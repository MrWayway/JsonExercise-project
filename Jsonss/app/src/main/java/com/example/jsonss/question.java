package com.example.jsonss;

public class question {
    private String head;
    private String tail;
    private String type;
    public question() {

    }

    public question(String head, String tail,String type) {
        this.head = head;
        this.tail = tail;
        this.type = type;
    }

    public String getHead() {
        return head;
    }

    public String getTail() {
        return tail;
    }

    public String getType() {
        return type;
    }

    public void setHead(String head) {
        this.head = head;
    }
    public void setTail(String tail) {
        this.tail = tail;
    }
    public void setType(String type) {
        this.type = type;
    }


    @Override
    public String toString() {
        StringBuilder sb= new StringBuilder();
        sb.append("head: " + head + "\ntail: " + tail +"\ntype:" +type);
        return sb.toString();
    }
}
