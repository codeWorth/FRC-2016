package org.usfirst.frc.team5026.robot.commands;

import org.usfirst.frc.team5026.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class IntakeRollerStop extends Command {

    public IntakeRollerStop() {
    	requires(Robot.intakeMotors);
    }

    protected void initialize() {
    }

    protected void execute() {
    	Robot.intakeMotors.stopIntake();
    }

    protected boolean isFinished() {
        return true;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
