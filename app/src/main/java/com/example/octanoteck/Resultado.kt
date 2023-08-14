    package com.example.octanoteck

    import android.os.Bundle
    import android.view.MenuItem
    import android.widget.TextView
    import androidx.appcompat.app.AppCompatActivity

    class ResultActivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_resultado)

            supportActionBar?.apply {
                setHomeButtonEnabled(true)
                setDisplayHomeAsUpEnabled(true)
            }

            val resultado = intent.getFloatExtra("EXTRA_RESULTADO", 0.1f)
            val resultadoFormatado = "R$ %.2f".format(resultado)
            val textoResultado = "Resultado: $resultadoFormatado"

            val tvResultado: TextView = findViewById(R.id.txtResult)
            tvResultado.text = textoResultado
        }

        override fun onOptionsItemSelected(item: MenuItem): Boolean {
            finish()
            return super.onOptionsItemSelected(item)
        }
    }
