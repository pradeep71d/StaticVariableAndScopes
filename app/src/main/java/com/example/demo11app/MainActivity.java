package com.example.demo11app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Employee e1=new Employee(12,"adxugu");
        e1.display();
        Employee e2=new Employee(456,"sdtffhfhv");
        e2.display();// in this way we can create thousands of objects
    }
}
