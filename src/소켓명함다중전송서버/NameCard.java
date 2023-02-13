package 소켓명함다중전송서버;

import java.io.Serializable;

public class NameCard implements Serializable {
    String name;
    String email;
    String phoneNumber;
    String address;

    public NameCard(String name, String phoneNumber, String email, String address) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }
}
