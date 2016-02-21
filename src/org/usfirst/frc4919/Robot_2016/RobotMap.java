// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc4919.Robot_2016;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.AnalogPotentiometer;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static SpeedController driveTrainLeftMotor;
    public static SpeedController driveTrainRightMotor;
    public static RobotDrive driveTrainRobotDrive21;
    public static AnalogInput driveTrainUltrasonic;
    public static AnalogPotentiometer towerAnalogPotentiometer1;
    public static SpeedController towerMiniCim1;
    public static SpeedController shooterSystemCimMotor1;
    public static Relay shooterSystemBallFeederSpike;
    public static Relay shooterSystemPickUpSpike;
    public static Relay kickerSystemkickerupdown;
    public static DigitalInput kickerSystemLimitSwitch;
    public static Servo cameraServo1;
    public static SpeedController backupTowerBackupTowerController;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        driveTrainLeftMotor = new Talon(0);
        LiveWindow.addActuator("Drive Train", "Left Motor", (Talon) driveTrainLeftMotor);
        
        driveTrainRightMotor = new Talon(1);
        LiveWindow.addActuator("Drive Train", "Right Motor", (Talon) driveTrainRightMotor);
        
        driveTrainRobotDrive21 = new RobotDrive(driveTrainLeftMotor, driveTrainRightMotor);
        
        driveTrainRobotDrive21.setSafetyEnabled(true);
        driveTrainRobotDrive21.setExpiration(0.1);
        driveTrainRobotDrive21.setSensitivity(0.5);
        driveTrainRobotDrive21.setMaxOutput(1.0);

        driveTrainUltrasonic = new AnalogInput(1);
        LiveWindow.addSensor("Drive Train", "Ultrasonic", driveTrainUltrasonic);
        
        towerAnalogPotentiometer1 = new AnalogPotentiometer(0, 1.0, 0.0);
        LiveWindow.addSensor("Tower", "Analog Potentiometer 1", towerAnalogPotentiometer1);
        
        towerMiniCim1 = new Talon(2);
        LiveWindow.addActuator("Tower", "Mini Cim 1", (Talon) towerMiniCim1);
        
        shooterSystemCimMotor1 = new Talon(4);
        LiveWindow.addActuator("ShooterSystem", "Cim Motor1", (Talon) shooterSystemCimMotor1);
        
        shooterSystemBallFeederSpike = new Relay(1);
        LiveWindow.addActuator("ShooterSystem", "Ball Feeder Spike", shooterSystemBallFeederSpike);
        
        shooterSystemPickUpSpike = new Relay(0);
        LiveWindow.addActuator("ShooterSystem", "Pick Up Spike", shooterSystemPickUpSpike);
        
        kickerSystemkickerupdown = new Relay(2);
        LiveWindow.addActuator("KickerSystem", "kickerupdown", kickerSystemkickerupdown);
        
        kickerSystemLimitSwitch = new DigitalInput(2);
        LiveWindow.addSensor("KickerSystem", "Limit Switch ", kickerSystemLimitSwitch);
        
        cameraServo1 = new Servo(9);
        LiveWindow.addActuator("Camera", "Servo 1", cameraServo1);
        
        backupTowerBackupTowerController = new Talon(8);
        LiveWindow.addActuator("BackupTower", "BackupTowerController", (Talon) backupTowerBackupTowerController);
        

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}
