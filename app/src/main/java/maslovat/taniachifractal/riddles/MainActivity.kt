package maslovat.taniachifractal.riddles

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import maslovat.taniachifractal.riddles.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var fldMain: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        fldMain=ActivityMainBinding.inflate(layoutInflater)
        setContentView(fldMain.root)

        }

}