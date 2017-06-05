package com.makeuponfleek.e_fashionhub;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        String products[]= {"product a:$10","product b:$2","product c:$11",
                "product d:$14", "product e:$1", "product a1:$23","product b1:$56"
                 ,"product c1:$9","product d1:$7","product e1:$3"};
        Integer[] imageId ={R.drawable.image1,R.drawable.image2,R.drawable.image3,R.drawable.image4
                            ,R.drawable.image5,R.drawable.image6,R.drawable.image8,R.drawable.image7
                             ,R.drawable.image9,R.drawable.image10};

        ListAdapter adapter = new CustomAdapter(HomeActivity.this,products,imageId);
        final ListView listView = (ListView) findViewById(R.id.listView);



        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                listView.getAdapter().getItem(i);
                if (i == 0){
                    Intent intent =new Intent(HomeActivity.this,ProductDetailActvity.class);
                    listView.getContext().startActivity(intent);
                } else if(i == 1){
                    Intent intent =new Intent(HomeActivity.this,ProductDetailActvity.class);
                    listView.getContext().startActivity(intent);
                }else if (i==2){
                    Intent intent =new Intent(HomeActivity.this,ProductDetailActvity.class);
                    listView.getContext().startActivity(intent);
                }
                else if (i==3){
                    Intent intent =new Intent(HomeActivity.this,ProductDetailActvity.class);
                    listView.getContext().startActivity(intent);
                }
                else if (i==4){
                    Intent intent =new Intent(HomeActivity.this,ProductDetailActvity.class);
                    listView.getContext().startActivity(intent);
                }
                else {
                    Intent intent =new Intent(HomeActivity.this,ProductDetailActvity.class);
                    listView.getContext().startActivity(intent);
                }
            }
        });
        listView.setAdapter(adapter);
    }
}
