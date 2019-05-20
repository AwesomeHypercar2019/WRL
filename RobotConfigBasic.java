package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.ElapsedTime;

public class RobotConfigBasic
{
    public DcMotor leftDrive = null;
    public DcMotor rightDrive = null;
    public DcMotor LeadScrew = null;
    public DcMotor fwbw = null;
    public Servo Claw1 = null;
    public Servo Claw2 = null;
    HardwareMap hwMap           =  null;
    private ElapsedTime period  = new ElapsedTime();

    /* Constructor */
    public RobotConfigBasic(){

    }

    public void init(HardwareMap ahwMap)
    {
        hwMap = ahwMap;
        leftDrive = hwMap.get(DcMotor.class, "leftDrive");
        rightDrive = hwMap.get(DcMotor.class,"rightDrive");
        LeadScrew = hwMap.get(DcMotor.class, "LeadScrew");
        fwbw = hwMap.get(DcMotor.class, "fwbw");
        Claw1 = hwMap.get(Servo.class, "Claw1");
        Claw2 = hwMap.get(Servo.class, "Claw2");
        leftDrive.setDirection(DcMotorSimple.Direction.REVERSE);
        rightDrive.setDirection(DcMotorSimple.Direction.FORWARD);
    }
}
