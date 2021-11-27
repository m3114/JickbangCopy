package com.neppplus.jickbangcopy.adapters

import android.content.Context
import android.security.identity.AccessControlProfileId
import android.widget.ArrayAdapter
import com.neppplus.jickbangcopy.RoomData

class RoomAdapter(
    val  mcontext:Context,
    val resId: Int,
    val mList : ArrayList<RoomData>
)  : ArrayAdapter<RoomData>(mcontext, resId, mList){
}