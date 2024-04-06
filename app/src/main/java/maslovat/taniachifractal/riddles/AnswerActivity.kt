package maslovat.taniachifractal.riddles

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import maslovat.taniachifractal.riddles.databinding.ActivityAnswerBinding
import maslovat.taniachifractal.riddles.databinding.ActivityMainBinding
import maslovat.taniachifractal.riddles.databinding.ActivityStatsBinding

class AnswerActivity : AppCompatActivity()
{
    private lateinit var fldAnswer: ActivityAnswerBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        fldAnswer= ActivityAnswerBinding.inflate(layoutInflater)
        setContentView(fldAnswer.root)

        fldAnswer.btCheck.setOnClickListener { btCheck_Click() }
    }

    private fun btCheck_Click()
    {
        finish()
    }
}