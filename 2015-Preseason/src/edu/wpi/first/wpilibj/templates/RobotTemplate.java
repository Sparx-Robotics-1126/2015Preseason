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
	private Talon frontRightT1;
	private Talon backRightT2;
	private Talon rearRightT3;
	private Talon frontLeftT4;
	private Talon backLeftT5;
	private Talon rightLeftT6;
	/**
	 * This function is run when the robot is first started up and should be
	 * used for any initialization code.
	 */
	public void robotInit() {
		frontRightT1 = new talon(7);
		backRightT2 = new talon(9);
		rearRightT3 = new talon(8);
		frontLeftT4 = new talon(4);
		backLeftT5 = new talon(10);
		rearLeftT6 = new talon(5);

	}

	/**
	 * This function is called periodically during autonomous
	 */
	public void autonomousPeriodic() {
		while(true(){
			frontRightT1.set(-0.01);
			backRightT2.set(0.01);
			rearRightT3.set(-0.01);
			frontLeftT4.set(0.01);
			backLeftT5.set(-0.01);
			frontLeftT6.set(0.01);
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
