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
	private Joystick joystick;
	private Compressor compress;
	private Solenoid sol;
	/**
	 * This function is run when the robot is first started up and should be
	 * used for any initialization code.
	 */
	public void robotInit() {
		frontRightT1 = new Talon(7);
		backRightT2 = new Talon(9);
		rearRightT3 = new Talon(8);
		frontLeftT4 = new Talon(4);
		backLeftT5 = new Talon(10);
		rearLeftT6 = new Talon(5);
		joystick = new Joystick(1);
		compress = new Compressor(1,14,1,1);
		sol = new Solenoid(1);

	}

	/**
	 * This function is called periodically during autonomous
	 */
	public void autonomousPeriodic() {
		/**while(true(){
			frontRightT1.set(joystick.getRawAxis(3));
			backRightT2.set(-joystick.getRawAxis(3));
			rearRightT3.set(joystick.getRawAxis(3));
			frontLeftT4.set(-joystick.getRawAxis(2));
			backLeftT5.set(joystick.getRawAxis(2));
			frontLeftT6.set(-joystick.getRawAxis(2));
			*/
			}

		}

		/**
		 * This function is called periodically during operator control
		 */
		public void teleopPeriodic() {
			boolean value = false
			boolean check = false;
			comress.start();
		while(true(){
			if(joystick.getRawButton(1) == true && check == false){
				value = !value;
				sol.set(check);
				check = true;
			}
			else if(check == true && joystick.getRawButton(1) == false)
			{
				check = false
			}
			frontRightT1.set(joystick.getRawAxis(3));
			backRightT2.set(-joystick.getRawAxis(3));
			rearRightT3.set(joystick.getRawAxis(3));
			frontLeftT4.set(-joystick.getRawAxis(2));
			backLeftT5.set(joystick.getRawAxis(2));
			frontLeftT6.set(-joystick.getRawAxis(2));
			
			}
		}

		/**
		 * This function is called periodically during test mode
		 */
		public void testPeriodic() {

		}

	}
