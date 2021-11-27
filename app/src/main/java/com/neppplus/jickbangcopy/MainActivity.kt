package com.neppplus.jickbangcopy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter

class MainActivity : AppCompatActivity() {

    val mRoomList = ArrayList<RoomData>()




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mRoomList.add(RoomData(8000,"서울시 동대문구", 5,"1번째 방입니다."))
        mRoomList.add(RoomData(18000,"서울시 동대문구", 3,"2번째 방입니다."))
        mRoomList.add(RoomData(28000,"서울시 서대문구", 2,"3번째 방입니다."))
        mRoomList.add(RoomData(6000,"서울시 사대문구", 5,"1번째 방입니다."))
        mRoomList.add(RoomData(5000,"서울시 동대문구", 3,"2번째 방입니다."))
        mRoomList.add(RoomData(9000,"서울시 도대문구", 2,"2번째 방입니다."))
        mRoomList.add(RoomData(7000,"서울시 동대문구", 1,"3번째 방입니다."))
        mRoomList.add(RoomData(18000,"서울시 북대문구", 0,"4번째 방입니다."))
        mRoomList.add(RoomData(28000,"서울시 남대문구", -1,"2번째 방입니다."))
        mRoomList.add(RoomData(38000,"서울시 동문구", -1,"3번째 방입니다."))

    }
}