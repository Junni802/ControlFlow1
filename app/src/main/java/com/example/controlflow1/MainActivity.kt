package com.example.controlflow1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)

		var name = "홍길동"  // name이라는 변수를 선언하고 문자열을 저장
		var age : Int		// age라는 Int형 변수를 선언(초기화 안 할 경우)
		age = 33			// Int형 변수 age에 값을 저장
		Log.d("BasicSyntax", "name : $name, age : $age")

		// 분기문 if
		var ball = 4
		if (ball > 3)	Log.d("ControllFlow_if", "4볼로 출루")
		else			Log.d("ControllFlow_if", "다음 투구")

		var eraR = 2.32
		var eraD = 2.33
		if (eraR < eraD) {
			Log.d("ControllFlow_if", "R이 D를 이김")
		}else {
			Log.d("ControllFlow_if", "D가 R을 이김")
		}

		if(eraR < eraD){
			Log.d("ControllFlow_if", "방어율${eraD}이 방어율${eraR}보다 높음")
		}else{
			Log.d("ControllFlow_if", "방어율${eraR}이 방어율${eraD}보다 높음")
		}

		when(ball){
			1 -> {Log.d("ControllFlow_if", "1볼")}
			2 -> {Log.d("ControllFlow_if", "2볼")}
			3 -> {Log.d("ControllFlow_if", "3볼")}
			4 -> {Log.d("ControllFlow_if", "4볼")}
			else -> {Log.d("ControllFlow_if", "0볼")}
		}

		// 분기문 when
		var now = 10
		when(now){
			6,7 -> Log.d("ControllFlow_when", "now는 6또는 7")
			8,10 -> Log.d("ControllFlow_when", "now 는 8또는 10")
			9,10 -> Log.d("ControllFlow_when", "now는 9또는 10")
			else -> Log.d("ControllFlow_when", "now값 판단 불가")
		}

		when{	// now의 값이 5보다 큰지, 작은지 같은지를 검사하여 출력
			now > 5 -> Log.d("ControllFlow_when", "now는 5보다 크다")
			now == 5 -> Log.d("ControllFlow_when", "now는 5랑 같다")
			now < 5 -> Log.d("ControllFlow_when", "now는 5도 작다")

		}

		age = 12
		when (age) {        //age 나이가 10대인지 아닌지 여부를 출력
			in 10..19	-> 	Log.d("ControllFlow_when", "10대입니다")
			!in 10..19	-> 	Log.d("ControllFlow_when", "10대가 아닙니다")
			else 		->	Log.d("ControllFlow_when", "모르겠습니다")
		}


	}
}