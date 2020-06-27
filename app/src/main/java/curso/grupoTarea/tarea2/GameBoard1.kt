package curso.grupoTarea.tarea2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import androidx.constraintlayout.widget.ConstraintLayout.LayoutParams

class GameBoard1 : AppCompatActivity() {
    private lateinit var moves:Map<Int,Map<Int,Int>>
    private var cachedButton:Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_board1)
        this.moves = mapOf(
            R.id.b1 to mapOf(R.id.b3 to R.id.b2, R.id.b9 to R.id.b4),
            R.id.b2 to mapOf(R.id.b10 to R.id.b5),
            R.id.b3 to mapOf(R.id.b1 to R.id.b2, R.id.b11 to R.id.b6),
            R.id.b4 to mapOf(R.id.b6 to R.id.b5, R.id.b16 to R.id.b9),
            R.id.b5 to mapOf(R.id.b17 to R.id.b10),
            R.id.b6 to mapOf(R.id.b18 to R.id.b11, R.id.b4 to R.id.b5),
            R.id.b7 to mapOf(R.id.b21 to R.id.b14, R.id.b9 to R.id.b8),
            R.id.b8 to mapOf(R.id.b10 to R.id.b9, R.id.b22 to R.id.b15),
            R.id.b9 to mapOf(R.id.b7 to R.id.b8, R.id.b1 to R.id.b4, R.id.b11 to R.id.b10, R.id.b23 to R.id.b16),
            R.id.b10 to mapOf(R.id.b2 to R.id.b5, R.id.b8 to R.id.b9, R.id.b12 to R.id.b11, R.id.b24 to R.id.b17),
            R.id.b11 to mapOf(R.id.b3 to R.id.b9, R.id.b9 to R.id.b10, R.id.b13 to R.id.b12, R.id.b25 to R.id.b18),
            R.id.b12 to mapOf(R.id.b10 to R.id.b11, R.id.b26 to R.id.b19),
            R.id.b13 to mapOf(R.id.b11 to R.id.b12, R.id.b27 to R.id.b20),
            R.id.b14 to mapOf(R.id.b16 to R.id.b15),
            R.id.b15 to mapOf(R.id.b18 to R.id.b17),
            R.id.b16 to mapOf(R.id.b4 to R.id.b9, R.id.b14 to R.id.b15, R.id.b18 to R.id.b17, R.id.b28 to R.id.b23),
            R.id.b17 to mapOf(R.id.b5 to R.id.b10, R.id.b15 to R.id.b16, R.id.b19 to R.id.b18, R.id.b29 to R.id.b24),
            R.id.b18 to mapOf(R.id.b6 to R.id.b11, R.id.b16 to R.id.b17, R.id.b20 to R.id.b19, R.id.b30 to R.id.b25),
            R.id.b19 to mapOf(R.id.b17 to R.id.b18),
            R.id.b20 to mapOf(R.id.b18 to R.id.b19),
            R.id.b21 to mapOf(R.id.b7 to R.id.b14, R.id.b23 to R.id.b22),
            R.id.b22 to mapOf(R.id.b8 to R.id.b15, R.id.b24 to R.id.b23),
            R.id.b23 to mapOf(R.id.b21 to R.id.b22, R.id.b9 to R.id.b16, R.id.b25 to R.id.b24, R.id.b31 to R.id.b28),
            R.id.b24 to mapOf(R.id.b22 to R.id.b23, R.id.b10 to R.id.b17, R.id.b26 to R.id.b25, R.id.b32 to R.id.b29),
            R.id.b25 to mapOf(R.id.b23 to R.id.b24, R.id.b11 to R.id.b18, R.id.b27 to R.id.b26, R.id.b33 to R.id.b30),
            R.id.b26 to mapOf(R.id.b24 to R.id.b25, R.id.b12 to R.id.b19),
            R.id.b27 to mapOf(R.id.b25 to R.id.b26, R.id.b13 to R.id.b20),
            R.id.b28 to mapOf(R.id.b16 to R.id.b23, R.id.b30 to R.id.b29),
            R.id.b29 to mapOf(R.id.b17 to R.id.b24),
            R.id.b30 to mapOf(R.id.b28 to R.id.b29, R.id.b18 to R.id.b25),
            R.id.b31 to mapOf(R.id.b23 to R.id.b28, R.id.b33 to R.id.b32),
            R.id.b32 to mapOf(R.id.b24 to R.id.b29),
            R.id.b33 to mapOf(R.id.b31 to R.id.b32, R.id.b25 to R.id.b30)
        )
    }

    fun attendButton(view: View) {
        if (this.cachedButton == 0) {
            this.cachedButton = view.id
        }
    }
}