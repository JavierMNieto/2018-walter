package frc.team4931.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.team4931.robot.Robot;

public class ArmUp extends Command {

  @Override
  protected boolean isFinished() {
    return true;
  }

  @Override
  protected void initialize() {
    Robot.arm.up();
  }
}
