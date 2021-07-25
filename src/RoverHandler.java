public class RoverHandler {
    public static void process(RoverPosition roverPosition, String instructions){
        //Create an array to store the instructions needed for a control rover
        char[] processArray = instructions.toCharArray();

        //Check instructions and control a rover
        for (char instruction : processArray) {
            if (instruction == ('L')) {
                roverTurnLeft(roverPosition);
            } else if (instruction == ('R')) {
                roverTurnRight(roverPosition);
            } else if (instruction == ('M')) {
                roverMoveForward(roverPosition);
            } else {
                //Exception handling
                throw new IllegalArgumentException("Please enter correct instructions.");
            }
        }
    }

    public static void roverTurnLeft(RoverPosition roverPosition){
        if (roverPosition.getStartFacing() == 1) {
            roverPosition.setStartFacing(7);
        } else {
            roverPosition.setStartFacing(roverPosition.getStartFacing() - 2);
        }
    }

    public static void roverTurnRight(RoverPosition roverPosition){
        if (roverPosition.getStartFacing() == 7) {
            roverPosition.setStartFacing(1);
        } else {
            roverPosition.setStartFacing(roverPosition.getStartFacing() + 2);
        }
    }

    public static void roverMoveForward(RoverPosition roverPosition){
        if (roverPosition.getStartFacing() == Constant.N) {
            roverPosition.setRoverY(roverPosition.getRoverY() + 1);
        } else if (roverPosition.getStartFacing() == Constant.E) {
            roverPosition.setRoverX(roverPosition.getRoverX() + 1);
        } else if (roverPosition.getStartFacing() == Constant.S) {
            roverPosition.setRoverY(roverPosition.getRoverY() - 1);
        } else if (roverPosition.getStartFacing() == Constant.W) {
            roverPosition.setRoverX(roverPosition.getRoverX() - 1);
        }
    }

    public static void printFinalPosition(RoverPosition roverPosition){
        char finalFace = 1;
        if (roverPosition.getStartFacing() == 1) {
            finalFace = 'N';
        } else if (roverPosition.getStartFacing() == 3) {
            finalFace = 'E';
        } else if (roverPosition.getStartFacing() == 5) {
            finalFace = 'S';
        } else if (roverPosition.getStartFacing() == 7) {
            finalFace = 'W';
        }
        System.out.println("The final position of the rover " + RoverMain.roverNum + " : " + roverPosition.getRoverX() + " " + roverPosition.getRoverY() + " " + finalFace);
    }
}
