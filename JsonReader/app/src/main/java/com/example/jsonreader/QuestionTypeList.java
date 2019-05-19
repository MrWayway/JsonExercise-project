package com.example.jsonreader;

import java.util.Arrays;

public class QuestionTypeList {
    QuestionType[] List;

    QuestionTypeList(QuestionType[] a) {
        List = Arrays.copyOf (a, a.length);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < List.length; ++i) {
            if (List[i] != null) {
                sb.append("\n" + this.List[i].toString());
        }
        }
            return sb.toString ();

    }
}
