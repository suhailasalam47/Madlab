package com.example.alarmclock;
import androidx.appcompat.app.AppCompatActivity;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.os.Bundle;
import android.widget.TextClock;
import android.widget.TimePicker;
import java.util.Timer;
import java.util.TimerTask;
public class MainActivity extends AppCompatActivity {
    TimePicker tp;
    TextClock tc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tp = findViewById(R.id.timepicker);
        tc = findViewById(R.id.textclock);
        Ringtone r=
                RingtoneManager.getRingtone(getApplicationContext(),RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION));
        Timer t = new Timer();
        t.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                if(tc.getText().toString().equals(AlarmTime())){
                    r.play();
                }else{
                    r.stop();
                }
            }
        },0,1000);
    }
    public String AlarmTime(){
        Integer alarmHours = tp.getCurrentHour();
        Integer alarmMinutes = tp.getCurrentMinute();
        String stringAlarmMinutes;
        if(alarmMinutes<10){
            stringAlarmMinutes="0";
            stringAlarmMinutes=stringAlarmMinutes.concat(alarmMinutes.toString());
        }else{
            stringAlarmMinutes=alarmMinutes.toString();
        }
        String stringAlarmTime;
        if(alarmHours>12){
            alarmHours=alarmHours-12;
            stringAlarmTime=alarmHours.toString().concat(":").concat(stringAlarmMinutes).concat("PM");
        }else {
            stringAlarmTime=alarmHours.toString().concat(":").concat(stringAlarmMinutes).concat("AM");
        }
        return stringAlarmTime;
    }
}