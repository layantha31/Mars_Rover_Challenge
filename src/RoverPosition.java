public class RoverPosition {
    private int roverX;
    private int roverY;
    private int startFacing;

    public RoverPosition(int roverX, int roverY, int startFacing) {
        this.roverX = roverX;
        this.roverY = roverY;
        this.startFacing = startFacing;
    }

    public int getRoverX() {
        return roverX;
    }

    public void setRoverX(int roverX) {
        this.roverX = roverX;
    }

    public int getRoverY() {
        return roverY;
    }

    public void setRoverY(int roverY) {
        this.roverY = roverY;
    }

    public int getStartFacing() {
        return startFacing;
    }

    public void setStartFacing(int startFacing) {
        this.startFacing = startFacing;
    }
}
