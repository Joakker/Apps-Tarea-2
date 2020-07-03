package curso.grupoTarea.tarea2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import kotlinx.android.synthetic.main.activity_ayuda.*

class Ayuda : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ayuda)
        val adapter = MyViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(Fragmento1() , " Objetivo ")
        adapter.addFragment(Fragmento2() , " Reglas ")
        adapter.addFragment(Fragmento3() , " A jugar! ")
        viewPager.adapter = adapter
        viewPager.background = getDrawable(R.color.defaultBackground)
        //tabs.setupWithViewPager(viewPager)

    }


    class MyViewPagerAdapter(manager: FragmentManager) : FragmentPagerAdapter(manager){

        private val fragmentList : MutableList<Fragment> = ArrayList()
        private val titleList : MutableList<String> = ArrayList()

        override fun getItem(position: Int): Fragment {
            return fragmentList[position]
        }

        override fun getCount(): Int {
            return fragmentList.size
        }

        fun addFragment(fragment: Fragment,title:String){
            fragmentList.add(fragment)
            titleList.add(title)
        }

        override fun getPageTitle(position: Int): CharSequence? {
            return titleList[position]
        }

    }
}
