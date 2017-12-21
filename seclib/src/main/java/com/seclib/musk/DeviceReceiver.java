package com.seclib.musk;

import android.app.admin.DeviceAdminReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Created by musk on 17/12/13.
 * 设备管理广播接收器：仅起绑定识别作用暂时不做操作
 */

public class DeviceReceiver extends DeviceAdminReceiver {
    //激活
    @Override
    public void onEnabled(Context context, Intent intent) {
        super.onEnabled(context, intent);
    }

    //取消激活
    @Override
    public void onDisabled(Context context, Intent intent) {
        super.onDisabled(context, intent);
    }

    //发起请求取消激活设备时
    @Override
    public CharSequence onDisableRequested(Context context, Intent intent) {
        return "取消时，弹出的用户提示信息！";
    }
}
