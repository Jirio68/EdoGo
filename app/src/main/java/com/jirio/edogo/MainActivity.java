package com.jirio.edogo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import Select.Selection_5;
import Select.Selection_6;
import Select.Selection_7;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.Select_class), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void select5(View v) {
        Intent intent = new Intent(this, Selection_5.class);

        startActivity(intent);
    }

    public void select6(View v) {
        Intent intent = new Intent(this, Selection_6.class);
        startActivity(intent);
    }

    public void select7(View v) {
        Intent intent = new Intent(this, Selection_7.class);
        startActivity(intent);
    }


}
