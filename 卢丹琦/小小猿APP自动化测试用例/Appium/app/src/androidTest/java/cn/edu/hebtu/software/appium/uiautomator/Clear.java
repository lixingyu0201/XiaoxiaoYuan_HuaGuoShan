package cn.edu.hebtu.software.appium.uiautomator;

import android.support.test.InstrumentationRegistry;
import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject;
import android.support.test.uiautomator.UiObjectNotFoundException;
import android.support.test.uiautomator.UiSelector;

import org.junit.Test;

public class Clear {
    private UiDevice device;

    @Test
    public void clearsuccessful() throws UiObjectNotFoundException, InterruptedException {
        device = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());
        UiObject into = device.findObject(new UiSelector().resourceId("com.google.blockly.demo:id/ll_go"));
        into.click();
        Thread.sleep(1000);
        UiObject course = device.findObject(new UiSelector().resourceId("com.google.blockly.demo:id/iv_tv"));
        course.click();

        Thread.sleep(1000);
        UiObject delete = device.findObject(new UiSelector().resourceId("com.google.blockly.demo:id/btn_clear"));
        delete.click();

    }
}
