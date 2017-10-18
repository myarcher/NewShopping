package com.wangteng.newshopping.ui.vo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.SparseArray
import android.view.View
import com.wangteng.newshopping.R
import com.wangteng.newshopping.base.SActivity
import com.wangteng.newshopping.base.SFragment
import com.wangteng.newshopping.ui.layout.main_v

class MainUi() : SActivity() {
    var mList: SparseArray<SFragment>?=null
    override fun initData(savedInstanceState: Bundle?) {
        mList = SparseArray<SFragment>()
        mList!!.put(0, MainFourFra(this))
        //mList!!.put(1, MainSortFra(mainUi))
       // mList!!.put(2, ShoppingFra(mainUi))
     //   mList!!.put(3, MySelfFra(mainUi))
    
    }

    override fun getView(): View? {
        return main_v(this)
    }
    
}
