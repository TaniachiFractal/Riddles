package maslovat.taniachifractal.riddles

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import maslovat.taniachifractal.riddles.databinding.ActivityAnswerBinding
import maslovat.taniachifractal.riddles.databinding.ActivityMainBinding
import maslovat.taniachifractal.riddles.databinding.ActivityStatsBinding

class StatsActivity:AppCompatActivity()
{
    private lateinit var fldStats: ActivityStatsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        fldStats= ActivityStatsBinding.inflate(layoutInflater)
        setContentView(fldStats.root)

        fldStats.btExit.setOnClickListener{btExit_Click()}
    }
    private fun btExit_Click()
    {
        finish()
    }
}