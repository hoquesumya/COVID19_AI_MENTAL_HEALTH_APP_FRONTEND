package com.example.covid_19ai;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ThirdActivity extends AppCompatActivity {

    //String s1 [];
    //int image[]={R.drawable.teenage,R.drawable.adults};
    //RecyclerView recyclerView;
   private  Button buttonteen,buttonyoung,buttonnursing;
   private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        /*s1=getResources().getStringArray(R.array.Counling_type);
        recyclerView=findViewById(R.id.recyclerview);
        Myadapter myadpter=new Myadapter(this,s1,image);
        recyclerView.setAdapter(myadpter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));*/
        init();
        text.setText("What are you looking for today?");
        buttonteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intet=new Intent(ThirdActivity.this, Under_Construction.class);
                startActivity(intet);

            }
        });
        buttonyoung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intet=new Intent(ThirdActivity.this, Under_Construction.class);
                startActivity(intet);

            }
        });
        buttonnursing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intet=new Intent(ThirdActivity.this, Chatbot_page.class);
                startActivity(intet);
            }
        });

    }
    private void init(){
        buttonteen=findViewById(R.id.button_teen);
        buttonyoung=findViewById(R.id.button_young);
        buttonnursing=findViewById(R.id.button_nursing);
        text=findViewById(R.id.textview_question);
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