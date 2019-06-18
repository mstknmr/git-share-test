package com.example.demo;

public class Car {
	private int speed;
	private int color;

	@Override
	public String toString() {
		return "Car [speed=" + speed + ", color=" + color + "]";
	}
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getColor() {
		return color;
	}
	public void setColor(int color) {
		this.color = color;
	}
}
