package com.qa.myblackjack;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class normalTest {
	Blackjack b = new Blackjack();

	@Test
	public void test1() {
		assertEquals("Player Valid Better, Dealer Valid",20,b.play( 20, 10));}
	@Test
	public void test2() {
		assertEquals("Player Valid, Dealer Valid Better",20,b.play( 10, 20));}
}
