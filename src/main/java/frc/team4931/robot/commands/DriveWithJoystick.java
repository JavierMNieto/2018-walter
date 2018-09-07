package frc.team4931.robot.commands;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Command;
import frc.team4931.robot.Robot;
import frc.team4931.robot.subsystems.Drivetrain;

public class DriveWithJoystick extends Command {
  private Joystick joystick;
  private Drivetrain drivetrain;

  public DriveWithJoystick() {
    requires(Robot.drivetrain);
    joystick = Robot.operatorInput.getJoystick();
    drivetrain = Robot.drivetrain;
  }

  @Override
  protected void execute() {
    drivetrain.arcadeDrive(
        joystick.getX() * -1, joystick.getZ(), 1 - ((joystick.getThrottle() + 1) / 2));
  }

  @Override
  protected boolean isFinished() {
    // TODO Auto-generated method stub
    return false;
  }
}
