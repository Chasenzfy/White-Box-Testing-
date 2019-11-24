package com.test.jacoco.test;

import static org.junit.Assert.assertEquals;

/**
 * Created by superZh on 2019/10/1.
 */

import org.junit.Test;
import com.test.jacoco.HelloWorld;

public class HelloWorldTest {
    @Test
    public void testMethod1() {
        HelloWorld hw = new HelloWorld();
        String a = hw.Method1();
        assertEquals("Hello World", a);
    }

    @Test
    public void testMethod2() {
        HelloWorld hw = new HelloWorld();
        int a = hw.Method2(2, 1);
        assertEquals(3, a);
    }
    
    @Test
    public void testMethod3() {
    	/**
    	 * TODO：finish the test function
    	 */
    	HelloWorld hw = new HelloWorld();
    	int a1 = hw.Method3(6, -1, 1);
        int a2 = hw.Method3(6, -1, -1);
        int a3 = hw.Method3(6, 1, 1);
        int a4 = hw.Method3(6, 1, -1);
        int a5 = hw.Method3(4, -1, 1);
        int a6 = hw.Method3(4, -1, -1);
        int a7 = hw.Method3(4, 1, 1);
        int a8 = hw.Method3(4, 1, -1);
        int b1 = hw.Method3(4, -1, -3);
        int b2 = hw.Method3(4, -1, -1);
        int b3 = hw.Method3(8, -1, -3);
        int b4 = hw.Method3(8, -1, -1);
    }

    @Test
    public void testMethod4(){
        HelloWorld hw = new HelloWorld();

        int a = hw.Method4(0, 1, 2, 3, 4);
        int b = hw.Method4(2, 2, 3, 2, 4);
        int c = hw.Method4(2, 1, 2, 3, 4);
        int c1 = hw.Method4(4, 1, 2, 2, 4);
        int d = hw.Method4(5, 1, 2, 2, 4);
        int e = hw.Method4(5, 1, 1, 2, 4);

    }

    @Test
    public void testbug(){
        HelloWorld hw = new HelloWorld();
        boolean a = hw.bug(5);
        boolean b = hw.bug(3);
    }

    @Test
    public void testisTriangle(){
        HelloWorld hw = new HelloWorld();
        boolean a1 = hw.isTriangle(0, 1, 2);
        boolean a2 = hw.isTriangle(1, 0, 2);
        boolean a3 = hw.isTriangle(1, 1, -1);
        boolean b = hw.isTriangle(1, 1, 2);
        boolean c = hw.isTriangle(2, 4, 2);
        boolean d = hw.isTriangle(5, 3, 2);
        boolean e = hw.isTriangle(2, 2, 2);
    }

    @Test
    public void testisBirthday(){
        HelloWorld hw = new HelloWorld();
        boolean a1 = hw.isBirthday(1200, 1, 2);
        boolean a2 = hw.isBirthday(2200, 0, 2);
        boolean a3 = hw.isBirthday(2000, 0, 2);
        boolean b = hw.isBirthday(2000, 13, 2);
        boolean c = hw.isBirthday(2000, 8, 0);
        boolean d = hw.isBirthday(2000, 8, 32);

        boolean e = hw.isBirthday(2000, 2, 30);
        boolean f = hw.isBirthday(2000, 2, 29);
        boolean f2 = hw.isBirthday(2000, 2, 27);
        boolean g = hw.isBirthday(2001, 2, 29);
        boolean g2 = hw.isBirthday(2001, 2, 27);

        boolean h0 = hw.isBirthday(2001, 4, 31);
        boolean h1 = hw.isBirthday(2001, 4, 30);
        boolean h2 = hw.isBirthday(2001, 6, 31);
        boolean h3 = hw.isBirthday(2001, 9, 31);
        boolean h4 = hw.isBirthday(2001, 11, 31);
        boolean h5 = hw.isBirthday(2001, 12, 31);

        boolean cc = hw.isBirthday(2000, 8, 3);
    }

    @Test
    public void testminiCalculator(){
        HelloWorld hw = new HelloWorld();
        double a1 = hw.miniCalculator(1,1,'+');
        double a2 = hw.miniCalculator(1,1,'-');
        double a3 = hw.miniCalculator(2,1,'*');
        double a4 = hw.miniCalculator(1,1,'/');
        double a5 = hw.miniCalculator(1,0,'/');
        double a6 = hw.miniCalculator(2,0,'*');
        double b1 = hw.miniCalculator(1,1,'^');
    }
    /**
     * TODO: add the test function of other methods in HelloWorld.java
     */
}
