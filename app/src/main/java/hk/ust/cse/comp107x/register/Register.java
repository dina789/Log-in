package hk.ust.cse.comp107x.register;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Register extends AppCompatActivity implements View.OnClickListener {

    EditText edit_number, edit_Email, edit_password,name,edit_Age;
    Button register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        edit_number= (EditText) findViewById(  R.id.edit_number);
        edit_Email=(EditText) findViewById(  R.id.edit_Email);
       edit_password = (EditText) findViewById(  R.id.edit_password);
        name = (EditText) findViewById(  R.id.name);
        register = (Button) findViewById(  R.id.register);
        edit_Age =(EditText) findViewById(R.id.edit_Age);
        register.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.register:
                String username=name.getText().toString();
                String password=edit_password.getText().toString();
                String Email=edit_Email.getText().toString();
                int number=Integer.parseInt(edit_number.getText().toString());
                int Age=Integer.parseInt(edit_Age.getText().toString());

                User RegisteredData=new User(username, password);


        }
    }
}