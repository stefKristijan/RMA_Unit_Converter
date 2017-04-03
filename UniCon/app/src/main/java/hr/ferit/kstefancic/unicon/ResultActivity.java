package hr.ferit.kstefancic.unicon;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Switch;
import android.widget.TextView;

public class ResultActivity extends Activity {

    TextView tvUnit1,tvValue1,tvUnit2,tvValue2,tvTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        setUI();
    }

    private void setUI() {
        this.tvUnit1 = (TextView) findViewById(R.id.tvUnit1);
        this.tvUnit2 = (TextView) findViewById(R.id.tvUnit2);
        this.tvValue1= (TextView) findViewById(R.id.tvValue1);
        this.tvValue2= (TextView) findViewById(R.id.tvValue2);
        this.tvTitle= (TextView) findViewById(R.id.tvTitle);

        float value;
        String fromUnit,toUnit;
        Intent convertIntent = this.getIntent();
        if(convertIntent.hasExtra(ConverterActivity.KEY_UNIT1 ) && convertIntent.hasExtra(ConverterActivity.KEY_UNIT2) && convertIntent.hasExtra(ConverterActivity.KEY_VALUE)){
            fromUnit=convertIntent.getStringExtra(ConverterActivity.KEY_UNIT1);
            tvUnit1.setText(fromUnit);
            value = Float.valueOf(convertIntent.getStringExtra(ConverterActivity.KEY_VALUE));
            tvValue1.setText(String.valueOf(value));
            toUnit=convertIntent.getStringExtra(ConverterActivity.KEY_UNIT2);

            int id = convertIntent.getIntExtra(ConverterActivity.KEY_TITLE_RES,0);
            tvTitle.setText(getResources().getString(id));

            switch(id){
                case R.string.length_convert:
                    value = convertLength(fromUnit,value,toUnit);
                    break;
                case R.string.mass_convert:
                    value = convertMass(fromUnit, value,toUnit);
                    break;
                case R.string.temperature_convert:
                    value = convertTemperature(fromUnit, value, toUnit);
                    break;
                case R.string.volume_convert:
                    value = convertVolume(fromUnit, value, toUnit);
                    break;
            }
            tvUnit2.setText(toUnit);
            tvValue2.setText(String.valueOf(value));
        }
    }

    private float convertTemperature(String fromUnit, float value, String toUnit) {
        switch (fromUnit){
            case "Kelvin":
                value=ConvertFunctions.K_to_C(value);
                break;
            case "Fahrenheit":
                value=ConvertFunctions.F_to_C(value);
                break;
        }
        switch(toUnit){
            case "Kelvin":
                value=ConvertFunctions.C_to_K(value);
                break;
            case "Fahrenheit":
                value=ConvertFunctions.C_to_F(value);
                break;
        }
        return value;
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent();
        setResult(RESULT_OK, intent);
        super.onBackPressed();
    }

    private float convertVolume(String fromUnit, float value, String toUnit) {
        switch (fromUnit){
            case "cubic kilometer":
                value=ConvertFunctions.ckm_to_cm(value);
                break;
            case "cubic centimeter":
                value=ConvertFunctions.ccm_to_cm(value);
                break;
            case "cubic millimeter":
                value=ConvertFunctions.cmm_to_cm(value);
                break;
            case "cubic mile":
                value=ConvertFunctions.cmile_to_cm(value);
                break;
            case "cubic yard":
                value=ConvertFunctions.cyard_to_cm(value);
                break;
            case "cubic foot":
                value=ConvertFunctions.cfoot_to_cm(value);
                break;
            case "cubic inch":
                value=ConvertFunctions.cin_to_cm(value);
                break;
            case "liter":
                value=ConvertFunctions.l_to_cm(value);
                break;
            case "milliliter":
                value=ConvertFunctions.ml_to_cm(value);
                break;
            case "US gallon":
                value=ConvertFunctions.USgallon_to_cm(value);
                break;
            case "US pint":
                value=ConvertFunctions.USpint_to_cm(value);
                break;
            case "US fluid ounce":
                value=ConvertFunctions.USfluidounce_to_cm(value);
                break;
            case "imperial gallon":
                value=ConvertFunctions.IMgallon_to_cm(value);
                break;
            case "imperial pint":
                value=ConvertFunctions.IMpint_to_cm(value);
                break;
            case "imperial fluid ounce":
                value=ConvertFunctions.IMfluidounce_to_cm(value);
                break;
        }
        switch (toUnit){
            case "cubic kilometer":
                value=ConvertFunctions.cm_to_ckm(value);
                break;
            case "cubic centimeter":
                value=ConvertFunctions.cm_to_ccm(value);
                break;
            case "cubic millimeter":
                value=ConvertFunctions.cm_to_cmm(value);
                break;
            case "cubic mile":
                value=ConvertFunctions.cm_to_cmile(value);
                break;
            case "cubic yard":
                value=ConvertFunctions.cm_to_cyard(value);
                break;
            case "cubic foot":
                value=ConvertFunctions.cm_to_cfoot(value);
                break;
            case "cubic inch":
                value=ConvertFunctions.cm_to_cinch(value);
                break;
            case "liter":
                value=ConvertFunctions.cm_to_l(value);
                break;
            case "milliliter":
                value=ConvertFunctions.cm_to_ml(value);
                break;
            case "US gallon":
                value=ConvertFunctions.cm_to_USgallon(value);
                break;
            case "US pint":
                value=ConvertFunctions.cm_to_USpint(value);
                break;
            case "US fluid ounce":
                value=ConvertFunctions.cm_to_USfluidounce(value);
                break;
            case "imperial gallon":
                value=ConvertFunctions.cm_to_IMgallon(value);
                break;
            case "imperial pint":
                value=ConvertFunctions.cm_to_IMpint(value);
                break;
            case "imperial fluid ounce":
                value=ConvertFunctions.cm_to_IMfluidounce(value);
                break;
        }
        return value;
    }

    private float convertMass(String fromUnit, float value, String toUnit) {
        switch(fromUnit){
            case "gram":
                value = ConvertFunctions.g_to_kg(value);
                break;
            case "milligram":
                value = ConvertFunctions.mg_to_kg(value);
                break;
            case "ton":
                value = ConvertFunctions.t_to_kg(value);
                break;
            case "pound":
                value = ConvertFunctions.pound_to_kg(value);
                break;
            case "ounce":
                value = ConvertFunctions.ounce_to_kg(value);
                break;
            case "carat":
                value = ConvertFunctions.carat_to_kg(value);
                break;
        }
        switch (toUnit){
            case "gram":
                value = ConvertFunctions.kg_to_g(value);
                break;
            case "milligram":
                value = ConvertFunctions.kg_to_mg(value);
                break;
            case "ton":
                value = ConvertFunctions.kg_to_t(value);
                break;
            case "pound":
                value = ConvertFunctions.kg_to_pound(value);
                break;
            case "ounce":
                value = ConvertFunctions.kg_to_ounce(value);
                break;
            case "carat":
                value = ConvertFunctions.kg_to_carat(value);
                break;
        }
        return value;
    }


    private float convertLength(String fromUnit, float value, String toUnit){
        switch(fromUnit){
            case "kilometer":
                value = ConvertFunctions.km_to_m(value);
                break;
            case "centimeter":
                value = ConvertFunctions.cm_to_m(value);
                break;
            case "millimeter":
                value = ConvertFunctions.mm_to_m(value);
                break;
            case "micrometer":
                value = ConvertFunctions.microm_to_m(value);
                break;
            case "nanometer":
                value = ConvertFunctions.nm_to_m(value);
                break;
            case "yard":
                value = ConvertFunctions.y_to_m(value);
                break;
            case "mile":
                value = ConvertFunctions.mile_to_m(value);
                break;
            case "foot":
                value = ConvertFunctions.foot_to_m(value);
                break;
            case "inch":
                value = ConvertFunctions.in_to_m(value);
                break;
            case "light year":
                value = ConvertFunctions.ly_to_m(value);
                break;
        }
        switch(toUnit){
            case "kilometer":
                value = ConvertFunctions.m_to_km(value);
                break;
            case "centimeter":
                value = ConvertFunctions.m_to_cm(value);
                break;
            case "millimeter":
                value = ConvertFunctions.m_to_mm(value);
                break;
            case "micrometer":
                value = ConvertFunctions.m_to_microm(value);
                break;
            case "nanometer":
                value = ConvertFunctions.m_to_nm(value);
                break;
            case "yard":
                value = ConvertFunctions.m_to_y(value);
                break;
            case "mile":
                value = ConvertFunctions.m_to_mile(value);
                break;
            case "foot":
                value = ConvertFunctions.m_to_foot(value);
                break;
            case "inch":
                value = ConvertFunctions.m_to_in(value);
                break;
            case "light year":
                value = ConvertFunctions.m_to_ly(value);
                break;
        }

        return value;
    }


}
