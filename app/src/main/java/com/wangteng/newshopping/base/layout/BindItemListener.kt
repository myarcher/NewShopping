package com.wangteng.newshopping.base.layout

import com.wangteng.newshopping.base.CustomAdapter
import com.wangteng.newshopping.base.ViHolder

/**
 *
 *
 * @author
 * @date    2017/10/13
 * @version 1.0
 */ 
public interface BindItemListener {
    fun bindItemHolder(holder: ViHolder, data: Map<String, Any>, position: Int, mAdapter: CustomAdapter)
} 