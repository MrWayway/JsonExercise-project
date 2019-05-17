package com.example.jsonreader;

import android.content.Context;

import com.example.jsonreader.Address1;
import com.example.jsonreader.Company;
import com.example.jsonreader.R;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


public class ReadJSONExample {

    // Đọc file company.json và chuyển thành đối tượng java.
    public static QuestionType readCompanyJSONFile(Context context) throws IOException, JSONException {

        // Đọc nội dung text của file Question
        String jsonText = readText(context, R.raw.question);

        // Đối tượng JSONObject gốc mô tả toàn bộ tài liệu JSON.
        JSONObject jsonRoot = new JSONObject(jsonText);

        JSONArray jsonArray = jsonRoot.getJSONArray("questions");

        String[] questionTypeList = new String[jsonArray.length()];

        for(int i=0;i < jsonArray.length();i++) {
            questionTypeList[i] = jsonArray.getString(i);
        }

        JSONObject first = new JSONObject (questionTypeList[0]);

        String head= first.getString("head");
        String tail= first.getString("tail");
        String type= first.getString("type");

        QuestionType questiontype = new QuestionType ();
        questiontype.setHead(head);
        questiontype.setType(type);
        questiontype.setTail(tail);



        return questiontype;
    }


    // Đọc nội dung text của một file nguồn.
    private static String readText(Context context, int resId) throws IOException {
        InputStream is = context.getResources().openRawResource(resId);
        BufferedReader br= new BufferedReader(new InputStreamReader (is));
        StringBuilder sb= new StringBuilder();
        String s= null;
        while((  s = br.readLine())!=null) {
            sb.append(s);
            sb.append("\n");
        }
        return sb.toString();
    }

}