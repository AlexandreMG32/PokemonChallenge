import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static constants.ConstantsGameplay.*;
import static org.junit.jupiter.api.Assertions.*;

public class WorldTest {

    private World world;

    @BeforeEach
    public void init() {
        world = new World();
    }

    @Test
    public void worldStartSize() {
        ArrayList<int[]> visited = world.getCellsVisited();
        assertEquals(1, visited.size());

    }

    @Test
    public void worldStartCell() {
        ArrayList<int[]> visited = world.getCellsVisited();
        assertArrayEquals(new int[]{0, 0}, visited.get(0));
    }

    @Test
    public void worldAfterMoveNorth() {
        world.movePlayer(MOVE_NORTH);
        ArrayList<int[]> visited = world.getCellsVisited();
        assertEquals(2, visited.size());
        assertArrayEquals(new int[]{1, 0}, visited.get(1));
    }

    @Test
    public void worldAfterMoveSouth() {
        world.movePlayer(MOVE_SOUTH);
        ArrayList<int[]> visited = world.getCellsVisited();
        assertEquals(2, visited.size());
        assertArrayEquals(new int[]{-1, 0}, visited.get(1));
    }

    @Test
    public void worldAfterMoveEast() {
        world.movePlayer(MOVE_EAST);
        ArrayList<int[]> visited = world.getCellsVisited();
        assertEquals(2, visited.size());
        assertArrayEquals(new int[]{0, 1}, visited.get(1));
    }

    @Test
    public void worldAfterMoveWest() {
        world.movePlayer(MOVE_WEST);
        ArrayList<int[]> visited = world.getCellsVisited();
        assertEquals(2, visited.size());
        assertArrayEquals(new int[]{0, -1}, visited.get(1));
    }


}