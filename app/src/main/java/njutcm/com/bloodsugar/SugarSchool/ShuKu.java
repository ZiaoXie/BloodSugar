package njutcm.com.bloodsugar.SugarSchool;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import njutcm.com.bloodsugar.R;

public class ShuKu extends Fragment {

    TextView recommend,novice;
    ImageView list;
    View view;
    public ShuKu() {
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
        view=inflater.inflate(R.layout.fragment_shu_ku, container, false);
        list=(ImageView)view.findViewById(R.id.list);

        recommend=(TextView)view.findViewById(R.id.recommend);
        recommend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                list.setBackgroundResource(R.mipmap.shuku);
            }
        });

        novice=(TextView)view.findViewById(R.id.novice);
        novice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                list.setBackgroundResource(R.mipmap.novice);
            }
        });
        return view;
    }

}
