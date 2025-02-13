package VideoEng;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.jirio.edogo.R;

import Select.Selection_6;

public class VideoEng6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_video_eng6);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.VideoEng6), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void Select_Subjest(View view) {
        Intent intent = new Intent(this, Selection_6.class);
        startActivity(intent);
    }

    public void playVideo1(View view) {
        String url = "https://rutube.ru/video/7b0df3446d5a24024f1bc7eaa12eac28/";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

    public void playVideo2(View view) {
        String url = "https://rutube.ru/video/5cd2f0bfaf55cd0d8ca4616a3c50f92f/";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

    public void playVideo3(View view) {
        String url = "https://rutube.ru/video/6ece17118ec23ffc08ed64d6e392be9f/";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

    public void playVideo4(View view) {
        String url = "https://rutube.ru/video/d29b95bdca7c57badc31e75a7c37dbe6/";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

    public void playVideo5(View view) {
        String url = "https://rutube.ru/video/b226183d5f44c02dd2858834cc310c3b/";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

    public void playVideo6(View view) {
        String url = "https://rutube.ru/video/14985919fd048725b28b3700be5d5912/";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

    public void playVideo7(View view) {
        String url = "https://rutube.ru/video/245807f7bef7ec3bba08b2c07755a47a/";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

    public void playVideo8(View view) {
        String url = "https://rutube.ru/video/62c7b774765f2d869cf3ce2e2eb96fa1/";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

    public void playVideo9(View view) {
        String url = "https://rutube.ru/video/56d939b820cdd134ad58aff8a59df784/";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

    public void playVideo10(View view) {
        String url = "https://rutube.ru/video/1e1e8cf4555a9794e5bc42d3e101129f/";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

    public void playVideo11(View view) {
        String url = "https://rutube.ru/video/a6520377945986222d4142844adf9d71/";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

    public void playVideo12(View view) {
        String url = "https://rutube.ru/video/79920c63856f6ce6e4d73e4266ecd2e3/";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

    public void playVideo13(View view) {
        String url = "https://rutube.ru/video/24902e15f135a4094231849d1b8b8a0b/";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

    public void playVideo14(View view) {
        String url = "https://rutube.ru/video/7a2eece6203b4157e0e6226aff9dee6c/";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

    public void playVideo15(View view) {
        String url = "https://rutube.ru/video/aa9e894fdfb28e7b05ab2ce6f3071202/";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

    public void playVideo16(View view) {
        String url = "https://rutube.ru/video/1d785252e6046f3d551f588d0b0b315d/";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

}