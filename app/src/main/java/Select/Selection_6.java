package Select;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.jirio.edogo.MainActivity;
import com.jirio.edogo.R;

import VideoComun6Class.VideoComun6_part1;
import VideoEng.VideoEng6;
import VideoMat6Class.VideoMat6_part1;

public class Selection_6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_selection6);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.select6), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void SubjectComun6(View v) {
        Intent intent = new Intent(this, VideoComun6_part1.class);
        startActivity(intent);
    }

    public void SubjectEng6(View v) {
        Intent intent = new Intent(this, VideoEng6.class);
        startActivity(intent);
    }

    public void SubjectMat6(View v) {
        Intent intent = new Intent(this, VideoMat6_part1.class);
        startActivity(intent);
    }

    public void Select_Subjest(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }



}