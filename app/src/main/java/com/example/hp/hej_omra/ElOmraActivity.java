package com.example.hp.hej_omra;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class ElOmraActivity extends AppCompatActivity implements View.OnClickListener
{

    private ImageView EhramimageView,MasjedimageView,TawafimageView,MakamimageView,AlsaeyimageView,TahalolimageView;
    private TextView EhramtextView,MasjedtextView,TawaftextView,MakamtextView,AlsaeytextView,TahaloltextView;
    private CheckBox EhramcheckBox,MasjedcheckBox,TawafcheckBox,MakamcheckBox,AlsaeycheckBox,TahalolcheckBox;
    Typeface font;
    SharedPreferences Pref;

    private ProgressBar progressBar;
    int ProgressCounter = 0;


    //    int []ListPics={R.drawable.azkar,R.drawable.hej,R.drawable.hotels,R.drawable.meqat,R.drawable.omra,R.drawable.splash};
    //ListView OmraListView;
    //    String[]OmraList;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_el_omra);
        font = Typeface.createFromAsset(getAssets(), "fonts/jazel.ttf");
        init();
        CheckProgress();

//        OmraListView= (ListView) findViewById(R.id.elomra_lV);
//        OmraList=getResources().getStringArray(R.array.OmraListView);
//        OmraListView.setAdapter(new ElOmraCustomAdapter(this,OmraList,ListPics));



    }

    private void CheckProgress() {
        Pref = getSharedPreferences("OmraSteps",0);

        if (Pref.contains("EhramDone")){
            boolean EhramDone= Pref.getBoolean("EhramDone",false);
            if (EhramDone){
                EhramcheckBox.setChecked(true);
                ProgressCounter = ProgressCounter +1;
                progressBar.setProgress(ProgressCounter);
            }else {EhramcheckBox.setChecked(false);}
        }

        if (Pref.contains("MasjedDone")){
            boolean EhramDone= Pref.getBoolean("MasjedDone",false);
            if (EhramDone){
                MasjedcheckBox.setChecked(true);
                ProgressCounter = ProgressCounter +1;
                progressBar.setProgress(ProgressCounter);
            }else {MasjedcheckBox.setChecked(false);}
        }

        if (Pref.contains("TawafDone")){
            boolean EhramDone= Pref.getBoolean("TawafDone",false);
            if (EhramDone){
                TawafcheckBox.setChecked(true);
                ProgressCounter = ProgressCounter +1;
                progressBar.setProgress(ProgressCounter);
            }else {TawafcheckBox.setChecked(false);}
        }

        if (Pref.contains("MakamDone")){
            boolean EhramDone= Pref.getBoolean("MakamDone",false);
            if (EhramDone){
                MakamcheckBox.setChecked(true);
                ProgressCounter = ProgressCounter +1;
                progressBar.setProgress(ProgressCounter);
            }else {MakamcheckBox.setChecked(false);}
        }

        if (Pref.contains("AlsaeyDone")){
            boolean EhramDone= Pref.getBoolean("AlsaeyDone",false);
            if (EhramDone){
                AlsaeycheckBox.setChecked(true);
                ProgressCounter = ProgressCounter +1;
                progressBar.setProgress(ProgressCounter);
            }else {AlsaeycheckBox.setChecked(false);}
        }

        if (Pref.contains("TahalolDone")){
            boolean EhramDone= Pref.getBoolean("TahalolDone",false);
            if (EhramDone){
                TahalolcheckBox.setChecked(true);
                ProgressCounter = ProgressCounter +1;
                progressBar.setProgress(ProgressCounter);
            }else {TahalolcheckBox.setChecked(false);}
        }


    }

    private void init() {

        font = Typeface.createFromAsset(getAssets(), "fonts/jazel.ttf");

        progressBar = (ProgressBar) findViewById(R.id.progressBar);

        EhramimageView = (ImageView)findViewById(R.id.EhramimageView);
        MasjedimageView = (ImageView)findViewById(R.id.MasjedimageView);
        TawafimageView = (ImageView)findViewById(R.id.TawafimageView);
        MakamimageView = (ImageView)findViewById(R.id.MakamimageView);
        AlsaeyimageView = (ImageView)findViewById(R.id.AlsaeyimageView);
        TahalolimageView = (ImageView)findViewById(R.id.TahalolimageView);
        EhramimageView.setOnClickListener(this);
        MasjedimageView.setOnClickListener(this);
        TawafimageView.setOnClickListener(this);
        MakamimageView.setOnClickListener(this);
        AlsaeyimageView.setOnClickListener(this);
        TahalolimageView.setOnClickListener(this);

        EhramtextView = (TextView)findViewById(R.id.EhramtextView);
        MasjedtextView = (TextView)findViewById(R.id.MasjedtextView);
        TawaftextView = (TextView)findViewById(R.id.TawaftextView);
        MakamtextView = (TextView)findViewById(R.id.MakamtextView);
        AlsaeytextView = (TextView)findViewById(R.id.AlsaeytextView);
        TahaloltextView = (TextView)findViewById(R.id.TahaloltextView);
        EhramtextView.setOnClickListener(this);
        MasjedtextView.setOnClickListener(this);
        TawaftextView.setOnClickListener(this);
        MakamtextView.setOnClickListener(this);
        AlsaeytextView.setOnClickListener(this);
        TahaloltextView.setOnClickListener(this);

        EhramtextView.setTypeface(font);
        MasjedtextView.setTypeface(font);
        TawaftextView.setTypeface(font);
        MakamtextView.setTypeface(font);
        AlsaeytextView.setTypeface(font);
        TahaloltextView.setTypeface(font);

        EhramcheckBox = (CheckBox)findViewById(R.id.EhramcheckBox);
        MasjedcheckBox = (CheckBox)findViewById(R.id.MasjedcheckBox);
        TawafcheckBox = (CheckBox)findViewById(R.id.TawafcheckBox);
        MakamcheckBox = (CheckBox)findViewById(R.id.MakamcheckBox);
        AlsaeycheckBox = (CheckBox)findViewById(R.id.AlsaeycheckBox);
        TahalolcheckBox = (CheckBox)findViewById(R.id.TahalolcheckBox);

        EhramcheckBox.setOnClickListener(this);
        MasjedcheckBox.setOnClickListener(this);
        TawafcheckBox.setOnClickListener(this);
        MakamcheckBox.setOnClickListener(this);
        AlsaeycheckBox.setOnClickListener(this);
        TahalolcheckBox.setOnClickListener(this);




    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            //------------------------------ Ehram
            case R.id.EhramimageView:
                startActivity(new Intent(ElOmraActivity.this, AlEhramActivity.class));
                break;
            case R.id.EhramtextView:
                startActivity(new Intent(ElOmraActivity.this, AlEhramActivity.class));
                break;
            case R.id.EhramcheckBox:
                if (EhramcheckBox.isChecked()){
                    SharedPreferences sharedPreferences =getSharedPreferences("OmraSteps",0);
                    SharedPreferences.Editor editor= sharedPreferences.edit();
                    editor.putBoolean("EhramDone",true);
                    editor.apply();
                    ProgressCounter = ProgressCounter +1;
                    progressBar.setProgress(ProgressCounter);
                }else if (!EhramcheckBox.isChecked()){
                    SharedPreferences sharedPreferences =getSharedPreferences("OmraSteps",0);
                    SharedPreferences.Editor editor= sharedPreferences.edit();
                    editor.putBoolean("EhramDone",false);
                    editor.apply();
                    ProgressCounter = ProgressCounter -1;
                    progressBar.setProgress(ProgressCounter);
                }
                break;

            //------------------------------ Masjed
            case R.id.MasjedimageView:
                startActivity(new Intent(ElOmraActivity.this, E_MosqueActivity.class));
                break;

            case R.id.MasjedtextView:
                startActivity(new Intent(ElOmraActivity.this, E_MosqueActivity.class));
                break;

            case R.id.MasjedcheckBox:
                if (MasjedcheckBox.isChecked()){
                    SharedPreferences sharedPreferences =getSharedPreferences("OmraSteps",0);
                    SharedPreferences.Editor editor= sharedPreferences.edit();
                    editor.putBoolean("MasjedDone",true);
                    editor.apply();
                    ProgressCounter = ProgressCounter +1;
                    progressBar.setProgress(ProgressCounter);
                }else if (!MasjedcheckBox.isChecked()){
                    SharedPreferences sharedPreferences =getSharedPreferences("OmraSteps",0);
                    SharedPreferences.Editor editor= sharedPreferences.edit();
                    editor.putBoolean("MasjedDone",false);
                    editor.apply();
                    ProgressCounter = ProgressCounter -1;
                    progressBar.setProgress(ProgressCounter);
                }
                break;

            //------------------------------ Tawaf
            case R.id.TawafimageView:
                startActivity(new Intent(ElOmraActivity.this, AlTawafActivity.class));
                break;

            case R.id.TawaftextView:
                startActivity(new Intent(ElOmraActivity.this, AlTawafActivity.class));
                break;

            case R.id.TawafcheckBox:
                if (TawafcheckBox.isChecked()){
                    SharedPreferences sharedPreferences =getSharedPreferences("OmraSteps",0);
                    SharedPreferences.Editor editor= sharedPreferences.edit();
                    editor.putBoolean("TawafDone",true);
                    editor.apply();
                    ProgressCounter = ProgressCounter +1;
                    progressBar.setProgress(ProgressCounter);
                }else if (!TawafcheckBox.isChecked()){
                    SharedPreferences sharedPreferences =getSharedPreferences("OmraSteps",0);
                    SharedPreferences.Editor editor= sharedPreferences.edit();
                    editor.putBoolean("TawafDone",false);
                    editor.apply();
                    ProgressCounter = ProgressCounter -1;
                    progressBar.setProgress(ProgressCounter);
                }
                break;

            //------------------------------ Makam
            case R.id.MakamimageView:
                startActivity(new Intent(ElOmraActivity.this, MaqamEbrahimActivity.class));
                break;

            case R.id.MakamtextView:
                startActivity(new Intent(ElOmraActivity.this, MaqamEbrahimActivity.class));
                break;

            case R.id.MakamcheckBox:
                if (MakamcheckBox.isChecked()){
                    SharedPreferences sharedPreferences =getSharedPreferences("OmraSteps",0);
                    SharedPreferences.Editor editor= sharedPreferences.edit();
                    editor.putBoolean("MakamDone",true);
                    editor.apply();
                    ProgressCounter = ProgressCounter +1;
                    progressBar.setProgress(ProgressCounter);
                }else if (!MakamcheckBox.isChecked()){
                    SharedPreferences sharedPreferences =getSharedPreferences("OmraSteps",0);
                    SharedPreferences.Editor editor= sharedPreferences.edit();
                    editor.putBoolean("MakamDone",false);
                    editor.apply();
                    ProgressCounter = ProgressCounter -1;
                    progressBar.setProgress(ProgressCounter);
                }
                break;

            //------------------------------ Alsaey
            case R.id.AlsaeyimageView:
                startActivity(new Intent(ElOmraActivity.this, AlSaeyActivity.class));
                break;

            case R.id.AlsaeytextView:
                startActivity(new Intent(ElOmraActivity.this, AlSaeyActivity.class));
                break;

            case R.id.AlsaeycheckBox:
                if (AlsaeycheckBox.isChecked()){
                    SharedPreferences sharedPreferences =getSharedPreferences("OmraSteps",0);
                    SharedPreferences.Editor editor= sharedPreferences.edit();
                    editor.putBoolean("AlsaeyDone",true);
                    editor.apply();
                    ProgressCounter = ProgressCounter +1;
                    progressBar.setProgress(ProgressCounter);
                }else if (!AlsaeycheckBox.isChecked()){
                    SharedPreferences sharedPreferences =getSharedPreferences("OmraSteps",0);
                    SharedPreferences.Editor editor= sharedPreferences.edit();
                    editor.putBoolean("AlsaeyDone",false);
                    editor.apply();
                    ProgressCounter = ProgressCounter -1;
                    progressBar.setProgress(ProgressCounter);
                }
                break;

            //------------------------------ Tahalol
            case R.id.TahalolimageView:
                startActivity(new Intent(ElOmraActivity.this, AlTahlolActivity.class));
                break;

            case R.id.TahaloltextView:
                startActivity(new Intent(ElOmraActivity.this, AlTahlolActivity.class));
                break;

            case R.id.TahalolcheckBox:
                if (TahalolcheckBox.isChecked()){
                    SharedPreferences sharedPreferences =getSharedPreferences("OmraSteps",0);
                    SharedPreferences.Editor editor= sharedPreferences.edit();
                    editor.putBoolean("TahalolDone",true);
                    editor.apply();
                    ProgressCounter = ProgressCounter +1;
                    progressBar.setProgress(ProgressCounter);
                }else if (!TahalolcheckBox.isChecked()){
                    SharedPreferences sharedPreferences =getSharedPreferences("OmraSteps",0);
                    SharedPreferences.Editor editor= sharedPreferences.edit();
                    editor.putBoolean("TahalolDone",false);
                    editor.apply();
                    ProgressCounter = ProgressCounter -1;
                    progressBar.setProgress(ProgressCounter);
                }
                break;
        }

    }
}