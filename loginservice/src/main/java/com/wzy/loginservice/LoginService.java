package com.wzy.loginservice;

import android.os.Bundle;

import androidx.fragment.app.FragmentManager;

import com.wzy.baselib.ILoginService;

public class LoginService implements ILoginService {
    @Override
    public int sum(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public void showFragmentByLogin(FragmentManager manager, int resId, Bundle bundle) {
      LoginFragment fragment = LoginFragment.newInstance("来自宿主app调用 sum = " + bundle.getInt("sum"),"显示login组件里面的登陆页面");
      manager.beginTransaction().add(resId, fragment).commitAllowingStateLoss();
    }
}
