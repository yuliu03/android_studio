package com.example.sendargs;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.UserHandle;
import android.view.View;
import android.widget.TextView;

import java.io.Serializable;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView)findViewById(R.id.textView);
        findViewById(R.id.btnStartAty).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,TheAty.class);
//                i.putExtra("data","Hello xiao liu yu");
//                Bundle b = new Bundle();
//                b.putString("name","liu xiao yu");
//                b.putInt("age",29);
//                i.putExtras(b);
//                i.putExtra("data",b);

                i.putExtra("user", new User("liu",29));
//                startActivity(i);
                startActivityForResult(i,0);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        //处理传进来的数据
        textView.setText("另一个activity传回的数据"+data.getStringExtra("data"));
    }
}
