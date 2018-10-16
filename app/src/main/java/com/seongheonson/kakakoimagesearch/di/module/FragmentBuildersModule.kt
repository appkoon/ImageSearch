package com.seongheonson.kakakoimagesearch.di.module

import com.seongheonson.kakakoimagesearch.ui.detail.DetailFragment
import com.seongheonson.kakakoimagesearch.ui.search.SearchFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Suppress("unused")
@Module
abstract class FragmentBuildersModule {

    @ContributesAndroidInjector
    abstract fun contributeDetailFragment(): DetailFragment

    @ContributesAndroidInjector
    abstract fun contributeSearchFragment(): SearchFragment
}
