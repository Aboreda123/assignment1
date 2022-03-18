package com.splineguy.junit.quotient;
import static org.junit.Assert.*;
import org.junit.Test;
import java.io.ByteArrayInputStream;

public class myclass2test {
    @Test
    public void test1(){
        String data="4\n"+"1 7 11 3\n"+"5 9 13 2\n"+"-3 -2 -4 -2\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        assertEquals(myclass2.myclass2(),false);
    }
    @Test
    public void test2(){
        String data="3\n"+"7 9 9\n"+"-3 -4 -6\n"+"-4 -5 -3\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        assertEquals(myclass2.myclass2(),true);
    }
    @Test
    public void test3(){
        String data="5\n"+"9 -11 -4 -2 3\n"+"4 -6 3 4 5\n"+"9 -2 -4 -2 -2\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        assertEquals(myclass2.myclass2(),false);
    }
}
