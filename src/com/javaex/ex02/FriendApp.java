package com.javaex.ex02;

import java.util.ArrayList;
import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	ArrayList<Friend> fList = new ArrayList<Friend>();
    	
    	String name = "";
    	String hp = "";
    	String school ="";
    	
    	System.out.println("친구를 3명 등록해주세요.");
    	
    	for(int i = 0; i < 3; i++) {
    		name = sc.next();
    		hp = sc.next();
    		school = sc.next();
    	
    		Friend friends = new Friend(name, hp, school);
    		fList.add(i, friends);
    	}   	
    	
    	for(int i = 0; i < fList.size(); i++) {
        	fList.get(i).showInfo();
    	}
    	
    	sc.close();
    	
    }

}
