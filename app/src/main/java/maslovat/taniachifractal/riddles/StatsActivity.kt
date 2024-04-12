package maslovat.taniachifractal.riddles

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import maslovat.taniachifractal.riddles.databinding.ActivityAnswerBinding
import maslovat.taniachifractal.riddles.databinding.ActivityMainBinding
import maslovat.taniachifractal.riddles.databinding.ActivityStatsBinding
import kotlin.system.exitProcess

class StatsActivity:AppCompatActivity()
{
    private lateinit var fldStats: ActivityStatsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        fldStats= ActivityStatsBinding.inflate(layoutInflater)
        setContentView(fldStats.root)

        fldStats.btExit.setOnClickListener{btExit_Click()}
        fldStats.btRestart.setOnClickListener { btMainPage_Click() }

        fldStats.tvStats.text="Верно решено ${correctCount}/10"
    }

    private fun btMainPage_Click()
    {
        crRdId = 0
        correctCount = 0
        solvedCorrectly = false
        val mainActivity = MainActivity()
        mainActivity.finish()
        exitProcess(0)
    }

    private fun btExit_Click()
    {
        1/0
    }
}