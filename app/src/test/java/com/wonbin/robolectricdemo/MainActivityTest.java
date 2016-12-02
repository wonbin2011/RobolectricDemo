package com.wonbin.robolectricdemo;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;
/**
 * Created by wonbin on 11/30/16.
 */

@RunWith(RobolectricTestRunner.class)
@Config(sdk = Build.VERSION_CODES.LOLLIPOP,constants = BuildConfig.class)
public class MainActivityTest {

    @Test
    public void clickingButtonShouldChangeText() {
        AppCompatActivity activity = Robolectric.buildActivity(MainActivity.class)
                .create().get();
        Button button = (Button) activity.findViewById(R.id.button);
        TextView textView = (TextView) activity.findViewById(R.id.text);

        button.performClick();
        assertThat("Hello Robolectric",equalTo(activity.getString(R.string.hello_robolectric)));
    }
}
