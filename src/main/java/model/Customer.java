package model;

import java.util.Calendar;

public class Customer {
    private int id;
    private String lastname;
    private String firstname;
    private Calendar dateOfBirth;
    private String licenseNumber;

    public Customer(int id, String lastname, String firstname, Calendar dateOfBirth, String licenseNumber) {
        this.id = id;
        this.lastname = lastname;
        this.firstname = firstname;
        this.dateOfBirth = dateOfBirth;
        this.licenseNumber = licenseNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public Calendar getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Calendar dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id : " + id +
                ", lastname : " + lastname + '\'' +
                ", firstname : " + firstname + '\'' +
                ", dateOfBirth : " + dateOfBirth +
                ", licenseNumber : '" + licenseNumber + '\'' +
                '}';
    }
}
