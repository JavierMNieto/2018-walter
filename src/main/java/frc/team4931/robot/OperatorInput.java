package frc.team4931.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.team4931.robot.commands.ArmDown;
import frc.team4931.robot.commands.ArmStop;
import frc.team4931.robot.commands.ArmUp;
import frc.team4931.robot.commands.RollerSpit;
import frc.team4931.robot.commands.RollerStop;
import frc.team4931.robot.commands.RollerSuck;

public class OperatorInput {
  private Joystick joystick;

  public OperatorInput() {
    joystick = makeJoystick();
  }

  private Joystick makeJoystick() {
    Joystick stick = new Joystick(0);

    Button rollerSpit = new JoystickButton(stick, 1);
    Button rollerSuck = new JoystickButton(stick, 2);
    Button armUp = new JoystickButton(stick, 5);
    Button armDown = new JoystickButton(stick, 3);

    rollerSpit.whenPressed(new RollerSpit());
    rollerSpit.whenReleased(new RollerStop());
    rollerSuck.whenPressed(new RollerSuck());
    rollerSuck.whenReleased(new RollerStop());
    armUp.whenPressed(new ArmUp());
    armUp.whenReleased(new ArmStop());
    armDown.whenPressed(new ArmDown());
    armDown.whenReleased(new ArmStop());

    return stick;
  }

  public Joystick getJoystick() {
    return joystick;
  }
}
