package com.geocalk.feranodor.androidgeocalk;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.geocalk.feranodor.androidgeocalk.Grunt.GruntNieSpoisty;
import com.geocalk.feranodor.androidgeocalk.Grunt.GruntSpoisty;
import com.geocalk.feranodor.androidgeocalk.Grunt.NazwaNiespoistegoGruntu;
import com.geocalk.feranodor.androidgeocalk.Grunt.NazwaSpoistegoGruntu;
import com.geocalk.feranodor.androidgeocalk.Grunt.StanWilg;
import com.geocalk.feranodor.androidgeocalk.Grunt.TypSpoistego;

public class MainActivity extends AppCompatActivity {

    private Spinner spinnerName;
    private Spinner spinnerTypWilg;
    private Spinner spinnerParamWiod;
    private ArrayAdapter<CharSequence> adapterSpoistyName;
    private ArrayAdapter<CharSequence> adapterTyp;
    private ArrayAdapter<CharSequence> adapterParamWiodSpoisty;
    private ArrayAdapter<CharSequence> adapterNiespoistyName;
    private ArrayAdapter<CharSequence> adapterWilg;
    private ArrayAdapter<CharSequence> adapterParamWiodNiespoisty;
    private TextView zagPlast;
    private TextView spojnoscText;
    private TextView spojnoscLiczba;
    private TextView typWilg;
    private NazwaSpoistegoGruntu nazwaSpoistegoGruntu;
    private NazwaNiespoistegoGruntu nazwaNiespoistegoGruntu;
    private StanWilg stanWilg;
    private TypSpoistego typSpoistego;
    private String parametrWiodacy;
    private SeekBar seekBar;
    private TextView numer1;
    private TextView numer2;
    private TextView numer3;
    private TextView numer4;
    private TextView numer5;
    private TextView numer6;
    private TextView numer7;
    private TextView numer8;
    private int intSeekBar;
    private RadioButton radioButtonNieSpoisty;
    private GruntNieSpoisty gruntNieSpoisty;
    private GruntSpoisty gruntSpoisty;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioButtonNieSpoisty = (RadioButton) findViewById(R.id.radiobutton_niespoisty);

        numer1 = (TextView) findViewById(R.id.numer1);
        numer2 = (TextView) findViewById(R.id.numer2);
        numer3 = (TextView) findViewById(R.id.numer3);
        numer4 = (TextView) findViewById(R.id.numer4);
        numer5 = (TextView) findViewById(R.id.numer5);
        numer6 = (TextView) findViewById(R.id.numer6);
        numer7 = (TextView) findViewById(R.id.numer7);
        numer8 = (TextView) findViewById(R.id.numer8);

        zagPlast = (TextView) findViewById(R.id.textViewPlastZag);
        spojnoscText = (TextView) findViewById(R.id.spojnoscText);
        spojnoscLiczba = (TextView) findViewById(R.id.spojnoscLiczba);
        typWilg = (TextView) findViewById(R.id.textViewTypWilg);

        spinnerName = (Spinner) findViewById(R.id.name_spinner);
        spinnerTypWilg = (Spinner) findViewById(R.id.spinner_typWilg);
        spinnerParamWiod = (Spinner) findViewById(R.id.spinner_paramWiod);

        adapterSpoistyName = ArrayAdapter.createFromResource(this,
                R.array.nazwa_gruntu_spoistego, android.R.layout.simple_spinner_item);
        adapterTyp = ArrayAdapter.createFromResource(this,
                R.array.typ_gruntu_spaistego, android.R.layout.simple_spinner_item);
        adapterParamWiodSpoisty = ArrayAdapter.createFromResource(this,
                R.array.parametr_wiodacy_spoisty, android.R.layout.simple_spinner_item);
        adapterNiespoistyName = ArrayAdapter.createFromResource(this,
                R.array.nazwa_gruntu_niespoistego, android.R.layout.simple_spinner_item);
        adapterWilg = ArrayAdapter.createFromResource(this,
                R.array.wilgotnosc_gruntu, android.R.layout.simple_spinner_item);
        adapterParamWiodNiespoisty = ArrayAdapter.createFromResource(this,
                R.array.parametr_wiodacy_niespoisty, android.R.layout.simple_spinner_item);

