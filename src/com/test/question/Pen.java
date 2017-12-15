package com.test.question;

public class Pen {

	private String color;
	private int ink;
	
	public Pen() {
		
	}
	
	public Pen(String color) {
		
		this.color = color;
	}

	public Pen(int ink) {
		
		this.ink = ink;
	}

	public Pen(String color, int ink) {
		
		this.color = color;
		this.ink = ink;
	}

	public void drawLine() {

		//ink -2ml
		System.out.printf("%s으로 선을 그렸습니다", color);
	}
	
	public void drawCircle() {
		
		//ink -3ml
		System.out.printf("%s으로 원을 그렸습니다", color);
	}
	
	public void drawRectangle() {
		
		//ink -4ml
		System.out.printf("%s으로 원을 그렸습니다", color);
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getInk() {
		return ink;
	}

	public void setInk(int ink) {
		this.ink = ink;
	}
}
