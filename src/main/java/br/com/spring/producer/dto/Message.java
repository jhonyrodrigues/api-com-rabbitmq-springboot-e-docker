package br.com.spring.producer.dto;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Message {

    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}