package com.julyyu.gankio_kotlin

import android.content.Context
import android.content.Intent
import com.julyyu.gankio_kotlin.model.Girl
import com.julyyu.gankio_kotlin.ui.AboutActivity
import com.julyyu.gankio_kotlin.ui.calendar.CalendarActivity
import com.julyyu.gankio_kotlin.ui.GirlsActivity
import com.julyyu.gankio_kotlin.ui.SettingActivity
import java.util.*

/**
 * Created by julyyu on 2017/4/28.
 * 路由
 */
class Route{

    fun visitGirls(context : Context,girls : ArrayList<Girl>,position : Int){
        val intent = Intent(context,GirlsActivity::class.java)
        intent.putExtra("position",position)
        intent.putParcelableArrayListExtra("girls",girls)
        context.startActivity(intent)
    }

    fun about(context : Context){
        val intent = Intent(context,AboutActivity::class.java)
        context.startActivity(intent)
    }

    fun setting(context: Context){
        val intent = Intent(context,SettingActivity::class.java)
        context.startActivity(intent)
    }

    fun Calendar(context: Context){
        val intent = Intent(context, CalendarActivity::class.java)
        context.startActivity(intent)
    }
}