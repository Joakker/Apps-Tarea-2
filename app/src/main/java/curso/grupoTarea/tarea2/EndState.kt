package curso.grupoTarea.tarea2

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

open class EndState : AppCompatActivity() {
    var message:Int = 0
    var image:Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_end_state)
        findViewById<TextView>(R.id.message).text = getString(message)
        findViewById<ImageView>(R.id.end_image).setImageResource(image)
    }
}