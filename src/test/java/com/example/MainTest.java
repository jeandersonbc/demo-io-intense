package com.example;

import java.io.File;

import org.junit.AfterClass;
import org.junit.Test;

public class MainTest {

	final int COUNTER = 5;

	@Test
	public void readFooA() throws Exception {
		for (int i = 0; i < COUNTER; i++)
			Main.net();
	}

	@Test
	public void readFooB() throws Exception {
		for (int i = 0; i < COUNTER; i++)
			Main.net();
	}

	@AfterClass
	public static void tearDown() {
		File f = new File("information.html");
		f.delete();
	}

}
