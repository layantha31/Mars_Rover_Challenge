import static org.junit.jupiter.api.Assertions.*;

class PlateauDimensionsTest {

    @org.junit.jupiter.api.Test
    void setDimX() {
        PlateauDimensions  plateauDimensions = new PlateauDimensions();
        plateauDimensions.setDimX(3);
        assertEquals(3 , plateauDimensions.getDimX());

    }

    @org.junit.jupiter.api.Test
    void setDimY() {
        PlateauDimensions  plateauDimensions = new PlateauDimensions();
        plateauDimensions.setDimY(2);
        assertEquals(2 , plateauDimensions.getDimY());
    }

    @org.junit.jupiter.api.Test
    void getDimX() {
        PlateauDimensions  plateauDimensions = new PlateauDimensions();
        plateauDimensions.setDimX(5);
        plateauDimensions.getDimX();
        assertEquals(5 , plateauDimensions.getDimX());

    }

    @org.junit.jupiter.api.Test
    void getDimY() {
        PlateauDimensions  plateauDimensions = new PlateauDimensions();
        plateauDimensions.setDimY(3);
        plateauDimensions.getDimY();
        assertEquals(3 , plateauDimensions.getDimY());
    }
}