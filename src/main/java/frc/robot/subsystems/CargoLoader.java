/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import frc.robot.RobotMap;
import edu.wpi.first.wpilibj.command.Subsystem;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
import com.ctre.phoenix.motorcontrol.ControlMode;

public class CargoLoader extends Subsystem {
  WPI_VictorSPX motorFrontMech = new WPI_VictorSPX(RobotMap.frontMechanismMotorID);
  WPI_VictorSPX motorRearMech = new WPI_VictorSPX(RobotMap.rearMechanismMotorID);

  public CargoLoader() {
    motorFrontMech = new WPI_VictorSPX(RobotMap.frontMechanismMotorID);
    motorRearMech = new WPI_VictorSPX(RobotMap.rearMechanismMotorID);

    motorRearMech.setInverted(true);

    motorRearMech.follow(motorFrontMech);
  }
	
  public void set(double speed) {
    motorFrontMech.set(ControlMode.PercentOutput, speed);
  }

  public void stop() {
    set(0.0);
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new fireCargo());
  }
}
