package main.collection;

public class User {

    private int id; // REQUIRED
    private String name;// REQUIRED
    private String address;// OPTIONAL
    private String phone;// OPTIONAL



    private User(UserBuilder userBuilder) {
        this.id = userBuilder.id;
        this.name = userBuilder.name;
        this.address = userBuilder.address;
        this.phone = userBuilder.phone;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public static class UserBuilder {
        private int id; // REQUIRED
        private String name;// REQUIRED
        private String address;// OPTIONAL
        private String phone;// OPTIONAL

        public UserBuilder(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public UserBuilder address(String address) {
            this.address = address;
            return this;
        }

        public UserBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public User build(){
            return new User(this);
        }

    }

}
