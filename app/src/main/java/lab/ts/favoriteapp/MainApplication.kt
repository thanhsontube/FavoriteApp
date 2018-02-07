package lab.ts.favoriteapp

import lab.ts.tslibrary.TsLibApplication
import timber.log.Timber

/**
 * Created by sonnt on 2/7/18.
 */
class MainApplication : TsLibApplication() {
    override fun onCreate() {
        super.onCreate()
        Timber.d(">>>MainApplication onCreate")
    }
}