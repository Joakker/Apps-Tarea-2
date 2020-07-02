package curso.grupoTarea.tarea2

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

@Suppress("UNUSED_PARAMETER")
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun comenzar(v: View) {
        val i = Intent(this,LevelSelector::class.java)
        startActivity(i)
    }

    fun ayuda(v: View) {
        val i = Intent(this, Ayuda::class.java)
        startActivity(i)
    }
}