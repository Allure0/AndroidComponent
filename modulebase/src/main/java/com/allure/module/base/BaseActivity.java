package com.allure.module.base;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * 作者：luomin
 * 邮箱：asddavid@163.com
 */

public class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    /**
     * 通过Class跳转界面
     **/
//    public void startActivity(Class<?> cls) {
//        startActivity(cls);
//    }

    /**
     * 通过包名跳转
     * @param context
     * @param activityName
     */
    public  void startActivityForName(Context context, String activityName) {
        try {
            Class clazz = Class.forName(activityName);
            Intent intent = new Intent(this,clazz);
            startActivity(intent);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }




}
