package com.qa.myblackjack;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({normalTest.class, bustTest.class})

public class ValidEntrySuite {

}
