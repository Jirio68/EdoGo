package VideoInfor5Class;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.net.Uri;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.jirio.edogo.R;

public class VideoInfor5_part2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_video_infor5_part2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.selectVideo5_part2), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void Select_Subjest(View view) {
        Intent intent = new Intent(this, VideoInfor5_part1.class);
        startActivity(intent);
    }

    public void See_more5_part3(View view) {
        Intent intent = new Intent(this, VideoInfor5_part3.class);
        startActivity(intent);
    }

    public void playVideo1(View view) {
        String url = "https://rutube.ru/video/e67af8387a726824a81793d70da52344/";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

    public void playVideo2(View view) {
        String url = "https://rutube.ru/video/8acaace06017ddbb68776770b06375d7/";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

    public void playVideo3(View view) {
        String url = "https://rutube.ru/video/f396f36f5dc13d09a77d53361aa2fcdd/";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

    public void playVideo4(View view) {
        String url = "https://rutube.ru/video/1e886f5668fbcce34737a525467db67d/";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

    public void playVideo5(View view) {
        String url = "https://rutube.ru/video/50eed9875a2039984b8c0e2f5588b76c/";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }


    public void playVideo6(View view) {
        String url = "https://rutube.ru/video/48129cd4e485d3592d3e9637d2ea20be/";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

    public void playVideo7(View view) {
        String url = "https://rutube.ru/video/e77d606f7c66aee14d7745345f05e56c/";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

    public void playVideo8(View view) {
        String url = "https://rutube.ru/video/f48af418b377f76e60e64d097a3df87a/";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

    public void playVideo9(View view) {
        String url = "https://rutube.ru/video/9878028f597990b085fe24c184e41432/";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

    public void playVideo10(View view) {
        String url = "https://rutube.ru/video/d9c424bcdd83e0b3dd45c413af6a690b/";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

    public void playVideo11(View view) {
        String url = "https://rutube.ru/video/0bc784d26fffc76e3a29fd6407375eb2/";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

    public void playVideo12(View view) {
        String url = "https://rutube.ru/video/63c1265ecea9254d967c67bfda5df859/";
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
        String url = "https://rutube.ru/video/bebb86d73dbddc85de86362ae1e162be/";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }
}