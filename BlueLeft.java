package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.util.ElapsedTime;

import org.firstinspires.ftc.robotcontroller.external.samples.HardwarePushbot;

@Autonomous(name="BlueLeft", group="Pushbot")
public class BlueLeft extends LinearOpMode {

    /* Declare OpMode members. */
    HardwareMap robot   = new HardwareMap();   // Use a Pushbot's hardware
    AutonomousActions actions = new AutonomousActions();
    private ElapsedTime     runtime = new ElapsedTime();

    @Override
    public void runOpMode() {

        robot.init(hardwareMap);

        waitForStart();

        while (opModeIsActive() && (runtime.seconds() < 3.0)) {
            actions.forward();
        }
        runtime.reset();

        sleep(1000);
    }
}
