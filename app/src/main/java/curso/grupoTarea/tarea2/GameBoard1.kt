package curso.grupoTarea.tarea2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.constraintlayout.widget.ConstraintLayout.LayoutParams

class GameBoard1 : AppCompatActivity() {
    private val botones = arrayListOf<Button>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_board1)
        for (i in 1..10) {
            this.botones += Button(this)
            botones[i].layoutParams = LayoutParams(
                LayoutParams.WRAP_CONTENT,
                LayoutParams.WRAP_CONTENT
            )
        }
    }
}