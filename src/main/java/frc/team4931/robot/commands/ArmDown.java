package frc.team4931.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.team4931.robot.Robot;

public class ArmDown extends Command {

    public ArmDown (){
        setInterruptible(false);
    }

    protected boolean isFinished(){
        return true;
    }

    protected void initialize(){
        Robot.arm.up();
    }
}