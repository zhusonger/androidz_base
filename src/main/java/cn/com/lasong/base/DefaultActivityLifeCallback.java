package cn.com.lasong.base;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/**
 * Author: zhusong
 * Email: song.zhu@lasong.com.cn
 * Date: 2020-03-04
 * Description: 应用监听类
 */
public class DefaultActivityLifeCallback implements Application.ActivityLifecycleCallbacks {

    @Override
    public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
        AppManager.getInstance().onCreate(activity);
    }

    @Override
    public void onActivityStarted(Activity activity) {
        AppManager.getInstance().onStart(activity);
    }

    @Override
    public void onActivityResumed(Activity activity) {
        AppManager.getInstance().onResume(activity);
    }

    @Override
    public void onActivityPaused(Activity activity) {
        AppManager.getInstance().onPause(activity);
    }

    @Override
    public void onActivityStopped(Activity activity) {
        AppManager.getInstance().onStop(activity);
    }

    @Override
    public void onActivitySaveInstanceState(Activity activity, Bundle outState) {

    }

    @Override
    public void onActivityDestroyed(Activity activity) {
        AppManager.getInstance().onDestroy(activity);
    }
}
