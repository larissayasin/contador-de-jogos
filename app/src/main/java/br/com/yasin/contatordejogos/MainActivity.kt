package br.com.yasin.contatordejogos

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.EditText
import butterknife.bindView
import com.shawnlin.numberpicker.NumberPicker
import org.jetbrains.anko.startActivity

class MainActivity : AppCompatActivity() {

    val pontuacao: EditText by bindView(R.id.et_pontuacao)
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
            var nomes = ArrayList<String>()
            if(j1.text.toString() != "") nomes.add(j1.text.toString())
            if(j2.text.toString() != "") nomes.add(j2.text.toString())
            if(j3.text.toString() != "") nomes.add(j3.text.toString())
            if(j4.text.toString() != "") nomes.add(j4.text.toString())
            if(j5.text.toString() != "") nomes.add(j5.text.toString())

            startActivity<ResultActivity>(BundleEnum.NUM_JOGADORES.name to numJogadores.value, BundleEnum.SCORE.name to pontuacao.text)

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
