package com.contact;

import java.util.ArrayList;
import java.util.LinkedList;

public class listPerformance {
 public static void main(String[] args) {
	
	 //arraylistAdd
	 ArrayList arraylist=new ArrayList();
	 LinkedList linkedlist=new LinkedList();
	 long StartTime=System.nanoTime();
	  for(int i=0;i<=500;i++) {
		 arraylist.add(i);
	 }
	 long EndTime=System.nanoTime();
	 long duration=StartTime-EndTime;
	 System.out.println("arraylist duration"+duration);
 
	 //linkedlistAdd
	 long StartTimell=System.nanoTime();
	  for(int i=0;i<=500;i++) {
		  linkedlist.add(i);
	 }
	 long EndTimell=System.nanoTime();
	 long durationll=StartTimell-EndTimell;
	 System.out.println("arraylist duration"+durationll);
	 
	  //arraylist remove
	 long StartTimer=System.nanoTime();
	  for(int i=499;i>=0;i--) {
		 arraylist.remove(i);
	 }
	 long EndTimer=System.nanoTime();
	 long durationr=StartTimer-EndTimer;
	 System.out.println("arraylist duration"+durationr);
	 // linkedlist remove
	 long StartTimerl=System.nanoTime();
	  for(int i=499;i>=0;i--) {
		 linkedlist.remove(i);
	 }
	 long EndTimerl=System.nanoTime();
	 long durationrl=StartTimerl-EndTimerl;
	 System.out.println("arraylist duration"+durationrl);
}
}
