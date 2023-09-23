package edu.uga.cs1302.txtbuff;
/**
 *The EditableTextLine class extends the TextLine class and implements the Editable interface.
 *Methods are derived feom the Editable interface
 */
public class EditableTextLine extends TextLine implements Editable{
    public char newBuffer[];
    /**
     *COnstructor creates an empty <code>EditableTextLine</code> object that calls on the parent constructor
     */
    public EditableTextLine(){
	super();
    }
    /**
     *COnstructor creates an <code>EditableTextLine</code> that passes the String <code>line</code> argument 
     *@param line String contained in the EditableTextLine
     */
    public EditableTextLine(String line){
	super(line);
    }
    //methods from Editable interface
    /**
     *Method appends the String <code>fragment</code> to the EditableTextLine
     *@param fragment the String appended
     */
    public void append(String fragment){
	length+=fragment.length();

	while(length>capacity){
	    capacity+=DEFAULT_SIZE;
	}
	newBuffer=new char[capacity];
	for(int i=0; i<textLine.length;i++){
	    newBuffer[i]=textLine[i];
	}
	for(int i=length-fragment.length(),j=0; i<length;i++,j++){
	    newBuffer[i]=fragment.charAt(j);
	}
	textLine=newBuffer;
    }
    /**
     *Method inserts the String <code>fragment</code> to the EditableTextLine at <code>index</code>.
     *@param index index where fragment is inserted
     *@param fragment String fragment that is being inserted
     *@throws TextLineIndexOutOfBoundsException thrown if index is out of bounds
     */
    public void insert(int index, String fragment)throws TextLineIndexOutOfBoundsException{
	length+=fragment.length();
        while(length>capacity){
            capacity+=DEFAULT_SIZE;
	}
        System.out.println(capacity);
        newBuffer=new char[capacity];
        for (int i=0;i<textLine.length;i++){
        newBuffer[i]=textLine[i];
    }
    if((index>=0)&& index<=length){
	textLine=new char[capacity];
	for(int a=0;a<capacity;a++){
	    textLine[a]=newBuffer[a];
	}
	int x=index;
	for(int b=0; b<fragment.length();b++){
	    newBuffer[x]=fragment.charAt(b);
	    x++;
	}
	for(int c=index; c<length-fragment.length();c++){
	    newBuffer[c+fragment.length()]=textLine[c];
	}
	textLine= new char[capacity];
	for(int y=0;y<capacity;y++){
	    textLine[y]=newBuffer[y];
	}
    }
    else{
	throw e= new TextLineIndexOutOfBoundsException(index);
    }
    }
    /**
     *Method replaces a part of the EditableTextLine from <code>start</code> index and <code>end</code> index of the EditableTextLine
     *@param start the starting index
     *@param end the ending index 
     *@param fragment String fragment that will replace characters between start and end 
     *@throws TextLineIndexOutOfBoundsException thrown if index is out of bounds  
     */
    public void replace(int start, int end, String fragment)throws TextLineIndexOutOfBoundsException{
        if((start<=length && start>=0)&& (end<capacity && end>=0)){
            if(fragment.length()<end-start){
                length-=(end-start)-fragment.length();
            }
            else if(fragment.length()>end-start){
                length+=fragment.length()-(end-start);
            }
            while(length>capacity){
                capacity+=DEFAULT_SIZE;
            }
	    
            newBuffer= new char[capacity];
	    
            for(int i=0;i<textLine.length;i++){
                newBuffer[i]=textLine[i];
            }
            if(end-start==0){
                textLine= new char[capacity];
		for(int a=0;a<capacity;a++){
		    textLine[a]=newBuffer[a];
		}
		for(int b=start;b<length-fragment.length();b++){
		    newBuffer[b+fragment.length()]=textLine[b];
		}
		int x=start;
		for(int c=0;c<fragment.length();c++){
		    newBuffer[x]=fragment.charAt(c);
		    x++;
		}
		textLine=new char[capacity];
		for(int d=0;d<capacity;d++){
		    textLine[d]=newBuffer[d];
		}
	    }
	    else if((start==0)&&(end>=length-1)){
		int x=0;
		for (int a=0;a<fragment.length();a++){
		    newBuffer[x]=fragment.charAt(a);
		    x++;
		}
		textLine=new char[capacity];
		for(int b=0;b<fragment.length();b++){
		    textLine[b]=newBuffer[b];
		}
	    }
	    else if(fragment.length()==(end-start)){
		textLine=new char[capacity];
		for (int a=0;a<capacity;a++){
		    textLine[a]=newBuffer[a];
		}
		int x= start;
		for(int b=0;b<fragment.length();b++){
		    newBuffer[x]=fragment.charAt(b);
		    x++;
		}
		textLine=new char[capacity];
		for(int c=0;c<capacity;c++){
		    textLine[c]=newBuffer[c];
		}
	    }
	    else if(fragment.length()<end-start){
		for(int a=start; a<length;a++){
		    newBuffer[a+fragment.length()]=textLine[a+(end-start)];
		}
		int x=start;
		for(int b=0;b<fragment.length();b++){
		    newBuffer[x]=fragment.charAt(b);
		    x++;
		}
		textLine=new char[capacity];
		for (int c=0;c<length;c++){
		    textLine[c]=newBuffer[c];
		}
	    }
	    else if(fragment.length() > end-start){
		if(end>=length-1){
		    int x=start;
		    for(int b=0;b<fragment.length();b++){
			newBuffer[x]=fragment.charAt(b);
			x++;
		    }
		    textLine=new char[capacity];
		    for(int c=0;c<length;c++){
			textLine[c]=newBuffer[c];
		    }
		}
		else{
		    for(int a=start;a<length-fragment.length();a++){
			newBuffer[a+fragment.length()]=textLine[end];
			end++;
		    }
		    int x=start;
		    for(int b=0;b<fragment.length();b++){
			newBuffer[x]=fragment.charAt(b);
			x++;
		    }
		    textLine=new char[capacity];
		    for(int c=0;c<length;c++){
			textLine[c]=newBuffer[c];
		    }
		}
	    }
	}
	else{
	    throw e =  new TextLineIndexOutOfBoundsException("TextLine"+" indexes out of range "+start+", "+end);
	}
    }
}
    

