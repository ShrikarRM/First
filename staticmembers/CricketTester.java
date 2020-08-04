package com.account.staticmembers;

public class CricketTester {

	public static void main(String[] args) {
		System.out.println("Name of tournament: " + Cricket.tournamentName);
		Cricket.intournamentName();

		Cricket odi = new Cricket(1, "Sachin");
		odi.display();

		Cricket t20 = new Cricket(2, "Saurav");
		t20.display();
	}

}
