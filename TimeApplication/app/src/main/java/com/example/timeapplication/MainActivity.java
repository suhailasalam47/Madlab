package com.example.timeapplication;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.text.SimpleDateFormat;
import java.util.Calendar;
public class MainActivity extends AppCompatActivity {
    TextView text2;
    Button button;
    Calendar calendar;
    SimpleDateFormat simpleDateFormat;
    String Date;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text2 = findViewById(R.id.text2);
        button = findViewById(R.id.button);
        calendar = Calendar.getInstance();
        simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        Date = simpleDateFormat.format(calendar.getTime());
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text2.setText(Date);
            }
        });
    }
}