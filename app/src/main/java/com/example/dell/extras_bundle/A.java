package com.example.dell.extras_bundle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText edtTittle , edtDescription;
    private Button btnSend;
    public static  final String TITTLE = "TITTLE";
    public static  final String DESCRIPTION = "DESCRIPTION";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a);
        edtTittle = (EditText)findViewById(R.id.edt_tittle);
        edtDescription = (EditText)findViewById(R.id.edt_description);
        btnSend = (Button)findViewById(R.id.btn_send);

        btnSend.setOnClickListener(new View.OnClickListener() {
            public String description;
            public String tittle;

            @Override
            public void onClick(View v) {
                String Title = edtTittle.getText().toString();
                String Description =  edtDescription.getText().toString();
                byExtra(tittle ,description);

            }
        });
    }
    public void byExtra(String tittle , String description){

        Intent intent =  new Intent(MainActivity.this,B_Activity.class);
        intent.putExtra(TITTLE,tittle);
        intent.putExtra(DESCRIPTION,description);
        startActivity(intent);

    }
}
