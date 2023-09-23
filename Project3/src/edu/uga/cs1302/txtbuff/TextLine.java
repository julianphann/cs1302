package edu.uga.cs1302.txtbuff;
/**
 *TextLine class holds information for TextLines.
 *Program throws exceptions from TextLineIndexOutOfBoundsException class of the same package.
 *DEFAULT_SIZE is declared aa final because the value should not be changed.
 *variables are protected because they should only be avaliable to classes in the same package or subclasses
*/
public class TextLine{
    public final int DEFAULT_SIZE=80;
    protected char[] textLine;
    protected int length;
    protected int capacity;
    protected String text;
    protected TextLineIndexOutOfBoundsException e;
    /**
     *Creates an <code>TextLine</code> object. This constructor creates an empty TextLine char array with a set capacity of 80
     */
    public TextLine(){
	length=0;
	capacity=DEFAULT_SIZE;
	textLine= new char[capacity];
	text="";
    }
    /**
     * Creates an <code>TextLine</code> object. This constructor creates a TextLIne char array containing characters from the String <code>line</code> 
     *@param line Strinf contained in the TextLine
     */
    public TextLine(String line){
	length=line.length();
	text=line;
	if(length==0){
	    capacity=DEFAULT_SIZE;
	    textLine = new char[capacity];
	}
	else{
	    while(length>capacity){
		capacity+=DEFAULT_SIZE;
	    }
	textLine=new char[capacity];
	for(int i=0; i<length;i++){
	    textLine[i]=line.charAt(i);
	}
	}
    }
    /**
     *returns length of the TextLine
     *@return length the length of TextLine
     */
    public int length(){
	return length;
    }
    /**
     *returns the capacity of the TextLine 
     *@return capacity the capacity of TextLine
     */
    public int capacity(){
	return capacity;
    }
    /**
     *Finds and returns index of the first occurrence of the String <code>fragment</code> in TextLine
     *@param fragment String parameter being searched
     *@return index returns the index of the first occurrence
     */
    public int indexOf(String fragment){
	int x=0;
	int index=-1;
	//count keeps track of char comparisons
	int count=0;
	//loop matches fragment's char values to TextLine char values
	for(int i=0;i<length;i++){
	    x=i;
	    for(int j=0;i<fragment.length(); j++){
		if(textLine[x]==fragment.charAt(j)){
		    count++;
		    x++;
		    if(count==fragment.length()){
			index=i;
			i=length;
		    }
		}
		else{
		    count=0;
		    j=fragment.length();
		}
	    }
	}
	return index;
    }
    /**
     *Finds and returns the index of the first occurrence of the String <code>fragment</code> in TextLine from the <code>index</code>
     *@param fragment String being searched
     *@param fromIndex the starting index
     *@throws TextLineIndexOutOfBoundsException exception thrown if index is out of bounds
     */
    public int indexOf(String fragment, int fromIndex) throws TextLineIndexOutOfBoundsException{
	int x=0;
        int index=-1;
        int count=0;
	//compares chars in fragments and TextLine but a starting index is defined
	if((fromIndex<=length-1)&&(fromIndex>=0)){
		for(int i=fromIndex+1;i<length;i++){
		    x=i;
		    for(int j=0;i<fragment.length(); j++){
			if(textLine[x]==fragment.charAt(j)){
			    count++;
			    x++;
			    if(count==fragment.length()){
				index=i;
				i=length;
			    }
			}
			else{
			    count=0;
			    j=fragment.length();
			}
		    }

		}
	       }
        else{
            throw e = new TextLineIndexOutOfBoundsException(fromIndex);
        }
        return index;
	    }
    /**                                                                                         
     *Determines whether TextLinw is equal to <code>anObject</code> by comparing the characters  in both objects                                                                                
     *@param obj the object being compared to TextLine
     *@return compare boolean variable determines if objects match                                                                             
     */
    public boolean equals(Object obj){
	boolean compare=true;
	int count=0;

	if(((TextLine)obj).text.length()== length){
	    for (int i = 0; i < length; i++) {
				if (textLine[i] == ((TextLine) obj).text.charAt(i)) {
					continue;
				}
				else{
					compare = false;
					break;
				}
	    }
	    return compare;
	}
	else{
	       	compare = false;
	       	return compare;
	}
    }
    /**
     *COntents of the TextLine into a String
     *@return textString TextLine as a String
     */
    public String toString(){
	String textString="";
	for (int i=0;i<length;i++){
	    textString+=textLine[i];
	}
	return textString;
    }
}

