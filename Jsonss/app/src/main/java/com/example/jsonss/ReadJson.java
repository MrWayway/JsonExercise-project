package com.example.jsonss;
import android.content.Context;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
public class ReadJson{
    // Read the company.json file and convert it to a java object.
    public static Company readCompanyJSONFile(Context context) throws IOException,JSONException {

        // Read content of company.json
        String jsonText = readText(context, R.raw.my);


        JSONObject jsonRoot = new JSONObject(jsonText);


        int id= jsonRoot.getInt("id");
        String name = jsonRoot.getString("name");

        JSONArray jsonArray = jsonRoot.getJSONArray("websites");
        String[] websites = new String[jsonArray.length()];

        for(int i=0;i < jsonArray.length();i++) {
            websites[i] = jsonArray.getString(i);
        }

        JSONObject jsonquestion = jsonRoot.getJSONObject("question");
        String street = jsonquestion.getString("street");
        String city = jsonquestion.getString("city");
        question question= new question(street, city,"haha");

        Company company = new Company();
        company.setId(id);
        company.setName(name);
        company.setquestion(question);
        company.setWebsites(websites);
        return company;
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
