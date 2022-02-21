package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.ElapsedTime;

public class HardwareMap
{
    /* Public OpMode members. */
    public DcMotor leftF, leftB, rightF, rightB, arm, duck;
    public Servo    claw;

    /* local OpMode members. */
    com.qualcomm.robotcore.hardware.HardwareMap hwMap = null;
    private ElapsedTime period  = new ElapsedTime();

    /* Constructor */
    public HardwareMap(){

    }

    /* Initialize standard Hardware interfaces */
    public void init(com.qualcomm.robotcore.hardware.HardwareMap ahwMap) {
        // Save reference to Hardware map
        hwMap = ahwMap;

        // Define and Initialize Motors
        leftF  = hwMap.get(DcMotor.class, "leftF");
        leftB = hwMap.get(DcMotor.class, "leftB");
        rightF = hwMap.get(DcMotor.class, "rightF");
        rightB = hwMap.get(DcMotor.class, "rightB");
        duck = hwMap.get(DcMotor.class, "duck");
        arm    = hwMap.get(DcMotor.class, "arm");
        leftF.setDirection(DcMotor.Direction.REVERSE); // Set to REVERSE if using AndyMark motors
        leftB.setDirection(DcMotor.Direction.REVERSE);// Set to FORWARD if using AndyMark motors
        rightF.setDirection(DcMotor.Direction.FORWARD);// Set to FORWARD if using AndyMark motors
        rightB.setDirection(DcMotor.Direction.FORWARD);// Set to FORWARD if using AndyMark motors


        // Set all motors to zero power
        leftF.setPower(0);
        leftB.setPower(0);
        rightF.setPower(0);
        rightB.setPower(0);
        duck.setPower(0);
        arm.setPower(0);

        // Set all motors to run without encoders.
        // May want to use RUN_USING_ENCODERS if encoders are installed.
        leftF.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        leftB.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        rightF.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        rightB.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        duck.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        arm.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);

        // Define and initialize ALL installed servos.
        claw  = hwMap.get(Servo.class, "left_hand");
    }
 }

