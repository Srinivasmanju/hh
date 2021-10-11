import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class ContactTest {
    Contact obj;

    @BeforeEach
    public void setup(){
        obj = new Contact();
    }
    @Test
    @DisplayName("Firstname is not storing")
    @RepeatedTest(5)
    void setFirstName() {
        obj.setFirstName("hemanth");
        Assertions.assertFalse(obj.getFirstName().isEmpty());
    }

    //condition
    @Test
    void setLastName() {
        obj.setLastName("hemanth");
        Assertions.assertFalse(obj.getLastName().isEmpty());
    }

    @Test
    void setPhoneNumber() {
        obj.setPhoneNumber("hemanth");
        Assertions.assertFalse(obj.getPhoneNumber().isEmpty());
    }


}





