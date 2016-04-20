package org.usfirst.frc.team5026.lib;


public class PantherGamepad extends PantherJoystick {
	public PantherGamepad(int port, double deadzoneX, double deadzoneY, double driveMotorsDeadZone, double driveJoystickXScaling, double driveJoystickYScaling) {
		super(port, deadzoneX, deadzoneY, driveMotorsDeadZone, driveJoystickXScaling, driveJoystickYScaling);
	}

	@Override
	public double getXAxis() {
		double value;
		double negative = (Math.abs(getX()) / getX()); 
		double xAxis = getX() - negative * m_deadzoneX;
		
		if(Math.abs(getX()) > m_deadzoneX) {
			if(xAxis < 0) {
				value = -Math.pow(Math.abs(xAxis), power);
			}
			else {
				value = Math.pow(Math.abs(xAxis), power);
			}
			value = scalingX * value + negative * motorDeadZone;
		}
		else {
			value = 0;
		}
		
		return value;
	}
	
	@Override
	public double getYAxis() {
		double value;
		double negative = (Math.abs(getY()) / getY());
		double yAxis = getY() - negative * m_deadzoneY;
		
		if(Math.abs(getY()) > m_deadzoneY) {
			if(yAxis < 0) {
				value = -Math.pow(Math.abs(yAxis), power);
			}
			else {
				value = Math.pow(Math.abs(yAxis), power);
			}
			value = scalingY * value + negative * motorDeadZone;
		}
		else {
			value = 0;
		}
		return value;
	}
}
