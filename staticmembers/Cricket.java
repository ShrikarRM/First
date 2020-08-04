package com.account.staticmembers;

public class Cricket {
	int jersyNum;
	String playerName;
	static String tournamentName;

	static {
		// Initialization
	}

	public Cricket(int jersyNum, String playerName) {
		this.jersyNum = jersyNum;
		this.playerName = playerName;
	}

	static void intournamentName() {
		tournamentName = "Ranji";
	}

	void display() {
		System.out.println("jersyNum of player= " + jersyNum);
		System.out.println("Name of player= " + playerName);
		System.out.println("Name of tournament= " + tournamentName);
	}

}
