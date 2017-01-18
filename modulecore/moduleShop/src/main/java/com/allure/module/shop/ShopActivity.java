package com.allure.module.shop;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Toast;

import com.allure.module.base.BaseActivity;
import com.allure.module.base.BaseApplication;
import com.github.mzule.activityrouter.router.Routers;

/**
 * 作者：luomin
 * 邮箱：asddavid@163.com
 */

public class ShopActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shop_activity);
    }

    public  void go2Main(View view){
        startActivityForName(this,"com.allure.sample.MainActivity");
    }
    public  void go2LoginModule(View view){
        Routers.open(ShopActivity.this, "allure://login");
//        startActivityForName(this,"com.allure.module.login.LoginActivity");
    }

    public  void useApplication(View view){
        Toast.makeText(BaseApplication.getInstance(),"1",1).show();
//        Applicatioin app=RuntimeInit.mApplicationObject.this$0.mInitialApplication;
    }
}
