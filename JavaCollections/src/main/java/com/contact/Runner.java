package com.contact;

import java.util.ArrayList;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		contact c1=new contact("suni", "reddy", "999999999", "test@gmail.com");
		System.out.println(c1);
		
		//array of contacts
		contact contacts[]=new contact[5];
		contacts[0]=new contact("sunil", "reddys", "899999999", "test1@gmail.com");
		contacts[1]=new contact("sunil1", "reddys1", "8999999991", "test11@gmail.com");
		contacts[2]=new contact("sunil2", "reddys2", "2899999999", "test12@gmail.com");
		contacts[3]=new contact("sunil3", "reddys3", "8999999993", "test13@gmail.com");
		contacts[4]=new contact("sunil4", "reddys4", "8999999994", "test14@gmail.com");
		System.out.println(contacts[4]);

		///arrayList
		ArrayList<contact> contactlist=new ArrayList<contact>();
		contactlist.add(c1);
		contactlist.add(new contact("sunil", "reddys", "899999999", "test1@gmail.com"));
		contactlist.add(new contact("sunil", "reddys", "899999999", "test1@gmail.com"));
		contactlist.add(new contact("sunil", "reddys", "899999999", "test1@gmail.com"));
		contactlist.add(new contact("sunil", "reddys", "899999999", "test1@gmail.com"));
		contactlist.add(new contact("sunil", "reddys", "899999999", "test1@gmail.com"));
		System.out.println(contactlist);
		System.out.println(contactlist.size());

	}

}
