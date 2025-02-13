package VideoComun6Class;

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

import Select.Selection_6;

public class VideoComun6_part3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_video_comun6_part3);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.VideoComun6_part3), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void See_more5_part3(View view) {
        Intent intent = new Intent(this, Selection_6.class);
        startActivity(intent);
    }

    public void Select_Subjest(View view) {
        Intent intent = new Intent(this, VideoComun6_part2.class);
        startActivity(intent);
    }

    public void playVideo1(View view) {
        String url = "https://rutube.ru/video/6b45add85f890de4778d702ee5af761f/";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

    public void playVideo2(View view) {
        String url = "https://rutube.ru/video/9476bcdaeef0cb7829b654b3fd08b3f2/";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

    public void playVideo3(View view) {
        String url = "https://rutube.ru/video/eff018ff89a5e5baeb8d2cba51914b0b/";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

    public void playVideo4(View view) {
        String url = "https://rutube.ru/video/8972d319f49a36c11556f95818979369/";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

    public void playVideo5(View view) {
        String url = "https://rutube.ru/video/55af073659e25100be634d7689eb70e2/";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

    public void playVideo6(View view) {
        String url = "https://rutube.ru/video/4a228cb8b23ea0f000363f6136e1d017/";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

    public void playVideo7(View view) {
        String url = "https://rutube.ru/video/70768cc8efee7dcd17b15ae81b9982a8/";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

    public void playVideo8(View view) {
        String url = "https://rutube.ru/video/6d96aed9656b50d616bf07db6f76f4cd/";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

    public void playVideo9(View view) {
        String url = "https://rutube.ru/video/1c75c4fe8cfa3b065bd5c6ec7cd5d787/";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

    public void playVideo10(View view) {
        String url = "https://rutube.ru/video/d0bb869da69b323c110c446e4b7463a2/";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

    public void playVideo11(View view) {
        String url = "https://rutube.ru/video/93cc98b72e4598e194f868b5ab4eff32/";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

    public void playVideo12(View view) {
        String url = "https://rutube.ru/video/bf9bec7602c2d2cbc975ba788b13d59e/";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

}