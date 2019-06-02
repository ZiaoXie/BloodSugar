package njutcm.com.bloodsugar.Personal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import njutcm.com.bloodsugar.R;

public class InfoCenter extends AppCompatActivity {

    TextView back,info1,info2,information;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_center);

        back=(TextView)findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        info1=(TextView)findViewById(R.id.info1);
        info2=(TextView)findViewById(R.id.info2);
        information=(TextView)findViewById(R.id.information);

        info1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                information.setText("暂时没有异常消息");
            }
        });

        info2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                information.setText("暂时没有系统消息");
            }
        });
    }
}
