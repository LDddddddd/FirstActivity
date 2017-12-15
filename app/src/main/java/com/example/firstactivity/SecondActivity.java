package com.example.firstactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {
private List<CharSequence> eduList = null;
    private ArrayAdapter<CharSequence> eduAdapter = null;
    private Spinner eduSpinner = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
eduSpinner = (Spinner)super.findViewById(R.id.eduSpinner);
   eduSpinner.setPrompt("请选择你的性别");
        eduList = new ArrayList<CharSequence>();
        eduList.add("男");
        eduList.add("女");
        eduAdapter= new ArrayAdapter<CharSequence>(this,android.R.layout.simple_spinner_item,eduList);
        eduAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        eduSpinner.setAdapter(eduAdapter);
        Button button = (Button) findViewById(R.id.button_4);
        button.setOnClickListener(new View.OnClickListener()
        {@Override
            public void onClick(View view){
            finish();
        }

        });
    }
}
