package curso.grupoTarea.tarea2

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

open class BoardLayout: AppCompatActivity() {

    /**
     * Inicializa la actividad con el layout correspondiente
     *
     * @see layout
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout)
    }

    /**
     * El mapa de los movimientos usados para el tablero en cruz. Accesado
     * a través de moves por todos los métodos que lo usan. Asignado en el
     * constructor de la clase heredera a ésta
     *
     * @see flower
     * @see moves
     */
    val cross  = mapOf(
        R.id.b1  to mapOf(R.id.b3  to R.id.b2, R.id.b9  to R.id.b4, R.id.b11   to R.id.b5),
        R.id.b2  to mapOf(R.id.b10 to R.id.b5, R.id.b12  to R.id.b6, R.id.b8   to R.id.b4),
        R.id.b3  to mapOf(R.id.b1  to R.id.b2, R.id.b11  to R.id.b6, R.id.b9   to R.id.b5),
        R.id.b4  to mapOf(R.id.b6  to R.id.b5, R.id.b16  to R.id.b9, R.id.b14  to R.id.b8, R.id.b18  to R.id.b10),
        R.id.b5  to mapOf(R.id.b17 to R.id.b10, R.id.b15 to R.id.b9, R.id.b19  to R.id.b11, R.id.b15 to R.id.b9),
        R.id.b6  to mapOf(R.id.b18 to R.id.b11, R.id.b4  to R.id.b5, R.id.b16  to R.id.b10, R.id.b20 to R.id.b12),
        R.id.b7  to mapOf(R.id.b21 to R.id.b14, R.id.b9  to R.id.b8, R.id.b23  to R.id.b15),
        R.id.b8  to mapOf(R.id.b10 to R.id.b9, R.id.b22  to R.id.b15, R.id.b24 to R.id.b16),
        R.id.b9  to mapOf(R.id.b7  to R.id.b8, R.id.b1   to R.id.b4, R.id.b11  to R.id.b10, R.id.b23 to R.id.b16, R.id.b3  to R.id.b5, R.id.b21  to R.id.b15, R.id.b25 to R.id.b17),
        R.id.b10 to mapOf(R.id.b2  to R.id.b5, R.id.b8   to R.id.b9, R.id.b12  to R.id.b11, R.id.b24 to R.id.b17, R.id.b26 to R.id.b18, R.id.b22 to R.id.b16),
        R.id.b11 to mapOf(R.id.b3  to R.id.b9, R.id.b9   to R.id.b10, R.id.b13 to R.id.b12, R.id.b25 to R.id.b18, R.id.b1  to R.id.b5, R.id.b27  to R.id.b19, R.id.b23 to R.id.b17),
        R.id.b12 to mapOf(R.id.b10 to R.id.b11, R.id.b26 to R.id.b19, R.id.b24 to R.id.b18),
        R.id.b13 to mapOf(R.id.b11 to R.id.b12, R.id.b27 to R.id.b20, R.id.b25 to R.id.b19),
        R.id.b14 to mapOf(R.id.b16 to R.id.b15, R.id.b4  to R.id.b8, R.id.b28  to R.id.b22),
        R.id.b15 to mapOf(R.id.b17 to R.id.b16, R.id.b5  to R.id.b9, R.id.b29  to R.id.b23),
        R.id.b16 to mapOf(R.id.b4  to R.id.b9, R.id.b14  to R.id.b15, R.id.b18 to R.id.b17, R.id.b28 to R.id.b23, R.id.b6  to R.id.b10, R.id.b30 to R.id.b24),
        R.id.b17 to mapOf(R.id.b5  to R.id.b10, R.id.b15 to R.id.b16, R.id.b19 to R.id.b18, R.id.b29 to R.id.b24),
        R.id.b18 to mapOf(R.id.b6  to R.id.b11, R.id.b16 to R.id.b17, R.id.b20 to R.id.b19, R.id.b30 to R.id.b25, R.id.b4  to R.id.b10, R.id.b28 to R.id.b24),
        R.id.b19 to mapOf(R.id.b17 to R.id.b18, R.id.b29 to R.id.b25, R.id.b5  to R.id.b11),
        R.id.b20 to mapOf(R.id.b18 to R.id.b19, R.id.b30 to R.id.b26),
        R.id.b21 to mapOf(R.id.b7  to R.id.b14, R.id.b23 to R.id.b22, R.id.b9  to R.id.b15),
        R.id.b22 to mapOf(R.id.b8  to R.id.b15, R.id.b24 to R.id.b23, R.id.b10 to R.id.b16),
        R.id.b23 to mapOf(R.id.b21 to R.id.b22, R.id.b9  to R.id.b16, R.id.b25 to R.id.b24, R.id.b31 to R.id.b28, R.id.b11 to R.id.b17, R.id.b7  to R.id.b15, R.id.b33 to R.id.b29),
        R.id.b24 to mapOf(R.id.b22 to R.id.b23, R.id.b10 to R.id.b17, R.id.b26 to R.id.b25, R.id.b32 to R.id.b29, R.id.b8  to R.id.b16, R.id.b12 to R.id.b18),
        R.id.b25 to mapOf(R.id.b23 to R.id.b24, R.id.b11 to R.id.b18, R.id.b27 to R.id.b26, R.id.b33 to R.id.b30, R.id.b9  to R.id.b17, R.id.b13 to R.id.b19, R.id.b31 to R.id.b29),
        R.id.b26 to mapOf(R.id.b24 to R.id.b25, R.id.b12 to R.id.b19, R.id.b10 to R.id.b18, R.id.b32 to R.id.b30),
        R.id.b27 to mapOf(R.id.b25 to R.id.b26, R.id.b13 to R.id.b20, R.id.b11 to R.id.b19),
        R.id.b28 to mapOf(R.id.b16 to R.id.b23, R.id.b30 to R.id.b29, R.id.b18 to R.id.b24, R.id.b14 to R.id.b22),
        R.id.b29 to mapOf(R.id.b17 to R.id.b24, R.id.b15 to R.id.b23, R.id.b19 to R.id.b25),
        R.id.b30 to mapOf(R.id.b28 to R.id.b29, R.id.b18 to R.id.b25, R.id.b16 to R.id.b24, R.id.b20 to R.id.b26),
        R.id.b31 to mapOf(R.id.b23 to R.id.b28, R.id.b33 to R.id.b32, R.id.b25 to R.id.b29),
        R.id.b32 to mapOf(R.id.b24 to R.id.b29, R.id.b22 to R.id.b28, R.id.b26 to R.id.b30),
        R.id.b33 to mapOf(R.id.b31 to R.id.b32, R.id.b25 to R.id.b30, R.id.b23 to R.id.b29)
    )

