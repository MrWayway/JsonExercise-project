package com.example.jsonreader;

import android.content.Context;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


public class ReadJSONExample {

    // Đọc file company.json và chuyển thành đối tượng java.
    public static QuestionType[] readQuestionJSONFile(Context context) throws IOException, JSONException {

        // Đọc nội dung text của file Question
        String jsonText = readText(context, R.raw.question);

        // Đối tượng JSONObject gốc mô tả toàn bộ tài liệu JSON.
        JSONObject jsonRoot = new JSONObject(jsonText);

        JSONArray jsonArray = jsonRoot.getJSONArray("questions");

        String[] questionTypeList = new String[jsonArray.length()];

        for(int i=0;i < jsonArray.length();i++) {
            questionTypeList[i] = jsonArray.getString(i);
        }
        QuestionType[] ret = new QuestionType[jsonArray.length()];
        JSONObject tempt;
        for(int i=0;i<jsonArray.length ();i++){
        tempt = new JSONObject (questionTypeList[i]);

        String head= tempt.getString("head");
        String tail= tempt.getString("tail");
        String type= tempt.getString("type");

        ret[i] = new QuestionType ();
        ret[i].set(head,tail,type);}



        return ret;
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