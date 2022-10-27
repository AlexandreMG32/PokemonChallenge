import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

public class AshTest {

    private Ash ash;

    @BeforeEach
    public void init() {
        ash = new Ash();
    }

    @Test
    public void testFirstPosition() {
        assertArrayEquals(new int[]{0,0}, ash.getPosition());
    }

    @Test
    public void testMovement() {
        ash.move(new int[]{1, 0});
        assertArrayEquals(new int[]{1,0}, ash.getPosition());
    }
}