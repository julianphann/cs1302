package edu.uga.cs1302.list;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

public class SimpleLinkedListTest{
    private SimpleLinkedList<String>t1;

    @Before
    public void setUp(){
	t1=new SimpleLinkedList<String>();
    }
    @After
    public void tearDown(){
	t1=null;
    }
    /**
     *Test 1: Test to see remove() method
     *removing a node at an index in the beginning, middle, and end of the node list 
     */
    @Test
    public void testRemoveIndex(){
	t1.add("A");
	t1.add("B");
	t1.add("C");
	t1.add("D");
	t1.add("E");
	t1.add("F");

	assertEquals(t1.remove(0),"A");
	assertEquals(t1.remove(2),"D");
	assertEquals(t1.remove(3),"F");
	assertEquals(t1.get(1),"C");
    }
    /**
     *Test 2: Test to see if remove method was executed by checking indices
     */
    @Test
    public void testRemove(){
        t1.add("A");
        t1.add("B");
        t1.add("C");
        t1.add("D");
        t1.add("E");
        t1.add("F");

	t1.remove(0);
	t1.remove(2);
	t1.remove(3);

	assertEquals(t1.get(0),"B");
	assertEquals(t1.get(1),"C");
	assertEquals(t1.get(2),"E");
    }
    @Test
    public void testIndexOf(){
	t1.add("A");
	t1.add("B");
	t1.add("C");
	t1.add("D");
	t1.add("E");
	t1.add("F");

	t1.remove(0);
	t1.remove(1);
	t1.remove(3);

	assertEquals(t1.get(0),"B");
	assertEquals(t1.get(1),"D");
	assertEquals(t1.get(2),"E");

	assertEquals(t1.indexOf("B"),0);
	assertEquals(t1.indexOf("D"),1);
	assertEquals(t1.indexOf("E"),2);
    }
    @Test(expected = IndexOutOfBoundsException.class)
    public void testException(){
	t1.add("A");
	t1.remove(-1);
    }
}
