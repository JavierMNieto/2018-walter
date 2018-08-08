package frc.team4931.robot;

import edu.wpi.first.wpilibj.Joystick;

public class OperatorInput {
  private Joystick joystick;
  
  public OperatorInput() {
    joystick = makeJoystick();
  }
  
  private Joystick makeJoystick() {
    Joystick stick = new Joystick(0); //FIXME value 
    //TODO bind buttons
    return stick;
  }
  
  public Joystick getJoystick() {
    return joystick;
    
  }
}
