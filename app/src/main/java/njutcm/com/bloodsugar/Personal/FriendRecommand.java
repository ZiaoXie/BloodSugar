package njutcm.com.bloodsugar.Personal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import njutcm.com.bloodsugar.R;

public class FriendRecommand extends AppCompatActivity {

    TextView back,reco1,reco2,info;
    EditText edit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friend_recommand);

        back=(TextView)findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        reco1=(TextView)findViewById(R.id.reco1);
        reco2=(TextView)findViewById(R.id.reco2);
        info=(TextView)findViewById(R.id.info);
        edit=(EditText)findViewById(R.id.edit);

        reco1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText("推荐患者注册得500积分");
                edit.setText("请输入手机号");
            }
        });

        reco2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText("推荐医生注册得2000积分");
                edit.setText("请输入手机号码");
            }
        });
    }
}
