import org.junit.jupiter.api.*;

public class Tests {
    @Test
    void exampleTest () {
        System.out.println("Hello");
    }

    @BeforeAll
    static void beforeAllTest() {
        System.out.println("Before all is executed before all tests");
    }

    @BeforeEach
    void setup() {
        System.out.println("Before each is executed before each test");
    }

    @Test
    @Disabled
    void disabledTest() {
        System.out.println("Disabled test is disabled");
    }

    @AfterAll
    static void afterAllTest() {
        System.out.println("After all is executed after all other tests");
    }

    @DisplayName("DISPLAY THIS NAME")
    void DisplayNameTest() {
        System.out.println("Display name test will display a name of the test");
    }

}
