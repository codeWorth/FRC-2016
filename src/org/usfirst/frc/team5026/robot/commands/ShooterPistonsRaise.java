package org.usfirst.frc.team5026.robot.commands;

import org.usfirst.frc.team5026.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class ShooterPistonsRaise extends Command {

    public ShooterPistonsRaise() {
    	requires(Robot.shooterPistons);
    }

    protected void initialize() {
    }

    protected void execute() {
    	Robot.shooterPistons.raiseShooter();
    }

    protected boolean isFinished() {
        return true; // TEST MEEEE
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
