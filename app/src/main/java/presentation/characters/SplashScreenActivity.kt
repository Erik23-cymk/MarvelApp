package presentation.characters

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.marvelheroesestudo.R

class SplashScreenActivity : AppCompatActivity() {

    private val SPLASHTIME: Long = 3000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        Handler().postDelayed({
            startActivity(Intent (this, CharactersActivity::class.java))
            finish()

        }, SPLASHTIME)
    }
}