        adapterSpoistyName.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapterTyp.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapterParamWiodSpoisty.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapterNiespoistyName.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapterWilg.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapterParamWiodNiespoisty.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radiogroup_spoj_niespoj);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.radiobutton_spoisty) {

                    spinnerName.setAdapter(adapterSpoistyName);
                    spinnerTypWilg.setAdapter(adapterTyp);
                    spinnerParamWiod.setAdapter(adapterParamWiodSpoisty);
                    zagPlast.setText(R.string.stopie_plastyczno_ci_gruntu_il);
                    spojnoscLiczba.setVisibility(View.VISIBLE);
                    spojnoscText.setVisibility(View.VISIBLE);
                    typWilg.setText(R.string.typ);
                    calculations();

                } else {

                    spinnerName.setAdapter(adapterNiespoistyName);
                    spinnerTypWilg.setAdapter(adapterWilg);
                    spinnerParamWiod.setAdapter(adapterParamWiodNiespoisty);
                    zagPlast.setText(R.string.stopie_zageszczenia_ci_gruntu_il);
                    spojnoscLiczba.setVisibility(View.INVISIBLE);
                    spojnoscText.setVisibility(View.INVISIBLE);
                    typWilg.setText(R.string.wilg);
                    calculations();

                }
            }
        });

        spinnerName.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedItem = parent.getItemAtPosition(position).toString();

                switch (selectedItem) {
                    case "żwir gliniasty":
                        nazwaSpoistegoGruntu = NazwaSpoistegoGruntu.ZWIR_GLINIASTY;
                        break;
                    case "pospółka gliniasta":
                        nazwaSpoistegoGruntu = NazwaSpoistegoGruntu.POSPOLKA_GLINIASTA;
                        break;
                    case "piasek gliniasty":
                        nazwaSpoistegoGruntu = NazwaSpoistegoGruntu.PIASEK_GLINIASTY;
                        break;
                    case "pył piaszczysty":
                        nazwaSpoistegoGruntu = NazwaSpoistegoGruntu.PYL_PIASZCZYSTY;
                        break;
                    case "pył":
                        nazwaSpoistegoGruntu = NazwaSpoistegoGruntu.PYL;
                        break;
                    case "glina piaszczysta":
                        nazwaSpoistegoGruntu = NazwaSpoistegoGruntu.GLINA_PIASZCZYSTA;
                        break;
                    case "glina":
                        nazwaSpoistegoGruntu = NazwaSpoistegoGruntu.GLINA;
                        break;
                    case "glina pylasta":
                        nazwaSpoistegoGruntu = NazwaSpoistegoGruntu.GLINA_PYLASTA;
                        break;
                    case "glina piaszczysta zwięzła":
                        nazwaSpoistegoGruntu = NazwaSpoistegoGruntu.GLINA_PIASZCZYSTA_ZWIEZLA;
                        break;
                    case "glina zwięzła":
                        nazwaSpoistegoGruntu = NazwaSpoistegoGruntu.GLINA_ZWIEZLA;
                        break;
                    case "glina pylasta zwięzła":
                        nazwaSpoistegoGruntu = NazwaSpoistegoGruntu.GLINA_PYLASTA_ZWIEZLA;
                        break;
                    case "ił piaszczysty":
                        nazwaSpoistegoGruntu = NazwaSpoistegoGruntu.IL_PIASZCZYSTY;
                        break;
                    case "ił":
                        nazwaSpoistegoGruntu = NazwaSpoistegoGruntu.IL;
                        break;
                    case "ił pylasty":
                        nazwaSpoistegoGruntu = NazwaSpoistegoGruntu.IL_PIASZCZYSTY;
                        break;
                    case "żwir":
                        nazwaNiespoistegoGruntu = NazwaNiespoistegoGruntu.ZWIR;
                        break;
                    case "pospółka":
                        nazwaNiespoistegoGruntu = NazwaNiespoistegoGruntu.POSPOLKA;
                        break;
                    case "piasek gruby":
                        nazwaNiespoistegoGruntu = NazwaNiespoistegoGruntu.PIASEK_GRUBY;
                        break;
                    case "piasek średni":
                        nazwaNiespoistegoGruntu = NazwaNiespoistegoGruntu.PIASEK_SREDNI;
                        break;
                    case "piasek drobny":
                        nazwaNiespoistegoGruntu = NazwaNiespoistegoGruntu.PIASEK_DROBNY;
                        break;
                    case "piasek pylasty":
                        nazwaNiespoistegoGruntu = NazwaNiespoistegoGruntu.PIASEK_PYLASTY;
                        break;
                    case "piasek próchniczy":
                        nazwaNiespoistegoGruntu = NazwaNiespoistegoGruntu.PIASEK_PROCHNICZY;
                        break;
                }
                calculations();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinnerTypWilg.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedItem = parent.getItemAtPosition(position).toString();

                switch (selectedItem) {
                    case "A":
                        typSpoistego = TypSpoistego.A;
                        break;
                    case "B":
                        typSpoistego = TypSpoistego.B;
                        break;
                    case "C":
                        typSpoistego = TypSpoistego.C;
                        break;
                    case "D":
                        typSpoistego = TypSpoistego.D;
                        break;
                    case "mało wilgotne":
                        stanWilg = StanWilg.MALO_WILGOTNE;
                        break;
                    case "wilgotne":
                        stanWilg = StanWilg.WILGOTNE;
                        break;
                    case "mokre":
                        stanWilg = StanWilg.MOKRE;
                        break;
                }
                calculations();

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinnerParamWiod.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                parametrWiodacy = parent.getItemAtPosition(position).toString();
                calculations();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        seekBar = (SeekBar) findViewById(R.id.seekBar);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                intSeekBar = progress;
                calculations();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        RadioButton radioSpoisty = (RadioButton) findViewById(R.id.radiobutton_spoisty);
        radioSpoisty.setChecked(true);

    }

    private void calculations() {

        if (radioButtonNieSpoisty.isChecked())//nie spoisty
        {
            if ("stopień zagęszczenia".equals(parametrWiodacy))//stopień zagęszczenia
            {
                numer1.setTextColor(Color.parseColor("#FF4081"));
                numer2.setTextColor(Color.parseColor("#000000"));
                spojnoscLiczba.setTextColor(Color.parseColor("#000000"));
                gruntNieSpoisty = new GruntNieSpoisty(nazwaNiespoistegoGruntu, stanWilg, (0.2f + 0.8f * ((float) intSeekBar) / 100.0f));

            } else//kat tarcia wewnetrznego
            {
                numer1.setTextColor(Color.parseColor("#000000"));
                numer2.setTextColor(Color.parseColor("#FF4081"));
                spojnoscLiczba.setTextColor(Color.parseColor("#000000"));
                if (nazwaNiespoistegoGruntu == NazwaNiespoistegoGruntu.ZWIR || nazwaNiespoistegoGruntu == NazwaNiespoistegoGruntu.POSPOLKA) {
                    gruntNieSpoisty = new GruntNieSpoisty((36.5f + 5.5f * ((float) intSeekBar) / 100f), nazwaNiespoistegoGruntu, stanWilg);
                } else if (nazwaNiespoistegoGruntu == NazwaNiespoistegoGruntu.PIASEK_GRUBY || nazwaNiespoistegoGruntu == NazwaNiespoistegoGruntu.PIASEK_SREDNI) {
                    gruntNieSpoisty = new GruntNieSpoisty((31f + 5f * ((float) intSeekBar) / 100f), nazwaNiespoistegoGruntu, stanWilg);
                } else {
                    gruntNieSpoisty = new GruntNieSpoisty((29f + 4f * ((float) intSeekBar) / 100f), nazwaNiespoistegoGruntu, stanWilg);
                }
            }

            numer1.setText("" + gruntNieSpoisty.getStZagGruntu());
            numer2.setText("" + gruntNieSpoisty.getKatTarciaWew());
            numer3.setText("" + gruntNieSpoisty.getGestWlasc());
            numer4.setText("" + gruntNieSpoisty.getGestObj());
            numer5.setText("" + gruntNieSpoisty.getWilgNat());
            numer6.setText("" + gruntNieSpoisty.getModulEo());
            numer7.setText("" + gruntNieSpoisty.getModulMo());
            numer8.setText("" + gruntNieSpoisty.getModulM());

        } else//spoisty
        {
            if ("stopień plastyczności".equals(parametrWiodacy)) {
                numer1.setTextColor(Color.parseColor("#FF4081"));
                numer2.setTextColor(Color.parseColor("#000000"));
                spojnoscLiczba.setTextColor(Color.parseColor("#000000"));
                gruntSpoisty = new GruntSpoisty(nazwaSpoistegoGruntu, typSpoistego, (0.75f * ((float) intSeekBar) / 100f));


            } else if ("spójność".equals(parametrWiodacy)) {
                numer1.setTextColor(Color.parseColor("#000000"));
                numer2.setTextColor(Color.parseColor("#000000"));
                spojnoscLiczba.setTextColor(Color.parseColor("#FF4081"));
                if (typSpoistego == TypSpoistego.A) {
                    gruntSpoisty = new GruntSpoisty(nazwaSpoistegoGruntu, (20f + 31f * ((float) intSeekBar) / 100f), typSpoistego);
                } else if (typSpoistego == TypSpoistego.B) {
                    gruntSpoisty = new GruntSpoisty(nazwaSpoistegoGruntu, (15f + 25f * ((float) intSeekBar) / 100f), typSpoistego);
                } else if (typSpoistego == TypSpoistego.C) {
                    gruntSpoisty = new GruntSpoisty(nazwaSpoistegoGruntu, (5f + 26f * ((float) intSeekBar) / 100f), typSpoistego);
                } else {
                    gruntSpoisty = new GruntSpoisty(nazwaSpoistegoGruntu, (25f + 35f * ((float) intSeekBar) / 100f), typSpoistego);
                }
            } else //kat tarcia wew
            {
                numer1.setTextColor(Color.parseColor("#000000"));
                numer2.setTextColor(Color.parseColor("#FF4081"));
                spojnoscLiczba.setTextColor(Color.parseColor("#000000"));
                if (typSpoistego == TypSpoistego.A) {
                    gruntSpoisty = new GruntSpoisty((12f + 13f * ((float) intSeekBar) / 100f), nazwaSpoistegoGruntu, typSpoistego);
                } else if (typSpoistego == TypSpoistego.B) {
                    gruntSpoisty = new GruntSpoisty((8f + 13f * ((float) intSeekBar) / 100f), nazwaSpoistegoGruntu, typSpoistego);
                } else if (typSpoistego == TypSpoistego.C) {
                    gruntSpoisty = new GruntSpoisty((6f + 12f * ((float) intSeekBar) / 100f), nazwaSpoistegoGruntu, typSpoistego);
                } else {
                    gruntSpoisty = new GruntSpoisty((3f + 10f * ((float) intSeekBar) / 100f), nazwaSpoistegoGruntu, typSpoistego);
                }
            }

            numer1.setText("" + gruntSpoisty.getStPlastGruntu());
            numer2.setText("" + gruntSpoisty.getKatTarciaWew());
            numer3.setText("" + gruntSpoisty.getGestWlasc());
            numer4.setText("" + gruntSpoisty.getGestObj());
            numer5.setText("" + gruntSpoisty.getWilgNat());
            numer6.setText("" + gruntSpoisty.getModulEo());
            numer7.setText("" + gruntSpoisty.getModulMo());
            numer8.setText("" + gruntSpoisty.getModulM());
            spojnoscLiczba.setText("" + gruntSpoisty.getSpojnoscGruntu());

        }


    }
}
