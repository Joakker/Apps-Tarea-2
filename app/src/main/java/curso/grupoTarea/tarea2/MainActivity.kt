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

    fun comenzar(v: View) {
        val I = Intent("curso.grupoTarea.tarea2.GameBoard")
        startActivity(I)
    }
}