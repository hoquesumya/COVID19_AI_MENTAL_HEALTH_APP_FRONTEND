package com.example.covid_19ai;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

import java.text.BreakIterator;

//import static com.example.covid_19ai.R.id.textFirstName;

public class MainActivity extends AppCompatActivity {
    private static final String TAG="MainActivity";
    private EditText editusername, editEmail, editpass;
    private TextView txtwarnname,textWarnemail,txtWarnpass,txtasterrisk1,txtagreemnet,txtaster2,txtaster23;
    private Button btnenter;
    private CheckBox checkagrement;
    public static ConstraintLayout parent;
   // private String name;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         initviews();


        //name=editusername.getText().toString();

        btnenter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //name=editusername.getText().toString();
                    initEnter();

            }//Caliing the initienter function
        });


    }
    //This function will cjeck if the user enters all of the required data, if its ture then it will check agreement//
    private void initEnter() {
        Log.d(TAG, "initEnter: Started");
        if (validatedata()) {
            if (checkagrement.isChecked()) {
                showsnackbar();// A littele window will be presented to give a message to the user
                //Intent intent=new Intent(MainActivity.this,SecnodpageActivity.class);
                //intent.putExtra("passdata1",name
                //);
               // startActivity(intent);
            } else {
                Toast.makeText(this, "You need to agree to this license agreement", Toast.LENGTH_SHORT).show();
            }
        }
    }
    private void showsnackbar(){
        Log.d(TAG,"showsnackbar: Started");
        txtwarnname.setVisibility(View.INVISIBLE);
        textWarnemail.setVisibility(View.INVISIBLE);
        txtWarnpass.setVisibility(View.INVISIBLE);
        String name=editusername.getText().toString();
        String message="Welcome "+name;

        Snackbar.make(parent,   message, Snackbar.LENGTH_INDEFINITE)
            .setAction("Dismiss", new View.OnClickListener(){

                @Override
                public void onClick(View v) {

                    Intent intent=new Intent(MainActivity.this,SecnodpageActivity.class);
                    ActivityOptions options =
                            ActivityOptions.makeCustomAnimation(MainActivity.this, R.anim.fade_in, R.anim.fade_out);
                    intent.putExtra("passdata1",name
                    );
                    startActivity(intent,options.toBundle());
                }
            }).show();
    }
    private boolean validatedata(){
        Log.d(TAG,"validtedata: Started");
        if(editusername.getText().toString().equals("")){
            txtwarnname.setVisibility(View.VISIBLE);
            txtwarnname.setText("Enter the username");
            return false;
        }
        if(editEmail.getText().toString().equals("")){
            textWarnemail.setVisibility(View.VISIBLE);
            textWarnemail.setText("Enter the email address");
            return false;
        }
        if(editpass.getText().toString().equals("")) {
           txtWarnpass.setVisibility(View.VISIBLE);
           textWarnemail.setText("Enter passward");
           return false;
        }
        return true;

    }
    public String setname(){
        String name=editusername.getText().toString();
        return name;
    }


    private void initviews() {
        Log.d(TAG,"initviews: Started");
        editusername=findViewById(R.id.editTextName);
        editEmail=findViewById(R.id.editTextemail);
        editpass=findViewById(R.id.editTextPassword);

        txtwarnname=findViewById((R.id.textwarningusser));
        textWarnemail=findViewById(R.id.warning_email);
        txtWarnpass=findViewById(R.id.waringpass);
        txtasterrisk1=findViewById(R.id.star1);
        txtagreemnet=findViewById(R.id.Privacy);
        txtaster2=findViewById(R.id.asterickemail);
        txtaster23=findViewById(R.id.asterickpass);


        btnenter=findViewById(R.id.btnRegister);
        checkagrement=findViewById(R.id.checkBox);
        parent=findViewById(R.id.parent);

    }



    }

