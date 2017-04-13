package com.example.hp.hej_omra;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class AlTahlolActivity extends AppCompatActivity implements View.OnClickListener
{
    ImageView TahlolImV;
    TextView TahlolTV;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_al_tahlol);
        TahlolInti();
    }
    private void TahlolInti()
    {

        TahlolImV= (ImageView) findViewById(R.id.Tahlol_Im);
        TahlolTV= (TextView) findViewById(R.id.Tahlol_Tv);



    }


    // custom dialog
    private void ShowDialog() {
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.customdialogitem);
        dialog.setTitle("Hi.....Haj");

        // set the custom dialog components - text, image and button
        TextView text = (TextView) dialog.findViewById(R.id.text);
        text.setText("Acceptable Omra!");
        ImageView image = (ImageView) dialog.findViewById(R.id.image);
        image.setImageResource(R.drawable.splash);

        Button dialogButton = (Button) dialog.findViewById(R.id.dialogButtonOK);
              dialogButton.setOnClickListener(new View.OnClickListener() {
                  @Override
                  public void onClick(View view) {
                      dialog.dismiss();
                  }
              });
        dialog.show();

    }

    @Override
    public void onClick(View view)
    {


    }
}
