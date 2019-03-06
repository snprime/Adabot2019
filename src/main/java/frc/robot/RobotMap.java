/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {

  //Motor IDs
  public static int leftFrontUpperMotorID = 6;
  public static int leftFrontLowerMotorID = 11;
  public static int leftRearUpperMotorID = 12;
  public static int leftRearLowerMotorID = 13;
  public static int rightFrontUpperMotorID = 7;
  public static int rightFrontLowerMotorID = 8;
  public static int rightRearUpperMotorID = 9;
  public static int rightRearLowerMotorID = 10;
  public static int intakeMotorID = 4;
  public static int frontMechanismMotorID = 5;
  public static int rearMechanismMotorID = 3;

  //Driverstation IDs
  public static int stickPort = 1;
  public static int throttle = 0;

  //Stick Button IDs
  public static int triggerHalf = 1;
  public static int redButton = 2;
  public static int bottomButton = 3;
  public static int bottomTrigger = 4;
  public static int topButton = 5;
  public static int triggerFull = 6;
  
  //Throttle Button IDs
  public static int throttleTrigger = 1;
  public static int thumbPush = 2;
  public static int thumbUp = 3;
  public static int thumbForward = 4;
  public static int thumbDown = 5;
  public static int thumbBack = 6;
  public static int topRidgeForward = 8;
  public static int topRidgeBack = 7;
  public static int bottomRidgeForward = 9;
  public static int bottomRidgeBack = 10;
  public static int redSwitchForward = 11;
  public static int redSwitchBack = 12;
  public static int pinkySwitchForward = 13;
  public static int pinkySwitchBack = 14;
  public static int pinkyButton = 15;

  //Pneumatics IDs
  public static int intakeFront = 1; //solenoid 2
  public static int intakeBack = 5; //solenoid 2
  public static int hatchLowerFront = 0; //solenoid 5 on pcm1
  public static int hatchLowerRear = 1; //solenoid 5 on pcm1
  public static int hatchUpperFront = 3; //solenoid 4
  public static int hatchUpperRear = 7; //solenoid 4
  public static int suctionFront = 6; //solenoid 3
  public static int suctionRear = 2; //solenoid 3
  public static int transmissionFront = 0; //solenoid 1
  public static int transmissionBack = 4; //solenoid 1
  
  public static int pcm2_id = 0; //controls lowerhatch
  public static int pcm1_id = 1; //controls everything else
  

}
