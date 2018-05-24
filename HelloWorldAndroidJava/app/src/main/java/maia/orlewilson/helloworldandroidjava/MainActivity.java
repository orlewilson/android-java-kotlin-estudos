package maia.orlewilson.helloworldandroidjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout);

        btnLogin = (Button) findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText edUser = findViewById(R.id.loginUser);
                EditText edPassword = findViewById(R.id.loginPassword);

                if (edUser.getText().toString().equals("Orlewilson") && 
                        edPassword.getText().toString().equals("12345")){
                    showMessage("Bem-vindo, login realizado com sucesso.");
                } else {
                    showMessage("Login e senha incorretos.");
                }
            }
        });

    }

    private void showMessage(String msg){
        Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT).show();
    }
}
