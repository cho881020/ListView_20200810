package kr.co.tjoeun.listview_20200810

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kr.co.tjoeun.listview_20200810.datas.Student

class MainActivity : AppCompatActivity() {

//    학생 명부가 담길 목록 변수
    val mStudentList = ArrayList<Student>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        학생 명부에 실제 학생 데이터 추가
        mStudentList.add(Student("조경진", "서울시 은평구", true, 1988))
        mStudentList.add(Student("강윤정", "경기도 안양시", false, 1991))
        mStudentList.add(Student("구주영", "서울시 용산구", true, 1968))
        mStudentList.add(Student("윤은영", "경기도 수원시", false, 1992))
        mStudentList.add(Student("이선영", "경기도 고양시", false, 1985))
        mStudentList.add(Student("이용찬", "서울시 노원구", true, 1976))
        mStudentList.add(Student("장동국", "서울시 은평구", true, 1974))
        mStudentList.add(Student("최인선", "서울시 영등포구", false, 1992))


    }
}