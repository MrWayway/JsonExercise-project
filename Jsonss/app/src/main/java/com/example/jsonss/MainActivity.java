package com.example.jsonss;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import com.example.jsonss.Company;
import com.example.jsonss.ReadJson;

public class MainActivity extends AppCompatActivity {
    private EditText outputText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        outputText = (EditText)this.findViewById(R.id.editText);
    }
    public void runExample(View view)  {
        try {

            Company company = ReadJson.readCompanyJSONFile(this);

            outputText.setText(company.toString());
        } catch(Exception e)  {
            outputText.setText(e.getMessage());
            e.printStackTrace();
        }
    }
}
