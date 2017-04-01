package com.example.cray.m0;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    //private TextView mHelloTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

   //     mHelloTextView = (TextView) findViewById(R.id.t1);
    }
    public void onMyButtonClick(View view)
    {
        // выводим сообщение
 //       String[] mTestArray;
        //mTestArray = getResources().getStringArray(R.array.media_names);
//        List<String> Lines = Arrays.asList(getResources().getStringArray(R.array.media_names));
 //       Lines.add(5,"wwwww");

        Resources res = getResources();
        String[] planets = res.getStringArray(R.array.media_names);
        ArrayList<String> dateStrings = new ArrayList<String>();  // ArrayList of strings
        String[] hourss = {"5:43", "6:00", "6:16", "6:32", "6:48", "7:04", "7:20", "7:36", "7:52", "8:09", "8:24", "8:40", "8:56", "9:12", "9:28", "9:44", "10:00", "10:16", "10:32", "10:48", "11:04", "11:20", "11:36", "11:52", "12:08", "12:24", "12:40", "12:56", "13:12", "13:28", "13:44", "14:00", "14:16", "14:32", "14:48", "15:04", "15:21", "15:37", "15:54", "16:10", "16:27", "16:43", "16:59", "17:15", "17:31", "17:47", "18:03", "18:19", "18:35", "18:51", "19:07", "19:23", "19:39", "19:55", "20:11", "20:27", "20:43", "20:59", "21:15", "21:31", "21:47", "22:03", "22:19", "22:35", "22:51", "23:07"};
        for (String item: hourss) {
            dateStrings.add(item);
        }
        List<Date> dates = new ArrayList<>(dateStrings.size()); // ArrayList of dates
        for(String s : dateStrings)
        {
            try
            {
                Date dateObj = new SimpleDateFormat("hh:mm").parse(s);
                dates.add(dateObj);
            }
            catch (ParseException e)
            {
                e.printStackTrace();
            }
        }
        for(Date d : dates)
        {
            String str = new SimpleDateFormat("hh:mm").format(d);
        }
        Stanciya st = new Stanciya("Проспект свободы",dates);
        Toast.makeText(this, st.getMinut(), Toast.LENGTH_SHORT).show();
    }
    public void onMyButtonClickpsb(View view)
    {
        // выводим сообщение
        ArrayList<String> dateStrings = new ArrayList<String>();  // ArrayList of strings
        String[] hourss = {"5:40", "5:52", "6:04", "6:15", "6:26", "6:37", "6:45", "6:52", "6:58", "7:03", "7:10", "7:17", "7:24", "7:31", "7:38", "7:46", "7:54", "8:03", "8:11", "8:18", "8:26", "8:35", "8:43", "8:53", "9:04", "9:15", "9:26", "9:36", "9:47", "9:59", "10:14", "10:31", "10:47", "11:03", "11:19", "11:35", "11:51", "12:07", "12:23", "12:39", "12:55", "13:11", "13:27", "13:44", "13:59", "14:15", "14:32", "14:45", "14:56", "15:07", "15:18", "15:29", "15:40", "15:51", "16:02", "16:13", "16:24", "16:35", "16:46", "16:57", "17:08", "17:19", "17:31", "17:41", "17:52", "18:03", "18:14", "18:25", "18:35", "18:47", "18:58", "19:07", "19:23", "19:39", "19:55", "20:11", "20:27", "20:43", "20:59", "21:15", "21:31", "21:47", "22:03", "22:19", "22:35", "22:51", "23:07"};
        for (String item: hourss) {
            dateStrings.add(item);
        }
        List<Date> dates = new ArrayList<>(dateStrings.size()); // ArrayList of dates
        for(String s : dateStrings)
        {
            try
            {
                Date dateObj = new SimpleDateFormat("hh:mm").parse(s);
                dates.add(dateObj);
            }
            catch (ParseException e)
            {
                e.printStackTrace();
            }
        }
        for(Date d : dates)
        {
            String str = new SimpleDateFormat("hh:mm").format(d);
        }
        Stanciya st = new Stanciya("Проспект свободы",dates);
        Toast.makeText(this, st.getMinut(), Toast.LENGTH_SHORT).show();
    }
    public void onMyButtonClickvb(View view)
    {
        // выводим сообщение
        ArrayList<String> dateStrings = new ArrayList<String>();  // ArrayList of strings
        String[] hourss = {"5:40", "5:54", "6:06", "6:18", "6:29", "6:40", "6:51", "6:59", "7:05", "7:11", "7:17", "7:24", "7:31", "7:38", "7:45", "7:52", "8:00", "8:08", "8:17", "8:25", "8:32", "8:40", "8:49", "8:57", "9:07", "9:18", "9:29", "9:40", "9:51", "10:02", "10:13", "10:29", "10:45", "11:01", "11:17", "11:33", "11:44", "12:05", "12:21", "12:37", "12:53", "13:09", "13:25", "13:41", "13:57", "14:13", "14:29", "14:46", "14:59", "15:10", "15:21", "15:32", "15:43", "15:54", "16:05", "16:16", "16:27", "16:38", "16:49", "17:00", "17:11", "17:22", "17:33", "17:44", "17:55", "18:06", "18:17", "18:28", "18:39", "18:49", "19:01", "19:12", "19:21", "19:37", "19:53", "20:09", "20:25", "20:41", "20:57", "21:13", "21:29", "21:45", "22:01", "22:17", "22:33", "22:49", "23:05"};
        for (String item: hourss) {
            dateStrings.add(item);
        }
        List<Date> dates = new ArrayList<>(dateStrings.size()); // ArrayList of dates
        for(String s : dateStrings)
        {
            try
            {
                Date dateObj = new SimpleDateFormat("hh:mm").parse(s);
                dates.add(dateObj);
            }
            catch (ParseException e)
            {
                e.printStackTrace();
            }
        }
        for(Date d : dates)
        {
            String str = new SimpleDateFormat("hh:mm").format(d);
        }
        Stanciya st = new Stanciya("Проспект свободы",dates);
        Toast.makeText(this, st.getMinut(), Toast.LENGTH_SHORT).show();
    }
    public void onMyButtonClickvv(View view)
    {
        // выводим сообщение
        ArrayList<String> dateStrings = new ArrayList<String>();  // ArrayList of strings
        String[] hourss = {"5:40", "5:58", "6:14", "6:30", "6:46", "7:02", "7:18", "7:34", "7:50", "8:06", "8:22", "8:38", "8:54", "9:10", "9:26", "9:42", "9:58", "10:14", "10:30", "10:46", "11:02", "11:18", "11:34", "11:50", "12:06", "12:22", "12:38", "12:54", "13:10", "13:26", "13:42", "13:58", "14:14", "14:30", "14:46", "15:02", "15:18", "15:35", "15:51", "16:08", "16:24", "16:41", "16:57", "17:13", "17:29", "17:45", "18:01", "18:17", "18:33", "18:49", "19:05", "19:21", "19:37", "19:53", "20:09", "20:25", "20:41", "20:57", "21:13", "21:29", "21:45", "22:01", "22:17", "22:33", "22:49", "23:05"};
        for (String item: hourss) {
            dateStrings.add(item);
        }
        List<Date> dates = new ArrayList<>(dateStrings.size()); // ArrayList of dates
        for(String s : dateStrings)
        {
            try
            {
                Date dateObj = new SimpleDateFormat("hh:mm").parse(s);
                dates.add(dateObj);
            }
            catch (ParseException e)
            {
                e.printStackTrace();
            }
        }
        for(Date d : dates)
        {
            String str = new SimpleDateFormat("hh:mm").format(d);
        }
        Stanciya st = new Stanciya("Проспект свободы",dates);
        Toast.makeText(this, st.getMinut(), Toast.LENGTH_SHORT).show();
    }

}
