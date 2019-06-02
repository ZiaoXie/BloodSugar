package njutcm.com.bloodsugar.BloodSugar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import njutcm.com.bloodsugar.Personal.SmartEquipment;
import njutcm.com.bloodsugar.R;

public class More extends AppCompatActivity {

    TextView back;
    LinearLayout tang_hua,blood_pressure,blood_fat,weight,
            laboratory_test,prescription,medical_record,bushi,pinggu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more);

        back=(TextView)findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        tang_hua=(LinearLayout)findViewById(R.id.tang_hua);
        tang_hua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(More.this,TangHua.class));
            }
        });
        blood_pressure=(LinearLayout)findViewById(R.id.blood_pressure);
        blood_pressure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(More.this,BloodPressure.class));
            }
        });
        blood_fat=(LinearLayout)findViewById(R.id.blood_fat);
        blood_fat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(More.this,BloodFat.class));
            }
        });
        weight=(LinearLayout)findViewById(R.id.weight);
        weight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(More.this,Weight.class));
            }
        });
        laboratory_test=(LinearLayout)findViewById(R.id.laboratory_test);
        laboratory_test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(More.this,LaboratoryTest.class));
            }
        });
        prescription=(LinearLayout)findViewById(R.id.prescription);
        prescription.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(More.this,Prescription.class));
            }
        });
        medical_record=(LinearLayout)findViewById(R.id.medical_record);
        medical_record.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(More.this,MedicalRecord.class));
            }
        });
        bushi=(LinearLayout)findViewById(R.id.bushi);
        bushi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(More.this,Discomfort.class));
            }
        });
        pinggu=(LinearLayout)findViewById(R.id.pinggu);
        pinggu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(More.this,Assessment.class));
            }
        });
    }
}
