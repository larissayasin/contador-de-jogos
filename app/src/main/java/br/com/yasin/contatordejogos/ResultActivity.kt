package br.com.yasin.contatordejogos

import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.view.ViewPager
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import butterknife.bindView
import org.jetbrains.anko.toast

class ResultActivity : AppCompatActivity() {

    val toolbar: Toolbar by bindView(R.id.toolbar)
    val viewPager: ViewPager  by bindView(R.id.viewpager)
    val tabLayout: TabLayout  by bindView(R.id.tabs)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        setSupportActionBar(toolbar)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        val bundle = intent.extras
        val numP = bundle[BundleEnum.NUM_JOGADORES.name]
        val score = bundle[BundleEnum.SCORE.name]

        toast("Num $numP e Score $score")

        setupViewPager(viewPager)

        tabLayout.setupWithViewPager(viewPager)
    }

    fun setupViewPager(viewPager: ViewPager) {
        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addFrag(ResultActivityFragment(), "TOTAL")
        adapter.addFrag(Jogador1Fragment(), "AA")
        viewPager.adapter = adapter
    }

}
