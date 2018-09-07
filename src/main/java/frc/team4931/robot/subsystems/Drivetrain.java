package frc.team4931.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.team4931.robot.RobotMap;
import frc.team4931.robot.commands.DriveWithJoystick;

public class Drivetrain extends Subsystem {

  private WPI_TalonSRX leftFront, rightFront, leftBack, rightBack;
  private SpeedControllerGroup left, right;
  private DifferentialDrive drive;

  public Drivetrain() {

    leftFront = new WPI_TalonSRX(RobotMap.LEFT_FRONT); // FIXME add real values
    rightFront = new WPI_TalonSRX(RobotMap.RIGHT_FRONT);
    leftBack = new WPI_TalonSRX(RobotMap.LEFT_BACK);
    rightBack = new WPI_TalonSRX(RobotMap.RIGHT_BACK);

    left = new SpeedControllerGroup(leftFront, leftBack);
    right = new SpeedControllerGroup(rightFront, rightBack);

    drive = new DifferentialDrive(left, right);
  }

  @Override
  protected void initDefaultCommand() {
    setDefaultCommand(new DriveWithJoystick());
  }

  public void arcadeDrive(double speed, double turn, double multiplier) {
    drive.arcadeDrive(speed * speed * multiplier, turn * turn * multiplier, false);
  }

  public void arcadeDrive(double speed, double turn) {
    arcadeDrive(speed, turn, 1);
  }

  public void log() {
    SmartDashboard.putNumber("left side motor speed", left.get());
    SmartDashboard.putNumber("right side motor speed", right.get());
  }
}
