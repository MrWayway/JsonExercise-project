package com.example.jsonss;

import android.content.Context;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ReadQuestion {
    public static String readQuestionJSONFile(Context context) throws IOException, JSONException {
        String jsonText = readText(context, R.raw.question);
        JSONObject jsonRoot = new JSONObject(jsonText);
        JSONArray jsonArray = jsonRoot.getJSONArray("question");
        String[] quest = new String[jsonArray.length()];
        question q = new question();
        String ret="";
        for(int i=0;i < jsonArray.length();i++) {
            quest[i] = jsonArray.getString(i);
            JSONObject tempt = new JSONObject(quest[i]);
            String head = tempt.getString("head");
            String tail = tempt.getString("tail");
            String type = tempt.getString("type");

            q.setHead(head);
            q.setTail(tail);
            q.setType(type);
        }
        return "haha";
    }




    private static String readText(Context context, int resId) throws IOException {
        InputStream is = context.getResources().openRawResource(resId);
        BufferedReader br= new BufferedReader(new InputStreamReader(is));
        StringBuilder sb= new StringBuilder();
        String s= null;
        while((  s = br.readLine())!=null) {
            sb.append(s);
            sb.append("\n");
        }
        return sb.toString();

    }

}


