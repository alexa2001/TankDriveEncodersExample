package org.usfirst.frc.team4645.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	// For example to map the left and right motors, you could define the
	// following variables to use with your drivetrain subsystem.
	// public static int leftMotor = 1;
	// public static int rightMotor = 2;

	// If you are using multiple modules, make sure to define both the port
	// number and the module. For example you with a rangefinder:
	// public static int rangefinderPort = 1;
	// public static int rangefinderModule = 1;
	

	public static int frontLeft = 1;
	public static int frontRight = 2;
	public static int backLeft = 3;
	public static int backRight = 4;

	public static int joystick1 = 1;
	public static int joystick2= 2;
	
	/* Left encoder Digital I/O ports.
	 */
	public static final int LEFT_ENCODER_1 = 2;
	public static final int LEFT_ENCODER_2 = 3;
	/**
	* Right encoder Digital I/O ports.
	*/
	public static final int RIGHT_ENCODER_1 = 4;
	public static final int RIGHT_ENCODER_2 = 5;	

}
