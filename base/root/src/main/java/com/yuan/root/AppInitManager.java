package com.yuan.root;

import android.app.Application;

import java.util.ArrayList;

public class AppInitManager {
    private static ArrayList<IApplication> applications = new ArrayList<>();
    public static void registerApp(IApplication iApplication){
        if (iApplication != null) {
            applications.add(iApplication);
        }
    }

    public static void init(Application realApplication){
        for (IApplication application : applications) {
            application.init(realApplication);
        }
        applications.clear();
    }

}
