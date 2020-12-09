package com.javaex.ex04;

import java.util.ArrayList;
import java.util.List;

public class ShapeApp {

    public static void main(String[] args) {
    	ArrayList<Shape> sList = new ArrayList<Shape>();
    	
    	Shape r01 = new Rectangle(5, 6);
    	Shape r02 = new RectTriangle(6, 2);
    	
    	sList.add(r01);
    	sList.add(r02);
    	
    	for(int i = 0; i < sList.size(); i++) {
    		System.out.println("area : " + sList.get(i).getArea());
    		System.out.println("perimeter : " + sList.get(i).getPerimeter());
    		
    		if (sList.get(i) instanceof Resizeable) {
    			((Resizeable)(sList.get(i))).resize(0.5);
    			
    			System.out.println("new area : " + sList.get(i).getArea());
        		System.out.println("new perimeter : " + sList.get(i).getPerimeter());
    		}
    	}

        
    }
}
