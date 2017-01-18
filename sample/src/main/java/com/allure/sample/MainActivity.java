package com.allure.sample;

import android.os.Bundle;
import android.view.View;

import com.allure.module.base.BaseActivity;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public  void go2LoginModule(View view){
        startActivityForName(this,"com.allure.module.login.LoginActivity");

    }
    public  void go2ShopModule(View view){
        startActivityForName(this,"com.allure.module.shop.ShopActivity");

    }
}
