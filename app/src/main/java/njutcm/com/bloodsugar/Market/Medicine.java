package njutcm.com.bloodsugar.Market;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import njutcm.com.bloodsugar.R;

public class Medicine extends AppCompatActivity {

    TextView back,xiyao,zhongyao;

    int xiyao_iv[]={R.mipmap.medicine1,R.mipmap.medicine2,R.mipmap.medicine3,R.mipmap.medicine4,R.mipmap.medicine5};
    String xiyao_name[]={"盐酸二甲双胍片","格列美服片","阿卡波糖片","格列美吡磺片","磷酸西格列叮片"};
    double xiyao_price[]={26.0,19.8,65.0,27.0,112.5};

    int zhongyao_iv[]={R.mipmap.medicine6,R.mipmap.medicine7,R.mipmap.medicine8};
    String zhongyao_name[]={"金银花","枸杞子","莲子心"};
    double zhongyao_price[]={29.8,39.9,28.0};

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medicine);

        listView=(ListView)findViewById(R.id.listview);
        listView.setAdapter(new MyAdapter(1));

        back=(TextView)findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        xiyao=(TextView)findViewById(R.id.xiyao);
        xiyao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listView.setAdapter(new MyAdapter(1));
            }
        });

        zhongyao=(TextView)findViewById(R.id.zhongyao);
        zhongyao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listView.setAdapter(new MyAdapter(2));
            }
        });

    }

    class MyAdapter extends BaseAdapter {

        int flag=0;
        MyAdapter(int flag){
            this.flag=flag;
        }

        @Override
        public int getCount() {
            switch (flag){
                case 1:
                    return xiyao_iv.length;
                case 2:
                    return zhongyao_iv.length;
            }
            return 0;
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
                convertView = View.inflate(Medicine.this,R.layout.item_medicine,null);
                holder.iv=(ImageView)convertView.findViewById(R.id.iv);
                holder.name = (TextView) convertView.findViewById(R.id.name);
                holder.price = (TextView) convertView.findViewById(R.id.price);
                convertView.setTag(holder);
            } else {
                //通过Tag找到缓存布局
                holder = (ViewHolder) convertView.getTag();
            }
            //设置布局中空间要显示的视图
            switch (flag){
                case 1:
                    holder.iv.setBackgroundResource(xiyao_iv[position]);
                    holder.name.setText(xiyao_name[position]);
                    holder.price.setText("￥"+xiyao_price[position]);
                    break;
                case 2:
                    holder.iv.setBackgroundResource(zhongyao_iv[position]);
                    holder.name.setText(zhongyao_name[position]);
                    holder.price.setText("￥"+zhongyao_price[position]);
                    break;
            }
            return convertView;
        }
    }
    class ViewHolder{
        ImageView iv;
        TextView name,price;
    }
}
