package com.shazam.android.aspects.sample;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import com.shazam.android.aspects.aspects.activity.NoOpAppCompatActivityAspect;
import com.shazam.android.aspects.base.activity.AspectAppCompatActivity;

public class ActivityLifecycleLoggingAspect extends NoOpAppCompatActivityAspect {

  private static final String TAG = ActivityLifecycleLoggingAspect.class.getSimpleName();

  @Override
  public void onCreate(@NonNull AspectAppCompatActivity activity, @Nullable Bundle savedInstanceState) {
    Log.d(TAG, activity.getClass().getSimpleName() + " " + "onCreate()");
  }

  @Override
  public void onStart(@NonNull AspectAppCompatActivity activity) {
    Log.d(TAG, activity.getClass().getSimpleName() + " " + "onStart()");
  }

  @Override
  public void onResume(@NonNull AspectAppCompatActivity activity) {
    Log.d(TAG, activity.getClass().getSimpleName() + " " + "onResume()");
  }

  @Override
  public void onPause(@NonNull AspectAppCompatActivity activity) {
    Log.d(TAG, activity.getClass().getSimpleName() + " " + "onPause()");
  }

  @Override
  public void onStop(@NonNull AspectAppCompatActivity activity) {
    Log.d(TAG, activity.getClass().getSimpleName() + " " + "onStop()");
  }

  @Override
  public void onDestroy(@NonNull AspectAppCompatActivity activity) {
    Log.d(TAG, activity.getClass().getSimpleName() + " " + "onDestroy()");
  }
}
