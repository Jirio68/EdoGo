package VideoMat6Class;

import android.content.Intent;
import android.os.Bundle;
import android.net.Uri;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.jirio.edogo.R;

public class Video2Mat6_part2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_video2_mat6_part2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.Video2Mat6_part2), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void Select_Subjest(View view) {
        Intent intent = new Intent(this, Video2Mat6_part1.class);
        startActivity(intent);
    }

    public void See_more5_part3(View view) {
        Intent intent = new Intent(this, Video2Mat6_part3.class);
        startActivity(intent);
    }

    public void playVideo1(View view) {
        String url = "https://rutube.ru/video/f62e8a1b80d1d8fc6adabd27ed70c996/";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

    public void playVideo2(View view) {
        String url = "https://rutube.ru/video/a62da31217e48a67596ffc6f311d7d44/";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

    public void playVideo3(View view) {
        String url = "https://rutube.ru/video/b408a37750a1b7928b789949538c96b8/";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

    public void playVideo4(View view) {
        String url = "https://rutube.ru/video/3e81173ab9fdf6e018b5f8cdcfccf87e/";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

    public void playVideo5(View view) {
        String url = "https://rutube.ru/video/2b529a5533dc7a23972bf64223f04910/";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

    public void playVideo6(View view) {
        String url = "https://rutube.ru/video/cc67df9cf3e66bfb698619ffaa5a5d1d/";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

    public void playVideo7(View view) {
        String url = "https://rutube.ru/video/97325458767e50a4377bf8e21746c38c/";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

    public void playVideo8(View view) {
        String url = "https://rutube.ru/video/0c53c6796cf1ed8800dff3f21e6ae54c/";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

    public void playVideo9(View view) {
        String url = "https://rutube.ru/video/3d74e1aac546f7601b11f6e13647effc/";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

    public void playVideo10(View view) {
        String url = "https://rutube.ru/video/8babc366911664455db726c361228333/";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

    public void playVideo11(View view) {
        String url = "https://rutube.ru/video/5cdb6cf5d77b8a3364281a0132206d72/";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

    public void playVideo12(View view) {
        String url = "https://rutube.ru/video/f4808f2e8b950db60391c6cf041730a2/";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

    public void playVideo13(View view) {
        String url = "https://rutube.ru/video/071adc986769d62fbda18f17ddfb1cb3/";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

    public void playVideo14(View view) {
        String url = "https://rutube.ru/video/dcf9ff56f2f30076b3d02099dc1f8c86/";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

}