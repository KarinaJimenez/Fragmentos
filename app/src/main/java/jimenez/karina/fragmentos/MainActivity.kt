package jimenez.karina.fragmentos

import android.app.Fragment
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Btn1.setOnClickListener(this)
        Btn2.setOnClickListener(this)
        Btn3.setOnClickListener(this)
    }


    

    override fun onClick(boton: View?) {
        var  f:androidx.fragment.app.Fragment? = null
       // var f:Fragment = null

        when(boton!!.id){
            R.id.Btn1 -> {
                f= PrimerFragment.newInstance("","")
            }
            R.id.Btn2 -> {
                f= SegundoFragment.newInstance("","")
            }
            R.id.Btn3 -> {
                f= TercerFragment.newInstance("","")
            }
        }
        supportFragmentManager.beginTransaction().replace(R.id.container, f!!).commitNow()
      //  supportFragmentManager.beginTransaction().replace(R.id.container, f!!).commitNow()
    }

}
