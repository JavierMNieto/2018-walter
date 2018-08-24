package frc.team4931.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.team4931.robot.Robot;

public class RollerSpit extends Command {

  public RollerSpit() {
    setInterruptible(false);
  }

  protected boolean isFinished() {
    // TODO Auto-generated method stub
    return true;
  }

  protected void initialize() {
    Robot.roller.spit();
  }
}
