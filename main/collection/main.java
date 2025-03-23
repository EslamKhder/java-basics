package main.collection;

public class main {
    public static void main(String[] args) {

        UserV1 userV1 = new UserV1(1, "ahmed");
        userV1.setAddress("add");
        userV1.setAddress("phone");


        User user = new User.UserBuilder(1, "ahmed")
                            .address("cairo")
                            .phone("0111")
                            .build();


        User user1 = new User.UserBuilder(1, "ahmed")
                .build();


        User user2 = new User.UserBuilder(1, "ahmed")
                .address("cairo")
                .build();
    }
}
