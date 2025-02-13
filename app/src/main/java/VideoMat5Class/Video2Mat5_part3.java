package VideoMat5Class;

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

import Select.Selection_5;

public class Video2Mat5_part3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_video2_mat5_part3);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.selectVideo2Mat5_part3), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void Select_Subjest(View view) {
        Intent intent = new Intent(this, Video2Mat5_part2.class);
        startActivity(intent);
    }

    public void See_more5_part3(View view) {
        Intent intent = new Intent(this, Selection_5.class);
        startActivity(intent);
    }

    public void playVideo1(View view) {
        String url = "https://rutube.ru/video/ec38e4c014381c1bd52e35216412e67d/";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

    public void playVideo2(View view) {
        String url = "https://rutube.ru/video/183304195ab55079c5cf25686fd41f12/";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

    public void playVideo3(View view) {
        String url = "https://rutube.ru/video/01b8eab04df5eebcdbd6e8b3535e446a/";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

    public void playVideo4(View view) {
        String url = "https://rutube.ru/video/c69edfadc38d3c611901c70628d419e7/";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

    public void playVideo5(View view) {
        String url = "https://rutube.ru/video/cd96acaa976a4b590d1c00a1b7e966f2/";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }


    public void playVideo6(View view) {
        String url = "https://rutube.ru/video/765142280bff20f33991c76391dea3f4/";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

    public void playVideo7(View view) {
        String url = "https://rutube.ru/video/a98585caeaf2dd017007f2c013070841/";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

    public void playVideo8(View view) {
        String url = "https://rutube.ru/video/a8dfcde7f0e0c96ab6e5f8ae0178fc91/";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

    public void playVideo9(View view) {
        String url = "https://rutube.ru/video/23543af2ab9ed805d2c0cce490bb6fb0/";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

    public void playVideo10(View view) {
        String url = "https://rutube.ru/video/cf0374705750d7f9833555994de17bcd/";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

    public void playVideo11(View view) {
        String url = "https://rutube.ru/video/d99e06fc96301b751043362bdaca5a1d/";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

    public void playVideo12(View view) {
        String url = "https://rutube.ru/video/fd2fd3e0a0d978592fd46c472847bb23/";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

    public void playVideo13(View view) {
        String url = "https://rutube.ru/video/5453a23b0b36fcade0c87be898e2285d/";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

    public void playVideo14(View view) {
        String url = "https://rutube.ru/video/70c6c5bfe3cab4447bcade5dba67add7/";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

    public void playVideo15(View view) {
        String url = "https://rutube.ru/video/ee177c1f198d0480c25d993172563e07/";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

    public void playVideo16(View view) {
        String url = "https://rutube.ru/video/89a337dd76914032e33d5595f5d32484/";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

}