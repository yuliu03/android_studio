package com.example.retrofit;

import retrofit2.Call;
import retrofit2.http.POST;

public interface MenuService {
    /**
     * 定义了一个获取用户信息的业务方法，并且通过注解的方式
     * 指定了方法调用的时候所请求的url路径
     */
    @POST("Menu/selectListRecursive")
    Call<Menu> getMenuInfo();
}
