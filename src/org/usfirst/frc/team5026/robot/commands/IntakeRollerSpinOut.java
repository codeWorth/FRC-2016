package org.usfirst.frc.team5026.robot.commands;

import org.usfirst.frc.team5026.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class IntakeRollerSpinOut extends Command {

    public IntakeRollerSpinOut() {
    	requires(Robot.intakeMotors);
    }

    protected void initialize() {
    }

    protected void execute() {
    	Robot.intakeMotors.outtakeBall();
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    	Robot.intakeMotors.stopIntake();
    }

    protected void interrupted() {
    	end();
    }
}
