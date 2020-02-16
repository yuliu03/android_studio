package com.example.okhttp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity {
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btnGetId).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.baidu.com";
                OkHttpClient okHttpClient = new OkHttpClient();
                final Request request = new Request.Builder()
                        .url(url)
                        .get()//默认就是GET请求，可以不写
                        .build();
                Call call = okHttpClient.newCall(request);
                call.enqueue(new Callback() {
                    @Override
                    public void onFailure(Call call, IOException e) {
                        System.out.println("get method fail");
                    }

                    @Override
                    public void onResponse(Call call, Response response) throws IOException {
                        System.out.println("get method onResponse: " + response.body().string());
                    }
                });
            }
        });

        findViewById(R.id.btnPostId).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaType mediaType = MediaType.parse("application/json, text/plain, */*");
                String requestBody = "";
                Request request = new Request.Builder()
                        .url("http://192.168.59.1:9999/Menu/selectListRecursive")
                        .post(RequestBody.create(mediaType, requestBody))
                        .build();
                OkHttpClient okHttpClient = new OkHttpClient();
                okHttpClient.newCall(request).enqueue(new Callback() {
                    @Override
                    public void onFailure(Call call, IOException e) {
                        System.out.println("post method onFailure: " + e.getMessage());
                    }

                    @Override
                    public void onResponse(Call call, Response response) throws IOException {
                        System.out.println(response.protocol() + " " +response.code() + " " + response.message());
                        Headers headers = response.headers();
                        for (int i = 0; i < headers.size(); i++) {
                            System.out.println(headers.name(i) + ":" + headers.value(i));
                        }
                        System.out.println("post method onResponse: " + response.body().string());
                    }
                });
            }
        });
    }
}
