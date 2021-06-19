package com.amar.covid19bihar.VocationalCourses;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.amar.covid19bihar.Adapters.CourseAdapter;
import com.amar.covid19bihar.R;

import java.util.ArrayList;

public class Novel extends AppCompatActivity {

    ArrayList<Integer> noveltitle = new ArrayList<Integer>();
    ArrayList<Integer> novelimg = new ArrayList<Integer>();
    ArrayList<String> novelurl = new ArrayList<String>();
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_novel);

        recyclerView = (RecyclerView) findViewById(R.id.novel_recycler);

        noveltitle.add(R.string.royal_road);
        noveltitle.add(R.string.web_friction_guide);
        noveltitle.add(R.string.wattpad);
        noveltitle.add(R.string.gravity_tales);

        novelimg.add(R.string.r);
        novelimg.add(R.string.w);
        novelimg.add(R.string.w);
        novelimg.add(R.string.g);

        novelurl.add("https://www.royalroad.com/ ");
        novelurl.add("http://webfictionguide.com/");
        novelurl.add("https://www.wattpad.com/");
        novelurl.add("http://gravitytales.com/");

        CourseAdapter courseAdapter = new CourseAdapter(getApplicationContext(),noveltitle,novelimg,novelurl);
        recyclerView.setAdapter(courseAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}
