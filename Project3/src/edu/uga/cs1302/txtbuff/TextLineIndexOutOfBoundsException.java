package edu.uga.cs1302.txtbuff;
import java.lang.IndexOutOfBoundsException;
/**This class entends IndexOutOfBoundsException and serves as an exception class. It provides multiple constructors for creating instances of the exception
 */
public class TextLineIndexOutOfBoundsException extends IndexOutOfBoundsException{
    /**
     *Creates an <code> IndexOutOfBoundsException</code> object.This constructor calls default constructor of the IndexOutOfBoundsException class to create the exception object
     */
    public TextLineIndexOutOfBoundsException(){
	super();
    }
    /**
     *creates an <code>IndexOutOfBoundsException</code> object.
     *This constructor calls the IndexOutOfBoundsException constructor and creates an object that passes the error message to the String <code>errMsg</code> argument.
     *@param errMsg the parameter that stores String of error message
    */
    public TextLineIndexOutOfBoundsException(String errMsg){
	super(errMsg);
    }
    /**
     *Creates an <code>IndexOutOfBoundsException</code> object.
     *COnstructor calls the IndexOutOfBoundsException constructor and creates an exception objectthat icludes out of bounds index as an argument to the int <code>index</code> parameter.
     */
    public TextLineIndexOutOfBoundsException(int index){
	super("TextLine index out of range: " + index);
    }
}
