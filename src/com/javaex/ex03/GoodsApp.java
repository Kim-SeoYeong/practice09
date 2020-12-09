package com.javaex.ex03;

import java.util.ArrayList;
import java.util.Scanner;

public class GoodsApp {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("상품을 입력해주세요(종료 q)");
    	
    	ArrayList<String> sList = new ArrayList<String>();
    	ArrayList<Goods> gList = new ArrayList<Goods>();
    	
    	int sum = 0;
    	int j = 0;
    	
    	System.out.println("상품을 입력해주세요(종료 q)");
    	
    	while(true) {
    		String str = sc.nextLine();
    		String[] goodsStr = str.split(",");	//입력받은 값을 ,단위로 잘라서 배열에 넣음
    		
    		if (str.equals("q")) {	//q를 입력시 프로그램 종료
    			break;
    		}
    		//sList에 ,단위로 잘린 값을 넣어줌
    		for(int i = 0; i < goodsStr.length; i++) {
    			sList.add(i, goodsStr[i]);
    		}
    		
    		String name = sList.get(0);
    		int price = Integer.parseInt(sList.get(1));
    		int count = Integer.parseInt(sList.get(2));
    	
    		//goods에 값을 넣어주는 과정
    		Goods goods = new Goods(name, price, count);
    		gList.add(j, goods);	//gList에 goods값을 add하는데 index카운트해주는 변수가 없어서
    		j ++;	//j라는 변수를 1씩 증가시켜 add해줌.
    		
    	}	
    	
    	System.out.println("[입력완료]");
		System.out.println("=======================");
    	System.out.println(gList.size());
    	for(int i = 0; i < gList.size(); i++) {
        	gList.get(i).showInfo();
			sum += gList.get(i).getCount();
    	}

		System.out.println("모든 상품의 갯수는 " + sum + " 개 입니다.");
    	
    	sc.close();

    }

}
