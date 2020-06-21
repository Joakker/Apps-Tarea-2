package curso.grupoTarea.tarea2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun funcionHola(){
        println("Hola")
    }

    fun comenzar(v: View) {
        val I = Intent(this,GameBoard1::class.java)
        startActivity(I)
    }
}