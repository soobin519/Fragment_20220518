package kr.co.asianaidt.fragment_20220518

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_first.*


class FirstFragment : Fragment(){

    //어떤 xml을 꿀어다 사용할지 결정하는 함수
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate( R.layout.fragment_first, container, false )
    }

    //동작 관련 코드 전달 함수
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        btnLog.setOnClickListener {

            Log.d("첫 프래그먼트", "프래그먼트에서의 로그")

        }
    }

}