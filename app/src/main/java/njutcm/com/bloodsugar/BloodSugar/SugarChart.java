package njutcm.com.bloodsugar.BloodSugar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

import njutcm.com.bloodsugar.Personal.MyRecord;
import njutcm.com.bloodsugar.R;

public class SugarChart extends AppCompatActivity {

    TextView back,sugarrecord;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sugar_chart);

        back=(TextView)findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        sugarrecord=(TextView)findViewById(R.id.sugarrecord);
        sugarrecord.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SugarChart.this, MyRecord.class));
            }
        });
    }
}
