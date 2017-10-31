package andersonassis.com.br.onde_estou

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //click botao capturar
        btn_capturar.setOnClickListener{
            Toast.makeText(this@MainActivity, "Botao capturar", Toast.LENGTH_SHORT).show()
        }

        //click botao salvar
        btn_salvar.setOnClickListener{
            Toast.makeText(this@MainActivity, "Botao salvar", Toast.LENGTH_SHORT).show()
        }

        //click botao limpar
        btn_limpar.setOnClickListener{
            Toast.makeText(this@MainActivity, "Botao limpar", Toast.LENGTH_SHORT).show()
        }

        //click botao ver locais
        btn_ver_locais.setOnClickListener{
            Toast.makeText(this@MainActivity, "Botao ver locais", Toast.LENGTH_SHORT).show()
        }



    }//fim do oncreate










}//fim da classe main
