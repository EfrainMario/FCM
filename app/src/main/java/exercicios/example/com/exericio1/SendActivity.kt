package exercicios.example.com.exericio1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_send.*

class SendActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_send)

        Sendtoolbar.setTitle("Enviar mensagem")
        setSupportActionBar(Sendtoolbar)
    }
}
