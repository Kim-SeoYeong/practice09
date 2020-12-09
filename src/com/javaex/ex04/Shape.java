package com.javaex.ex04;

public abstract class Shape {
	//필드
	private int countSides;
	
	//생성자
	public Shape() {}
	
	public Shape(int countSides) {
		this.countSides = countSides;
	}
	
	//메소드
	//넓이
	public abstract double getArea();
	//둘레길이
	public abstract double getPerimeter();
	
}
