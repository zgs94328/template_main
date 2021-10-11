package other.mvvm.activity.src.app_package

fun mvvmAcitivityKt(
        applicationPackage: String?,
        activityClass: String,
        layoutName: String,
        packageName: String
) = """
package ${packageName}
import android.os.Bundle
import com.zgs.baselibrary.base.BaseDBActivity
class ${activityClass}Activity : BaseDBActivity<Activity${activityClass}Binding>() {
   
    override fun getLayoutId(): Int = R.layout.${layoutName}
    override fun initView(savedInstanceState: Bundle?) {
    }
    override fun initData() {
    }
   
    /**
     *	监听数据的变化
     */
    override fun observe() {

    }
} 
"""