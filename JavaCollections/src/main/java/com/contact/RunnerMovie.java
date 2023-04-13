package com.contact;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RunnerMovie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movie movie=new Movie("Jan Vick","Language",6,"hero");
		System.out.println(movie);
	ArrayList<Movie> movies=new ArrayList<Movie>();
	movies.add(movie);
	movies.add(new Movie("Jan Vick1","Language1",6,"hero1"));
	System.out.println(movies);
	movies.add(new Movie("Jan Vick2","Language2",6,"hero2"));
	movies.add(new Movie("Jan Vick3","Language3",7,"hero3"));
	movies.add(new Movie("Jan Vick4","Language4",8,"hero4"));
	movies.add(new Movie("Jan Vick5","Language1",9,"hero4"));
	System.out.println(movies);
	System.out.println("---------------");
	FilterActor actor=new FilterActor("hero4");
	Object result[]=movies.stream().filter(actor).toArray();
	System.out.println(Arrays.toString(result));
	Object rating[]=movies.stream().filter(s->s.getRating()>5).toArray();
	System.out.println(Arrays.toString(rating));
	}
}
