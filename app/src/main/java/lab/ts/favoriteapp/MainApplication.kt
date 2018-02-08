package lab.ts.favoriteapp

import android.content.Context
import lab.ts.favoriteapp.di.AppComponent
import lab.ts.favoriteapp.di.DaggerAppComponent
import lab.ts.tslibrary.TsLibApplication
import timber.log.Timber
import javax.inject.Inject

/**
 * Created by sonnt on 2/7/18.
 */
class MainApplication : TsLibApplication() {
    @Inject lateinit var appComponent: AppComponent
    @Inject lateinit var appname: String
    override fun onCreate() {
        super.onCreate()
        Timber.d(">>>MainApplication onCreate")

//        appComponent = DaggerAppComponent.builder()
//                .appModule(AppModule())
//                .build().apply { inject(this@MainApplication) }

        appComponent = DaggerAppComponent.builder().application(this@MainApplication)
                .build().apply { inject(this@MainApplication) }

        Timber.d(">>>appname $appname")
    }

}

internal fun Context.app () : MainApplication {
    return applicationContext as MainApplication
}