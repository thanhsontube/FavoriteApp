package lab.ts.favoriteapp.useCases

import io.reactivex.Observable
import lab.ts.favoriteapp.entities.AppData
import javax.inject.Inject

/**
 * Created by sonnt on 2/7/18.
 */
interface UseCaseApps {
    fun getAllApps(): Observable<AppData>
    fun getSysApps(): Observable<AppData>
    fun getDownloadedApp(): Observable<AppData>
}

class UseCaseAppsImpl @Inject constructor() : UseCaseApps  {
    override fun getAllApps(): Observable<AppData> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getSysApps(): Observable<AppData> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getDownloadedApp(): Observable<AppData> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}