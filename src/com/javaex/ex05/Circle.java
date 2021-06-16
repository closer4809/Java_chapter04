package com.javaex.ex05;

public class Circle {
	
	//필드
	private int radius;

	public Circle() {
		super();
	}
	
	public Circle(int radius) {
		
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}

	
	
	


	
	
}
