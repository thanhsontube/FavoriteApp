package lab.ts.tslibrary

import dagger.android.AndroidInjector

/**
 * Created by sonnt on 2/7/18.
 */
data class TsLibrary(val name : String = "Hello") {
    var a : AndroidInjector<String>? = null
}