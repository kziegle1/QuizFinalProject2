package com.example.android.quizfinalproject;

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


/**
 * This is a quiz app .
 */
public class MainActivity extends AppCompatActivity {

    // Tracks the score of question 1
    int baseScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }


    /**
     * This method is called when the submit quiz is clicked.
     */
    public void submitQuiz(View view) {


        // 1. Players answer for number 1.
        final RadioGroup group = (RadioGroup) findViewById(R.id.group_1);


        // Get players answer for number 2.
        EditText answerField = (EditText) findViewById(R.id.answer_field);
        Editable nameEditable = answerField.getText();
        String name = nameEditable.toString();


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
        boolean answer_3d = answer_3dCheckBox.isChecked();


    }

    /**
     * Calculates the score of the game.
     *
     * @param answer_1a is correct, plus 1 point
     * @param answer_1b is incorrect, 0 points
     * @param answer_1c is incorrect, 0 points
     * @param answer_1d is incorrect, 0 points
     * @param answer_3a is correct, plus 1 point
     * @param answer_3b is incorrect, 0 points
     * @param answer_3c is incorrect, 0 points
     * @param answer_3d is correct, plus 1 point
     * @return final score
     */
    private int calculateScore(boolean answer_1a, boolean answer_1b, boolean answer_1c, boolean answer_1d, boolean answer_3a, boolean answer_3b, boolean answer_3c, boolean answer_3d) {
        // The score of the game begins at zero.
        int baseScore = 0;

        // 1. If the player chooses answer "a", add 1 point
        if (answer_1a) {
            baseScore = baseScore + 1;
        }

        // 1. If the player chooses answer "b", add 0 points
        if (answer_1b) {
            baseScore = baseScore + 0;
        }
        // 1. If the player chooses answer "c", add 0 points
        if (answer_1c) {
            baseScore = baseScore + 0;
        }

        // 1. If the player chooses answer "d", add 0 points
        if (answer_1d) {
            baseScore = baseScore + 0;
        }
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

