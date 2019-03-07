package frc.robot.subsystems;

import frc.robot.RobotMap;
import frc.robot.commands.Drive;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.DoubleSolenoid;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;


public class Drivetrain extends Subsystem {
    WPI_TalonSRX motorLA = new WPI_TalonSRX(RobotMap.leftRearUpperMotorID);
    WPI_TalonSRX motorLB = new WPI_TalonSRX(RobotMap.leftFrontUpperMotorID);
    WPI_TalonSRX motorLC = new WPI_TalonSRX(RobotMap.leftFrontLowerMotorID);
    WPI_TalonSRX motorLD = new WPI_TalonSRX(RobotMap.leftRearLowerMotorID);
    SpeedControllerGroup m_leftControllerGroup = new SpeedControllerGroup(motorLA, motorLB, motorLC, motorLD);

    WPI_TalonSRX motorRA = new WPI_TalonSRX(RobotMap.rightRearUpperMotorID);
    WPI_TalonSRX motorRB = new WPI_TalonSRX(RobotMap.rightFrontUpperMotorID);
    WPI_TalonSRX motorRC = new WPI_TalonSRX(RobotMap.rightFrontLowerMotorID);
    WPI_TalonSRX motorRD = new WPI_TalonSRX(RobotMap.rightRearLowerMotorID);
    SpeedControllerGroup m_rightControllerGroup = new SpeedControllerGroup(motorRA, motorRB, motorRC, motorRD);
 
    DifferentialDrive drive = new DifferentialDrive(m_leftControllerGroup, m_rightControllerGroup);

    DoubleSolenoid gearSwitcher = new DoubleSolenoid(RobotMap.pcm1_id, RobotMap.transmissionFront, RobotMap.transmissionBack);
   
    public boolean highTorque = true;
    public boolean lowTorque = false;
    
    public Drivetrain() 
    {
      m_leftControllerGroup = new SpeedControllerGroup(motorLA, motorLB, motorLC, motorLD);
      m_rightControllerGroup = new SpeedControllerGroup(motorRA, motorRB, motorRC, motorRD);

      drive = new DifferentialDrive(m_leftControllerGroup, m_rightControllerGroup);
	  }
	
    public void teleopDrive(double move, double turn)
    {
      double moveLimiter = 0.65;
      double turnLimiter = 0.55;
		  drive.arcadeDrive(move*moveLimiter, turn*turnLimiter);
    }

    public void setGear(DoubleSolenoid.Value gear) {
      gearSwitcher.set(gear);
    }
  
    public void switchGear() {
      DoubleSolenoid.Value current_gear = gearSwitcher.get();

      if (current_gear == DoubleSolenoid.Value.kForward){
        gearSwitcher.set(DoubleSolenoid.Value.kReverse);
      }
      if (current_gear == DoubleSolenoid.Value.kReverse){
        gearSwitcher.set(DoubleSolenoid.Value.kForward);
      }
    }

    public void initDefaultCommand()
    {
      setDefaultCommand(new Drive());
    }
}
