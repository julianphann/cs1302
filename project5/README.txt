First, ensure that your bash profile is correctly set up.

Copy country_continent.csv file into your cs1302/project5/src/main/resources directory 

To compile the project, execute in the project5 directory:

mvn compile

To run it, first start your X11 server, if on a Windows computer (on a
Mac, XQuartz should start automatically) and connect to odin with X11
forwarding enabled.

Then execute in project5 directory:

mvn javafx:run

You can also clean the project by executing:

mvn clean
