package com.seclib.musk;

import android.accessibilityservice.AccessibilityService;
import android.view.accessibility.AccessibilityEvent;
import com.seclib.musk.compat.Huawei;

/**
 * Created by musk on 17/12/13.
 * 辅助服务
 */

public class SecureService extends AccessibilityService {

    private final String TAG=SecureService.class.getSimpleName();

    @Override
    public void onAccessibilityEvent(AccessibilityEvent event) {
        if(null!=event.getSource()) {
            Debugger.i(TAG+"==SecureService应用=="+event.getPackageName());
            EventHandler.dealEvent(getRootInActiveWindow(),this);

            Huawei.cancelUninstallFromSysManager(event,this);
        }
    }

    @Override
    public void onInterrupt() {
        //ignore
    }
}
