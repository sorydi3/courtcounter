package com.example.android.curtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int ScoreA=0;
    int ScoreB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * Displays the given score for Team A.
     */
    public void point1(View view) {
        ScoreA=ScoreA+1;
                displayForTeamA(ScoreA);
    }
    public void point1b(View view) {
        ScoreB=ScoreB+1;
        displayForTeamB(ScoreB);
    }
    /**
     * Displays the given score for Team A.
     */
    public void point2(View view) {
        ScoreA=ScoreA+2;
        displayForTeamA(ScoreA);
    }
    public void point2b(View view) {
        ScoreB=ScoreB+2;
        displayForTeamB(ScoreB);
    }
    /**
     * Displays the given score for Team A.
     */
    public void point3(View view) {
        ScoreA=ScoreA+3;
        displayForTeamA(ScoreA);
    }
    public void point3b(View view) {
        ScoreB=ScoreB+3;
        displayForTeamB(ScoreB);
    }
    /**
     * This methode will reset the scores.
     */
    public void reset(View view) {
        ScoreA=0;
        displayForTeamA(ScoreA);
        ScoreB=0;
        displayForTeamB(ScoreB);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}
