package com.example.wojtekkurylo.finalprojectps2;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int scorePlayerA = 0;
    int scorePlayerB = 0;
    int timeToast = Toast.LENGTH_LONG;
    String txtToast = "Ok Ok I am moving for this ball - do not go to negative score :)";
    int timeToastA = Toast.LENGTH_LONG;
    String txtToastA = "Player A - won ! Congrats";
    int timeToastB = Toast.LENGTH_LONG;
    String txtToastB = "Player B - won ! Congrats";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Load a bitmap from the drawable folder
        Bitmap bMap = BitmapFactory.decodeResource(getResources(), R.drawable.player5p70k);
        // Resize the bitmap to 150x100 (width x height)
        Bitmap bMapScaled = Bitmap.createScaledBitmap(bMap, 150, 100, true);
        // Loads the resized Bitmap into an ImageView
        ImageView image = (ImageView) findViewById(R.id.my_image);
        image.setImageBitmap(bMapScaled);

    }

    public void addOneToPlayerA(View view) {
        if (scorePlayerA >= 12) {
            scorePlayerA = 12;
            displayForPlayerA(scorePlayerA);
            Context alfa = this;
            Toast omega = Toast.makeText(alfa, txtToastA, timeToastA);
            omega.show();
        } else {
            scorePlayerA = scorePlayerA + 1;
            displayForPlayerA(scorePlayerA);
        }
    }

    public void addTwoToPlayerA(View view) {
        scorePlayerA = scorePlayerA + 2;
        if (scorePlayerA >= 12) {
            scorePlayerA = 12;
            displayForPlayerA(scorePlayerA);
            Context alfa = this;
            Toast omega = Toast.makeText(alfa, txtToastA, timeToastA);
            omega.show();
        } else {
            displayForPlayerA(scorePlayerA);
        }
    }

    public void minusOneFromPlayerA(View view) {
        if (scorePlayerA <= 0) {
            scorePlayerA = 0;
            displayForPlayerA(scorePlayerA);
            Context alfa = this;
            Toast omega = Toast.makeText(alfa, txtToast, timeToast);
            omega.show();
        } else {
            scorePlayerA = scorePlayerA - 1;
            displayForPlayerA(scorePlayerA);
        }
    }

    public void addOneToPlayerB(View view) {
        if (scorePlayerB >= 12) {
            scorePlayerB = 12;
            displayForPlayerB(scorePlayerB);
            Context alfa = this;
            Toast omega = Toast.makeText(alfa, txtToastB, timeToastB);
            omega.show();
        } else {
            scorePlayerB = scorePlayerB + 1;
            displayForPlayerB(scorePlayerB);
        }
    }

    public void addTwoToPlayerB(View view) {
        scorePlayerB = scorePlayerB + 2;
        if (scorePlayerB >= 12) {
            scorePlayerB = 12;
            displayForPlayerB(scorePlayerB);
            Context alfa = this;
            Toast omega = Toast.makeText(alfa, txtToastB, timeToastB);
            omega.show();
        } else {
            displayForPlayerB(scorePlayerB);
        }
    }

    public void minusOneFromPlayerB(View view) {
        if (scorePlayerB <= 0) {
            scorePlayerB = 0;
            displayForPlayerB(scorePlayerB);
            Context alfa = this;
            Toast omega = Toast.makeText(alfa, txtToast, timeToast);
            omega.show();
        } else {
            scorePlayerB = scorePlayerB - 1;
            displayForPlayerB(scorePlayerB);
        }
    }

    public void reset(View view) {
        scorePlayerA = 0;
        scorePlayerB = 0;
        displayForPlayerA(scorePlayerA);
        displayForPlayerB(scorePlayerB);
    }

    public void displayForPlayerA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.scorePlayerA);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForPlayerB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.scorePlayerB);
        scoreView.setText(String.valueOf(score));
    }
}