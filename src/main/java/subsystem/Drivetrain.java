package subsystem;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

public class Drivetrain extends Subsystem {
  
  private WPI_TalonSRX leftFront, rightFront, leftBack, rightBack;
  private SpeedControllerGroup left, right;
  private DifferentialDrive drive; 

  public Drivetrain() {
    
    leftFront = new WPI_TalonSRX(0); //FIXME add real values
    rightFront = new WPI_TalonSRX(0);
    leftBack = new WPI_TalonSRX(0);
    rightBack = new WPI_TalonSRX(0);
    
    left = new SpeedControllerGroup(leftFront, leftBack);
    right = new SpeedControllerGroup(rightFront, rightBack);
    
    drive = new DifferentialDrive(left, right);
  }
  
  @Override
  protected void initDefaultCommand() {
    // TODO Auto-generated method stub
    
  }
  
  public void arcadeDrive(double speed, double turn, double multiplier) {
    drive.arcadeDrive(speed * speed * multiplier, turn * turn * multiplier, false);
  }
  
  public void arcadeDrive(double speed, double turn) {
    arcadeDrive(speed, turn, 1);
  }
  
  

}
