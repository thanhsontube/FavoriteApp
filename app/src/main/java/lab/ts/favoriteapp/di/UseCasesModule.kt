package lab.ts.favoriteapp.di

import dagger.Module
import dagger.Provides
import lab.ts.favoriteapp.useCases.UseCaseApps
import lab.ts.favoriteapp.useCases.UseCaseAppsImpl

/**
 * Created by sonnt on 2/7/18.
 */
@Module
class UseCasesModule {
    @Provides
    fun provide1 (impl : UseCaseAppsImpl) : UseCaseApps = impl
}