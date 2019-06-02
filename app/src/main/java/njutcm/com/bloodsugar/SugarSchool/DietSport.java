package njutcm.com.bloodsugar.SugarSchool;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import njutcm.com.bloodsugar.R;


public class DietSport extends Fragment {

    View view;
    ListView listView;
    int iv[]={R.mipmap.sport1,R.mipmap.sport4,R.mipmap.sport5,R.mipmap.sport6,R.mipmap.sport7};
    int count[]={84,148,2206,2388,5919};
    String title[]={"运动时间越长越好?","哪些运动方式适合自己?",
            "揭发两种伪“健康食品” 竟然有麦片!","血糖不是唯一指标，糖友要想身体好营养不能少",
            "吃月饼血糖飙升，那是你吃错了月饼!"};
    String source[]={"来源:全民健身指南","来源:全民健身指南","来源:糖护原创","来源:糖护原创","来源:糖护整理"};

    public DietSport() {
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
        view=inflater.inflate(R.layout.fragment_diet_sport, container, false);
        listView=(ListView)view.findViewById(R.id.listview);
        listView.setAdapter(new MyAdapter());
        return view;
    }

    class MyAdapter extends BaseAdapter{

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
}
