package br.com.yasin.contatordejogos

import android.os.Bundle
import android.support.design.widget.TextInputLayout
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.EditText
import butterknife.bindView
import com.shawnlin.numberpicker.NumberPicker
import org.jetbrains.anko.startActivity

class MainActivity : AppCompatActivity() {

    val pontuacao: EditText by bindView(R.id.et_pontuacao)
    val tilPontuacao: TextInputLayout by bindView(R.id.til_pontuacao)
    val iniciar: Button by bindView(R.id.bt_iniciar)
    val numJogadores: NumberPicker by bindView(R.id.np_jogadores_picker)
    val j1: EditText by bindView(R.id.et_jogador1)
    val j2: EditText by bindView(R.id.et_jogador2)
    val j3: EditText by bindView(R.id.et_jogador3)
    val j4: EditText by bindView(R.id.et_jogador4)
    val j5: EditText by bindView(R.id.et_jogador5)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        iniciar.setOnClickListener {
            val jogadores = ArrayList<Jogador>()
            if(1 <= numJogadores.value)
                jogadores.add(Jogador(j1.text.toString()))
            if(2 <= numJogadores.value)
                jogadores.add(Jogador(j2.text.toString()))
            if(3 <= numJogadores.value)
                jogadores.add(Jogador(j3.text.toString()))
            if(4 <= numJogadores.value)
                jogadores.add(Jogador(j4.text.toString()))
            if(5 <= numJogadores.value)
                jogadores.add(Jogador(j5.text.toString()))


//            if(j1.text.toString() != "") jogadores.add(Jogador(j1.text.toString()))
//            if(j2.text.toString() != "") jogadores.add(Jogador(j2.text.toString()))
//            if(j3.text.toString() != "") jogadores.add(Jogador(j3.text.toString()))
//            if(j4.text.toString() != "") jogadores.add(Jogador(j4.text.toString()))
//            if(j5.text.toString() != "") jogadores.add(Jogador(j5.text.toString()))

            if(pontuacao.text.toString() == ""){
                tilPontuacao.error = "Campo deve ser preenchido"
                return@setOnClickListener
            }
          //  startActivity<ScoreActivity>(BundleEnum.NUM_JOGADORES.name to numJogadores.value, BundleEnum.SCORE.name to pontuacao.text.toString(), BundleEnum.JOGADORES.name to jogadores)
            startActivity<ScoreActivity>( "players" to jogadores)
        }

        numJogadores.setOnValueChangedListener { picker, oldVal, newVal ->
            when (newVal) {
                1 -> {
                    j1.visibility = View.VISIBLE
                    j2.visibility = View.INVISIBLE
                    j3.visibility = View.INVISIBLE
                    j4.visibility = View.INVISIBLE
                    j5.visibility = View.INVISIBLE
                }
                2 -> {
                    j1.visibility = View.VISIBLE
                    j2.visibility = View.VISIBLE
                    j3.visibility = View.INVISIBLE
                    j4.visibility = View.INVISIBLE
                    j5.visibility = View.INVISIBLE
                }
                3 -> {
                    j1.visibility = View.VISIBLE
                    j2.visibility = View.VISIBLE
                    j3.visibility = View.VISIBLE
                    j4.visibility = View.INVISIBLE
                    j5.visibility = View.INVISIBLE
                }
                4 -> {
                    j1.visibility = View.VISIBLE
                    j2.visibility = View.VISIBLE
                    j3.visibility = View.VISIBLE
                    j4.visibility = View.VISIBLE
                    j5.visibility = View.INVISIBLE
                }
                5 -> {
                    j1.visibility = View.VISIBLE
                    j2.visibility = View.VISIBLE
                    j3.visibility = View.VISIBLE
                    j4.visibility = View.VISIBLE
                    j5.visibility = View.VISIBLE
                }
            }
        }

    }
}
