package com.example.mir.testcustomadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<InternalMarkDesign> internalMarks = new ArrayList<InternalMarkDesign>();
        internalMarks.add(new InternalMarkDesign("Abhisekh","2"));
        internalMarks.add(new InternalMarkDesign("Riya","4"));

        InternalMarksAdapter marksAdapter = new InternalMarksAdapter(this, internalMarks);


        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(marksAdapter);
    }
}
