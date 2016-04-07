package org.usfirst.frc.team5026.robot.subsystems;

import org.usfirst.frc.team5026.robot.Robot;
import org.usfirst.frc.team5026.robot.commands.ShooterPistonsLower;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class ShooterPistons extends Subsystem {
    
	private DoubleSolenoid shooterSolenoid;
	public ShooterPistons() {
		shooterSolenoid = Robot.hardware.shooterSolenoid;
	}

	public void raiseShooter() {
		shooterSolenoid.set(Value.kForward);
	}
	
	public void lowerShooter() {
		shooterSolenoid.set(Value.kReverse);
	}
	
    public void initDefaultCommand() {
    	setDefaultCommand(new ShooterPistonsLower());
    }
}

