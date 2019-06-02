package njutcm.com.bloodsugar.Market;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import njutcm.com.bloodsugar.Personal.HealthRecords;
import njutcm.com.bloodsugar.R;

public class HealthFood extends AppCompatActivity {

    TextView back;
    ListView listView;
    int food_iv[]={R.mipmap.healthfood1,R.mipmap.healthfood2,R.mipmap.healthfood3,R.mipmap.healthfood4,R.mipmap.healthfood5};
    String food_name[]={"益生元菊粉","三色藜麦500g","大麦茶","低聚果糖","金奈玛抗糖茶"};
    double food_price[]={65.0,32.0,16.6,89.0,162.0};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health_food);

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
            return food_iv.length;
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
                convertView = View.inflate(HealthFood.this,R.layout.item_medicine,null);
                holder.iv=(ImageView)convertView.findViewById(R.id.iv);
                holder.name = (TextView) convertView.findViewById(R.id.name);
                holder.price = (TextView) convertView.findViewById(R.id.price);
                convertView.setTag(holder);
            } else {
                //通过Tag找到缓存布局
                holder = (ViewHolder) convertView.getTag();
            }
            //设置布局中空间要显示的视图
            holder.iv.setBackgroundResource(food_iv[position]);
            holder.name.setText(food_name[position]);
            holder.price.setText("￥"+food_price[position]);
            return convertView;
        }
    }
    class ViewHolder{
        ImageView iv;
        TextView name,price;
    }

}
