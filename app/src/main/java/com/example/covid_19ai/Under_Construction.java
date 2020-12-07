package com.example.covid_19ai;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class Under_Construction extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_under__construction);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.about, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id=item.getItemId();
        if(id==R.id.setting){
            Toast.makeText(this, "Settings clicked", Toast.LENGTH_LONG).show();
        }
        if(id==R.id.menu_about){
            Toast.makeText(this, "About clicked", Toast.LENGTH_LONG).show();
        }
        if(id==R.id.menu_contact){
            Toast.makeText(this, "Contact clicked", Toast.LENGTH_LONG).show();
        }
        return super.onOptionsItemSelected(item);
    }
}