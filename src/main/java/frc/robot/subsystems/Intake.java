/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import frc.robot.RobotMap;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.DoubleSolenoid;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
import com.ctre.phoenix.motorcontrol.ControlMode;


public class Intake extends Subsystem {
  WPI_VictorSPX motorIntake = new WPI_VictorSPX(RobotMap.intakeMotorID);
  DoubleSolenoid deployIntake = new DoubleSolenoid(RobotMap.pcm2_id, RobotMap.intakeFront, RobotMap.intakeBack);

  public Intake() {
    motorIntake = new WPI_VictorSPX(RobotMap.intakeMotorID);
    deployIntake = new DoubleSolenoid(RobotMap.pcm2_id, RobotMap.intakeFront, RobotMap.intakeBack);
  }

  public void deploy() {
    deployIntake.set(DoubleSolenoid.Value.kForward);
  }

  public void retract() {
    deployIntake.set(DoubleSolenoid.Value.kReverse);
  }
  
  public void set(double speed) {
    motorIntake.set(ControlMode.PercentOutput, speed);
  }
  
  @Override
  public void initDefaultCommand() {
    //setDefaultCommand(new intakeRun());
  }
}