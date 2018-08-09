

package frc.team4931.robot.commands;

import frc.team4931.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class RollerSuck extends Command {

	public RollerSuck() {
		setInterruptible(true);
	}
	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;

	}

	@Override
	protected void initialize() {
		Robot.roller.suck();
	}
}