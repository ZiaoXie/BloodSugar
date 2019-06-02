package njutcm.com.bloodsugar.SugarSchool;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.bigkoo.convenientbanner.ConvenientBanner;
import com.bigkoo.convenientbanner.holder.CBViewHolderCreator;

import java.util.Arrays;

import njutcm.com.bloodsugar.R;


public class Recommend extends Fragment {

    View view;
    ListView listView;
    LinearLayout school1,school2,school3;
    ConvenientBanner convenientBanner;

    int iv[]={R.mipmap.sport1,R.mipmap.sport2,R.mipmap.sport3};
    int count[]={44,8517,65};
    String title[]={"运动时间越长越好?",
            "规律监测血糖——小举措大意义",
            "糖护士9.27签 病情稳定了就不用测血糖了?"};
    String source[]={"来源:全民健身指南","来源:糖护士原创","来源:糖护士原创"};

    Integer lunbo[]=new Integer[]{R.mipmap.lunbo1,R.mipmap.lunbo2};
    public Recommend() {
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
        view=inflater.inflate(R.layout.fragment_recommend, container, false);
        listView=(ListView)view.findViewById(R.id.listview);
        listView.setAdapter(new MyAdapter());

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

        school1=(LinearLayout)view.findViewById(R.id.school1);
        school2=(LinearLayout)view.findViewById(R.id.school2);
        school3=(LinearLayout)view.findViewById(R.id.school3);
        school1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(),NoviceGuide.class));
            }
        });
        school2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(),OpenClass.class));
            }
        });
        school3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(),BookStore.class));
            }
        });
        return view;
    }

    class MyAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return iv.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            ViewHolder holder = null;
            //判断是否缓存
            if (convertView == null) {
                holder = new ViewHolder();
                //通过LayoutInflater实例化布局
                convertView = View.inflate(getContext(),R.layout.item_sport,null);
                holder.iv = (ImageView) convertView.findViewById(R.id.iv);
                holder.title = (TextView) convertView.findViewById(R.id.title);
                holder.source=(TextView)convertView.findViewById(R.id.source);
                holder.count=(TextView)convertView.findViewById(R.id.count);
                convertView.setTag(holder);
            } else {
                //通过Tag找到缓存布局
                holder = (ViewHolder) convertView.getTag();
            }
            //设置布局中空间要显示的视图
            holder.iv.setBackgroundResource(iv[position]);
            holder.title.setText(title[position]);
            holder.source.setText(source[position]);
            holder.count.setText(String.valueOf(count[position]));
            return convertView;
        }
    }
    class ViewHolder{
        TextView title,source,count;
        ImageView iv;
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
