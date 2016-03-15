package com.team1241.frc2016.commands.defence;

import com.team1241.frc2016.NumberConstants;
import com.team1241.frc2016.commands.auto.*;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class AutoDriveOver extends CommandGroup {
    
    public  AutoDriveOver() {
        //Drive to defense
    	addParallel(new DriveCommand(60,0.6,0,2));
    	addSequential(new RunArm(NumberConstants.downArmAngle+150, 0.6, 2));
    	
    	//Drives over the defense
    	addParallel(new RunArm(NumberConstants.downArmAngle+50, 1, 3.5));
    	addSequential(new DriveCommand(85, 1, 0, 3.5));

    }
}
