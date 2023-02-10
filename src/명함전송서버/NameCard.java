package 명함전송서버;

import java.io.Serializable;

public class NameCard implements Serializable {
    String name;
    String eMail;
    String phoneNumber;
    String address;

    public NameCard(String name,String phoneNumber, String eMail,  String address) {
        this.name = name;
        this.eMail = eMail;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String geteMail() {
        return eMail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }
}
