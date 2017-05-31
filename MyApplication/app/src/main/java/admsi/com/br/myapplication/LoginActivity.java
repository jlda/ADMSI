package admsi.com.br.myapplication;

import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);

        final String username = "abcd";
        final int pass = 12345;

        // Faz botao de login ir para "Tela Principal" do programa
        final Button button_login = (Button)findViewById(R.id.button_login);
        button_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (username.equals("abcd") && pass == 12345) {
                    startActivity(new Intent(LoginActivity.this, MainActivity.class));
                }
            }
        });

    }

//    public void login (View view) {
//        if (username.getText().equals("admin") && userpass.getText().equals(123456)) {
//            // correct password
//        } else {
//            // wrong password
//        }
//
//    }
}
