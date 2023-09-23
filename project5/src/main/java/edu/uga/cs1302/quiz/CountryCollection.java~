package edu.uga.cs1302.quiz;

import java.io.IOException;
import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

public class CountryCollection{
    private ArrayList<Country> countries;
    private ArrayList<String> continents;

    public CountryCollection(){
	countries= new ArrayList<>();
	continents = new ArrayList<>();
    }
    //Read countries from csv
    public void readCountries(String fileName) throws IOException{
	BufferedReader reader = Files.newBufferedReader(Paths.get(fileName));
	CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT.withIgnoreHeaderCase().withTrim());

	for(CSVRecord csvRecord:csvParser){
	    String country= csvRecord.get(0);
	    String continent=csvRecord.get(1);

	    if(!continents.contains(continent)){
		continents.add(continent);
	    }
	    countries.add(new Country(country,continent));
	}
	continents.add("Antarctica");
	csvParser.close();
    }

    public Country getCountry(int index){
	return countries.get(index);
    }

    public int size(){
	return countries.size();
    }

    public ArrayList<String> getContinents(){
	return continents;
    }
}
