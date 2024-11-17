package tr.com.nuritiras.ogrenmebirimi5uygulama3

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val button1 = findViewById<Button>(R.id.button1)
        val editText1=findViewById<EditText>(R.id.editText1)
        val editText2=findViewById<EditText>(R.id.editText2)

        button1.setOnClickListener {
            val sayi1 = editText1.text.toString().toInt()
            val sayi2 = editText2.text.toString().toInt()
            val toplam = topla(sayi1, sayi2)
            Toast.makeText(this, "Toplam: $toplam", Toast.LENGTH_SHORT).show()
        }

    }

    private fun topla(sayi1: Int, sayi2: Int): Int {
        return sayi1 + sayi2
    }

}