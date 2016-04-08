package org.usfirst.frc.team5026.robot.commands;

import org.usfirst.frc.team5026.robot.Robot;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class RoutineShootBall extends CommandGroup {
    
    public  RoutineShootBall() {
    	addSequential(new ShooterWaitForStabilize(Robot.rpmUpperShooterAuto, Robot.rpmLowerShooterAuto));
    	addSequential(new StageTwoQueueToShooter());
    	addSequential(new ShooterSlowStop());
    }
}
