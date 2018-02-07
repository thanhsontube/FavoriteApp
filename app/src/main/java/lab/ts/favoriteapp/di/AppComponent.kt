package lab.ts.favoriteapp.di

import dagger.Component
import lab.ts.favoriteapp.MainApplication
import javax.inject.Singleton

/**
 * Created by sonnt on 2/7/18.
 */
@Singleton
@Component(modules = arrayOf(AppModule::class))
interface AppComponent {

    fun inject(target: MainApplication)

}