package curso.grupoTarea.tarea2

import android.util.Log

class Lose: EndState() {
    init {
        Log.i("ButtonStates", "Entered Lose State")
        message = R.string.lose
        image = R.drawable.game_lost
    }
}