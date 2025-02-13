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

import VideoEng.VideoEng5;
import VideoInfor5Class.VideoInfor5_part1;
import VideoMat5Class.VideoMat5_part1;

public class Selection_5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_selection5);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.select5), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void SubjectInf5(View v) {
        Intent intent = new Intent(this, VideoInfor5_part1.class);
        startActivity(intent);
    }

    public void SubjectEng5(View v) {
        Intent intent = new Intent(this, VideoEng5.class);
        startActivity(intent);
    }

    public void SubjectMat5(View v) {
        Intent intent = new Intent(this, VideoMat5_part1.class);
        startActivity(intent);


    }

    public void Select_Subjest(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }
}