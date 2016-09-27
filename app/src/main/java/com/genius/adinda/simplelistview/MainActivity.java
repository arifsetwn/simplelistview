package com.genius.adinda.simplelistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ListView lvitem;
    private String[] footballclubs = new String[]{
            "Juventus","Manchester United","Liverpool","Bayern Muenchen",
            "Real Madrid","Ajax Amsterdam","Barcelona","Arsenal",
            "Leicester City","Lazio","AS Roma","Napoli"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvitem = (ListView)findViewById(R.id.lv_item);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_list_item_1,
                android.R.id.text1, footballclubs);
        lvitem.setAdapter(adapter);

        lvitem.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this,"Kamu fans : "+footballclubs[position],Toast.LENGTH_LONG).show();
                                          }
                                       }
        );
    }
}
