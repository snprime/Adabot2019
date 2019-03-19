/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.RobotMap;
import frc.robot.commands.intakeDeploy;
import frc.robot.commands.intakeRetract;
import frc.robot.commands.intakeRun;
import frc.robot.commands.switchGear;
import frc.robot.commands.fireCargo;
import frc.robot.commands.hatchDown;
import frc.robot.commands.hatchSuctionOn;
import frc.robot.commands.hatchSuctionOff;
import frc.robot.commands.hatchUp;


public class OI {

  public Joystick stick = new Joystick(RobotMap.stickPort);
  public Joystick throttle = new Joystick(RobotMap.throttle);

  public JoystickButton fireCargoButton = new JoystickButton(stick, RobotMap.triggerFull);
  public JoystickButton intakeDeployButton = new JoystickButton(throttle, RobotMap.topRidgeForward);
  public JoystickButton intakeRetractButton = new JoystickButton(throttle, RobotMap.topRidgeBack);
  public JoystickButton lowerHatchButton = new JoystickButton(throttle, RobotMap.thumbDown);
  public JoystickButton raiseHatchButton = new JoystickButton(throttle, RobotMap.thumbUp);
  public JoystickButton hatchSuctionButton = new JoystickButton(throttle, RobotMap.thumbForward);
  public JoystickButton hatchReleaseButton = new JoystickButton(throttle, RobotMap.thumbBack);
  public JoystickButton cargoEjectButton = new JoystickButton(stick, RobotMap.redButton);
  public JoystickButton switchGear = new JoystickButton(throttle, RobotMap.throttleTrigger);


  public OI(){
    //Intake Control
    fireCargoButton.whenPressed(new intakeRun(-0.75));
    fireCargoButton.whenPressed(new fireCargo(-0.75));
    fireCargoButton.whenReleased(new intakeRun(0.0));
    fireCargoButton.whenReleased(new fireCargo(0.0));

    //Eject Cargo
    cargoEjectButton.whenPressed(new fireCargo(0.75));
    cargoEjectButton.whenReleased(new fireCargo(0.0));

    //Intake Deploy and Retract
    intakeDeployButton.whenPressed(new intakeDeploy());
    intakeRetractButton.whenPressed(new intakeRetract());

    //Hatch Deploy and Retract
    lowerHatchButton.whenPressed(new hatchDown());
    raiseHatchButton.whenPressed(new hatchUp());

    //Engage and Disengage Hatch Suction
    hatchSuctionButton.whenPressed(new hatchSuctionOn());
    hatchReleaseButton.whenPressed(new hatchSuctionOff());

    //Change Gears
    switchGear.whenPressed(new switchGear());
  }
}
