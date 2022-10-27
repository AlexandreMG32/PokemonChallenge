import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

public class UserCommunicatorTest {

    private UserCommunicator communicator;

    @BeforeEach
    public void init() {
        communicator = new UserCommunicator();
    }

    @Test
    public void testWrongInputs() {
        String input = "NAE";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        assertFalse(communicator.checkPattern());
    }

    @Test
    public void testWrongInputs2() {
        String input = "NEOSAO";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        assertFalse(communicator.checkPattern());
    }

    @Test
    public void testEmptyInput() {
        String input = "";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        assertFalse(communicator.checkPattern());
    }

    @Test
    public void testNumbers() {
        String input = "12312";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        assertFalse(communicator.checkPattern());
    }

}