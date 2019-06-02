package njutcm.com.bloodsugar.BloodSugar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import njutcm.com.bloodsugar.Market.Machine;
import njutcm.com.bloodsugar.R;

public class ShiLiao extends AppCompatActivity {

    TextView back;
    ListView listView;
    int iv[]={R.mipmap.shiliao1,R.mipmap.shiliao2,R.mipmap.shiliao3,
            R.mipmap.shiliao4,R.mipmap.shiliao5};
    String name[]={"笋米粥","土茯苓猪骨汤","猪胰黄芪汤","山药黄芪粥","洋葱炒黄鳝"};
    String contents[]={"推荐理由：笋米粥可清热，宣肺，利湿，适用于糖尿病人，也适用于久泻、久痢、脱肛等症。",
            "推荐理由：健脾气，利水湿，补阴益髓。",
            "推荐理由：补肝益肾，消热利尿，用于糖尿病及肝肾阴虚所致头晕目眩，腰膝酸软等症。",
            "推荐理由：黄芪性味甘，微温。能使白细胞的吞噬能力增强，故能增强机体的抵抗力，有补气止汗、利水......",
            "推荐理由：理气健脾，降糖降脂。洋葱有降血糖作用。黄鳝有“黄鳝鱼素”，对高血糖者具有类似胰岛素......"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shi_liao);

        listView=(ListView)findViewById(R.id.listview);
        listView.setAdapter(new MyAdapter());

        back=(TextView)findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                startActivity(new Intent(ShiLiao.this,Details.class));
            }
        });
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
                convertView = View.inflate(ShiLiao.this,R.layout.item_shi_liao,null);
                holder.iv=(ImageView)convertView.findViewById(R.id.iv);
                holder.name = (TextView) convertView.findViewById(R.id.name);
                holder.contents = (TextView) convertView.findViewById(R.id.contents);
                convertView.setTag(holder);
            } else {
                //通过Tag找到缓存布局
                holder = (ViewHolder) convertView.getTag();
            }
            //设置布局中空间要显示的视图
            holder.iv.setBackgroundResource(iv[position]);
            holder.name.setText(name[position]);
            holder.contents.setText(contents[position]);
            return convertView;
        }
    }
    class ViewHolder{
        ImageView iv;
        TextView name,contents;
    }
}
