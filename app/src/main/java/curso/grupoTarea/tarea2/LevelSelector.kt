package curso.grupoTarea.tarea2

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class LevelSelector : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_level_selector)
    }

    fun startLevel(view: View) {
        val i = Intent(this, when((view as Button).text) {
            getString(R.string.cross) -> GameBoardCross::class.java
            getString(R.string.flower) -> GameBoardFlower::class.java
            else -> MainActivity::class.java
        })
        startActivity(i)
    }
}