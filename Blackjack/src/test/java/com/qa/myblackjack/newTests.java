package com.qa.myblackjack;

import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Collection;
import org.junit.*;
import org.junit.runner.*;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class newTests {
	Blackjack b = new Blackjack();
	
@Parameters
public static Collection<Object[]>data(){
return Arrays.asList(new Object[][] {{0,-10,-10},{0,-10,10},{0,-10,30},{0,-10,50},{0,10,-10}});
}
private int intexpect;
private int intplayer;
private int intdealer;

public newTests(int expect, int player, int dealer) {
	intexpect = expect;
	intplayer = player;
	intdealer = dealer;
}
@Test
public void test() {
	assertEquals(intexpect,b.play(intplayer, intdealer));
}
}
