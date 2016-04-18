import org.junit.Test;

        import java.io.ByteArrayOutputStream;
        import java.io.PrintStream;

        import static junit.framework.TestCase.assertEquals;

public class ChitterTest {
    private Chitter chitter = new Chitter();
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();


    @Test
    public void printOptions() throws Exception {
        System.setOut(new PrintStream(outContent));
        String menu = "1. Create User\n2. Post a message\n3. Follow\n4. Show messages\n5. Change User\n6. Show followed timeline\n7. Exit \n\nPlease enter your option: ";
        chitter.printOptions();
        assertEquals(menu, outContent.toString());
    }
}