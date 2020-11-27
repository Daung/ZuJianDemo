package com.wzy.chajiandemo;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import com.wzy.baselib.ILoginService;
import com.wzy.baselib.ServiceFactory;

public class LoginServiceActivity extends AppCompatActivity {
    private static final String TAG = "LoginServiceActivity";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        FragmentManager supportFragmentManager = getSupportFragmentManager();
        ILoginService loginService = ServiceFactory.getInstance().getLoginService();
        int sum = loginService.sum(10, 10);
        Log.d(TAG, "onCreate: sum = " + sum);
        Bundle bundle = new Bundle();
        bundle.putInt("sum", sum);

        loginService.showFragmentByLogin(supportFragmentManager,R.id.fl_content, bundle);

    }
}
