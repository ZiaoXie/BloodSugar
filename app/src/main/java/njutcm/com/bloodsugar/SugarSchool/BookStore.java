package njutcm.com.bloodsugar.SugarSchool;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import njutcm.com.bloodsugar.R;

public class BookStore extends AppCompatActivity {

    TextView back,shuku,shujia;
    FragmentManager fm;
    FragmentTransaction transaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_store);

        fm=getSupportFragmentManager();
        transaction=fm.beginTransaction();
        transaction.replace(R.id.detail,new ShuKu());
        transaction.commit();

        back=(TextView)findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        shuku=(TextView)findViewById(R.id.shuku);
        shuku.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                transaction=fm.beginTransaction();
                transaction.replace(R.id.detail,new ShuKu());
                transaction.commit();
            }
        });

        shujia=(TextView)findViewById(R.id.shujia);
        shujia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                transaction=fm.beginTransaction();
                transaction.replace(R.id.detail,new ShuJia());
                transaction.commit();
            }
        });

    }
}
