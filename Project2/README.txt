Complile Commands:

Working directory: cd cs1302/Project2

This Project contains two directory paths in the working directory- 
classes and src. 

When compiling the interface classes, the compiled file should
be set (-d) to the classes/ directory. They all belong to
 the edu.uga.cs1302.vehicles package.

Transporter interface: 
Transporter interface:
$javac -d classes src/edu/uga/cs1302/vehicles/Transporter.java

Flyable interface:
$javac -d classes src/edu/uga/cs1302/vehicles/Flyable.java

Floatable interface:
$javac -d classes src/edu/uga/cs1302/vehicles/Floatable.java


When compiling the abstract class Vehicle.java,the Transporter
"interface" is implmented, requiring a classpath to be set to
the edu.uga.cs1302.vehicles package.

Vehicle class:
$javac -d classes -cp classes src/edu/uga/cs1302/vehicles/Vehicle.java

The Automobile, Airplane, Ship, FlyingBoat, and MagicSchoolBus classes
will have the same classpath because they inherit the Vehicle class.

$javac -d classes -cp classes src/edu/uga/cs1302/vehicles/Automobile.java
$javac -d classes -cp classes src/edu/uga/cs1302/vehicles/Airplane.java
$javac -d classes -cp classes src/edu/uga/cs1302/vehicles/Ship.java
$javac -d classes -cp classes src/edu/uga/cs1302/vehicles/FlyingBoat.java
$javac -d classes -cp classes src/edu/uga/cs1302/vehicles/MagicSchoolBus.java

The main class will also have the same classpath because it is in the same
package 

$javac -d classes -cp classes src/edu/uga/cs1302/vehicles/Main.java

This command can also be used to compile all classes in the package:
$javac -d classes -cp classes src/edu/uga/cs1302/vehicles/*.java

When executing the program, the classpath to the package and the fully
qualified name of the Main class must be specified.

Execution command:
$java -cp classes edu.uga.cs1302.vehicles.Main

