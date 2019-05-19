package com.example.jsonreader;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {
    TextView a;
    private EditText outputText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = (Button) findViewById(R.id.button);
        a=(TextView) findViewById (R.id.editText);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                runExample(v);
            }
        });

    }
    public void runExample(View view)  {
        try {
            // Đọc file: res/raw/company.json và trả về đối tượng Company.
            QuestionTypeList questiontype = new QuestionTypeList (ReadJSONExample.readQuestionJSONFile (this));
            a.setText(questiontype.toString());

        } catch(Exception e)  {
            outputText.setText(e.getMessage());
            e.printStackTrace();
        }
    }
}
