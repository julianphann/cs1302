package edu.uga.cs1302.txtbuff;
import java.util.*;
import edu.uga.cs1302.txtbuff.*;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
/**
 * The tester class for the TextLine programs.
 * This class implements methods from the derived classes.
 */
public class EditableTextLineTester{
    private EditableTextLine t1,t2;

    @Before
    public void setUp(){
	t1=new EditableTextLine();
	t2=new EditableTextLine("Julian");
    }
    @After
    public void tearDown(){
	t1=null;
	t2=null;
    }
    //test 1 Instantiation an EditableTextLine object with user-supplied String value within the default capacity
    @Test
    public void testInstantiateConstructor(){
	t1= new EditableTextLine("Julian");
	assertEquals(t1.length(),6);
	assertEquals(t1.capacity(),80);
    }
    @Test
    public void testInstantiateAtCapacity(){
	t1=new EditableTextLine("computersciencecomputersciencecomputersciencecomputersciencecomputersciencecompu");
	assertEquals(t1.length(),80);
	assertEquals(t1.capacity(),80);
    }
    @Test
    public void testInstantiateAboveCapacity(){
	t1=new EditableTextLine("computersciencecomputersciencecomputersciencecomputersciencecomputersciencecomputerscience");
	assertEquals(t1.length(),90);
	assertEquals(t1.capacity(),160);
    }
    @Test
    public void testAppend(){
	t2=new EditableTextLine("Julian");
	t2.append(" is my name.");
	assertEquals(t2.toString(), "Julian is my name.");
	assertEquals(t2.length(), 18);
	assertEquals(t2.capacity(),80);
    }
    @Test
    public void testAppendAboveCapacity(){
	t1= new EditableTextLine("Julian");
	t1.append(" is my name. Hiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
	assertEquals(t1.length(), 90);
        assertEquals(t1.capacity(),160);
    }
    @Test
    public void testInsertBeginning(){
	t2 = new EditableTextLine (" is my name.");
	t2.insert(0, "Julian");
	assertEquals(t2.toString(),"Julian is my name.");
        assertEquals(t2.length(),18);
        assertEquals(t2.capacity(),80);
    }
    @Test
    public void testInsertEnd(){
	t2 = new EditableTextLine ("12345");
	t2.insert(4,"6789");
	assertEquals(t2.length(),9);
        assertEquals(t2.capacity(),80);	
    }
    @Test
    public void testInsertMiddle(){
	t2=new EditableTextLine("12346789");
        t2.insert(4,"5");
        assertEquals(t2.toString(),"123456789");
        assertEquals(t2.length(),9);
        assertEquals(t2.capacity(),80);
    }
    @Test
    public void testInsertAboveCapacity(){
	t1=new EditableTextLine("Julian");
	t1.insert(5, "nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn");
	assertEquals(t1.toString(),"Juliannnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn");
	assertEquals(t1.length(),95);
	assertEquals(t1.capacity(),160);
    }
    @Test
    public void testReplaceBeginning(){
	t1=new EditableTextLine("Hi friend!");
	t1.replace(0,10, "Hello");
	assertEquals(t1.toString(), "Hello");
	assertEquals(t1.length(), 5);
	assertEquals(t1.capacity(), 80);
    }
   @Test
   public void testReplaceEnd(){
       t1=new EditableTextLine("Hey!");
       t1.replace(3,4,"o");
       assertEquals(t1.toString(), "Heyo");
       assertEquals(t1.length(), 4);
       assertEquals(t1.capacity(), 80);
   }
   @Test
   public void testReplaceMiddle(){
       t1=new EditableTextLine("Hey!");
       t1.replace(3,4, " friend!");
       assertEquals(t1.toString(),"Hey friend!");
       assertEquals(t1.length(), 11);
       assertEquals(t1.capacity(), 80);
   }
   @Test
   public void testReplaceAboveCapacity(){
       t1=new EditableTextLine("Julian");
       t1.replace( 5, 6, "nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn");
       assertEquals(t1.toString(), "Juliannnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn");
       assertEquals(t1.length(), 95);
       assertEquals(t1.capacity(), 160);
   }
    @Test(expected = edu.uga.cs1302.txtbuff.TextLineIndexOutOfBoundsException.class)
    public void testInsertIllegal(){
	t1=new EditableTextLine("Computer");
	t1.insert(-1,"Science");
	t1.insert(100, "Science");
    }
    @Test(expected = edu.uga.cs1302.txtbuff.TextLineIndexOutOfBoundsException.class)
    public void testReplaceIllegal(){
	t1=new EditableTextLine("Computer");
	t1.replace(-1,100, "Science");
	t1.replace(0,100, "Science");
    }
    @Test
    public void testEqualsTrue(){
	t1=new EditableTextLine ("Julian");
	t2=new EditableTextLine ("Julian");
	assertTrue(t1.equals(t2));
	assertTrue(t1.equals(t1));
	assertTrue(t2.equals(t1));
	assertTrue(t2.equals(t2));
    }
    @Test
    public void testEqualsFalse(){
	t1=new EditableTextLine ("Julian");
        t2=new EditableTextLine ("Juliann");
        assertFalse(t1.equals(t2));
        assertFalse(t2.equals(t1));
    }
    @Test
    public void testZeroCapacity(){
	t1=new EditableTextLine ("");
	assertEquals(t1.length(), 0);
	assertEquals(t1.capacity(), 80);
    }
}
