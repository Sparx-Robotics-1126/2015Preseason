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
	private Talon FrightT1;
	private Talon BrightT2;
	private Talon RrightT3;
	private Talon FleftT4;
	private Talon BleftT5;
	private Talon RleftT6;
	/**
	 * This function is run when the robot is first started up and should be
	 * used for any initialization code.
	 */
	public void robotInit() {
		FrightT1 = new Talon(7);
		BrightT2 = new Talon(9);
		RrightT3 = new Talon(8);
		FleftT4 = new Talon(5);
		BleftT5 = new Talon(10);
		RleftT6 = new Talon(6);
	}

	/**
	 * This function is called periodically during autonomous
	 */
	public void autonomousPeriodic() {
		while(true){
			FrightT1.set(-0.01);
			BrightT2.set(0.01);
			RrightT3.set(-0.01);
			FleftT4.set(0.01);
			BleftT5.set(-0.01);
			RleftT6.set(0.01);
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
