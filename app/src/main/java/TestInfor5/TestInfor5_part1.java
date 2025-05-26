package TestInfor5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import com.jirio.edogo.R;

import VideoInfor5Class.VideoInfor5_part1;
import VideoMat5Class.Video2Mat5_part1;

public class TestInfor5_part1 extends AppCompatActivity {

    int[] correctAnswers = {
            R.id.q1a, R.id.q2a, R.id.q3b, R.id.q4a, R.id.q5b,
            R.id.q6b, R.id.q7b, R.id.q8b, R.id.q9a, R.id.q10b,
            R.id.q11b, R.id.q12a, R.id.q13a, R.id.q14a, R.id.q15b
    };

    int[] questionGroupIds = {
            R.id.q1, R.id.q2, R.id.q3, R.id.q4, R.id.q5,
            R.id.q6, R.id.q7, R.id.q8, R.id.q9, R.id.q10,
            R.id.q11, R.id.q12, R.id.q13, R.id.q14, R.id.q15
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_infor5_part1);

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
        Intent intent = new Intent(this, VideoInfor5_part1.class);
        startActivity(intent);
    }
}
