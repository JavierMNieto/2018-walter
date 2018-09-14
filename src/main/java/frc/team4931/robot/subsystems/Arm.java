package frc.team4931.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.team4931.robot.RobotMap;

public class Arm extends Subsystem {
  private static final double UP_SPEED = 1;
  private static final double DOWN_SPEED = -1;
  private WPI_TalonSRX armMotor;

  public Arm() {
    armMotor = new WPI_TalonSRX(RobotMap.ARM); // FIXME put real value
  }

  @Override
  protected void initDefaultCommand() {
    // TODO Auto-generated method stub

  }

  public void up() {
    armMotor.set(UP_SPEED);
  }

  public void down() {
    armMotor.set(DOWN_SPEED);
  }

  public void stop() {
    armMotor.set(0);
  }
}
