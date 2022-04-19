package com.baidu.mobstat;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONObject;

import com.baidu.mobstat.StatService;

import android.text.TextUtils;

public class BaiduMobStat extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) {
        command(action, args, callbackContext);
        return true;
    }

    private void command(String action, JSONArray args, CallbackContext callbackContext) {
        if (TextUtils.isEmpty(action)) {
            callbackContext.error("action invalid, error");
        }

        if ((args == null) || (args.length() == 0)) {
            callbackContext.error("args invalid, error");
        }

        if ("onInit".equals(action)) {
            StatService.setAuthorizedState(this.cordova.getContext(),true);

        }


    }


}
