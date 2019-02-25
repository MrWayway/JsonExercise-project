package com.example.jsonss;

public class Company {
    private int id;
    private String name;
    private String[] websites;
    private question question;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getWebsites() {
        return websites;
    }

    public void setWebsites(String[] websites) {
        this.websites = websites;
    }

    public question getquestion() {
        return question;
    }

    public void setquestion(question question) {
        this.question = question;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("\n id:" + this.id);
        sb.append("\n name:" + this.name);
        if (this.websites != null) {
            sb.append("\n website: ");
            for (String website : this.websites) {
                sb.append(website + ", ");
            }
        }
        if (this.question != null) {
            sb.append("\n question:" + this.question.toString());
        }
        return sb.toString();
    }

}
