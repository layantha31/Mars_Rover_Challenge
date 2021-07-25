import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoverPositionTest {

    @Test
    void getRoverX() {
        RoverPosition roverPosition = new RoverPosition(1, 2, 3);
        roverPosition.getRoverX();
        assertEquals(1,roverPosition.getRoverX());

    }

    @Test
    void setRoverX() {
        RoverPosition roverPosition = new RoverPosition(1, 2, 3);
        roverPosition.setRoverX(4);
        assertEquals(4,roverPosition.getRoverX());
    }

    @Test
    void getRoverY() {
        RoverPosition roverPosition = new RoverPosition(1, 2, 3);
        roverPosition.getRoverY();
        assertEquals(2,roverPosition.getRoverY());
    }

    @Test
    void setRoverY() {
        RoverPosition roverPosition = new RoverPosition(1, 2, 3);
        roverPosition.setRoverY(7);
        assertEquals(7,roverPosition.getRoverY());
    }

    @Test
    void getStartFacing() {
        RoverPosition roverPosition = new RoverPosition(1, 2, 3);
        roverPosition.getStartFacing();
        assertEquals(3,roverPosition.getStartFacing());
    }

    @Test
    void setStartFacing() {
        RoverPosition roverPosition = new RoverPosition(1, 2, 3);
        roverPosition.setStartFacing(5);
        assertEquals(5,roverPosition.getStartFacing());
    }
}