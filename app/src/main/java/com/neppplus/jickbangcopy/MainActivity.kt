package com.neppplus.jickbangcopy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.neppplus.jickbangcopy.adapters.RoomAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val mRoomList = ArrayList<RoomData>()
    lateinit var mRoomAdapter:RoomAdapter




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()




        roomListview.setOnItemClickListener { adapterView, view, position, l ->

            val clilkedRoom = mRoomList[position]

            val myIntent = Intent(this,ViewRoomDetailActivity::class.java)
            myIntent.putExtra("room",clilkedRoom)
            startActivity(myIntent)
        }


    }

    fun setupEvents(  ){
        // 이벤트 초ㅓ리관련 코드를 모아두는 함수
    }
    fun setValues(){
        // 화면에 처링 보여주눈 코드를 모아ㅜ는 함수
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


        mRoomAdapter = RoomAdapter(this, R.layout.room_list_item,mRoomList)
        roomListview.adapter = mRoomAdapter



    }
}