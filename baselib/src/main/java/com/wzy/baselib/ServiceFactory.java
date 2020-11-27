package com.wzy.baselib;

public class ServiceFactory {

    private static volatile ServiceFactory instance;

    public static ServiceFactory getInstance() {
        if (instance == null) {
            synchronized (ServiceFactory.class) {
                if (instance == null) {
                    instance = new ServiceFactory();
                }
            }
        }
        return instance;
    }

    private ServiceFactory() {

    }

    private ILoginService mLoginService;

    public ILoginService getLoginService() {
        return mLoginService;
    }

    public void setLoginService(ILoginService mLoginService) {
        this.mLoginService = mLoginService;
    }
}
