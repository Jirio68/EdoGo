package Select;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.jirio.edogo.MainActivity;
import com.jirio.edogo.R;

import VideoAlg7Class.VideoAlg7_part1;
import VideoBio7Class.VideoBio7_part1;
import VideoHisRus7Class.VideoHisRus7_part1;

public class Selection_7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_selection7);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.select7), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void SubjectAlg7(View v) {
        Intent intent = new Intent(this, VideoAlg7_part1.class);
        startActivity(intent);
    }

    public void SubjectBio7(View v) {
        Intent intent = new Intent(this, VideoBio7_part1.class);
        startActivity(intent);
    }

    public void SubjectHisRus7(View v) {
        Intent intent = new Intent(this, VideoHisRus7_part1.class);
        startActivity(intent);
    }

    public void Select_Subjest(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }
}