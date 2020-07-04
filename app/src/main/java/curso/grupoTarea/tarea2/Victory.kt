package curso.grupoTarea.tarea2

import android.util.Log

class Victory: EndState() {
    init {
        Log.i("ButtonStates", "Entered Victory State")
        message = R.string.victory
        image = R.drawable.game_epic_win
    }
}