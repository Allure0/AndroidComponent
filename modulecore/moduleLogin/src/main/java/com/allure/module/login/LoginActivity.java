package com.allure.module.login;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.allure.module.base.BaseActivity;
import com.github.mzule.activityrouter.annotation.Router;

/**
 * 作者：luomin
 * 邮箱：asddavid@163.com
 */
@Router("login")
public class LoginActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);
    }
    public  void go2Main(View view){
        startActivityForName(this,"com.allure.sample.MainActivity");
    }
    public  void go2ShopModule(View view){
        startActivityForName(this,"com.allure.module.shop.ShopActivity");
    }


}
