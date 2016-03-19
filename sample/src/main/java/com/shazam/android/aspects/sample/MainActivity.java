package com.shazam.android.aspects.sample;

import android.os.Bundle;
import com.shazam.android.aspects.annotations.Aspects;
import com.shazam.android.aspects.base.activity.AspectAppCompatActivity;

@Aspects(aspects = ActivityLifecycleLoggingAspect.class)
public class MainActivity extends AspectAppCompatActivity {

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
  }
}
