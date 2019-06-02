package njutcm.com.bloodsugar.Personal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import njutcm.com.bloodsugar.R;

public class MyRecord extends AppCompatActivity {

    TextView back,record1,record3;
    ImageView record;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_record);

        back=(TextView)findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        record1=(TextView)findViewById(R.id.record1);
        record3=(TextView)findViewById(R.id.record3);
        record=(ImageView)findViewById(R.id.record);
        record1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                record.setBackgroundResource(R.mipmap.bloodsugarrecord);
            }
        });
        record3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                record.setBackgroundResource(R.mipmap.sportrecord);
            }
        });
    }
}
