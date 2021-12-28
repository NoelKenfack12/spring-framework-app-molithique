package com.afhunt.blogspring.models;
import lombok.Data;

@Data
public class Tag {
    String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
