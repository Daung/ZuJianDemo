package com.wzy.baselib;

import android.os.Bundle;

import androidx.fragment.app.FragmentManager;

public interface ILoginService {

    int sum(int num1, int num2);

    void showFragmentByLogin(FragmentManager manager, int resId, Bundle bundle);
}
