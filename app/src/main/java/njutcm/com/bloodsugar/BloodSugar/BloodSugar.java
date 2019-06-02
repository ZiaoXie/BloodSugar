package njutcm.com.bloodsugar.BloodSugar;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import njutcm.com.bloodsugar.R;

public class BloodSugar extends Fragment {

    View view;
    TextView chart,sugarrecord,shiliao;
    LinearLayout yapei,sport,use_medicine,more;

    public BloodSugar() {
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
        view=inflater.inflate(R.layout.fragment_blood_sugar, container, false);

        chart=(TextView)view.findViewById(R.id.chart);
        chart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(),SugarChart.class));
            }
        });

        sugarrecord=(TextView)view.findViewById(R.id.sugarrecord);
        sugarrecord.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(),RememberSugar.class));
            }
        });

        shiliao=(TextView)view.findViewById(R.id.shiliao);
        shiliao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(),ShiLiao.class));
            }
        });

        yapei=(LinearLayout)view.findViewById(R.id.yapei);
        yapei.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(),YaPei.class));
            }
        });

        sport=(LinearLayout)view.findViewById(R.id.sport);
        sport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(),Sport.class));
            }
        });

        use_medicine=(LinearLayout)view.findViewById(R.id.use_medicine);
        use_medicine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(),UseMedicine.class));
            }
        });

        more=(LinearLayout)view.findViewById(R.id.more);
        more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(),More.class));
            }
        });
        return view;
    }

}
