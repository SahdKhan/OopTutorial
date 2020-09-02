package com.sahdyk;

public class TextBox {
    public String text = ""; // Field (the conditions or features)
    // To prevent "null" exception, initialize the string to "";

    public void setText(String text){
        this.text = text; // this is used to reference the current object.
        // "this" is used when the name of the parameter is the same as the name of the field.
    }

    public void clear(){
        text = "";
    }
}
