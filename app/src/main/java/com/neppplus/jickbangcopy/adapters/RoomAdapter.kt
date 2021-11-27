package com.neppplus.jickbangcopy.adapters

import android.content.Context
import android.security.identity.AccessControlProfileId
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.core.R
import com.neppplus.jickbangcopy.RoomData

class RoomAdapter(
    val  mContext:Context,
    val resId: Int,
    val mList : ArrayList<RoomData>
)  : ArrayAdapter<RoomData>(mContext, resId, mList){

    val mInflater = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val  tempRow = convertView

        if(tempRow == null){
            tempRow = mInflater.inflate(R.layout., null)
        }
        val row = tempRow!!
        return  row
    }

    }
