package com.example.menuwithsubmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId())
        {
            case R.id.coding:
                Toast.makeText(MainActivity.this,"Coding",Toast.LENGTH_SHORT).show();
                return true;



            case R.id.programming:
                Toast.makeText(MainActivity.this,"Programming",Toast.LENGTH_SHORT).show();
                return true;


            case R.id.status:
                Toast.makeText(MainActivity.this,"status",Toast.LENGTH_SHORT).show();
                return true;


            case R.id.call:
                Toast.makeText(MainActivity.this,"Calls",Toast.LENGTH_SHORT).show();
                return true;


            default:
                return super.onOptionsItemSelected(item);


        }







    }

    @Override
    public boolean onCreatePanelMenu(int featureId, @NonNull Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return true;
    }
}