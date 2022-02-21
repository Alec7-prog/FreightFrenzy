package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.util.ElapsedTime;

@Autonomous(name="BlueRight", group="Pushbot")
public class BlueRight extends LinearOpMode {

    /* Declare OpMode members. */
    HardwareMap robot   = new HardwareMap();   // Use a Pushbot's hardware
    private ElapsedTime     runtime = new ElapsedTime();

    @Override
    public void runOpMode() {

        robot.init(hardwareMap);

        waitForStart();

        while (opModeIsActive() && (runtime.seconds() < 3.0)) {
            this.drive("");
        }
        runtime.reset();

        sleep(1000);
    }

    public void drive (String whatToDo) {
        String action = whatToDo;
        if (action.equals("Forward")) {
            robot.leftF.setPower(0);
            robot.leftB.setPower(0);
            robot.rightF.setPower(0);
            robot.rightB.setPower(0);
        } else if (action.equals("Back")) {
            robot.leftF.setPower(0);
            robot.leftB.setPower(0);
            robot.rightF.setPower(0);
            robot.rightB.setPower(0);
        } else if (action.equals("Left")) {
            robot.leftF.setPower(0);
            robot.leftB.setPower(0);
            robot.rightF.setPower(0);
            robot.rightB.setPower(0);
        } else if (action.equals("Right")) {
            robot.leftF.setPower(0);
            robot.leftB.setPower(0);
            robot.rightF.setPower(0);
            robot.rightB.setPower(0);
        } else if(action.equals("Strafe Left")) {
            this.strafe(0);
        } else if(action.equals("Strafe Right")){
            this.strafe(1);
        } else if(action.equals("Open")) {
            robot.claw.setPosition(.5);
            robot.claw.setPosition(.5);
        } else {
            robot.claw.setPosition(0);
            robot.claw.setPosition(0);
        }

    }

    public void strafe(int leftRight) {
        int val = leftRight;
        if (val > 0) {
            // Strafe Right
            robot.leftF.setPower(1);
            robot.leftB.setPower(-1);
            robot.rightF.setPower(-1);
            robot.rightB.setPower(1);
        } else {
            // Strafe Left
            robot.leftF.setPower(-1);
            robot.leftB.setPower(1);
            robot.rightF.setPower(1);
            robot.rightB.setPower(-1);
        }
    }
}
