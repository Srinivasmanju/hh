public class Contact {
    private String firstName;
    private String lastName;
    private String phoneNumber;

    public Contact(String firstName, String lastName, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void validateFirstName() {
        if (this.firstName == null)
            throw new RuntimeException("First name Cannot br Null");
    }

    public void validateLastName() {
        if (this.lastName == null)
            throw new RuntimeException("Last name Cannot br Null");
    }

    public void validatePhoneNumber() {
        if(this.phoneNumber== null){
            throw new RuntimeException("Phone number should not be empty");
        }
        if (this.phoneNumber.length() != 11) {
            throw new RuntimeException("Phone number should be 10 digits long");
        }
        if (!this.phoneNumber.matches("\\d+")) {
            throw new RuntimeException("Phone Number Should Contain Only Digits");
        }
        if (!this.phoneNumber.startsWith("0")) {
            throw new RuntimeException("Phone Number Should Start with Zero");
        }
    }
}
