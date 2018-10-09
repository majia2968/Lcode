package com.agile.practice.c100.tree;

public class Battleship {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] battleship = {{"X", ".", "X", ".", "X"}, {"X", ".", "X", ".", "X"},{"X", ".", "X", ".", "X"}, 
				{"X", ".", "X", ".", "X"}, {"X", "X", "X", ".", "X"}, {"X", "X", "X", ".", "X"}};
		for (int i = 0; i < battleship.length; i++) {
			for (int j = 0; j < battleship[i].length; j++) {
				System.out.print(battleship[i][j]);
			}
			System.out.println("\\n");
		}
		System.out.println(countBattleship(battleship));
	}
	
	public static int countBattleship(String[][] ship) {
		int count = 0;
		for (int i = 0; i < ship.length; i++) {
			for (int j = 0; j < ship[i].length; j++) {
				if (ship[i][j] == ".") continue;
				if ((i > 0) && ship[i-1][j] == "X") {
					continue;
				}
				if ((j > 0) && ship[i][j-1] == "X") {
					continue;
				}
				count++;
			}
		}
		return count;
	}

}
