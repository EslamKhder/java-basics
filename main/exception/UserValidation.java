package main.exception;

public class UserValidation {

    public void validateUserName(String userName){

        if (userName.length() < 5) {
            throw new RuntimeException("invalid name size pls enter size greater thant 5");
        }
    }
}
