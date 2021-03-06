package com.wangteng.newshopping

import android.app.ActivityManager
import android.app.Application
import android.content.Context
import android.net.ConnectivityManager
import android.util.Log
import com.wangteng.newshopping.constance.BaseContanse
import com.wangteng.newshopping.net.SClitent
import com.wangteng.newshopping.until.ShareUntil

/**
 * @author
 * @version 1.0
 * @date 2017/4/19
 */

 class AppAppliction : Application() {
    var isDebug: Boolean = false//是否调试
    var mBClient:SClitent?=null
    var preShare:ShareUntil?=null
    override fun onCreate() {
        super.onCreate()
        applictions = this
        isDebug = true
        mBClient = SClitent.get()
        preShare=ShareUntil.get(BaseContanse.SHARE_NAME, this)
    }
    
    companion object {
        var applictions: AppAppliction?=null//全局单例
    }

}
