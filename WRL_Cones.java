package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name = "WRL_Cones", group = "WRL")
public class WRL_Cones extends OpMode
{
    RobotConfigBasic robot = new RobotConfigBasic();
    public void init()
    {
        robot.init(hardwareMap);
    }
    public void loop()
    {
        double fb = gamepad1.left_stick_y;
        double turn = gamepad1.right_stick_x;
        double leadScrewPower = gamepad2.left_stick_y;
        double fwbwPower = gamepad2.right_stick_y;
        boolean Claw = gamepad2.right_bumper;
        double leftPower = fb-turn;
        double rightPower = fb+turn;
        robot.leftDrive.setPower(leftPower);
        robot.rightDrive.setPower(rightPower);
        robot.LeadScrew.setPower(leadScrewPower);
        robot.fwbw.setPower(fwbwPower);
        if (Claw)
        {
            robot.Claw1.setPosition(0);
            robot.Claw2.setPosition(1);
        }
        else{
            robot.Claw1.setPosition(1);
            robot.Claw2.setPosition(0);
        }

    }
}
