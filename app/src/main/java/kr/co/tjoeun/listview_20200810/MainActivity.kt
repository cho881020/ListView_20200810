package kr.co.tjoeun.listview_20200810

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kr.co.tjoeun.listview_20200810.adapters.StudentAdapter
import kr.co.tjoeun.listview_20200810.datas.Student

class MainActivity : AppCompatActivity() {

//    학생 명부가 담길 목록 변수
    val mStudentList = ArrayList<Student>()

//    Adapter는 멤버변수로 있는게 편리함 => 초기화는 여기서 할 수 없다.
//    초기화만 나중으로 미루자.

    lateinit var mStudentAdapter : StudentAdapter


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


//        Adapter 변수들은 onCreate 내부에서 초기화 해야함.
        mStudentAdapter = StudentAdapter(this, R.layout.student_list_item, mStudentList)

//        xml에 있는 리스트뷰의 어댑터로 지정해주자.
        studentListView.adapter = mStudentAdapter

//        각각의 학생을 누르면, 그 학생의 이름을 토스트로 띄우자.
//        학생을 누른다 => 리스트뷰의 줄 (Item)을 누른다.

        studentListView.setOnItemClickListener { adapterView, view, position, l ->
//            i or position 변수 => 어느 줄이 눌렸는지 알려준다.

//            position에 맞는 학생 데이터를 가져와서 => 토스트에 이름을 찍자.

            val clickedStudent = mStudentList[position]

            Toast.makeText(this, clickedStudent.name, Toast.LENGTH_SHORT).show()

        }

//        각 줄이 오래 눌렸을때의 별도 이벤트 처리.

        studentListView.setOnItemLongClickListener { adapterView, view, position, l ->

//            position 번째 학생을 목록에서 삭제.
            mStudentList.removeAt(position)

//            어댑터에게 새로고침 실행시키자.
            mStudentAdapter.notifyDataSetChanged()

//            오래 눌린 이벤트는 return t/f 처리를 해줘야함.

            return@setOnItemLongClickListener true

        }

    }
}