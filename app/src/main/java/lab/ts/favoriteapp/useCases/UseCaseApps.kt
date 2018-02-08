package lab.ts.favoriteapp.useCases

import android.content.pm.ApplicationInfo
import android.content.pm.PackageInfo
import android.content.pm.PackageManager
import android.content.pm.PermissionInfo
import io.reactivex.Observable
import lab.ts.favoriteapp.entities.AppData
import timber.log.Timber
import java.util.*
import javax.inject.Inject

/**
 * Created by sonnt on 2/7/18.
 */
interface UseCaseApps {
    fun getAllApps(): Observable<AppData>
    fun getSysApps(): Observable<AppData>
    fun getDownloadedApp(): Observable<AppData>
}

class UseCaseAppsImpl @Inject constructor(private val packageManager: PackageManager) : UseCaseApps {
    override fun getAllApps(): Observable<AppData> {
        val installPackage: MutableList<PackageInfo> = packageManager.getInstalledPackages(PackageManager.GET_PERMISSIONS)
        installPackage.forEach {
            val name = it.packageName
            val packageInfo: PackageInfo = packageManager.getPackageInfo(it.packageName, PackageManager.GET_PERMISSIONS)
            val permissions: Array<out PermissionInfo>? = packageInfo.permissions
            val a: ApplicationInfo = packageInfo.applicationInfo
            val b = a.icon
            val c = packageManager.getApplicationLabel(a)
            val d = a.category
            Timber.d(">>> ================ >>>>")
            Timber.d(">>>ApplicationInfo $a")
            Timber.d(">>>installPackage permissions ${Arrays.deepToString(permissions?: emptyArray())}")
            Timber.d(">>>installPackage icon $b")
            Timber.d(">>>installPackage name $c")
            Timber.d(">>>installPackage category $d")
        }

        return Observable.just(AppData("1"))

    }

    override fun getSysApps(): Observable<AppData> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getDownloadedApp(): Observable<AppData> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}