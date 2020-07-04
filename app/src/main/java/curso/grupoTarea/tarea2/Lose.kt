package curso.grupoTarea.tarea2

import android.util.Log

class Lose: EndState() {
    init {
        Log.i("ButtonStates", "Hello World")
        message = R.string.lose
    }
}