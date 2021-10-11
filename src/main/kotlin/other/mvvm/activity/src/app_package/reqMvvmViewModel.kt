
package other.mvvm.activity.src.app_package
fun reqMvvmViewModel(
        packageName:String,
        activityClass:String
)="""
package ${packageName}
import com.zgs.commonlibrary.base.BaseViewModel
class Req${activityClass}ViewModel : BaseViewModel() {
   
}    
"""