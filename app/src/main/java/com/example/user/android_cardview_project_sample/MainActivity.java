package com.example.user.android_cardview_project_sample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private CardView schoolcardview,hospitalcardview,aiportcardview,resturantcardview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        schoolcardview=findViewById(R.id.schoolcardview_id);
        hospitalcardview=findViewById(R.id.hospital_id);
        aiportcardview=findViewById(R.id.airport_id);
        resturantcardview=findViewById(R.id.resturant_id);

        schoolcardview.setOnClickListener(this);
        hospitalcardview.setOnClickListener(this);
        aiportcardview.setOnClickListener(this);
        resturantcardview.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {

        if(v.getId()==R.id.airport_id){

            Intent intent=new Intent(MainActivity.this,airport_activity.class);
            startActivity(intent);


        }
        else if(v.getId()==R.id.schoolcardview_id){

            Intent intent=new Intent(MainActivity.this,school_activity.class);

            startActivity(intent);



        }else if(v.getId()==R.id.hospital_id){

            Intent intent=new Intent(MainActivity.this,hospital_activity.class);
            startActivity(intent);



        }else if(v.getId()==R.id.resturant_id){


            Intent intent=new Intent(MainActivity.this,resturant_activity.class);
            startActivity(intent);


        }




    }
}













