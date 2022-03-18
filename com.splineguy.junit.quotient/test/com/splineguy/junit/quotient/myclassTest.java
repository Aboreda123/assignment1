package com.splineguy.junit.quotient;
import static org.junit.Assert.*;
import org.junit.Test;
import java.io.ByteArrayInputStream;

import org.junit.Test;

import static org.junit.Assert.*;

public class myclassTest {


    @Test
    public void test1(){
        String data="10";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        assertEquals(myclass.myclass(),true);
    }
    @Test
    public void test2(){
        String data="1";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        assertEquals(myclass.myclass(),false);
    }
    @Test
    public void test3(){
        String data="102";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        assertEquals(myclass.myclass(),false);
    }
    @Test
    public void test4(){
        String data="9";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        assertEquals(myclass.myclass(),false);
    }
    @Test
    public void test5(){
        String data="2";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        assertEquals(myclass.myclass(),false);
    }
    @Test
    public void test6(){
        String data="12";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        assertEquals(myclass.myclass(),true);
    }
}