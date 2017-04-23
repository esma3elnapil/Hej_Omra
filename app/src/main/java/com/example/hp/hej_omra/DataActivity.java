package com.example.hp.hej_omra;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class DataActivity extends AppCompatActivity implements View.OnClickListener
{
EditText CompanyName,CompanyMob,HajNmae,HajMob,Id,Nationality,Authorization,MunaCamp,
        MunaCategory,ArafaCamp,ArafaCategory,Tent,OtherData,Hotel;
    Button save;
    public static final String MY_PREFS_NAME = "MyPrefsFile";
    Boolean UserData=false;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);
        inti();

    }
    private void inti()
    {
        CompanyName= (EditText  ) findViewById(R.id.companyET);
        CompanyMob= (EditText) findViewById(R.id.companymobET);
        HajNmae= (EditText) findViewById(R.id.nameET);
        HajMob= (EditText) findViewById(R.id.mobET);
        Id= (EditText) findViewById(R.id.idET);
        Nationality= (EditText) findViewById(R.id.nationalityET);
        Authorization= (EditText) findViewById(R.id.authoET);
        MunaCamp= (EditText) findViewById(R.id.munaCampET);
        MunaCategory= (EditText) findViewById(R.id.munaCategoryET);
        ArafaCamp= (EditText) findViewById(R.id.arafacampET);
        ArafaCategory= (EditText) findViewById(R.id.arafaCategoryET);
        Tent= (EditText) findViewById(R.id.khimaET);
        OtherData= (EditText) findViewById(R.id.otherET);
        Hotel= (EditText) findViewById(R.id.hotelET);
        save= (Button) findViewById(R.id.save);

       save.setOnClickListener(this);



    }

    @Override
    public void onClick(View view)
    {
        switch (view.getId()){
            case R.id.save:

                SavePreferences();
                startActivity(new Intent(this,ProfileActivity.class));

                break;
        }

    }
    private void SaveData()
    {
        SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString("companyName",CompanyName.getText().toString());
        editor.putString("companyMob",CompanyMob.getText().toString());
        editor.putString("hajName",HajNmae.getText().toString());
        editor.putString("hajMob",HajMob.getText().toString());
        editor.putString("hotel",Hotel.getText().toString());
        editor.putString("id",Id.getText().toString());
        editor.putString("nationality",Nationality.getText().toString());
        editor.putString("authorization",Authorization.getText().toString());
        editor.putString("menaCamp",MunaCamp.getText().toString());
        editor.putString("menaCategory",MunaCategory.getText().toString());
        editor.putString("arfaCamp",ArafaCamp.getText().toString());
        editor.putString("arafaCategory",ArafaCategory.getText().toString());
        editor.putString("tent",Tent.getText().toString());
        editor.putString("other",OtherData.getText().toString());


        String d="done";
        editor.putString("done",d);


        editor.apply();

        startActivity(new Intent(this,ProfileActivity.class));



    }
    private void SavePreferences(){
        SharedPreferences sharedPref = getSharedPreferences("MY_SHARED_PREF", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString("companyName",CompanyName.getText().toString());
        editor.putString("companyMob",CompanyMob.getText().toString());
        editor.putString("hajName",HajNmae.getText().toString());
        editor.putString("hajMob",HajMob.getText().toString());
        editor.putString("hotel",Hotel.getText().toString());
        editor.putString("id",Id.getText().toString());
        editor.putString("nationality",Nationality.getText().toString());
        editor.putString("authorization",Authorization.getText().toString());
        editor.putString("menaCamp",MunaCamp.getText().toString());
        editor.putString("menaCategory",MunaCategory.getText().toString());
        editor.putString("arfaCamp",ArafaCamp.getText().toString());
        editor.putString("arafaCategory",ArafaCategory.getText().toString());
        editor.putString("tent",Tent.getText().toString());
        editor.putString("other",OtherData.getText().toString());
        editor.commit();
    }

}
