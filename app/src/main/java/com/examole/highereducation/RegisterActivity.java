package com.examole.highereducation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {
    EditText name, password, email, Mobile , mode;
    //private FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

       // getSupportActionBar().hide();

        name = findViewById(R.id.name);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        mode = findViewById(R.id.mode);




    }

    public void button(View view) {
        String userName = name.getText().toString();
        String userEmail = email.getText().toString();
        String userPassword = password.getText().toString();




        if (TextUtils.isEmpty(userName)) {
            Toast.makeText(this, "Enter Name", Toast.LENGTH_SHORT).show();
            return;

        }
        if (TextUtils.isEmpty(userEmail)) {
            Toast.makeText(this, "Enter Email address", Toast.LENGTH_SHORT).show();
            return;

        }


//        auth.createUserWithEmailAndPassword(userEmail,userPassword)
//                .addOnCompleteListener(RegistrationActivity.this,new OnCompleteListener<AuthResult>() {
//                    @Override
//                    public void onComplete(@NonNull Task<AuthResult> task) {
//
//                        if(task.isSuccessful()){
//                            Toast.makeText(RegistrationActivity.this, "Successful", Toast.LENGTH_SHORT).show();
//                            startActivity(new Intent(RegistrationActivity.this, MainActivity.class));
//                        }else{
//                            Toast.makeText(RegistrationActivity.this, "UnSuccessful"+task.getException(), Toast.LENGTH_SHORT).show();
//                        }
//
//
//
//                    }
//                });




    }
}