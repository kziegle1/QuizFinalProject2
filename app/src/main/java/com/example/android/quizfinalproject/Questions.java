package com.example.android.quizfinalproject;

public class Questions {

    public String mQuestions[] = {

            {
                    "1. In the episode Branch Wars, what are the names written on Michael, Dwight, and Jim's uniforms respectively?",
                    "2. Finish this quote, Nostalgia is truly one of the greatest human weaknesses...second only to the ______.",
                    "3. In S3E10, A Benihana Christmas,  Who takes gifts OUT of the toy donation box?",
                    "4. In S5E22, Heavy Competition What does Dwight find out Michael wrote on the back of his Rolodex entry for Schrute, Dwight?",
            ,}};



    private String mChoices[][] = {
            {"Kent, Joe, Madge", "Michael, Brandon, Roy", "Evan, Carl, Ruth", "Nate, Darryl, Madge"},
            {"neck"},
            {"Creed", "Dwight", "Meredith", "Michael"},
            {"Assistant (to the) Regional Manager, Dunder Mifflen Scranton", "tall, beets", "burly, built for warehouse", "Dog-like obedience to authority"},

    };

    private String mCorrectAnswers[] = {"Kent, Joe, Madge", "neck", "Creed", "Michael", "tall, beets"};

    public String getQuestion (int a){
    String question= mQuestions[a];
        return question;
    }
    public String getChoice1 (int a){
        String choice = mChoices[a][0];
        return choice;
    }
    public String getChoice2 (int a){
        String choice = mChoices[a][1];
        return choice;
                }
    public String getChoice3 (int a){
        String choice = mChoices[a][2];
        return choice;
    }
    public String getChoice4 (int a){
        String choice = mChoices[a][3];
        return choice;
    }
    public String getCorrectAnswer (int a){
        String answer= mCorrectAnswers[a];
        return answer;


    }
}