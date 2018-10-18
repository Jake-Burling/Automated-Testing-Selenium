package com.qa.myblackjack;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class bustTest {
	Blackjack b = new Blackjack();
	@Test
	public void test1() {
		assertEquals("Player Valid, Dealer Bust",10,b.play( 10, 30));}
	@Test
	public void test2() {
		assertEquals("Player Bust, Dealer Valid",10,b.play( 30, 10));}
	@Test
	public void test3() {
		assertEquals("Player Bust, Dealer Bust",0,b.play( 30, 30));}
}
