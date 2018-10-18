package com.qa.myblackjack;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BlackjackTest {
	Blackjack b = new Blackjack();
	static int i = 1;
	@BeforeClass
public static void setup() {
	System.out.println("Welcome to the tets");
}
	@Before
public void initial() {
		System.out.println("Test: " + i + "/17");
	}
	@After
public void increment() {
		System.out.println("Test: " + i + "/17 finished");
		i++;
	}	
	@AfterClass
public static void finish() {
		System.out.println("Test Class Complete");
}
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
		assertEquals("Player Valid Better, Dealer Valid",20,b.play( 20, 10));}
	@Test
	public void test7() {
		assertEquals("Player Valid, Dealer Valid Better",20,b.play( 10, 20));}
	@Test
	public void test8() {
		assertEquals("Player Valid, Dealer Bust",10,b.play( 10, 30));}
	@Test
	public void test9() {
		assertEquals("Player Valid, Dealer Invalid High",0,b.play( 10, 50));}
	@Test
	public void test10() {
		assertEquals("Player Bust, Dealer Invalid Low",0,b.play( 30,-10));}
	@Test
	public void test11() {
		assertEquals("Player Bust, Dealer Valid",10,b.play( 30, 10));}
	@Test
	public void test12() {
		assertEquals("Player Bust, Dealer Bust",0,b.play( 30, 30));}
	@Test
	public void test13() {
		assertEquals("Player Bust, Dealer Invalid High",0,b.play( 30, 50));}
	@Test
	public void test14() {
		assertEquals("Player Invalid High, Dealer Invalid Low",0,b.play( 50,-10));}
	@Test
	public void test15() {
		assertEquals("Player Invalid High, Dealer Valid",0,b.play( 50, 10));}
	@Test
	public void test16() {
		assertEquals("Player Invalid High, Dealer Bust",0,b.play( 50, 30));}
	@Test
	public void test17() {
		assertEquals("Player Invalid High, Dealer Invalid High",0,b.play( 50, 50));}
	
}
