package com.example.myapplication;

import android.content.Context;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class question {
    public
    String head,tail,type;
    public question readfile(Context content ) throws IOException, JSONException
    {
        question ret = new question();
        String a = readText(content,R.raw.my);
        JSONObject tempt = new JSONObject(a);
        ret.head = tempt.getString("head");
        ret.tail = tempt.getString("tail");
        ret.type = tempt.getString("type");

        return ret;
    }
    public String readText(Context context, int resId) throws IOException {
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
    public String toString()
    {
        StringBuilder ret= new StringBuilder();
        ret.append("Head:");
        ret.append(this.head);
        ret.append("\nTail:");
        ret.append(this.tail);
        ret.append("\nType:");
        ret.append(this.type);
        return ret.toString();
    }
}
