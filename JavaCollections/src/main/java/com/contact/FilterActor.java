package com.contact;

import java.util.function.Predicate;

public class FilterActor implements Predicate<Movie>{
	private String actor;
	
	public FilterActor(String actor) {
		super();
		this.actor = actor;
	}

	public boolean test(Movie t) {
		// TODO Auto-generated method stub
		if(t.getStar().equalsIgnoreCase(actor)) {
		return true;
		}else {
		return false;
		}
	}

}
