package com.wzy.loginservice;

import android.app.Application;

import com.wzy.baselib.IService;
import com.wzy.baselib.ServiceFactory;

public class LoginApplication extends Application implements IService {

    private Application app;
    @Override
    public void initApp(Application app) {
        ServiceFactory.getInstance().setLoginService(new LoginService());
        this.app = app;
    }
}
