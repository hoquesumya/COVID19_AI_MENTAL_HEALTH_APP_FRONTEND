package com.example.covid_19ai;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Chatbot_page extends AppCompatActivity {
    Button chatbot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chatbot_page);
        chatbot=findViewById(R.id.button_chatbot);
        chatbot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent assistant=new Intent(Intent.ACTION_VIEW, Uri.parse("https://web-chat.global.assistant.watson.cloud.ibm.com/preview.html?region=us-south&integrationID=744a4a7f-52a0-4ace-ad3c-a37854ee1ddc&serviceInstanceID=a707bc1a-8722-4bb3-9d90-390ec24c08a7"));
                if(assistant!=null) {
                    startActivity(assistant);
                }
            }
        });
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
