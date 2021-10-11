public class Contact {
    String[] firstName=new String[5];
    String[] lastName=new String[5];
    String[] phoneNumber=new String[5];
    static int i=0;
    public String getFirstName() {
        return firstName[0];
    }

    public void setFirstName(String firstName) {
        this.firstName[0] = firstName;
        i=i+1;
    }

    public String getLastName() {
        return lastName[0];
    }

    public void setLastName(String lastName) {
        this.lastName[0] = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber[0];
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber[0] = phoneNumber;
    }
}
