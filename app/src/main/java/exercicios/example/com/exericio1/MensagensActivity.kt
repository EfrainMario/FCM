package exercicios.example.com.exericio1

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat.startActivity
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_mensagens.*
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.View


class MensagensActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mensagens)

        toolbar.setTitle("Mensagens")
        setSupportActionBar(toolbar)
        InitRecycleView();
    }

    private fun InitRecycleView()
    {
        var lista = ArrayList<String>();
        lista.add("Eud")
        lista.add("Eud")
        lista.add("Eud")
        lista.add("Eud")
        lista.add("Eud")
        lista.add("Eud")
        lista.add("Eud")
        lista.add("Eud")
        lista.add("Eud")
        lista.add("Eud")
        lista.add("Eud")
        lista.add("Eud")
        lista.add("adasdjkq")
        lista.add("adasdjkq")
        lista.add("adasdjkq")
        lista.add("adasdjkq")
        lista.add("adasdjkq")

        rllRemetentes.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        var rllAdapter = RllAdapter(lista);
        rllRemetentes.setAdapter(rllAdapter);
    }

}
