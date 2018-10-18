package com.qa.myblackjack;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class invalidTest {
	Blackjack b = new Blackjack();

	@Test
	public void test1() {
		assertEquals("Player Invalid Low, Dealer Invalid Low",0,b.play(-10,-10));}
	@Test
	public void test2() {
		assertEquals("Player Invalid Low, Dealer Valid",0,b.play(-10, 10));}
	@Test
	public void test3() {
		assertEquals("Player Invalid Low, Dealer Bust",0,b.play(-10, 30));}
	@Test
	public void test4() {
		assertEquals("Player Invalid Low, Dealer Invalid High",0,b.play(-10, 50));}
	@Test
	public void test5() {
		assertEquals("Player Valid, Dealer Invalid Low",0,b.play( 10,-10));}
	@Test
	public void test6() {
		assertEquals("Player Valid, Dealer Invalid High",0,b.play( 10, 50));}
	@Test
	public void test7() {
		assertEquals("Player Bust, Dealer Invalid Low",0,b.play( 30,-10));}
	@Test
	public void test8() {
		assertEquals("Player Bust, Dealer Invalid High",0,b.play( 30, 50));}
	@Test
	public void test9() {
		assertEquals("Player Invalid High, Dealer Invalid Low",0,b.play( 50,-10));}
	@Test
	public void test10() {
		assertEquals("Player Invalid High, Dealer Valid",0,b.play( 50, 10));}
	@Test
	public void test11() {
		assertEquals("Player Invalid High, Dealer Bust",0,b.play( 50, 30));}
	@Test
	public void test12() {
		assertEquals("Player Invalid High, Dealer Invalid High",0,b.play( 50, 50));}
}
