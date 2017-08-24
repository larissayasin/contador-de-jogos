package br.com.yasin.contatordejogos

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.MenuItem
import android.widget.LinearLayout
import android.widget.TextView
import butterknife.bindView

class ScoreActivity : AppCompatActivity() {

//    val j1: EditText by bindView(R.id.et_jogador1)
//    val j2: EditText by bindView(R.id.et_jogador2)
//    val j3: EditText by bindView(R.id.et_jogador3)
//    val j4: EditText by bindView(R.id.et_jogador4)
//    val j5: EditText by bindView(R.id.et_jogador5)

    val nomeJ1: TextView by bindView(R.id.tv_nome1)
    val nomeJ2: TextView by bindView(R.id.tv_nome2)
    val nomeJ3: TextView by bindView(R.id.tv_nome3)
    val nomeJ4: TextView by bindView(R.id.tv_nome4)
    val nomeJ5: TextView by bindView(R.id.tv_nome5)

    val scoreJ1: TextView by bindView(R.id.tv_score1)
    val scoreJ2: TextView by bindView(R.id.tv_score2)
    val scoreJ3: TextView by bindView(R.id.tv_score3)
    val scoreJ4: TextView by bindView(R.id.tv_score4)
    val scoreJ5: TextView by bindView(R.id.tv_score5)

    val layoutJ1: LinearLayout by bindView(R.id.layout_j1)
    val layoutJ2: LinearLayout by bindView(R.id.layout_j2)
    val layoutJ3: LinearLayout by bindView(R.id.layout_j3)
    val layoutJ4: LinearLayout by bindView(R.id.layout_j4)
    val layoutJ5: LinearLayout by bindView(R.id.layout_j5)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_score)

        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        val bundle = intent.extras
//        val numP = bundle[BundleEnum.NUM_JOGADORES.name]
//        val score = bundle[BundleEnum.SCORE.name]

    //    val jogadores = bundle[BundleEnum.JOGADORES.name]


//        toast("Num \$numP e Score \$score")
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.getItemId()
        if (id == android.R.id.home) {
            finish()
            return true
        }
        return super.onOptionsItemSelected(item)
    }



}
