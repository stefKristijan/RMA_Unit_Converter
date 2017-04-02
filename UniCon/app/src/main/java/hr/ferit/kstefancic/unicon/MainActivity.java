package hr.ferit.kstefancic.unicon;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener {

    public static final String KEY_UNIT = "unit";
    public static final String KEY_TITLE = "title";
    Button btnTemperature, btnLength, btnMass, btnVolume;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.setUI();
    }

    private void setUI() {
        this.btnLength= (Button) findViewById(R.id.btnLength);
        this.btnMass= (Button) findViewById(R.id.btnMass);
        this.btnTemperature= (Button) findViewById(R.id.btnTemperature);
        this.btnVolume= (Button) findViewById(R.id.btnVolume);

        this.btnLength.setOnClickListener(this);
        this.btnVolume.setOnClickListener(this);
        this.btnTemperature.setOnClickListener(this);
        this.btnMass.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(getApplicationContext(),ConverterActivity.class);
        String[] units = null;
        Resources res=getResources();
        switch (v.getId()){
            case (R.id.btnMass):
                units = res.getStringArray(R.array.mass_units);
                intent.putExtra(KEY_UNIT,units);
                intent.putExtra(KEY_TITLE, R.string.mass_convert);
                this.startActivity(intent);
                break;
            case(R.id.btnLength):
                units = res.getStringArray(R.array.length_units);
                intent.putExtra(KEY_UNIT,units);
                intent.putExtra(KEY_TITLE, R.string.length_convert);
                this.startActivity(intent);
                break;
            case(R.id.btnTemperature):
                units = res.getStringArray(R.array.temperature_units);
                intent.putExtra(KEY_UNIT,units);
                intent.putExtra(KEY_TITLE, R.string.temperature_convert);
                this.startActivity(intent);
                break;
            case(R.id.btnVolume):
                units = res.getStringArray(R.array.volume_units);
                intent.putExtra(KEY_UNIT,units);
                intent.putExtra(KEY_TITLE, R.string.volume_convert);
                this.startActivity(intent);
                break;
        }
    }
}
