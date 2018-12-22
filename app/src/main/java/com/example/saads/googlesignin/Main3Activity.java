package com.example.saads.googlesignin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {

    EditText user,pass;
    Button btnlogin;
    private String TAG="iamtag";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        user=(EditText)findViewById(R.id.username);
        pass=(EditText)findViewById(R.id.password);

        btnlogin=(Button)findViewById(R.id.Login);
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(user.getText().toString().equals("savemart") && pass.getText().toString().equals("savemart"))
                {
                    Intent intent=new Intent(Main3Activity.this,Main4Activity.class);
                    startActivity(intent);
                    //Toast toast=Toast.makeText(getApplicationContext(), "You are Login as Save Mart Admin", Toast.LENGTH_LONG);
                    //toast.show();
                    Toast.makeText(getApplicationContext(), "You are Login as Save Mart Admin", Toast.LENGTH_LONG).show();
                }
                else if(user.getText().toString().equals("moonmall") && pass.getText().toString().equals("moonmall"))
                {

                    Intent intent=new Intent(Main3Activity.this,Main5Activity.class);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(),"You are Login as Moon Shopping Mall Admin", Toast.LENGTH_LONG).show();
                    //Toast toast=Toast.makeText(Main3Activity.this, "You are Login as Moon Shopping Mall Admin", Toast.LENGTH_LONG);
                    //toast.show();
                }
                else if(user.getText().toString().equals("atozmall") && pass.getText().toString().equals("atozmall"))
                {
                    Intent intent=new Intent(Main3Activity.this,Main6Activity.class);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(), "You are Login as AtoZ Shopping Mall Admin", Toast.LENGTH_LONG).show();
                    //Toast toast = Toast.makeText(getApplicationContext(), "You are Login as AtoZ Shopping Mall Admin", Toast.LENGTH_LONG);
                    //toast.show();
                }
                else if(user.getText().toString().equals("gelanimart") && pass.getText().toString().equals("gelanimart"))
                {
                    Intent intent=new Intent(Main3Activity.this,Main7Activity.class);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(), "You are Login as Gelani Mart Admin", Toast.LENGTH_LONG).show();
                    //Toast toast = Toast.makeText(getApplicationContext(), "You are Login as Gelani Mart Admin", Toast.LENGTH_LONG);
                    //toast.show();
                }
                else
                {
                    Toast.makeText(getApplicationContext(), "Your UserName OR Password Is Invalid", Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}
