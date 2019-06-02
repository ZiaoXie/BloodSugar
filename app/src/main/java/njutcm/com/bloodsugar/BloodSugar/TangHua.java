package njutcm.com.bloodsugar.BloodSugar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import njutcm.com.bloodsugar.Personal.MyRecord;
import njutcm.com.bloodsugar.R;

public class TangHua extends AppCompatActivity {

    TextView back,record;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tang_hua);

        back=(TextView)findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        record=(TextView)findViewById(R.id.record);
        record.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TangHua.this, MyRecord.class));
            }
        });
    }
}
