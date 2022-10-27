public class Ash {

    private int xPosition;
    private int yPosition;

    /**
     * class that represents the player
     */
    public Ash() {
        this.xPosition = 0;
        this.yPosition = 0;
    }

    public void move (int[] direction) {
        this.xPosition += direction[1];
        this.yPosition += direction[0];
    }

    public int[] getPosition() {
        return new int[]{yPosition, xPosition};
    }
}
