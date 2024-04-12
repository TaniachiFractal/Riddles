package maslovat.taniachifractal.riddles

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import maslovat.taniachifractal.riddles.databinding.ActivityAnswerBinding
import maslovat.taniachifractal.riddles.databinding.ActivityMainBinding
import java.util.EventListener
import kotlin.random.Random

class AnswerActivity : AppCompatActivity()
{
    private lateinit var fldAnswer: ActivityAnswerBinding

    private var correctId=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        fldAnswer= ActivityAnswerBinding.inflate(layoutInflater)
        setContentView(fldAnswer.root)

        fldAnswer.btCheck.setOnClickListener { btCheck_Click() }

        fldAnswer.tvRiddle.text=riddlesTable[crRdId].getText()

        setAnswers()
    }

    /**Load answers into radio buttons*/
    private fun setAnswers()
    {
        correctId = Random.nextInt(0,4)
        setRadioButtonText(correctId,
            riddlesTable[crRdId].getAnswer())
        var k = 0
        for (i in 0..3)
        {
            if (i!=correctId)
            {
                setRadioButtonText(i,riddlesTable[crRdId].getWrong(k))
                k++
            }
        }
    }

    /**Set text to a radio button by its number*/
    private fun setRadioButtonText(id:Int,text:String)
    {
        when(id)
        {
            0 -> fldAnswer.rb0.text=text;
            1 -> fldAnswer.rb1.text=text;
            2 -> fldAnswer.rb2.text=text;
            3 -> fldAnswer.rb3.text=text;
            else -> fldAnswer.rb0.text=text
        }
    }

    /**Returns the number of the selected radio button*/
    private fun getRadioButtonID():Int
    {
        if      (fldAnswer.rb0.isChecked) return 0
        else if (fldAnswer.rb1.isChecked) return 1
        else if (fldAnswer.rb2.isChecked) return 2
        else if (fldAnswer.rb3.isChecked) return 3
        else return -1
    }

    private fun btCheck_Click()
    {
        if (getRadioButtonID()==-1) return

        if (getRadioButtonID()==correctId)
         {correctCount++;solvedCorrectly=true}
        crRdId++; crRdId%=10
        updateFldMain()
        finish()
    }

    /**Send data to fld main ON ACTIVITY RESULT DOES NOT WORK!!!!!*/
    private fun updateFldMain()
    {
        if(solvedCorrectly)
        {
            solvedCorrectly=false
            fldMain.tvCorrect.text="Верно"
            fldMain.tvCorrect.setBackgroundColor(Color.GREEN)
        }
        else
        {
            fldMain.tvCorrect.text="Неверно"
            fldMain.tvCorrect.setBackgroundColor(Color.RED)
        }
    }
}