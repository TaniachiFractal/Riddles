package maslovat.taniachifractal.riddles

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import maslovat.taniachifractal.riddles.databinding.ActivityMainBinding
@SuppressLint("StaticFieldLeak")

/**Binding to the main activity*/
lateinit var fldMain: ActivityMainBinding
class MainActivity : AppCompatActivity()
{

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        fldMain=ActivityMainBinding.inflate(layoutInflater)
        setContentView(fldMain.root)

        fldMain.btRiddle.setOnClickListener { btRiddle_Click() }
        fldMain.btAnswer.setOnClickListener { btAnswer_Click() }
        fldMain.btStats.setOnClickListener { btStats_Click() }
    }


    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt("crRdId",crRdId)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        crRdId=savedInstanceState.getInt("crRdId")
        updateRiddleText(riddlesTable[crRdId].getText())
        switchEnabled()

    }


    /**btRiddle enabled -> btRiddle disabled and btAnswer enabled; vise-versa*/
    private fun switchEnabled()
    {
        fldMain.btRiddle.isEnabled=!fldMain.btRiddle.isEnabled
        fldMain.btAnswer.isEnabled=!fldMain.btAnswer.isEnabled
    }
    fun updateRiddleText(riddle:String)
    {
        fldMain.tvRiddle.text= riddle
        fldMain.tvRiddleId.text="${crRdId+1}/10"
        fldMain.tvCorrect.text=""; fldMain.tvCorrect.setBackgroundColor(Color.WHITE)
    }
    private fun btRiddle_Click()
    {
        updateRiddleText(riddlesTable[crRdId].getText())
        switchEnabled()
    }
    private fun btAnswer_Click()
    {
        val intent = Intent(this,AnswerActivity::class.java)
        startActivity(intent)
        switchEnabled()
        if (crRdId==9)
        {
            fldMain.btAnswer.isEnabled=false
            fldMain.btRiddle.isEnabled=false
            fldMain.btStats.isEnabled=true
            updateRiddleText("")
        }
    }
    private fun btStats_Click()
    {
        val intent = Intent(this,StatsActivity::class.java)
        startActivity(intent)
    }
}