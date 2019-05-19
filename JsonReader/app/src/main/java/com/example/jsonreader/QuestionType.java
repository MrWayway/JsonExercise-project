package com.example.jsonreader;

public class QuestionType {

    private String Head;
    private String Type;
    private String Tail;

    public String getHead() {
        return Head;
    }
    public void setHead(String head) {
        this.Head = head;
    }
    public String getType() {
        return Type;
    }
    public void setType(String type) {
        this.Type = type;
    }
    public String getTail() {
        return Tail;
    }
    public void setTail(String tail) {
        this.Tail = tail;
    }
    public void set(String head,String tail,String Type){
        this.Head=head;
        this.Tail=tail;
        this.Type=Type;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        if (this.Head != null) {
            sb.append("\n Head:" + this.Head.toString());
        }
        if (this.Type != null) {
            sb.append("\n Type:" + this.Type.toString());
        }
        if (this.Tail != null) {
            sb.append("\n Tail:" + this.Tail.toString());
        }
        return sb.toString();
    }

}

/**

    public String[] getWebsites() {
        return websites;
    }

    public void setWebsites(String[] websites) {
        this.websites = websites;
    }

    public Address1 getAddress() {
        return address;
    }

    public void setAddress(Address1 address) {
        this.address = address;
    }


}
*/