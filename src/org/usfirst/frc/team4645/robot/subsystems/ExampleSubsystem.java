package org.usfirst.frc.team4645.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Encoder;

/**
 *
 */
public class ExampleSubsystem extends Subsystem {
	// Put methods for controlling this subsystem
	// here. Call these from Commands.
	
	Encoder sampleEncoder = new Encoder(0, 1, false, Encoder.EncodingType.k4X);

	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		setDefaultCommand(new ExampleCommand());
	}
}
