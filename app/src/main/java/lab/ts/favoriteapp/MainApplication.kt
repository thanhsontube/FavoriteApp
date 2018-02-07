package lab.ts.favoriteapp

import lab.ts.favoriteapp.di.AppComponent
import lab.ts.tslibrary.TsLibApplication
import timber.log.Timber
import javax.inject.Inject

/**
 * Created by sonnt on 2/7/18.
 */
class MainApplication : TsLibApplication() {
    @Inject lateinit var appComponent : AppComponent
    override fun onCreate() {
        super.onCreate()
        Timber.d(">>>MainApplication onCreate")
    }

}