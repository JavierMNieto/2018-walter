

package frc.team4931.robot.commands;

import frc.team4931.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class RollerSuck extends Command {

	public RollerSuck() {
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