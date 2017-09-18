package hk.ust.cse.comp107x.register;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    EditText username,password,Email;

    Button Log_in,Sign_up;
    UserLocalStore userLocalStore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username=(EditText) findViewById(R.id. username);
        password=(EditText) findViewById(R.id. password);

        Email=(EditText) findViewById(R.id.  Email);
        Log_in =(Button) findViewById(R.id.   Log_in);
        Sign_up=(Button) findViewById(R.id. Sign_up );
        Sign_up.setOnClickListener(this);
        Log_in.setOnClickListener(this);
        userLocalStore = new UserLocalStore(this);
    }
    protected void onStart(){
        super.onStart();
        if(authentication()==true){
            dispalysUserDetails();
            //display el user details
        }

    }//return true if the user is logged in.
private boolean authentication(){
    return userLocalStore.getUserLoggedIn();
}
private void dispalysUserDetails(){
    User user=userLocalStore.getLoggedInUser();
    username.setText(user.username);
    Email.setText(user. Email);
    password.setText(user.  password);
}

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.Sign_up:
                startActivity(new Intent(this, Register.class));
                break;

            case R.id.Log_in:
                startActivity(new Intent(this, Login.class));
                break;
        }
}}
