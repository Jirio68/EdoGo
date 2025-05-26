package com.jirio.edogo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.jirio.edogo.R;
import Select.Selection_5;
import Select.Selection_6;
import Select.Selection_7;
import TestBio7.TestBio7_part1;
import TestInfor5.TestInfor5_part1;
import TestMat5.TestMat5_part3;
import VideoHisRus7Class.Video2HisRus7_part1;
import VideoHisRus7Class.Video2HisRus7_part2;

public class MainActivity extends AppCompatActivity {

    private ImageButton themeToggleButton;

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

        // Настройка кнопки переключения темы
        themeToggleButton = findViewById(R.id.theme_toggle_button);
        updateThemeIcon(); // Устанавливаем начальную иконку

        themeToggleButton.setOnClickListener(v -> {
            int currentNightMode = getResources().getConfiguration().uiMode & android.content.res.Configuration.UI_MODE_NIGHT_MASK;
            if (currentNightMode == android.content.res.Configuration.UI_MODE_NIGHT_YES) {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
            } else {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
            }
            updateThemeIcon(); // Обновляем иконку после переключения
        });
    }

    private void updateThemeIcon() {
        int currentNightMode = getResources().getConfiguration().uiMode & android.content.res.Configuration.UI_MODE_NIGHT_MASK;
        if (currentNightMode == android.content.res.Configuration.UI_MODE_NIGHT_YES) {
            themeToggleButton.setImageResource(R.drawable.baseline_wb_sunny_24); // Иконка солнца для перехода к светлой теме
        } else {
            themeToggleButton.setImageResource(R.drawable.baseline_dark_mode_24); // Иконка луны для перехода к тёмной теме
        }
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