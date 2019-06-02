package njutcm.com.bloodsugar.SugarSchool;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import njutcm.com.bloodsugar.BloodSugar.BloodSugar;
import njutcm.com.bloodsugar.R;

public class SugarSchool extends Fragment {

    View view;
    FragmentManager fm;
    FragmentTransaction transaction;
    TextView school1,school2;
    ImageView search;

    public SugarSchool() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view=inflater.inflate(R.layout.fragment_sugar_school, container, false);
        fm=getChildFragmentManager();
        transaction=fm.beginTransaction();
        transaction.replace(R.id.detail,new Recommend());
        transaction.commit();

        search=(ImageView)view.findViewById(R.id.search);

        school1=(TextView)view.findViewById(R.id.school1);
        school2=(TextView)view.findViewById(R.id.school2);
        school1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                transaction=fm.beginTransaction();
                transaction.replace(R.id.detail,new Recommend());
                transaction.commit();
            }
        });
        school2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                transaction=fm.beginTransaction();
                transaction.replace(R.id.detail,new DietSport());
                transaction.commit();
            }
        });
        return view;
    }

}
