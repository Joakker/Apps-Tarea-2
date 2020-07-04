package curso.grupoTarea.tarea2

import android.util.Log

class Win: EndState() {
    init {
        Log.i("ButtonStates", "Entered Win State")
        message = R.string.win
        image = R.drawable.game_win
    }
}