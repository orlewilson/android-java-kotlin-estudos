package maia.orlewilson.helloworldandroidkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btLogin = findViewById<Button>(R.id.btnLogin)

        btLogin.setOnClickListener {
            val edLogin = findViewById<EditText>(R.id.loginUser)
            val edPassword = findViewById<EditText>(R.id.loginPassword)

            if (edLogin.text.toString().equals("Orlewilson") &&
                    edPassword.text.toString().equals("12345")){
                showMessage("Bem-vindo, login realizado com sucesso.")
            } else {
                showMessage("Login e senha incorretos.")
            }
        }
    }

    private fun showMessage(msg: String) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
    }
}
