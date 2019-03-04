package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import frc.robot.Robot;
//import frc.robot.RobotMap;

public class Drive extends Command {

    public Drive() {
    	requires(Robot.driveTrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        
        double move = Robot.oi.throttle.getZ();
        double turn = -Robot.oi.stick.getX();

        Robot.driveTrain.teleopDrive(move, turn);
        
        /*if (Robot.oi.stick.getRawButtonReleased(RobotMap.throttleTrigger)) {
            Robot.driveTrain.switchGear();
        }*/
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}