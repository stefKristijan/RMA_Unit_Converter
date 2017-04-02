package hr.ferit.kstefancic.unicon;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class ConverterActivity extends Activity implements View.OnClickListener {

    public static final int KEY_REQUEST_CONVERSION = 10;
    public static final String KEY_UNIT1 = "unit1";
    public static final String KEY_UNIT2 = "unit2";
    public static final String KEY_VALUE = "value";
    Spinner spinner1,spinner2;
    TextView tvConverter;
    EditText etNumber;
    Button btnConvert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_converter);

        this.setUI();
    }

    private void setUI() {
        this.tvConverter= (TextView) findViewById(R.id.tvConverter);
        this.spinner1= (Spinner) findViewById(R.id.spinner1);
        this.spinner2= (Spinner) findViewById(R.id.spinner2);
        this.etNumber= (EditText) findViewById(R.id.etNumber);
        this.btnConvert= (Button) findViewById(R.id.btnConvert);
        this.btnConvert.setOnClickListener(this);

        Intent mainIntent = this.getIntent();
        if(mainIntent.hasExtra(MainActivity.KEY_UNIT ) && mainIntent.hasExtra(MainActivity.KEY_TITLE)){
            tvConverter.setText(mainIntent.getStringExtra(MainActivity.KEY_TITLE));
            String[] units=mainIntent.getStringArrayExtra(MainActivity.KEY_UNIT);
            setSpinners(units);
        }
    }

    private void setSpinners(String[] units) {
        ArrayAdapter<String> spinnerAdapter = new ArrayAdapter<String>(this, R.layout.spinner_item,units);
        spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(spinnerAdapter);
        spinner2.setAdapter(spinnerAdapter);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch(requestCode){
            case KEY_REQUEST_CONVERSION:
                if(resultCode==RESULT_OK){
                    Toast.makeText(this,"Successfuly converted!",Toast.LENGTH_LONG).show();
                }
                break;
        }
    }

    @Override
    public void onClick(View v) {
        if(this.etNumber.getText().toString().matches("")){
            Toast.makeText(this,"Please enter a value you want to convert",Toast.LENGTH_SHORT).show();
        }
        else if (Float.valueOf(String.valueOf(this.etNumber.getText()))>=0){
            Toast.makeText(this,"Please enter a value bigger than 0",Toast.LENGTH_SHORT).show();
        }
        else{
            Intent intent = new Intent(getApplicationContext(),ResultActivity.class);
            intent.putExtra(KEY_UNIT1,String.valueOf(spinner1.getSelectedItem()));
            intent.putExtra(KEY_UNIT2,String.valueOf(spinner1.getSelectedItem()));
            intent.putExtra(KEY_VALUE,String.valueOf(spinner1.getSelectedItem()));
            this.startActivityForResult(intent,KEY_REQUEST_CONVERSION);
        }

    }
}
