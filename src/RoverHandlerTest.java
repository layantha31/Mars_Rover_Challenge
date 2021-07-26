import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoverHandlerTest {

    @Test
    void process() {
        RoverPosition roverPosition = new RoverPosition(1,2,1);
        RoverHandler roverHandler = new RoverHandler();
        roverHandler.process(roverPosition,"LMLMLMLMM");

        assertEquals(1,roverPosition.getRoverX());
        assertEquals(3,roverPosition.getRoverY());
        assertEquals(1,roverPosition.getStartFacing());
    }
}