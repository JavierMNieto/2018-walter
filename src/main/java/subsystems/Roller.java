package subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.command.Subsystem;



public class Roller extends Subsystem {
	private static final double SUCK_SPEED = 1;
	private static final double SPIT_SPEED = 1;
	private WPI_TalonSRX rollerMotor;
	/**
	 * 1 for suck, -1 for spit, 0 for stop
	 */
	private int direction = 0;
	
	private DigitalInput beam;
	public Roller() {
		rollerMotor = new WPI_TalonSRX(0); 
		beam = new DigitalInput(0); 
	}

	@Override
	protected void initDefaultCommand() {
		
	}
	
	public void checkBeam() {
		if (beam.get() && direction == 1) {
			stop();
		}
	}
	public void stop() {
		rollerMotor.set(0);
		direction = 0;
	}
	
	public void suck() {
		direction = 1;
		rollerMotor.set(SUCK_SPEED);
	}
	public void spit() {
		direction = -1;
		rollerMotor.set(SPIT_SPEED);
	}
}