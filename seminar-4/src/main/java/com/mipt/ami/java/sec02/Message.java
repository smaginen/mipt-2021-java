package com.mipt.ami.java.sec02;

import java.util.ArrayList;

public final class Message {
    private String sender;
    private ArrayList<String> recipients;
    private String text;
    
    
    
    public Message(String sender, String text) {
        this.sender = sender;
        this.text = text;
        recipients = new ArrayList<>();
    }

    public void addRecipient(String recipient) { 
        recipients.add(recipient);
    };
    
    public Message clone() {
        try {
            Message cloned = (Message) super.clone();
            @SuppressWarnings("unchecked") ArrayList<String> clonedRecipients 
                = (ArrayList<String>) recipients.clone();
            cloned.recipients = clonedRecipients; 
            return cloned;
        } catch (CloneNotSupportedException ex) {
            return null;
        }
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}