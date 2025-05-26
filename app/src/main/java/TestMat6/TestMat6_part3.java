package TestMat6;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import com.jirio.edogo.R;

import VideoMat6Class.VideoMat6_part1;
import VideoMat6Class.VideoMat6_part3;

public class TestMat6_part3 extends AppCompatActivity {

    int[] correctAnswers = {
            R.id.q1a, R.id.q2a, R.id.q3a, R.id.q4a, R.id.q5a,
            R.id.q6a, R.id.q7a, R.id.q8a, R.id.q9a, R.id.q10a,
            R.id.q11a, R.id.q12a, R.id.q13a, R.id.q14a, R.id.q15a
    };

    int[] questionGroupIds = {
            R.id.q1, R.id.q2, R.id.q3, R.id.q4, R.id.q5,
            R.id.q6, R.id.q7, R.id.q8, R.id.q9, R.id.q10,
            R.id.q11, R.id.q12, R.id.q13, R.id.q14, R.id.q15
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_mat6_part3);

        Button checkAllButton = findViewById(R.id.checkAllButton);
        TextView resultView = findViewById(R.id.finalResult);

        checkAllButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int correctCount = 0;

                for (int i = 0; i < questionGroupIds.length; i++) {
                    RadioGroup group = findViewById(questionGroupIds[i]);
                    int selectedId = group.getCheckedRadioButtonId();
                    if (selectedId == correctAnswers[i]) {
                        correctCount++;
                    }
                }

                String grade;
                if (correctCount >= 14) {
                    grade = "5";
                } else if (correctCount >= 11) {
                    grade = "4";
                } else if (correctCount >= 8) {
                    grade = "3";
                } else {
                    grade = "2";
                }

                resultView.setText("Правильных ответов: " + correctCount + " из 15\nОценка: " + grade);
            }
        });
    }

    public void Select_Subjest(View v) {
        Intent intent = new Intent(this, VideoMat6_part3.class);
        startActivity(intent);
    }
}