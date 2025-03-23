package main.collection;

public class UserV1 {

    private int id; // REQUIRED
    private String name;// REQUIRED
    private String address;// OPTIONAL
    private String phone;// OPTIONAL

    public UserV1(int id, String name) {
        this.id = id;
        this.name = name;
        this.address = null;
        this.phone = null;
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

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
