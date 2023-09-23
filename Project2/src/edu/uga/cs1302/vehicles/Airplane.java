package edu.uga.cs1302.vehicles;
//Airplane class is defined  as a subclass of Vehicle implementing Flyable.
public class Airplane extends Vehicle implements Flyable{
        //airplane has a given number of engines                                                                             
        private int numberOfEngines;
        private int maxAltitude;
        private int maxRange;

        public Airplane(String name, String manufacturer, int yearOfManufacture, int maxPassengers, int topSpeed, int numberOfEngines, int maxAltitude, int maxRange){
            super(name,manufacturer,yearOfManufacture,maxPassengers,topSpeed);
        this.numberOfEngines=numberOfEngines;
	}
	public int getNumberOfEngines(){
            return numberOfEngines;
        }
        public void setNumberOfEngines(int numberOfEngines){
            this.numberOfEngines=numberOfEngines;
        }
        //Flyable Methods                                                                                                       
        public int getMaxAltitude(){
            return maxAltitude;
        }
        public void setMaxAltitude(int maxAltitude){
            this.maxAltitude=maxAltitude;
        }
        public int getMaxRange(){
            return maxRange;
        }
        public void setMaxRange(int maxRange){
            this.maxRange=maxRange;
        }
    }
