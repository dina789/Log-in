package hk.ust.cse.comp107x.register;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity implements View.OnClickListener {
    EditText username;
    EditText password;
    Button button_log;
    UserLocalStore userLocalStore;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        button_log = (Button) findViewById(R.id.button_log);

        button_log.setOnClickListener(this);
        userLocalStore = new UserLocalStore(this);

    }

    /**
     *
     */


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button_log:
User user=new User(null, null);
                userLocalStore.storeUserdata(user);
                    userLocalStore.setUserLoggedIn(true);

                break;


        }
    }
}