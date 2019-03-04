/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class fireCargo extends Command {
  double speed;

  public fireCargo(double speed) {
    this.speed = speed;
    requires(Robot.cargo);
  }

  @Override
  protected void initialize() {
    Robot.cargo.set(0.0);
  }

  @Override
  protected void execute() {
    Robot.cargo.set(speed);
  }

  @Override
  protected boolean isFinished() {
    return false;
  }

  @Override
  protected void end() {
    Robot.cargo.set(0.0);
  }

  @Override
  protected void interrupted() {
    end();
  }
}
