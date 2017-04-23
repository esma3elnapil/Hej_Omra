package com.example.hp.hej_omra;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class ArkanAlHejActivity extends AppCompatActivity implements View.OnClickListener
{
    Typeface font;
    SharedPreferences Pref;
    private int ProgressCounter = 0;

    CheckBox IhramCB,WokofArafaCB,TawafIfadaCB,SaeeyCB;
    ImageView IhramIM,WokofArafaIM,TawafIfadaIM,SaeeyIM;
    TextView IhramTV,WokofArafaTV,TawafIfadaTV,SaeeyTV;
    Button ResetHej;
    LinearLayout Ihram_Hej,Wokof_Hej,Tawaf_Hej,Saeey_Hej;
   private ProgressBar AlhejProgress;

    private LayoutInflater inflater;
    private View layout;
    private ImageView image;
    private Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arkan_al_hej);
        ArkanIniti();
        CheckProgress();

    }

    private void CheckProgress() {
        Pref = getSharedPreferences("HejSteps", 0);
        if (Pref.contains("EhramDone")) {
            boolean EhramDone = Pref.getBoolean("EhramDone", false);
            if (EhramDone) {
                IhramCB.setChecked(true);
                ProgressCounter = ProgressCounter + 1;
                AlhejProgress.setProgress(ProgressCounter);
            } else {
                IhramCB.setChecked(false);
            }
        }

        if (Pref.contains("WokofArafaDone")) {
            boolean MasjedDone = Pref.getBoolean("WokofArafaDone", false);
            if (MasjedDone) {
                WokofArafaCB.setChecked(true);
                ProgressCounter = ProgressCounter + 1;
                AlhejProgress.setProgress(ProgressCounter);
            } else {
                WokofArafaCB.setChecked(false);
            }
        }

        if (Pref.contains("TawafIfadaDone")) {
            boolean TawafDone = Pref.getBoolean("TawafIfadaDone", false);
            if (TawafDone) {
                TawafIfadaCB.setChecked(true);
                ProgressCounter = ProgressCounter + 1;
                AlhejProgress.setProgress(ProgressCounter);
            } else {
                TawafIfadaCB.setChecked(false);
            }
        }

        if (Pref.contains("SaeeyDone")) {
            boolean MakamDone = Pref.getBoolean("SaeeyDone", false);
            if (MakamDone) {
                SaeeyCB.setChecked(true);
                ProgressCounter = ProgressCounter + 1;
                AlhejProgress.setProgress(ProgressCounter);
            } else {
                SaeeyCB.setChecked(false);
            }
        }
        ShowThisToast("You have Finished "+ProgressCounter+" Steps of 4 ");

    }

    private void ResetProgress() {
        PutBooleanIntoSharedPref("EhramDone", false);
        PutBooleanIntoSharedPref("WokofArafaDone", false);
        PutBooleanIntoSharedPref("TawafIfadaDone", false);
        PutBooleanIntoSharedPref("SaeeyDone", false);
        CheckProgress();
        ProgressCounter = 0 ;
        AlhejProgress.setProgress(ProgressCounter);
    }
    public void PutBooleanIntoSharedPref(String KEY, boolean TrueOrFalse) {
        SharedPreferences sharedPreferences = getSharedPreferences("HejSteps", 0);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(KEY, TrueOrFalse);
        editor.apply();
    }
    private void ShowThisToast(String ToastMessage) {
        //---------------------- Custome Toast ----------
        inflater = getLayoutInflater();
        layout = inflater.inflate(R.layout.toast,
                (ViewGroup) findViewById(R.id.toast_layout_root));
        TextView text = (TextView) layout.findViewById(R.id.text);
        text.setText(ToastMessage);

        toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(layout);
        toast.show();
        //-----------------------------------------------
    }

    private void ArkanIniti(){
        font = Typeface.createFromAsset(getAssets(), "fonts/jazel.ttf");

        IhramCB= (CheckBox) findViewById(R.id.ihramcheckBox);
        WokofArafaCB= (CheckBox) findViewById(R.id.wokofArafacheckBox);
        TawafIfadaCB= (CheckBox) findViewById(R.id.tawafIfadacheckBox);
        SaeeyCB= (CheckBox) findViewById(R.id.saeeycheckBox);
        AlhejProgress= (ProgressBar) findViewById(R.id.AlhejprogressBar);
        IhramCB.setOnClickListener(this);
        TawafIfadaCB.setOnClickListener(this);
        WokofArafaCB.setOnClickListener(this);
        SaeeyCB.setOnClickListener(this);

        ResetHej= (Button) findViewById(R.id.ResetHejButton);
        ResetHej.setOnClickListener(this);


        IhramTV= (TextView) findViewById(R.id.iharmtextView);
        SaeeyTV= (TextView) findViewById(R.id.saeeytextView);
        TawafIfadaTV= (TextView) findViewById(R.id.tawafIfadatextView);
        WokofArafaTV= (TextView) findViewById(R.id.wokofArafatextView);

        IhramTV.setTypeface(font);
        SaeeyTV.setTypeface(font);
        TawafIfadaTV.setTypeface(font);
        WokofArafaTV.setTypeface(font);


        IhramIM= (ImageView) findViewById(R.id.ihramimageView);
        SaeeyIM= (ImageView) findViewById(R.id.saeeyimageView);
        TawafIfadaIM= (ImageView) findViewById(R.id.tawafIfadaimageView);
        WokofArafaIM= (ImageView) findViewById(R.id.wokofArafaimageView);

        Ihram_Hej= (LinearLayout) findViewById(R.id.ihramHej);
        Wokof_Hej= (LinearLayout) findViewById(R.id.wokofHej);
        Tawaf_Hej= (LinearLayout) findViewById(R.id.tawafHej);
        Saeey_Hej= (LinearLayout) findViewById(R.id.saeeyHej);

        Ihram_Hej.setOnClickListener(this);
        Wokof_Hej.setOnClickListener(this);
        Tawaf_Hej.setOnClickListener(this);
        Saeey_Hej.setOnClickListener(this);




    }

    @Override
    public void onClick(View view)
    {
        switch (view.getId()){
            case R.id.ihramHej:
                startActivity(new Intent(ArkanAlHejActivity.this,AlEhramActivity.class));
                break;

            case R.id.tawafHej:
                startActivity(new Intent(ArkanAlHejActivity.this,AlTawafActivity.class));
                break;

            case R.id.saeeyHej:
                startActivity(new Intent(ArkanAlHejActivity.this,AlSaeyActivity.class));
                break;

            case R.id.wokofHej:
                startActivity(new Intent(ArkanAlHejActivity.this,WokofArafaActivity.class));
                break;








            case R.id.ihramcheckBox:
                if (IhramCB.isChecked()) {

                    PutBooleanIntoSharedPref("EhramDone", true);
                    ProgressCounter = ProgressCounter + 1;
                    AlhejProgress.setProgress(ProgressCounter);
                } else if (!IhramCB.isChecked()) {

                    PutBooleanIntoSharedPref("EhramDone", false);
                    ProgressCounter = ProgressCounter - 1;
                    AlhejProgress.setProgress(ProgressCounter);
                }
                break;

            case R.id.wokofArafacheckBox:
                if (WokofArafaCB.isChecked()) {

                    PutBooleanIntoSharedPref("WokofArafaDone", true);
                    ProgressCounter = ProgressCounter + 1;
                    AlhejProgress.setProgress(ProgressCounter);
                } else if (!WokofArafaCB.isChecked()) {

                    PutBooleanIntoSharedPref("WokofArafaDone", false);
                    ProgressCounter = ProgressCounter - 1;
                    AlhejProgress.setProgress(ProgressCounter);
                }
                break;

            case R.id.tawafIfadacheckBox:
                if (TawafIfadaCB.isChecked()) {

                    PutBooleanIntoSharedPref("TawafIfadaDone", true);
                    ProgressCounter = ProgressCounter + 1;
                    AlhejProgress.setProgress(ProgressCounter);
                } else if (!TawafIfadaCB.isChecked()) {

                    PutBooleanIntoSharedPref("TawafIfadaDone", false);
                    ProgressCounter = ProgressCounter - 1;
                    AlhejProgress.setProgress(ProgressCounter);
                }
                break;

            case R.id.saeeycheckBox:
                if (SaeeyCB.isChecked()) {

                    PutBooleanIntoSharedPref("SaeeyDone", true);
                    ProgressCounter = ProgressCounter + 1;
                    AlhejProgress.setProgress(ProgressCounter);
                } else if (!SaeeyCB.isChecked()) {

                    PutBooleanIntoSharedPref("SaeeyDone", false);
                    ProgressCounter = ProgressCounter - 1;
                    AlhejProgress.setProgress(ProgressCounter);
                }
                break;

            case R.id.ResetHejButton:
                ResetProgress();
                break;
        }

    }
}
