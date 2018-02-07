package lab.ts.favoriteapp.di

import dagger.Module
import dagger.Provides

/**
 * Created by sonnt on 2/7/18.
 */
@Module
class AppModule {
    @Provides
    fun provideAppName () : String = "app name"



}