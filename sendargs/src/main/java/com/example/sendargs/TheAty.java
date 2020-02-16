package com.example.sendargs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class TheAty extends AppCompatActivity {
    private TextView tv;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the_aty);
        Intent i = getIntent();
//        Bundle data = i.getExtras();
//        Bundle data = i.getBundleExtra("data");
         tv =(TextView)findViewById(R.id.tv);
        editText=(EditText)findViewById(R.id.editText);
//        tv.setText(i.getStringExtra("data"));
//        tv.setText(String.format("name=%s,age=%d,name1=%s",data.getString("name"),data.getInt("age"),data.getString("name1","default")));

//        User user = (User) i.getSerializableExtra("user");
        User user = (User) i.getParcelableExtra("user");
        tv.setText(String.format("user info(name=%s,age=%d)",user.getName(),user.getAge()));

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.putExtra("data",editText.getText().toString());
                setResult(1,i);
                finish();//结束当前activity
            }
        });
    }
}