    /**
     * El mapa de los movimientos usados para el tablero en flor. Accesado
     * a través de moves por todos los métodos que lo usan. Asignado en el
     * constructor de la clase heredera a ésta
     *
     * @see cross
     * @see moves
     */
    val flower = mapOf(
        R.id.b1  to mapOf(R.id.b3  to R.id.b2, R.id.b8   to R.id.b4),
        R.id.b2  to mapOf(R.id.b7  to R.id.b4, R.id.b9   to R.id.b5),
        R.id.b3  to mapOf(R.id.b1  to R.id.b2, R.id.b8   to R.id.b5),
        R.id.b4  to mapOf(R.id.b13 to R.id.b8, R.id.b11  to R.id.b7),
        R.id.b5  to mapOf(R.id.b12 to R.id.b8, R.id.b14  to R.id.b9),
        R.id.b6  to mapOf(R.id.b8  to R.id.b7, R.id.b15  to R.id.b11),
        R.id.b7  to mapOf(R.id.b9  to R.id.b8, R.id.b2   to R.id.b4),
        R.id.b8  to mapOf(R.id.b1  to R.id.b4, R.id.b3   to R.id.b5, R.id.b6 to R.id.b7, R.id.b10 to R.id.b9, R.id.b15 to R.id.b12, R.id.b16 to R.id.b13),
        R.id.b9  to mapOf(R.id.b7  to R.id.b8, R.id.b2   to R.id.b5),
        R.id.b10 to mapOf(R.id.b8  to R.id.b9, R.id.b16  to R.id.b14),
        R.id.b11 to mapOf(R.id.b4  to R.id.b7, R.id.b13  to R.id.b12),
        R.id.b12 to mapOf(R.id.b5  to R.id.b8, R.id.b14  to R.id.b13),
        R.id.b13 to mapOf(R.id.b4  to R.id.b8, R.id.b11  to R.id.b12),
        R.id.b14 to mapOf(R.id.b5  to R.id.b9, R.id.b12  to R.id.b13),
        R.id.b15 to mapOf(R.id.b6  to R.id.b11, R.id.b8  to R.id.b12),
        R.id.b16 to mapOf(R.id.b8  to R.id.b13, R.id.b10 to R.id.b14)
    )

    /**
     * El mapa de movimientos que cada pieza puede hacer. Las llaves son los
     * id de cada botón, y los valores son mapas, cuyas llaves son los espacios
     * hacia los que nos queremos mover, y cuyos valores son las piezas sobre
     * las cuales nos movemos.
     *
     * Si la pieza en la posición A se mueve sobre la pieza en posición B, hacia
     * la posición C (que está vacía para que sea un movimiento válido), la id:
     * <ul>
     *     <li>A es el botón que seleccionamos previamente (cachedButton)</li>
     *     <li>B es una llave del mapa contenido en moves[A]</li>
     *     <li>C es el valor asociado a moves[A][B]</li>
     * </ul>
     *
     * @see cachedButton
     */
    protected lateinit var moves:Map<Int,Map<Int,Int>>

    /**
     * El id asociado al botón que está en el centro del tablero. Similar a
     * cross y flower, depende del layout del tablero, así que es asignado
     * al valor correspondiente en el constructor de la clase heredera a ésta.
     * 
     * @see flower
     * @see cross
     */
    protected var winButton: Int = 0

