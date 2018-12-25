
package com.dingle.cardview;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

public class RNCardviewModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNCardviewModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNCardview";
  }

  @ReactMethod
  public void log() {
	System.out.println("android 的打印");
  }
}