Set CLASSPATH in .bash_profile to the following directories:


Be in the ~/cs1302/Project3 directory 

Compile TextLineIndexOutOfBoundsException.java:
javac -d classes src/edu/uga/cs1302/txtbuff/TextLineIndexOutOfBoundsException.java


Compile TextLine.java:
javac -d classes -cp classes src/edu/uga/cs1302/txtbuff/TextLine.java


Compile Editable.java:
javac -d classes -cp classes src/edu/uga/cs1302/txtbuff/Editable.java


Compile EditableTextLine.java:
javac -d classes -cp classes src/edu/uga/cs1302/txtbuff/EditableTextLine.java


Compile EditableTextLineTester.java:
javac -d classes src/edu/uga/cs1302/test/EditableTextLineTester.java

To Run EditableTextLineTester:
java org.junit.runner.JUnitCore edu.uga.cs1302.txtbuff.EditableTextLineTester


Javadoc:
In the Project3 directory, make a directory titled html
mkdir html
Run the following command to complie Javadocs:
javadoc -d html -sourcepath src -subpackages edu
