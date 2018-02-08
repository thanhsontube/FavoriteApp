package lab.ts.favoriteapp.di

import android.content.Context
import dagger.Module
import dagger.Provides
import lab.ts.favoriteapp.MainApplication

/**
 * Created by sonnt on 2/7/18.
 */
@Module
class AppModule {
    @Provides
    fun provideAppName(): String = "app name"

    @Provides
    fun provideAppContext(impl: MainApplication): Context = impl

    @Provides
    fun providepackageManager(context: Context) = context.packageManager
}