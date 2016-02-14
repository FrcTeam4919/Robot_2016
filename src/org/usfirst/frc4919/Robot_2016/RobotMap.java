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
import edu.wpi.first.wpilibj.AnalogPotentiometer;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.Ultrasonic;

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
    public static Ultrasonic driveTrainUltrasonic1;
    public static AnalogPotentiometer towerAnalogPotentiometer1;
    public static SpeedController towerMiniCim1;
    public static SpeedController shooterSystemCimMotor1;
    public static SpeedController shooterSystemCimMotor2;
    public static Relay shooterSystemSpike2;
    public static Relay pickupSpike1;
    public static Relay kickerSystemSpike3;
    public static DigitalInput kickerSystemLimitSwitch;

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

        driveTrainUltrasonic1 = new Ultrasonic(0, 1);
        LiveWindow.addSensor("Drive Train", "Ultrasonic 1", driveTrainUltrasonic1);
        
        towerAnalogPotentiometer1 = new AnalogPotentiometer(0, 1.0, 0.0);
        LiveWindow.addSensor("Tower", "Analog Potentiometer 1", towerAnalogPotentiometer1);
        
        towerMiniCim1 = new Talon(2);
        LiveWindow.addActuator("Tower", "Mini Cim 1", (Talon) towerMiniCim1);
        
        shooterSystemCimMotor1 = new Talon(4);
        LiveWindow.addActuator("ShooterSystem", "Cim Motor1", (Talon) shooterSystemCimMotor1);
        
        shooterSystemCimMotor2 = new Talon(5);
        LiveWindow.addActuator("ShooterSystem", "Cim Motor 2", (Talon) shooterSystemCimMotor2);
        
        shooterSystemSpike2 = new Relay(1);
        LiveWindow.addActuator("ShooterSystem", "Spike 2", shooterSystemSpike2);
        
        pickupSpike1 = new Relay(0);
        LiveWindow.addActuator("Pickup", "Spike 1", pickupSpike1);
        
        kickerSystemSpike3 = new Relay(2);
        LiveWindow.addActuator("KickerSystem", "Spike 3", kickerSystemSpike3);
        
        kickerSystemLimitSwitch = new DigitalInput(2);
        LiveWindow.addSensor("KickerSystem", "Limit Switch ", kickerSystemLimitSwitch);
        

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}
