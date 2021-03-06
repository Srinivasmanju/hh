import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ContactManager {

    Map<String,Contact> contactList = new ConcurrentHashMap<String,Contact>();
     public void addConatact(String firstName, String lastName, String phoneNumber){
         Contact contact = new Contact(firstName,lastName,phoneNumber);
     validateContact(contact);
     checkIfContactAlreadyExist(contact);
     contactList.put(generatekey(contact), contact);
     }
    public Collection<Contact> getAllContacts(){
        return contactList.values();
    }
    private String generatekey(Contact contact) {
         return String.format("%s-%s",contact.getFirstName(), contact.getLastName());
    }
    private void checkIfContactAlreadyExist(Contact contact) {
    if (contactList.containsKey(generatekey(contact))){
        throw new RuntimeException("Contact Already Exists");
    }
     }


private void validateContact(Contact contact){
         contact.validateFirstName();
         contact.validateLastName();
         contact.validatePhoneNumber();
}

}


