/*----------------------------------------------------------------------------*/
/* Copyright (c) FIRST 2008. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package edu.wpi.first.wpilibj.templates;


import edu.wpi.first.wpilibj.IterativeRobot;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class RobotTemplate extends IterativeRobot {
	private Talon t1r;
	private Talon t2r;
	private Talon t3r;
	private Talon t1l;
	private Talon t2l;
	private Talon t3l;
	private Joystick j1;
    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() {
		t1r = new Talon(7);
		t2r = new Talon(9);
		t3r = new Talon(8);
		t1l = new Talon(4);
		t2l = new Talon(10);
		t3l = new Talon(5);
		j1 =new Joystick(1)
    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {
    	while(true)
    	{
    	t1r.set(-j1.getRawAxis(4));
    	t2r.set(j1.getRawAxis(4));
    	t3r.set(-j1.getRawAxis(4));
    	t1l.set(j1.getRawAxis(2));
    	t2l.set(-j1.getRawAxis(2));
    	t3l.set(j1.getRawAxis(2));
    	}
    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
        
    }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
    
    }
    
}
