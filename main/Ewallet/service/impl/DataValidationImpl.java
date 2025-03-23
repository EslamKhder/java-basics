package main.Ewallet.service.impl;

import main.Ewallet.service.DataValidation;

public class DataValidationImpl implements DataValidation {
    @Override
    public boolean validateUserName(String userName) {
        // TODO check if username size >= 3 and first char is upper return true
        // else return false
        return false;
    }

    @Override
    public boolean validatePassword(String password) {
        // TODO check if password size >= 6 and must contain number , char upper, char lower and special char return true
        return false;
    }
}
