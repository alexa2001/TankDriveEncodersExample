package org.usfirst.frc.team4645.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Encoder;

/**
 *
 */
public class ExampleSubsystem extends Subsystem {
	// Put methods for controlling this subsystem
	// here. Call these from Commands.
	
	

	public void initDefaultCommand() {
		// Set the default command for a subsystem here.

		public static TalonSRX motorFL = new TalonSRX(RobotMap.frontLeft);
		public static TalonSRX motorFR = new TalonSRX(RobotMap.frontRight);
		public static TalonSRX motorBR = new TalonSRX(RobotMap.backLeft);
		public static TalonSRX motorBL = new TalonSRX(RobotMap.backRight);
		RobotDrive rb = new RobotDrive(motorFL, motorFR, motorBL, motorBR);

		Joystick joy1 = new Joystick(RobotMap.joystick1) ; 
		Joystick joy2 = new Joystick(RobotMap.joystick2) ;
		
		Encoder leftEncoder = new Encoder(RobotMap.LEFT_ENCODER_1,RobotMap.LEFT_ENCODER_2 , false, Encoder.EncodingType.k4X);
		Encoder rightEncoder = new Encoder(RobotMap.RIGHT_ENCODER_1,RobotMap.RIGHT_ENCODER_2 , false, Encoder.EncodingType.k4X);
		
		setDefaultCommand(new ExampleCommand());
	}
}
