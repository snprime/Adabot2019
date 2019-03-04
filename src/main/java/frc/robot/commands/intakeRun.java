/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;


public class intakeRun extends Command {
  double speed;

  public intakeRun(double speed) {
    this.speed = speed;
    requires(Robot.intake);
  }

  @Override
  protected void initialize() {
    Robot.intake.set(0.0);
  }

  @Override
  protected void execute() {
    Robot.intake.set(speed);
  }

  @Override
  protected boolean isFinished() {
    return false;
  }

  @Override
  protected void end() {
    Robot.intake.set(0.0);
  }

  @Override
  protected void interrupted() {
    end();
  }
}
