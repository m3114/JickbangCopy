package com.neppplus.jickbangcopy

import android.location.Address
import java.io.FileDescriptor
import java.text.NumberFormat
import java.util.*

class RoomData(
    val price : Int,
    val address: String,
    val floor:Int,
    val descriptor: String

){

//    방 데이터 기능 : 가격을 가공해서 스트링으로 주는 기능= 리스트뷰에서 , 상세화면두군데에서 사용

       fun getFormmattedPrice() : String{
        if(this.price < 10000){
//            8000 = 8,000
            return NumberFormat.getNumberInstance(Locale.KOREA).format(this.price)

        }
        else {
            return "1억이상"
        }
    }


//    추가기능 : 층수도 가공해서 스트링으로 주자.

      fun getFormattedFloor() : String{

          if(this.floor > 0){
              return "${this.floor}층"
          }
          else if(this.floor == 0){
              return "반지하"
          }
          else{
              return "지하 ${-this.floor}층" // -2 : 지하2층
          }


    }

}
