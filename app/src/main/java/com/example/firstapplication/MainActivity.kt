package com.example.firstapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //activity_main.xml 파일의 내용을 현재 Activity의 전체 영역에 출력하는 코드
        setContentView(R.layout.activity_main)

        //xml에 디자인한 2개의 버튼과 텍스트 뷰를 가져오기
        //findViewById는 View로 리턴하기 때문에 원래의 자료형으로 형 변환을 해야 한다.
        //val btn1 = findViewById(R.id.btn1) as Button
        //val btn2 = findViewById(R.id.btn2) as Button
        //val text = findViewById(R.id.text) as TextView

        //kotlin 의 확장 기능을 이용해서 xml 파일에 설정한 id를 클래스로 프로퍼티를 추가했기 때문에 선언하지 않아도 된다.
        btn1.setOnClickListener({text.visibility = View.VISIBLE})
        btn2.setOnClickListener({text.visibility = View.INVISIBLE})

    }
}