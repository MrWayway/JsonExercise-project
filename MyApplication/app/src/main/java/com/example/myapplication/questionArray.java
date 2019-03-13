package com.example.myapplication;

import android.content.Context;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class questionArray {
    public question[] readFile(Context content) throws IOException, JSONException
    {
        String tempt=readText(content, R.raw.my);
        JSONObject arr= new JSONObject(tempt);
        JSONArray listQuestion=arr.getJSONArray("question");
        question a[] =new question[listQuestion.length()];
        int count;
        for( count=0;count<a.length;++count);
        {
            JSONObject cur = listQuestion[count];
        }

        return a;
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
