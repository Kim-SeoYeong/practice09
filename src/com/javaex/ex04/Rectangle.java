package com.javaex.ex04;

public class Rectangle extends Shape implements Resizeable {
	//필드
	private double width;
	private double height;
	
	//생성자
	public Rectangle() {}
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	//메소드-g/s
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	//메소드-일반
	public double getArea() {
		return width * height;
	}
	
	public double getPerimeter() {
		return (width + height) * 2;
	}
	
	public void resize(double x) {
		this.width = width * x;
		this.height = height * x;
	}

}