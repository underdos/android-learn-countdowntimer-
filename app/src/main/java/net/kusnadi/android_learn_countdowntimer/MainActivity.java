package net.kusnadi.android_learn_countdowntimer;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.textView);
        Timer();
    }

    private void Timer(){
        new CountDownTimer(50000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                textView.setText("Time left is " + millisUntilFinished/1000 + "s");
            }

            @Override
            public void onFinish() {
                Toast.makeText(MainActivity.this, "Time is up", Toast.LENGTH_SHORT).show();
            }
        }.start();
    }
}
