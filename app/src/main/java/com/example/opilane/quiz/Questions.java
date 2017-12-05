package com.example.opilane.quiz;


public class Questions {
    //array of questions
    public String MyQuestions[]={
            "What is my name?",
            "How old i am?",
            "Who i am?",
            "Who is chicken?",
            "Where i come from?"
    };

    //array of multible choices for each questions
    public String MyChoices [] []= {
            {"Viktoria","Veronika","Natali","Vicy"},
            {"18","17","12","10"},
            {"Animal","Human","Which","Fairy"},
            {"Bird","Human","Table","Computer"},
            {"Tallinn","Tartu","Narva","Katrina"}
    };

    //array of correct answers - in the same order as array of questions
    private String MyCorrectAnswers []= {
            "Viktoria", "17", "Human", "Bird", "Tallinn"
    };
    //method returns number of questions
    public int getLength (){
        return MyQuestions.length;
    }
    //method returns questions from array textQuestions[] based on array index
    public String getQuestion(int a) {
        String question= MyQuestions [a];
        return question;
    }
    //method returns a single multiple choice item for questions based on array index,
    //based on number of multiple choice item in the list - 1,2,3 or 4 as an argument
    public String  getChoice(int index, int num){
        String choice0=MyChoices[index] [num -1];
        return choice0;
    }
    //method returns correct answer for the questions based on array index
    public String getCorrectAnswer(int a){
        String answer=MyCorrectAnswers[a];
        return answer;
    }
}
