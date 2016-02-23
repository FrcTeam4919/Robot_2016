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

import org.usfirst.frc4919.Robot_2016.commands.*;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.*;
import org.usfirst.frc4919.Robot_2016.subsystems.*;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);

    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.

    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:

    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());

    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());

    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());


    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public JoystickButton shootButton;
    public JoystickButton pickupOn_OffButton;
    public JoystickButton swapview;
    public JoystickButton towerDownButton;
    public JoystickButton towerUpButton;
    public JoystickButton unbrakeButton;
    public JoystickButton brakeButton;
    public JoystickButton backupTowerUpButton;
    public JoystickButton backupTowerDownButton;
    public Joystick driverJoystick;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public OI() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS

        driverJoystick = new Joystick(0);
        
        backupTowerDownButton = new JoystickButton(driverJoystick, 9);
        backupTowerDownButton.whileHeld(new BackupTowerDown());
        backupTowerUpButton = new JoystickButton(driverJoystick, 7);
        backupTowerUpButton.whileHeld(new BackupTowerUp());
        brakeButton = new JoystickButton(driverJoystick, 12);
        brakeButton.whenPressed(new Brake());
        unbrakeButton = new JoystickButton(driverJoystick, 11);
        unbrakeButton.whenPressed(new UnBrake());
        towerUpButton = new JoystickButton(driverJoystick, 5);
        towerUpButton.whileHeld(new Towerup(0));
        towerDownButton = new JoystickButton(driverJoystick, 3);
        towerDownButton.whileHeld(new Towerdown(0));
        swapview = new JoystickButton(driverJoystick, 4);
        swapview.whenPressed(new SwapView());
        pickupOn_OffButton = new JoystickButton(driverJoystick, 2);
        pickupOn_OffButton.whileHeld(new PickUp_Intake());
        shootButton = new JoystickButton(driverJoystick, 1);
        shootButton.whileHeld(new Shoot());


        // SmartDashboard Buttons
        SmartDashboard.putData("Autonomous Command", new AutonomousCommand());
        SmartDashboard.putData("Drive Joystick", new DriveJoystick());
        SmartDashboard.putData("Brake", new Brake());
        SmartDashboard.putData("Shoot", new Shoot());
        SmartDashboard.putData("UnBrake", new UnBrake());
        SmartDashboard.putData("Pick Up_Intake", new PickUp_Intake());
        SmartDashboard.putData("Towerup: highest", new Towerup(4.5));
        SmartDashboard.putData("Towerdown: lowest", new Towerdown(.5));
        SmartDashboard.putData("SwapView", new SwapView());
        SmartDashboard.putData("SetBrake", new SetBrake());
        SmartDashboard.putData("TowerStop: Half", new TowerStop(0.5));
        SmartDashboard.putData("TowerDefault", new TowerDefault());
        SmartDashboard.putData("BackupTowerUp", new BackupTowerUp());
        SmartDashboard.putData("BackupTowerDown", new BackupTowerDown());
        SmartDashboard.putData("BGrabBall", new BGrabBall());
        SmartDashboard.putData("Autonomous1", new Autonomous1());
        SmartDashboard.putData("Autonomous2", new Autonomous2());
        SmartDashboard.putData("Autonomous3", new Autonomous3());
        SmartDashboard.putData("ATowerDown", new ATowerDown());
        SmartDashboard.putData("ATowerUp", new ATowerUp());
        SmartDashboard.putData("AMoveBackwards", new AMoveBackwards());
        SmartDashboard.putData("ATowerSallyPort", new ATowerSallyPort());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    public Joystick getDriverJoystick() {
        return driverJoystick;
    }


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
}

