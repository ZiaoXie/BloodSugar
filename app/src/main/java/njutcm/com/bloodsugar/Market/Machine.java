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

public class Machine extends AppCompatActivity {

    TextView back;
    ListView listView;
    int machine_iv[]={R.mipmap.machine1,R.mipmap.machine2,R.mipmap.machine3,R.mipmap.machine4,R.mipmap.machine5};
    String machine_name[]={"试纸","罗氏血糖仪","血糖仪+试纸20片","雅培瞬感传感器","小米手环"};
    double machine_price[]={29.0,72.0,135.0,455.0,99.0};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_machine);

        listView=(ListView)findViewById(R.id.listview);
        listView.setAdapter(new MyAdapter());

        back=(TextView)findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    class MyAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return machine_iv.length;
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
                convertView = View.inflate(Machine.this,R.layout.item_medicine,null);
                holder.iv=(ImageView)convertView.findViewById(R.id.iv);
                holder.name = (TextView) convertView.findViewById(R.id.name);
                holder.price = (TextView) convertView.findViewById(R.id.price);
                convertView.setTag(holder);
            } else {
                //通过Tag找到缓存布局
                holder = (ViewHolder) convertView.getTag();
            }
            //设置布局中空间要显示的视图
            holder.iv.setBackgroundResource(machine_iv[position]);
            holder.name.setText(machine_name[position]);
            holder.price.setText("￥"+machine_price[position]);
            return convertView;
        }
    }
    class ViewHolder{
        ImageView iv;
        TextView name,price;
    }
}
