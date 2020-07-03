package curso.grupoTarea.tarea2

import android.view.View


class GameBoardCross : BoardLayout() {
    init {
        moves = cross
        winButton = R.id.b17
        layout = R.layout.activity_game_board1
    }
    fun reiniciar(v: View) {
        recreate()
    }
}