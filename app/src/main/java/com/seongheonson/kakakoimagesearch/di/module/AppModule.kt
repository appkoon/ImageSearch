package com.seongheonson.kakakoimagesearch.di.module

import android.app.Application
import android.content.Context
import com.seongheonson.kakakoimagesearch.ui.ActionManager
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(includes = [ViewModelModule::class])
class AppModule {

    @Singleton
    @Provides
    fun provideContext(application: Application): Context {
        return application
    }

    @Singleton
    @Provides
    fun provideActionManager(): ActionManager = ActionManager.instance
}