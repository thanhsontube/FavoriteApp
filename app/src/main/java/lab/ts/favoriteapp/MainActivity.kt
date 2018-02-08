package lab.ts.favoriteapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import io.reactivex.Observable
import lab.ts.favoriteapp.useCases.UseCaseApps
import timber.log.Timber
import java.util.concurrent.TimeUnit
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject lateinit var useCaseApps : UseCaseApps

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Timber.d(">>>wowowoowowow")
        Observable.just("Son").delay (1, TimeUnit.SECONDS)
                .doOnNext { Timber.d(">>>after delay: $it") }
                .subscribe()

        app().appComponent.inject(this)
        useCaseApps.getAllApps().subscribe()
    }
}
