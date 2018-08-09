package frc.team4931.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import subsystem.Drivetrain;
import subsystems.Arm;
import subsystems.Roller;

public class Robot extends IterativeRobot {
  
  public static OperatorInput operatorInput;
  public static Drivetrain drivetrain;
  public static Arm arm;
  public static Roller roller;
  
  @Override
  public void robotInit() {
    drivetrain = new Drivetrain();
    operatorInput = new OperatorInput();
    
    arm = new Arm();
    roller = new Roller();
    
    System.out.println("Hello World! Beep Boop!");
  }
}
