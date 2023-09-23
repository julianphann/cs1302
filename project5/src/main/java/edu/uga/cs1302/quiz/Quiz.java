package edu.uga.cs1302.quiz;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Quiz{
    public static final int TOTAL_QUESTIONS=6;

    private ArrayList<Question> questions;
    private int score;

    public Quiz(CountryCollection countryCollection){
	questions = new ArrayList<>();
	ArrayList<Integer> selected = new ArrayList<>();

	while(questions.size() !=TOTAL_QUESTIONS){
	    int index=ThreadLocalRandom.current().nextInt(countryCollection.size());
	    if(!selected.contains(index)){
		selected.add(index);

		questions.add(new Question(countryCollection.getCountry(index), countryCollection.getContinents()));
	    }
	}
    }

    public Question getQuestion(int index){
	return questions.get(index);
    }

    public int getScore(){
	return score;
    }
    public boolean answer(int question, int index){
	if(getQuestion(question).answer(index)){
		score++;
		return true;
	    }
	    return false;
    }
}
