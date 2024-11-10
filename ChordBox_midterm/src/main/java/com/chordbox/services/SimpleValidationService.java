package com.chordbox.services;

public class SimpleValidationService {
    public boolean validateEmail(String email) {
        return email != null && email.contains("@");
    }

    public boolean validatePrice(double price) {
        return price > 0;
    }
}
