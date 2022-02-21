package org.firstinspires.ftc.teamcode;

public class AutonomousActions {
    HardwareMap robot = new HardwareMap();

    public void forward() {
        robot.leftF.setPower(1);
        robot.leftB.setPower(1);
        robot.rightF.setPower(1);
        robot.rightB.setPower(1);
    }

    public void back() {
        robot.leftF.setPower(-1);
        robot.leftB.setPower(-1);
        robot.rightF.setPower(-1);
        robot.rightB.setPower(-1);
    }

    public void left() {
        robot.leftF.setPower(-1);
        robot.leftB.setPower(-1);
        robot.rightF.setPower(1);
        robot.rightB.setPower(1);
    }

    public void right() {
        robot.leftF.setPower(1);
        robot.leftB.setPower(1);
        robot.rightF.setPower(-1);
        robot.rightB.setPower(-1);
    }

    public void strafeLeft() {
    }

    public void strafeRight() {
    }

    public void open() {
    }

    public void close() {
    }
}
