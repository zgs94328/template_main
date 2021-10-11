
package other.mvvm.activity.src.app_package
fun mvvmViewModel(
        packageName:String,
        activityClass:String
)="""
package ${packageName}
import com.zgs.commonlibrary.base.BaseViewModel
class ${activityClass}ViewModel : BaseViewModel() {
   
}    
"""