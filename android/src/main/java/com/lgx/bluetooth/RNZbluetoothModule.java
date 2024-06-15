
package com.lgx.bluetooth;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;

public class RNZbluetoothModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNZbluetoothModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNZbluetooth";
  }

  @ReactMethod
  public void getBlueToothName(Promise promise) {
      promise.resolve("RNZbluetooth");
  }
}