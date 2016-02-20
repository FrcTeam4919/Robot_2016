// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc4919.Robot_2016.subsystems;

import org.usfirst.frc4919.Robot_2016.RobotMap;
import org.usfirst.frc4919.Robot_2016.commands.*;

import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.Relay.Value;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class ShooterSystem extends Subsystem {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private final SpeedController cimMotor1 = RobotMap.shooterSystemCimMotor1;
    private final Relay ballFeederSpike = RobotMap.shooterSystemBallFeederSpike;
    private final Relay pickUpSpike = RobotMap.shooterSystemPickUpSpike;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS


    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }
    public void startThePickUpMotor() {
    	pickUpSpike.set(Relay.Value.kForward);
    }
    public void stopThePickUpMotor() {
    	pickUpSpike.set(Relay.Value.kOff);
    }
    public void ballFeeder() {
    	ballFeederSpike.set(Value.kForward);
    }
    public void stopBallFeeder() {
    	ballFeederSpike.set(Value.kOff);
    }
    public void shootTheBall() {
    	cimMotor1.set(1.0);
    }
    public void stopTheShooter() {
    	cimMotor1.set(0.0);
    }
}

