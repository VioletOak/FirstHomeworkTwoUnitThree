package com.example.firsthomeworktwounitthree;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int count = 0;
    private Button button;
    private TextView textView;

    private static final String KEY_COUNT = "key";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView);
    }

    public void onButtonClick(View view) {
        count++;
        textView.setText(Integer.toString(count));
    }

    /** @Override
    protected void onSaveInstanceState(Bundle outState) {
    Toast toast = Toast.makeText(getApplicationContext(),"onSaveInstanceState()", Toast.LENGTH_LONG);
    toast.show();
    super.onSaveInstanceState(outState);
    }
     **/
    @Override
    public void onSaveInstanceState(@NonNull Bundle outState, @NonNull PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
        Toast toast = Toast.makeText(getApplicationContext(),"onSaveInstanceState()", Toast.LENGTH_SHORT);
        toast.show();
        outState.putInt(KEY_COUNT,count);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Toast toast = Toast.makeText(getApplicationContext(),"onRestoreInstanceState()", Toast.LENGTH_SHORT);
        toast.show();
        count = savedInstanceState.getInt(KEY_COUNT);
    }

    /** @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
    Toast toast = Toast.makeText(getApplicationContext(),"onRestoreInstanceState()", Toast.LENGTH_LONG);
    toast.show();
    super.onRestoreInstanceState(savedInstanceState);
    }
     **/
    @Override
    protected void onStart() {
        Toast toast = Toast.makeText(getApplicationContext(),"onStart()", Toast.LENGTH_SHORT);
        toast.show();
        super.onStart();
    }

    @Override
    protected void onStop() {
        Toast toast = Toast.makeText(getApplicationContext(),"onStop()", Toast.LENGTH_SHORT);
        toast.show();
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Toast toast = Toast.makeText(getApplicationContext(),"onDestroy()", Toast.LENGTH_SHORT);
        toast.show();
        super.onDestroy();
    }

    @Override
    protected void onPause() {
        Toast toast = Toast.makeText(getApplicationContext(),"onPause()", Toast.LENGTH_SHORT);
        toast.show();
        super.onPause();
    }

    @Override
    protected void onResume() {
        Toast toast = Toast.makeText(getApplicationContext(),"onResume()", Toast.LENGTH_SHORT);
        toast.show();
        super.onResume();
    }
}