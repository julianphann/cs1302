package edu.uga.cs1302.vehicles;
//Automobile has an engine with a given horsepower
public class Automobile extends Vehicle implements Transporter{
    private int engineHorsepower;

public Automobile(String name,String manufacturer,int yearOfManufacture,int maxPassengers,int topSpeed,int engineHorsepower){
            super(name,manufacturer,yearOfManufacture,maxPassengers,topSpeed);
            this.engineHorsepower=engineHorsepower;
    }    
    public int getEngineHorsepower(){
        return engineHorsepower;
    }
    public void setEngineHorsePower(int engineHorsepower){
        this.engineHorsepower=engineHorsepower;
    }

}
