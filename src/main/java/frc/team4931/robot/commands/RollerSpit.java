package frc.team4931.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.team4931.robot.Robot;

public class RollerSpit extends Command{

	public RollerSpit() {
		setInterruptible(false);
	}
	
	@Override
	protected boolean isFinished() {
		return true;
	}
	
	@Override
	protected void initialize() {
		Robot.roller.suck();
	}
}

