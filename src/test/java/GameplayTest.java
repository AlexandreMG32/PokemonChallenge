import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

public class GameplayTest {

    private Gameplay gameplay;
    private UserCommunicator communicatorMock;

    @BeforeEach
    public void init() {
        gameplay = new Gameplay();
        communicatorMock = Mockito.mock(UserCommunicator.class);
    }

    @Test
    public void testNOE() {
        Mockito.when(communicatorMock.getUserInput()).thenReturn("NOE");
        gameplay.setCommunicator(communicatorMock);
        int result = gameplay.play();
        assertEquals(3, result);
    }

    @Test
    public void testNSNSNS() {
        Mockito.when(communicatorMock.getUserInput()).thenReturn("NSNSNS");
        gameplay.setCommunicator(communicatorMock);
        int result = gameplay.play();
        assertEquals(2, result);
    }

    @Test
    public void testE() {
        Mockito.when(communicatorMock.getUserInput()).thenReturn("E");
        gameplay.setCommunicator(communicatorMock);
        int result = gameplay.play();
        assertEquals(2, result);
    }

    @Test
    public void testNESO() {
        Mockito.when(communicatorMock.getUserInput()).thenReturn("NESO");
        gameplay.setCommunicator(communicatorMock);
        int result = gameplay.play();
        assertEquals(4, result);
    }

    @Test
    public void testLargeDimension() {
        Mockito.when(communicatorMock.getUserInput()).thenReturn("NESOSNEENSO");
        gameplay.setCommunicator(communicatorMock);
        int result = gameplay.play();
        assertEquals(7, result);
    }





}