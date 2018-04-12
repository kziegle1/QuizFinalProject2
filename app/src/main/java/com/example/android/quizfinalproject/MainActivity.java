package com.example.android.quizfinalproject;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.Random;


/**
 * This is a quiz app .
 */
public class MainActivity extends AppCompatActivity {

    Button answer_1a, answer_1b, answer_1c, answer_1d, answer_4a, answer_4b, answer_4c, answer_4d;

    TextView score, question_1, question_2, question_3, question_4;

    RadioGroup firstQuestion, fourthQuestion;

    EditText answer_field;

    private Questions mQuestions = new Questions();

    private String mAnswer;

    private int mScore = 0;

    private int mQuestionLength = mQuestions.mQuestions.length;

    Random r;

    // The score of the game begins at zero.
    int baseScore = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        r = new Random();

        answer_1a = (Button) findViewById(R.id.answer_1a);
        answer_1a = (Button) findViewById(R.id.answer_1a);
        answer_1b = (Button) findViewById(R.id.answer_1b);
        answer_1c = (Button) findViewById(R.id.answer_1c);
        answer_1d = (Button) findViewById(R.id.answer_1d);
        answer_field = (EditText) findViewById(R.id.answer_field);
        answer_4a = (Button) findViewById(R.id.answer_4a);
        answer_4b = (Button) findViewById(R.id.answer_4b);
        answer_4c = (Button) findViewById(R.id.answer_4c);
        answer_4d = (Button) findViewById(R.id.answer_4d);
        score = (TextView) findViewById(R.id.score);
        question_1 = (TextView) findViewById(R.id.question_1);
        question_2 = (TextView) findViewById(R.id.question_2);
        question_3 = (TextView) findViewById(R.id.question_3);
        question_4 = (TextView) findViewById(R.id.question_4);
        firstQuestion = (RadioGroup) findViewById(R.id.firstQuestion);
        fourthQuestion = (RadioGroup) findViewById(R.id.fourthQuestion);


        score.setText("Score" + mScore);

        answer_1a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answer_1a.getText() == mAnswer) {
                    mScore++;
                    score.setText("Score" + mScore);
                    updateQuestion(r.nextInt(mQuestionLength));
                } else {
                    gameOver();
                }

            }
        });
        answer_1b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answer_1b.getText() == mAnswer) {
                    mScore++;
                    score.setText("Score" + mScore);
                    updateQuestion(r.nextInt(mQuestionLength));
                } else {
                    gameOver();
                }

            }
        });
        answer_1c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answer_1c.getText() == mAnswer) {
                    mScore++;
                    score.setText("Score" + mScore);
                    updateQuestion(r.nextInt(mQuestionLength));
                } else {
                    gameOver();
                }

            }
        });
        answer_1d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answer_1d.getText() == mAnswer) {
                    mScore++;
                    score.setText("Score" + mScore);
                    updateQuestion(r.nextInt(mQuestionLength));
                } else {
                    gameOver();
                }

            }
        });
        answer_4a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answer_4a.getText() == mAnswer) {
                    mScore++;
                    score.setText("Score" + mScore);
                    updateQuestion(r.nextInt(mQuestionLength));
                } else {
                    gameOver();

                }
            }
        });
        answer_4b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answer_4b.getText() == mAnswer) {
                    mScore++;
                    score.setText("Score" + mScore);
                    updateQuestion(r.nextInt(mQuestionLength));
                } else {
                    gameOver();
                }

            }
        });
        answer_4c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answer_4c.getText() == mAnswer) {
                    mScore++;
                    score.setText("Score" + mScore);
                    updateQuestion(r.nextInt(mQuestionLength));
                } else {
                    gameOver();
                }

            }
        });
        answer_4d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answer_4d.getText() == mAnswer) {
                    mScore++;
                    score.setText("Score" + mScore);
                    updateQuestion(r.nextInt(mQuestionLength));
                } else {
                    gameOver();
                }
            }
        });
    }

    private void updateQuestion(int num) {
        question_1.setText(mQuestions.getQuestion(num));
        answer_1a.setText(mQuestions.getChoice1(num));
        answer_1b.setText(mQuestions.getChoice2(num));
        answer_1c.setText(mQuestions.getChoice3(num));
        answer_1d.setText(mQuestions.getChoice4(num));

        question_2.setText(mQuestions.getQuestion(num));
        answer_1a.setText(mQuestions.getChoice1(num));
        answer_1b.setText(mQuestions.getChoice2(num));
        answer_1c.setText(mQuestions.getChoice3(num));
        answer_1d.setText(mQuestions.getChoice4(num));

        mAnswer = mQuestions.getCorrectAnswer(num);
    }

    private void gameOver() {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);
        alertDialogBuilder
                .setMessage("Game Over! Your score is" + mScore + "points")
                .setPositiveButton("New Game",
                        new DialogInterface.OnClickListener(

                                startActivity(new Intent(getApplicationContext(), MainActivity.class)),
                                finish(),
        alertDialogBuilder.setNegativeButton("Exit",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }
                });
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }


    // Get players answer for number 2.
    EditText answerField = (EditText) findViewById(R.id.answer_field);
    Editable nameEditable = answerField.getText();
    String name = nameEditable.toString();


    /**
     * This method is called when the submit quiz is clicked.
     */

    public void submitQuiz(View view) {


        final RadioGroup group = (RadioGroup) findViewById(R.id.group_1);


        // 3. Figure out if the user selects answer 'a'
        CheckBox answer_3aCheckBox = (CheckBox) findViewById(R.id.answer_3a_checkbox);
        boolean answer_3a = answer_3aCheckBox.isChecked();

        // 3. Figure out if the user selects answer 'b'
        CheckBox answer_3bCheckBox = (CheckBox) findViewById(R.id.answer_3b_checkbox);
        boolean answer_3b = answer_3bCheckBox.isChecked();

        // 3. Figure out if the user selects answer 'c'
        CheckBox answer_3cCheckBox = (CheckBox) findViewById(R.id.answer_3c_checkbox);
        boolean answer_3c = answer_3cCheckBox.isChecked();

        // 3. Figure out if the user selects answer 'd'
        CheckBox answer_3dCheckBox = (CheckBox) findViewById(R.id.answer_3d_checkbox);
        boolean answer_3d = answer_3dCheckBox.isChecked();}


/**
 * Calculates the score of the game.

 * @param answer_3a is correct, plus 1 point
 * @param answer_3b is incorrect, 0 points
 * @param answer_3c is incorrect, 0 points
 * @param answer_3d is correct, plus 1 point
 * @return final score
 */

    private int calculateScore(boolean answer_1a, boolean answer_1b, boolean answer_1c, boolean answer_1d, boolean answer_3a, boolean answer_3b, boolean answer_3c, boolean answer_3d) {


        // 1. If the player chooses answer "a", add 1 point
        if (answer_3a) {
            baseScore = baseScore + 1;
        }

        // 1. If the player chooses answer "b", add 0 points
        if (answer_3b) {
            baseScore = baseScore + 0;
        }
        // 1. If the player chooses answer "c", add 0 points
        if (answer_3c) {
            baseScore = baseScore + 0;
        }

        // 1. If the player chooses answer "d", add 0 points
        if (answer_3d) {
            baseScore = baseScore + 1;
        }

        // Calculate the final score by adding the total points.
        return baseScore;
    }


}

