package maslovat.taniachifractal.riddles

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import maslovat.taniachifractal.riddles.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity()
{

    private lateinit var fldMain: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        fldMain=ActivityMainBinding.inflate(layoutInflater)
        setContentView(fldMain.root)

        fldMain.btRiddle.setOnClickListener { btRiddle_Click() }
        fldMain.btAnswer.setOnClickListener { btAnswer_Click() }
        fldMain.btStats.setOnClickListener { btStats_Click() }
    }

    private fun btRiddle_Click()
    {
        fldMain.btAnswer.isEnabled=true
    }
    private fun btAnswer_Click()
    {
        val intent = Intent(this,AnswerActivity::class.java)
        startActivity(intent)
    }
    private fun btStats_Click()
    {

    }
}