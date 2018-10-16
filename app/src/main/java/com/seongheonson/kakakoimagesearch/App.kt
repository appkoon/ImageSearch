package com.seongheonson.kakakoimagesearch

import android.app.Activity
import android.app.Application
import com.facebook.drawee.backends.pipeline.Fresco
import com.seongheonson.kakakoimagesearch.di.AppInjector
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import javax.inject.Inject


class App : Application(), HasActivityInjector {

    @Inject
    lateinit var activityInjector: DispatchingAndroidInjector<Activity>

    override fun onCreate() {
        super.onCreate()
        AppInjector.init(this)
        Fresco.initialize(this)
    }

    override fun activityInjector(): AndroidInjector<Activity> = activityInjector

}