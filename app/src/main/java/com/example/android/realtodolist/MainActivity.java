package com.example.android.realtodolist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemClickListene {

    private EditText iText;
    private Button iButton;
    private ListView iList;

    private ArrayList<String> items;
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iText = findViewById(R.id.item_edit_text);
        iButton = findViewById(R.id.add_btn);
        iList = findViewById(R.id.items_list);

        items = File.readData(this);
        //android.R.layout.simple_list_item_1是系统定义好的布局文件只显示一行文字
        adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,items);
        iList.setAdapter(adapter);

        iButton.setOnClickListener(this);
        iList.setOnItemClickListener(this);
        //iList.setOnItemLongClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.add_btn:
                String itemEntered = iText.getText().toString();
                adapter.add(itemEntered);
                iText.setText("");
                File.writeData(items,this);
                Toast.makeText(this, "Added", Toast.LENGTH_SHORT).show();
                break;

        }
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        items.remove(position);
        adapter.notifyDataSetChanged();
        Toast.makeText(this, "Deleted", Toast.LENGTH_SHORT).show();
    }

   /* @Override
    public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
        itemList.isInEditMode();
        return true;
    }*/

    /*@Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        itemChange(view);
    }*/

    /*private void itemChange(View view){
        TextView txView = (TextView) view;//这里强转必须是咱自己知道的明确的是点击的是TextView
        txView.setText("更改过");
    }*/r
}
