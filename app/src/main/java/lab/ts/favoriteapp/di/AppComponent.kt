package lab.ts.favoriteapp.di

import dagger.BindsInstance
import dagger.Component
import lab.ts.favoriteapp.MainActivity
import lab.ts.favoriteapp.MainApplication
import javax.inject.Singleton

/**
 * Created by sonnt on 2/7/18.
 */
@Singleton
@Component(modules = arrayOf(AppModule::class, UseCasesModule::class))
interface AppComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(app: MainApplication): Builder

        fun build(): AppComponent
    }

    fun inject(target: MainApplication)
    fun inject(target: MainActivity)

}