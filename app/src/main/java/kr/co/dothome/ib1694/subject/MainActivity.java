package kr.co.dothome.ib1694.subject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        setContentView(R.layout.activity_main);
        Until.setGlobalFont(this, getWindow().getDecorView());
    }

    public void Korean(View v) {
        Intent intent = new Intent(getApplicationContext(), KoreanActivity.class);
        startActivity(intent);
    }

    public void Math(View v) {
        Intent intent = new Intent(getApplicationContext(), MathActivity.class);
        startActivity(intent);
    }

    public void Society(View v) {
        Intent intent = new Intent(getApplicationContext(), SocietyActivity.class);
        startActivity(intent);
    }

    public void Science(View v) {
        Intent intent = new Intent(getApplicationContext(), ScienceActivity.class);
        startActivity(intent);
    }

    public void English(View v) {
        Intent intent = new Intent(getApplicationContext(), EnglishActivity.class);
        startActivity(intent);
    }

    public void Technology_and_home_economics(View v) {
        Intent intent = new Intent(getApplicationContext(), Technology_and_home_economicsActivity.class);
        startActivity(intent);
    }

    public void Scales_of_justice(View v) {
        Intent intent = new Intent(getApplicationContext(), Scales_of_justiceActivity.class);
        startActivity(intent);
    }

    public void Japanese(View v) {
        Intent intent = new Intent(getApplicationContext(), JapaneseActivity.class);
        startActivity(intent);
    }

    public void Chinese(View v) {
        Intent intent = new Intent(getApplicationContext(), ChineseActivity.class);
        startActivity(intent);
    }

    public void Information(View v) {
        Intent intent = new Intent(getApplicationContext(), InformationActivity.class);
        startActivity(intent);
    }

    public void Music(View v) {
        Intent intent = new Intent(getApplicationContext(), MusicActivity.class);
        startActivity(intent);
    }

    public void Art(View v) {
        Intent intent = new Intent(getApplicationContext(), ArtActivity.class);
        startActivity(intent);
    }

}
