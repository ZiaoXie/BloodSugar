package njutcm.com.bloodsugar.BloodSugar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import njutcm.com.bloodsugar.Personal.SmartEquipment;
import njutcm.com.bloodsugar.R;

public class RememberSugar extends AppCompatActivity {

    TextView back;
    LinearLayout tang_hua,blood_pressure,blood_fat,weight,
            smart_equipment,laboratory_test,prescription,medical_record;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_remember_sugar);

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
                startActivity(new Intent(RememberSugar.this,TangHua.class));
            }
        });
        blood_pressure=(LinearLayout)findViewById(R.id.blood_pressure);
        blood_pressure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RememberSugar.this,BloodPressure.class));
            }
        });
        blood_fat=(LinearLayout)findViewById(R.id.blood_fat);
        blood_fat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RememberSugar.this,BloodFat.class));
            }
        });
        weight=(LinearLayout)findViewById(R.id.weight);
        weight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RememberSugar.this,Weight.class));
            }
        });
        smart_equipment=(LinearLayout)findViewById(R.id.smart_equipment);
        smart_equipment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RememberSugar.this,SmartEquipment.class));
            }
        });
        laboratory_test=(LinearLayout)findViewById(R.id.laboratory_test);
        laboratory_test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RememberSugar.this,LaboratoryTest.class));
            }
        });
        prescription=(LinearLayout)findViewById(R.id.prescription);
        prescription.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RememberSugar.this,Prescription.class));
            }
        });
        medical_record=(LinearLayout)findViewById(R.id.medical_record);
        medical_record.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RememberSugar.this,MedicalRecord.class));
            }
        });
    }
}
