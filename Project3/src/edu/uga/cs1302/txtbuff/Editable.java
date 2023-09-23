package edu.uga.cs1302.txtbuff;

//The Editable interface allows the abstract methods to be inherited
/**
 *Interface allows methods to be inherited by a class that would manipulate contexts of TextLine
 */
public interface Editable{
    void append(String fragment);
    void insert(int index, String fragment)
	throws TextLineIndexOutOfBoundsException;
    void replace(int start, int end, String fragment)
	throws TextLineIndexOutOfBoundsException;
    
}
