package lab.ts.tslibrary

import android.app.Application
import timber.log.Timber

/**
 * Created by sonnt on 2/7/18.
 */
open class TsLibApplication : Application(), ThirdParty {
    override fun onCreate() {
        super.onCreate()

        initTimber()
        Timber.d(">>>TsLibApplication onCreate")
    }

    override fun initTimber() {
        Timber.plant(Timber.DebugTree())
    }
}

interface ThirdParty {
    fun initTimber()
}