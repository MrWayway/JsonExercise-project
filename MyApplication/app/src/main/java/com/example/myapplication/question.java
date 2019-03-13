package com.example.myapplication;
public class question {
    public
    String head,tail,type;
    public void set(String x, String y, String z)
    {

        head = x;
        tail = y;
        type = z;

        return ;
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
