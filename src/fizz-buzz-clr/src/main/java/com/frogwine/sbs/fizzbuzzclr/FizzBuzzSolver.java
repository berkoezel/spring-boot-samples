package com.frogwine.sbs.fizzbuzzclr;

import java.util.ArrayList;

public class FizzBuzzSolver {
    private final ArrayList<String> answers;
    private final int count;

    public FizzBuzzSolver(int count){
        answers = new ArrayList<>();
        this.count = count;
    }

    private void Solver(){
        try {
            for (int i = 0; i <= count; i++) {
                if (i % 3 == 0 && i % 5 == 0) answers.add(i + " is FizzBuzz");
                else if(i % 3 == 0) answers.add(i + " is Fizz");
                else if(i % 5 == 0) answers.add(i + " is Buzz");
                else answers.add(i + " is DeezNutz");
            }
        } catch(Exception e){
            e.printStackTrace();
        }
    }

    public ArrayList<String> getAnswers() {
        Solver();
        return answers;
    }
}
