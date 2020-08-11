package kr.co.tjoeun.listview_20200810.datas

import java.util.*

class Student(
    val name: String,
    val address: String,
    val isMale: Boolean,
    val birthYear: Int
) {
//    학생이 갖는 하위 정보 (ex. 이름 / 거주지 / 성별 / 생년 등) 목록을
//    멤버변수로 만들자. => 생성자에서 멤버변수까지 동시에 세팅.

//    성별을 String 형태로 가공해서 출력해주는 기능 - function

    fun getGenderString() : String {
        when (this.isMale) {
            true -> {return "남성"}
            else -> {return "여성"}
        }
    }

//    생년을 가지고 => 올해의 나이로 계산해서 출력해주는 fun

    fun getKoreanAge() : Int {

//        Calendar 클래스의 기능을 이용. => Calendar를 만들때 현재 시간이 기본 저장됨.
        val now = Calendar.getInstance()

        return now.get(Calendar.YEAR) - this.birthYear + 1
    }

}