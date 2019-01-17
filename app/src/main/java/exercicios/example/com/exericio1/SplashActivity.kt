package exercicios.example.com.exericio1

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var handler = Handler();
        handler.postDelayed({
                mostrarMainActivity();
        }, 2000);
    }

    fun mostrarMainActivity() {
        startActivity(Intent(this, LoginActivity::class.java));
        finish();
    }

}
