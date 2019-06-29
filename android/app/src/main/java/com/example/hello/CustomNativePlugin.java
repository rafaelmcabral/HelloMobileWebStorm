package com.example.hello;

import com.getcapacitor.JSObject;
import com.getcapacitor.NativePlugin;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;

@NativePlugin
public class CustomNativePlugin extends Plugin {
    @PluginMethod
    public void customCall(PluginCall call) {
        String message = call.getString("message");
        JSObject ret = new JSObject();
        ret.put("returnedMessage", message);
        call.success(ret);
    }
}
