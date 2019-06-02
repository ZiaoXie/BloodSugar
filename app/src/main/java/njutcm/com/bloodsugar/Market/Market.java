package njutcm.com.bloodsugar.Market;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.bigkoo.convenientbanner.ConvenientBanner;
import com.bigkoo.convenientbanner.holder.CBViewHolderCreator;

import java.util.Arrays;

import njutcm.com.bloodsugar.R;


public class Market extends Fragment {

    View view;
    ConvenientBanner convenientBanner;
    Integer lunbo[]=new Integer[]{R.mipmap.marketbanner1,R.mipmap.marketbanner2};

    LinearLayout market1,market2,market3;
    public Market() {
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
        view=inflater.inflate(R.layout.fragment_market, container, false);


        convenientBanner=(ConvenientBanner)view.findViewById(R.id.banner);
        convenientBanner.startTurning(4000);
        convenientBanner.setPages(new CBViewHolderCreator<NetworkImageHolderView>() {
            @Override
            public NetworkImageHolderView createHolder() {
                return new NetworkImageHolderView();
            }
        }, Arrays.asList(lunbo))
                .setPageIndicator(new int[]{R.mipmap.ic_page_indicator, R.mipmap.ic_page_indicator_focused})
                .setPageIndicatorAlign(ConvenientBanner.PageIndicatorAlign.CENTER_HORIZONTAL);

        market1=(LinearLayout)view.findViewById(R.id.market1);
        market2=(LinearLayout)view.findViewById(R.id.market2);
        market3=(LinearLayout)view.findViewById(R.id.market3);
        market1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(),Medicine.class));
            }
        });
        market2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(),HealthFood.class));
            }
        });
        market3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(),Machine.class));
            }
        });

        return view;
    }

    public class NetworkImageHolderView implements com.bigkoo.convenientbanner.holder.Holder<Integer> {
        private ImageView imageView;

        @Override
        public View createView(Context context) {
            imageView = new ImageView(context);
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            return imageView;
        }
        @Override
        public void UpdateUI(Context context, int position, Integer data) {
            imageView.setImageResource(data);
        }
    }

}
