package com.qa.myblackjack;

public class Blackjack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int play(int player, int dealer) {
		if(player < 0 || dealer < 0) {//both invalid low
			return 0;
		}
		else if(player > 31 || dealer >31) {//both invalid high
			return 0;
		}
		else if(player <= 21 && dealer <=21 && player > dealer) {//both valid player better
			return player;
		}
		else if(player <=21 && dealer <=21 && player <= dealer) {//both valid dealer better
			return dealer;
		}
		else if(player > 21 && player <= 31 && dealer <= 21) {//player bust dealer valid
			return dealer;
		}
		else if(dealer > 21 && dealer <= 31 && player <= 21) {//dealer bust player valid
		return player;
		}
		return 0;
	}
}
