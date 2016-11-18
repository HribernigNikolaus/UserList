package at.fh.swengb.userlist.model;

import java.io.Serializable;

/**
 * Created by hribernn15 on 18.11.2016.
 */

public class User implements Serializable{



    private String firstName;
    private String lastName;
    private String address;
    private String phoneNumber;

    public User() {
    }

    public User(String firstName, String lastName, String address, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (!firstName.equals(user.firstName)) return false;
        if (!lastName.equals(user.lastName)) return false;
        return address.equals(user.address);

    }

    @Override
    public int hashCode() {
        int result = firstName.hashCode();
        result = 31 * result + lastName.hashCode();
        result = 31 * result + address.hashCode();
        return result;

    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer();
        sb.append(firstName).append(" ")
                .append(lastName)
                .append('\n')
                .append(address).append('\n')
                .append(phoneNumber);
        return sb.toString();
    }
}
