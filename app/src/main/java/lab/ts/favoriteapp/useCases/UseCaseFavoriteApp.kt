package lab.ts.favoriteapp.useCases

import io.reactivex.Observable
import lab.ts.favoriteapp.entities.AppData

/**
 * Created by sonnt on 2/7/18.
 */
interface UseCaseFavoriteApp {
    fun getFavoriteApps(): Observable<AppData>
}