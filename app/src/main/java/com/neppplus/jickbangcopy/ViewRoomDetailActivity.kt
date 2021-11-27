package com.neppplus.jickbangcopy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_view_room_detail.*

class ViewRoomDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_room_detail)

        val roomData = intent.getSerializableExtra("room") as RoomData

        txtPrice.text = roomData.getFormmattedPrice()
        txtDescription.text = roomData.descriptor

        txtAddress.text = roomData.address
        txtFloor.text = roomData.getFormattedFloor()



    }
}