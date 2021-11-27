package com.neppplus.jickbangcopy.adapters

import android.content.Context
import android.security.identity.AccessControlProfileId
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.neppplus.jickbangcopy.R
import com.neppplus.jickbangcopy.RoomData
import java.util.zip.Inflater

class RoomAdapter(
    val mContext:Context,
    val resId: Int,
    val mList : ArrayList<RoomData>
)  : ArrayAdapter<RoomData>(mContext, resId, mList){

    val mInflater = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tempRow = convertView

        if(tempRow == null){
            tempRow = mInflater.inflate(R.layout.room_list_item, null)
        }
        val row = tempRow!!

        val data = mList[position]

        val txtPrice = row.findViewById<TextView>(R.id.txtPrice)
        val txtAddressAndFloor = row.findViewById<TextView>(R.id.txtAddressAndFloor)
        val txtDescriptor = row.findViewById<TextView>(R.id.txtDescriptor)

        txtPrice.text = "${data.getFormmattedPrice()}"


        txtAddressAndFloor.text = "${data.address},${data.getFormattedFloor()}"


        txtDescriptor.text = data.descriptor

        return  row
    }

    }
