package com.example.retrofit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    private TextView mTv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTv=(TextView)findViewById(R.id.tv);

        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //1初始化Retorfit对象
                Retrofit retrofit = new Retrofit.Builder()
                        //设置服务器主机地址,非常注意：BaseUrl必须以/结尾，否则报错
                        //注意ip地址请设置为你自己的
                        .baseUrl(Constant.BASE_URL)
                        //设置Gson为json的转换器
                        .addConverterFactory(GsonConverterFactory.create())
                        .build();

                //创建业务接口类实例对象,create方法内部实际上是用动态代理的方式帮助我们创建了实力对象
                MenuService anInterface = retrofit.create(MenuService.class);

                //获取业务方法调用对象，并进行请求
                //1.得到请求的封装对象，包含注解的信息，就是url和参数信息
                Call<Menu> call = anInterface.getMenuInfo();
                //2.执行异步请求对象
                call.enqueue(new Callback<Menu>() {
                        @Override
                        public void onResponse(Call<Menu> call, Response<Menu> response) {
                            //1.得到结果
                            Menu menuInfo = response.body();
                            System.out.println(menuInfo.toString());
                        }
                        @Override
                        public void onFailure(Call<Menu> call, Throwable t) {
                            System.out.println("error");
                            System.out.println(t.getMessage());;
                        }
                    });

            }
        });
    }
}
