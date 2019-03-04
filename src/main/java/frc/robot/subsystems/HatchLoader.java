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


public class HatchLoader extends Subsystem {
  DoubleSolenoid loader = new DoubleSolenoid(RobotMap.pcm2_id, RobotMap.hatchUpperFront, RobotMap.hatchUpperRear);
  DoubleSolenoid support = new DoubleSolenoid(RobotMap.pcm2_id, RobotMap.hatchLowerFront, RobotMap.hatchLowerRear);
  DoubleSolenoid suction = new DoubleSolenoid(RobotMap.pcm2_id, RobotMap.suctionFront, RobotMap.suctionRear);


  public HatchLoader() {
    loader = new DoubleSolenoid(RobotMap.pcm2_id, RobotMap.hatchUpperFront, RobotMap.hatchUpperRear);
    support = new DoubleSolenoid(RobotMap.pcm2_id, RobotMap.hatchLowerFront, RobotMap.hatchLowerRear);
    suction = new DoubleSolenoid(RobotMap.pcm2_id, RobotMap.suctionFront, RobotMap.suctionRear);  
  }


  public void upright() {
    support.set(DoubleSolenoid.Value.kForward);
  }

  public void lowerHatch() {
    loader.set(DoubleSolenoid.Value.kForward);
  }

  public void retract() {
    loader.set(DoubleSolenoid.Value.kReverse);
  }

  public void suctionOn() {
    suction.set(DoubleSolenoid.Value.kForward);
  }

  public void suctionOff() {
    suction.set(DoubleSolenoid.Value.kOff);
  }
  
  @Override
  public void initDefaultCommand() {
    //setDefaultCommand(new intakeRun());
  }
}
