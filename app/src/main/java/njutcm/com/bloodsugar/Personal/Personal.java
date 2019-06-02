package njutcm.com.bloodsugar.Personal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.zip.Inflater;

import njutcm.com.bloodsugar.R;


public class Personal extends Fragment {

    TextView jifen,dingdan,shoucang;
    ListView listView;
    int iv[]={R.mipmap.per2,
            R.mipmap.per3,
            R.mipmap.per4,
            R.mipmap.per5,
            R.mipmap.per6,
            R.mipmap.per7,
            R.mipmap.per8,};
    String tv[]={"购物车","健康档案","消息中心","智能设备","好友推荐","账户信息","系统设置"};

    public Personal() {
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
        View v=inflater.inflate(R.layout.fragment_personal, container, false);
        listView= (ListView) v.findViewById(R.id.listview);
        jifen=(TextView)v.findViewById(R.id.jifen);
        dingdan=(TextView)v.findViewById(R.id.dingdan);
        shoucang=(TextView)v.findViewById(R.id.shoucang);

        jifen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(),JiFen.class));
            }
        });

        dingdan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(),DingDan.class));
            }
        });

        shoucang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(),ShouCang.class));
            }
        });

        listView.setAdapter(new MyAdapter());
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent;
                switch (position){
                    case 0:
                        intent=new Intent(getContext(),ShoppingCart.class);
                        startActivity(intent);
                        break;
                    case 1:
                        intent=new Intent(getContext(),HealthRecords.class);
                        startActivity(intent);
                        break;
                    case 2:
                        intent=new Intent(getContext(),InfoCenter.class);
                        startActivity(intent);
                        break;
                    case 3:
                        intent=new Intent(getContext(),SmartEquipment.class);
                        startActivity(intent);
                        break;
                    case 4:
                        intent=new Intent(getContext(),FriendRecommand.class);
                        startActivity(intent);
                        break;
                    case 5:
                        intent=new Intent(getContext(),AccountInformation.class);
                        startActivity(intent);
                        break;
                    case 6:
                        intent=new Intent(getContext(),SystemSetup.class);
                        startActivity(intent);
                        break;
                }
            }
        });
        return v;
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
                convertView = View.inflate(getContext(),R.layout.item_personal,null);
                holder.iv = (ImageView) convertView.findViewById(R.id.iv);
                holder.tv = (TextView) convertView.findViewById(R.id.tv);
                convertView.setTag(holder);
            } else {
                //通过Tag找到缓存布局
                holder = (ViewHolder) convertView.getTag();
            }
            //设置布局中空间要显示的视图
            holder.iv.setBackgroundResource(iv[position]);
            holder.tv.setText(tv[position]);
            return convertView;
        }
    }
    class ViewHolder{
        ImageView iv;
        TextView tv;
    }
}
