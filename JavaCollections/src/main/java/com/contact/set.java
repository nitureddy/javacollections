package com.contact;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class set {
public static void main(String[] args) {
	//arraylist
	ArrayList<String> arrayList=new ArrayList<String>();
	arrayList.add("sunitha");
	arrayList.add("sunitha");
	arrayList.add("Reddy");
	arrayList.add("Reddy");
	arrayList.add("Mudigolam");
	arrayList.add("Mudigolam");
	System.out.println(arrayList);
		//Treeset sort in alpahbitical order
	TreeSet<String> treeset=new TreeSet<String>();
	treeset.add("sunitha");
	treeset.add("sunitha");
	treeset.add("Reddy");
	treeset.add("Reddy");
	treeset.add("Mudigolam");
	treeset.add("Mudigolam");
	System.out.println(treeset);
	//HashSet not sort in alpahbitical order
	HashSet<String> hashset=new HashSet<String>();
	hashset.add("sunitha");
	hashset.add("sunitha");
	hashset.add("Reddy");
	hashset.add("Reddy");
	hashset.add("Mudigolam");
	hashset.add("Mudigolam");
	System.out.println(hashset);
	
}
}
