package curso.grupoTarea.tarea2

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity


/**
 * Punto de partida de la aplicación. Conecta con el selector de niveles
 * y la pantalla de ayuda
 *
 * @see LevelSelector
 * @see Ayuda
 */
@Suppress("UNUSED_PARAMETER")
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    /**
     * Invocado por el botón Comenzar, inicia la actividad LevelSelector
     *
     * @see LevelSelector
     */
    fun comenzar(v: View) {
        val i = Intent(this,LevelSelector::class.java)
        startActivity(i)
    }

    /**
     * Invocado por el botón Ayuda, inicia la actividad Ayuda
     *
     * @see Ayuda
     */
    fun ayuda(v: View) {
        val i = Intent(this, Ayuda::class.java)
        startActivity(i)
    }

    fun creditos(v: View) {
        val i = Intent(this, Creditos::class.java)
        startActivity(i)
    }

}