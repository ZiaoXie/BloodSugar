package njutcm.com.bloodsugar;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;

import njutcm.com.bloodsugar.AskDoctor.AskDoctor;
import njutcm.com.bloodsugar.BloodSugar.BloodSugar;
import njutcm.com.bloodsugar.Market.Market;
import njutcm.com.bloodsugar.Personal.Personal;
import njutcm.com.bloodsugar.SugarSchool.SugarSchool;

public class HomePage extends AppCompatActivity {

    FragmentManager fm;
    FragmentTransaction transaction;
    int radiocheckedId;
    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        fm=getSupportFragmentManager();
        transaction=fm.beginTransaction();
        transaction.replace(R.id.detail,new BloodSugar());
        transaction.commit();

        radioGroup= (RadioGroup) findViewById(R.id.radioGroup);
        radiocheckedId=radioGroup.getCheckedRadioButtonId();

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(radiocheckedId==checkedId) return;
                radiocheckedId=radioGroup.getCheckedRadioButtonId();
                transaction=fm.beginTransaction();
                switch (checkedId){
                    case R.id.bloodsugar:
                        transaction.replace(R.id.detail,new BloodSugar());
                        break;
//                    case R.id.askdoctor:
//                        transaction.replace(R.id.detail,new AskDoctor());
//                        break;
                    case R.id.sugarschool:
                        transaction.replace(R.id.detail,new SugarSchool());
                        break;
                    case R.id.market:
                        transaction.replace(R.id.detail,new Market());
                        break;
                    case R.id.personal:
                        transaction.replace(R.id.detail,new Personal());
                        break;
                }
                transaction.commit();
            }
        });

    }
}
