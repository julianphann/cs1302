package edu.uga.cs1302.vehicles;
//abstract class called Vehicle that implements Transporter interface
public abstract class Vehicle implements Transporter{
    /* The visibiliy of the Vehicle class' variables are set to "protected" 
 * except for the instances variable.
 * The protected variables are protected so that they can only be accessed 
 * and inherited by Vehicle's sub-classes.
 */ 
        protected String name;
        protected String manufacturer;
        protected int yearOfManufacture;
    /* The Instances variable is declared as public static  because 
     * this variable is required to be incremented each time 
     * the Vehicle class is instantiated, thus it needs to be 
     * shared with all the objects that inherits this class.
     *
     * The instances variable holds the number of Vehicle class instances.
     */
        public static int instanceCount=0;
        protected int maxPassengers;
        protected int topSpeed;
//set instance variables to reference variables     
        public Vehicle(String name,String manufacturer,int yearOfManufacture,int maxPassengers,int topSpeed){
            this.name=name;
            this.manufacturer=manufacturer;
            this.yearOfManufacture=yearOfManufacture;
	    instanceCount++;
            this.maxPassengers=maxPassengers;
            this.topSpeed=topSpeed;
        }
    //getters and setters
        public String getName(){
            return name; 
        }
        public void setName(String name){
            this.name=name;
        }
        public String getManufacturer(){
            return manufacturer;
        }
        public void setManufacturer(String manufacturer){
            this.manufacturer=manufacturer;
        }
        public int getYearOfManufacture(){
            return yearOfManufacture;
        }
        public void setYearOfManufacture(int yearOfManufacture){
            this.yearOfManufacture=yearOfManufacture;
        }
        public static int getInstanceCount(){
            return instanceCount;
        }
        public int getMaxPassengers(){
            return maxPassengers;
        }
        public void setMaxPassengers(int maxPassengers){
            this.maxPassengers=maxPassengers;
        }
        public int getTopSpeed(){
            return topSpeed;
        }
        public void setTopSpeed(int topSpeed){
            this.topSpeed=topSpeed;
        }
}
