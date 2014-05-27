/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package RobotCode2015.commands.drivetrain;

import RobotCode2015.OI;
import RobotCode2015.commands.CommandBase;

/**
 * Framework that should be inherited by any Command that autonomously utilizes the drivetrain.
 * @author Manan
 */
public abstract class AutomaticDriveCommand extends CommandBase {
    
    public AutomaticDriveCommand(String name) {
        super (name);
    }
    
    // Called once after isFinished returns true
    protected void end() {
        super.end();
	OI.manualDriveRestore.start();
        drivetrain.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
        end();
    }
}
