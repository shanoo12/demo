package com.example.demo;

public class Account extends OnlineAccount implements Comparable<Account>{
	Integer noOfRegularMovies;
	Integer noOfExclusiveMovies;
	String ownersName;
	

	public Account(Integer noOfRegularMovies, Integer noOfExclusiveMovies, String ownersName) {
		super();
		this.noOfRegularMovies = noOfRegularMovies;
		this.noOfExclusiveMovies = noOfExclusiveMovies;
		this.ownersName = ownersName;
	}
	public double monthlyCost()
	{
		return basePrice+this.noOfRegularMovies*regularMoviePrice+noOfExclusiveMovies*exclusivemoviePrice;
	}

	@Override
	public int compareTo(Account o) {
		
		Double a=this.monthlyCost()-o.monthlyCost();
		return a.intValue();
	}
	
	public String toString() {
		return "Owner is:"+this.ownersName+"monthlyCost is "+this.monthlyCost()+" USD";
	}

}