    /**
     * Usado en el método onCreate para asignar el layout de la actividad.
     * Similar a cross y flower, depende del layout del tablero, así que es
     * asignado al valor correspondiente en el constructor de la clase heredera
     * a ésta.
     *
     * @see onCreate
     */
    protected var layout:Int = 0

    /**
     * El id asociado al botón que está destacado en este momento. Un valor
     * de 0 indica que no hay ninguna pieza seleccionada
     *
     * @see attendButton
     */
    private var cachedButton:Int = 0

    /**
     * Bandera utilizada por checkEnd y attendButton para comunicar
     * si el final del juego fué una gran victoria o sólo una normal
     *
     * @see checkEnd
     * @see attendButton
     */
    private var isVictory:Boolean = false

    /**
     * Bandera utilizada por checkEnd para ver si quedan movimientos posibles
     */
    private var movesLeft:Boolean = false

    /**
     * Método extensión de Map
     *
     * @return  el id del botón entre cachedButton y target, o null si no existe
     */
    private fun Map<Int,Map<Int,Int>>.getMiddleButton(target:Int): Int? {
        return this[cachedButton]?.get(target)
    }

    /**
     * Retorna si acaso el botón asociado con view está encendido o apagado, es decir,
     * si el botón muestra el drawable roundbutton_on
     *
     * @param   view    el View asociado al botón que buscamos
     * @return          si el botón está encendido o apagado
     */
    private fun isOn(view: View):Boolean {
        return view.background.constantState == getDrawable(R.drawable.roundbutton_on)?.constantState
    }

    /**
     * Actualiza la pieza seleccionada, es decir, cambia el background del botón
     * dependiendo si es seleccionado o deseleccionado
     *
     * @param   view        el View asociado al botón que queremos cambiar
     * @param   selecting   si acaso queremos seleccionar o deseleccionar
     */
    private fun updateSelection(view: View, selecting:Boolean) {
        view.background = getDrawable(
            if (selecting) {
                cachedButton = view.id
                R.drawable.roundbutton_selected
            } else {
                findViewById<Button>(cachedButton).background = getDrawable(R.drawable.roundbutton_off)
                cachedButton = 0
                R.drawable.roundbutton_on
            }
        )
    }

    /**
     * Hace que la pieza asociada a cachedButton capture la asociada a over,
     * y se mueva a la posición de view
     *
     * @param   view    el View asociado al espacio al que nos queremos mover
     * @param   over    la pieza sobre la cual nos moveremos
     */
    private fun capturePiece(view: View, over:Int) {
        view.background = getDrawable(R.drawable.roundbutton_on)
        findViewById<Button>(over).background = getDrawable(R.drawable.roundbutton_off)
        updateSelection(view, false)
    }

    /**
     * Llamada cada vez que se actualiza el tablero. Chequea que:
     * <ul>
     *     <li>Queda una sola pieza activa en el tablero</li>
     *     <li>Si esa pieza tiene id igual a winButton, es una victoria mayor</li>
     * <ul>
     *
     * @return  si las condiciones de victoria se cumplen
     * @see     isVictory
     */
    private fun checkEnd():Boolean {
        val remaining = moves.keys.filter { isOn(findViewById(it)) }
        val possibles = remaining.filter {
            moves[it]?.any {
                entry ->
                !isOn(findViewById(entry.key)) && isOn(findViewById(entry.value))
            }!!
        }
        Log.i("ButtonStates", "$possibles")
        return when {
            remaining.size == 1 -> {
                isVictory = (remaining[0] == winButton)
                true
            }
            possibles.isEmpty() -> {
                movesLeft = true
                true
            }
            else -> false
        }
    }

    /**
     * Llamada por todos los botones del tablero, controla toda la lógica del juego,
     * las variables correspondientes, y si el juego debe terminar o no
     *
     * @param   view    el botón que llamó al método
     */
    fun attendButton(view: View) {
        Log.i("ButtonStates", "isOn(view) = ${isOn(view)}")
        if (isOn(view)) {
            if (cachedButton != 0) {
                Log.i("ButtonStates", "Cached button $cachedButton")
                findViewById<Button>(cachedButton).background = getDrawable(R.drawable.roundbutton_on)
            }
            updateSelection(view, true)
        } else if (cachedButton != 0) try {
            Log.i("ButtonStates", "New Button ${view.id}")
            val l: Int = moves.getMiddleButton(view.id)?:error("Illegal movement")
            if (!isOn(view) && isOn(findViewById(l)))
                capturePiece(view, l)
        } catch (e: IllegalStateException) {
            Log.e("ButtonStates", e.message!!)
            Toast.makeText(this, getString(R.string.illegal), Toast.LENGTH_SHORT).show()
        }

        if (checkEnd()) {
            Log.i("ButtonStates", "Won")
            when {
                isVictory -> Log.i("ButtonStates", "It was a victory!")
                movesLeft -> Log.i("ButtonStates", "No more moves!")
            }
        }
    }
}
