import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class ContactManagerTest {
    private static ContactManager contactManager;
    @BeforeAll
    public static void setupAll(){
        System.out.println("Should Print Before All Tests");

    }

    @BeforeEach
    public void setUp(){
        System.out.println("Instating Contact Manager");
        contactManager= new ContactManager();

    }
  @Test
  @DisplayName("Should Create Contact")
  public void shouldCreateContact(){
         ContactManager contactManager = new ContactManager();
         contactManager.addConatact("srinivas","M","09535641238");
    Assertions.assertFalse(contactManager.getAllContacts().isEmpty());
    Assertions.assertEquals(1,contactManager.getAllContacts().size());

  }
@Test
  @DisplayName("Should not create Contact When First name is null")
public void shouldThrowErrorWhenFirstNameIsNull(){
    ContactManager contactManager= new ContactManager();
    Assertions.assertThrows(RuntimeException.class,()-> {
      contactManager.addConatact(null, "m", "08123812619");
    });


}
    @Test
    @DisplayName("Should not create Contact When Last name is null")
    public void shouldThrowErrorWhenLastNameIsNull(){
        ContactManager contactManager= new ContactManager();
        Assertions.assertThrows(RuntimeException.class,()-> {
            contactManager.addConatact("srini", null, "08123812619");
        });


    }
    @Test
    @DisplayName("Should not create Contact when PhoneNumber is null")
    public void shouldThrowErrorWhenPhoneNumberIsNull(){
        ContactManager contactManager= new ContactManager();
        Assertions.assertThrows(RuntimeException.class,()-> {
            contactManager.addConatact("srini", "m", null);
        });


    }
    @AfterEach
    public void finish(){
        System.out.println("should execute after each test");
    }

    @AfterAll
    public static void finishAll(){
        System.out.println("should execute at the end of the Test");
    }
}