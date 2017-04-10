package com.elysewarren.takehomeassignment09_elysew;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Main2Activity extends AppCompatActivity {
    private EditText displayName;
    private EditText displayAge;
    private CheckBox checkBox;
    private FirebaseDatabase database = FirebaseDatabase.getInstance();
    private DatabaseReference studentRef = database.getReference("students");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        displayName = (EditText) findViewById(R.id.student_name);
        displayAge = (EditText) findViewById(R.id.student_age);
        checkBox = (CheckBox) findViewById(R.id.knows_scratch);
    }

    public void submitActivity(View view) {
        String studentName = displayName.getText().toString();
        int studentAge = Integer.parseInt(displayAge.getText().toString());
        boolean isKnowsScratch = checkBox.isChecked();
        studentRef.push().setValue(new Student(studentName, studentAge, isKnowsScratch));
        Intent student = new Intent(this, MainActivity.class);
        startActivity(student);
    }
}
