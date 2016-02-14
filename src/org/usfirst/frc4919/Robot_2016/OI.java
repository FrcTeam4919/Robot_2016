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
    public Joystick driverJoystick;
    public JoystickButton towerDownButton;
    public JoystickButton towerUpButton;
    public JoystickButton kickerButton;
    public JoystickButton shootTheBall1;
    public Joystick joystick;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public OI() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS

        joystick = new Joystick(1);
        
        shootTheBall1 = new JoystickButton(joystick, 1);
        shootTheBall1.whileHeld(new Shoot());
        kickerButton = new JoystickButton(joystick, 12);
        kickerButton.whileHeld(new Brake());
        towerUpButton = new JoystickButton(joystick, 3);
        towerUpButton.whileHeld(new Towerup());
        towerDownButton = new JoystickButton(joystick, 2);
        towerDownButton.whileHeld(new Towerdown());
        driverJoystick = new Joystick(0);
        
        pickupOn_OffButton = new JoystickButton(driverJoystick, 2);
        pickupOn_OffButton.whileHeld(new PickUp_Intake());
        shootButton = new JoystickButton(driverJoystick, 1);
        shootButton.whileHeld(new Shoot());


        // SmartDashboard Buttons
        SmartDashboard.putData("Autonomous Command", new AutonomousCommand());
        SmartDashboard.putData("Drive Joystick", new DriveJoystick());
        SmartDashboard.putData("Shoot", new Shoot());
        SmartDashboard.putData("Pick Up_Intake", new PickUp_Intake());
        SmartDashboard.putData("Brake", new Brake());
        SmartDashboard.putData("Retract Kicker", new RetractKicker());
        SmartDashboard.putData("Towerup: highest", new Towerup(4.5));
        SmartDashboard.putData("Towerdown: lowest", new Towerdown(.5));

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    public Joystick getDriverJoystick() {
        return driverJoystick;
    }

    public Joystick getjoystick() {
        return joystick;
    }


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
}

