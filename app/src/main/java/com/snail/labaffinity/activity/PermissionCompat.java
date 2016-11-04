package com.snail.labaffinity.activity;

import com.annotation.OnGrantedListener;

/**
 * Author: hzlishang
 * Data: 16/11/4 下午7:15
 * Des:
 * version:
 */
public class PermissionCompat {
    public static void requestPermission(BaseActivity activity, String[] strings, OnGrantedListener listener) {
        activity.requestPermissions(strings, listener);
    }
}
