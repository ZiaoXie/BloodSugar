package njutcm.com.bloodsugar.Personal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import njutcm.com.bloodsugar.R;

public class JiFen extends AppCompatActivity {

    TextView back,jifen1,jifen2,jifen3;
    String info1[]={"注册","完善个人信息","添加医师","推荐患者注册成功","推荐医生注册成功"};
    int score1[]={100,1000,100,500,2000};

    String info2[]={"录入血糖","录入云端","录入用药","录入血压","添加不适记录",
                    "绑定密友盒子","绑定血糖仪"};
    int score2[]={2,5,5,10,10,500,500};

    String info3[]={"上传病历","上传化验单","上传处方医嘱","记录血脂","记录糖化血红蛋白"
                    ,"血红蛋白同步记录"};
    int score3[]={100,100,100,100,100,100};

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ji_fen);

        listView=(ListView)findViewById(R.id.listview);
        listView.setAdapter(new MyAdapter(1));

        back=(TextView)findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        jifen1=(TextView)findViewById(R.id.jifen1);
        jifen1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listView.setAdapter(new MyAdapter(1));
            }
        });

        jifen2=(TextView)findViewById(R.id.jifen2);
        jifen2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listView.setAdapter(new MyAdapter(2));
            }
        });

        jifen3=(TextView)findViewById(R.id.jifen3);
        jifen3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listView.setAdapter(new MyAdapter(3));
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
                    return info1.length;
                case 2:
                    return info2.length;
                case 3:
                    return info3.length;
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
                convertView = View.inflate(JiFen.this,R.layout.item_score,null);
                holder.tv1 = (TextView) convertView.findViewById(R.id.text1);
                holder.tv2 = (TextView) convertView.findViewById(R.id.text2);
                convertView.setTag(holder);
            } else {
                //通过Tag找到缓存布局
                holder = (ViewHolder) convertView.getTag();
            }
            //设置布局中空间要显示的视图
            switch (flag){
                case 1:
                    holder.tv1.setText(info1[position]);
                    holder.tv2.setText("+"+score1[position]);
                    break;
                case 2:
                    holder.tv1.setText(info2[position]);
                    holder.tv2.setText("+"+score2[position]);
                    break;
                case 3:
                    holder.tv1.setText(info3[position]);
                    holder.tv2.setText("+"+score3[position]);
                    break;
            }
            return convertView;
        }
    }
    class ViewHolder{
        TextView tv1,tv2;
    }
}
