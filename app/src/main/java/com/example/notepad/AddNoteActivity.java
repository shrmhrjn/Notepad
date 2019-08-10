package com.example.notepad;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddNoteActivity extends AppCompatActivity {
    EditText editText;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_note);

        editText= findViewById(R.id.editText);
        button= findViewById(R.id.button);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String noteValue = editText.getText().toString();
                    Toast.makeText(AddNoteActivity.this, "Your note was added successfully.", Toast.LENGTH_LONG).show();
                }
            });
    }
}
