package com.wangteng.newshopping.toast

import com.wangteng.newshopping.bean.ToastBean

/**
 *
 *
 * @author
 * @date    2017/10/16
 * @version 1.0
 */
interface ToastCallBackLister {
     fun beginClick(bean: ToastBean)
     fun forwordclick(bean: ToastBean)
}