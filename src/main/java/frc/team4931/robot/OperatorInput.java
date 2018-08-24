package frc.team4931.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.team4931.robot.commands.RollerSpit;
import frc.team4931.robot.commands.RollerSuck;

public class OperatorInput {
  private Joystick joystick;
  
  public OperatorInput() {
    joystick = makeJoystick();
   
  }
  
  private Joystick makeJoystick() {
    Joystick stick = new Joystick(0); //FIXME value 
    //TODO bind buttons
    
    Button rollerSpit = new JoystickButton(stick, 1);
    Button rollerSuck = new JoystickButton(stick, 2);
    
    rollerSpit.whenPressed(new RollerSpit());
    rollerSuck.whenPressed(new RollerSuck());
    return stick;
  }
  
  public Joystick getJoystick() {
    return joystick;
    
  }
}
