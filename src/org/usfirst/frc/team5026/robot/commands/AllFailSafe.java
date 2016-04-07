package org.usfirst.frc.team5026.robot.commands;

import org.usfirst.frc.team5026.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 * To Interrupt ALL commands with these subsystems, a failsafe of sorts UNTESTED
 */
public class AllFailSafe extends Command {

    public AllFailSafe() {
        requires(Robot.shooter);
        requires(Robot.intakeArm);
        requires(Robot.rotate);
        requires(Robot.stageTwo);
        //requires(Robot.shooterPistons);
    }

    protected void initialize() {
    }

    protected void execute() {
    }

    protected boolean isFinished() {
        return true;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
