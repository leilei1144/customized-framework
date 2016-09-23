package com.customized.util;

import java.math.BigDecimal;
import java.util.Calendar;

public class Guid {
	public static final int bit = 18;
	  private static int one = 100;

	  private static int two = 999;

	  private static long three = -1L;
	  private static long four = -1L;
	  private static int five = 0;

	  private static String six = null;

	  private static Guid seven = null;

	  private Guid() {
	    Calendar c = Calendar.getInstance();
	    long startuptime = c.getTimeInMillis();
	    int dy = c.get(6);
	    int ys = c.get(1);
	    c.set(10, 0);
	    c.set(12, 0);
	    c.set(13, 0);
	    long zerotime = c.getTimeInMillis();

	    three = System.nanoTime();
	    four = (startuptime - zerotime) * 1000L;
	    five = (ys * 365 + dy) % 10000;

	    seven();
	  }

	  private static Guid four() {
	    if (seven == null) {
	      synchronized (Guid.class) {
	        if (seven == null)
	          seven = new Guid();
	      }
	    }
	    return seven;
	  }

	  public static String g() {
	    return four().two();
	  }

	  private synchronized String two() {
	    if (one >= two)
	      seven();
	    else
	      one += 1;
	    return six + one;
	  }

	  private static void seven() {
	    long s = System.nanoTime();
	    while (s - three < 1000L) {
	      s = System.nanoTime();
	    }

	    long stub = four + (s - three) / 1000L;

	    six = five + String.valueOf(stub);
	    int i = 18 - six.length() - 1;
	    one = new BigDecimal(Math.pow(10.0D, i)).intValue();
	    two = one * 10 - 1;
	  }

	 /* public static void main(String[] args) {
	    long start = System.nanoTime();

	    for (int i = 0; i < 100000; i++)
	    {
	      String f = g();
	      System.out.println(f);
	    }

	    System.out.println("=============finished=================" + (System.nanoTime() - start) / 1000000L);
	  }*/
}
