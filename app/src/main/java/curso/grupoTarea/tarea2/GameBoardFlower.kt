package curso.grupoTarea.tarea2

import android.view.View


class GameBoardFlower : BoardLayout() {
    init {
        moves = flower
        winButton = R.id.b8
        layout = R.layout.activity_game_board2
    }
    fun reiniciar(v: View) {
        recreate()
    }
}