package com.info.detaylirvkullanimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var filmlerArrayList:ArrayList<Filmler>
    private lateinit var adapter: FilmlerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rv.setHasFixedSize(true)
        rv.layoutManager = StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)

        val f1 = Filmler(1,"Django","django",12.99)
        val f2 = Filmler(2,"Inception","inception",10.99)
        val f3 = Filmler(3,"Interstellar","interstellar",17.99)
        val f4 = Filmler(4,"The Hateful Eight","thehatefuleight",5.99)
        val f5 = Filmler(5,"The Pianist","thepianist",23.99)
        val f6 = Filmler(6,"Anadoluda","birzamanlaranadoluda",2.99)

        filmlerArrayList = ArrayList<Filmler>()
        filmlerArrayList.add(f1)
        filmlerArrayList.add(f2)
        filmlerArrayList.add(f3)
        filmlerArrayList.add(f4)
        filmlerArrayList.add(f5)
        filmlerArrayList.add(f6)

        adapter = FilmlerAdapter(this,filmlerArrayList)

        rv.adapter = adapter



    }
}
