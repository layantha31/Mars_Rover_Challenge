import java.util.Scanner;
/*
ASSUMPTIONS:-
  1).I used the coordinates in the lower left corner of the plateau for calculations. The X and Y
     coordinates in the lower left corner are 0,0, making it easy to use for calculations.
  2).Each rover will be finished sequentially.
*/

public class RoverMain {
    //Count rover number
    static int roverNum = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        getPlateauDimensions();

        while (true) {
            //Increase rover number
            roverNum++;

            System.out.println(" ");
            System.out.println("---Rover " + roverNum + " position and location---");

            getRoverPosition();

            //check user want exit program or continue the program.
            System.out.print("If you want to exit please enter Q or press any key to continue.");
            String exitCommand = sc.nextLine();

            if (exitCommand.equals("q")||exitCommand.equals("Q")){
                break;
            }
        }
    }

    public static void getPlateauDimensions() {
        Scanner sc = new Scanner(System.in);

        PlateauDimensions plateauDimensions;

        boolean correct = true;

        while (correct) {

            //Get the upper-right coordinates input of the plateau
            System.out.print("Enter upper-right coordinates of the plateau (EX :- 0 0) :");
            String plateauDim = sc.nextLine();

            if (plateauDim.contains(" ")) {
                //Get the X and Y coordinates of the input splitting by space.
                String[] dimensionArray = plateauDim.split(" ");

                if (dimensionArray.length == 2) {
                    try {
                        plateauDimensions = new PlateauDimensions();
                        //Set plateau dimensions
                        int plateauDimX = Integer.parseInt(dimensionArray[0]);
                        int plateauDimY = Integer.parseInt(dimensionArray[1]);
                        plateauDimensions.setDimX(plateauDimX);
                        plateauDimensions.setDimY(plateauDimY);

                        correct = false;
                    } catch (Exception e) {
                        System.out.println("Please enter input with only integers.");
                    }
                } else {
                    System.out.println("Please enter valid plateau dimensions.");
                }
            } else {
                System.out.println("Please enter valid plateau dimensions.");
            }
        }
    }

    public static void getRoverPosition(){
        RoverPosition roverPosition;

        Scanner sc = new Scanner(System.in);

        boolean correct = true;

        while (correct) {
            //get the position input of the rover from a user
            System.out.println("Enter rover " + roverNum + " position (EX :- 0 0 N) :");
            String positionInput = sc.nextLine();

            if (positionInput.contains(" ")) {
                //Get the X and Y co-ordinates and the rover’s orientation of the input separately by dividing by space.
                String[] positionArray = positionInput.split(" ");

                if (positionArray.length == 3) {
                    try {
                        int xCoordinate = Integer.parseInt(positionArray[0]);
                        int yCoordinate = Integer.parseInt(positionArray[1]);
                        String orientation = positionArray[2].toUpperCase();

                        //check user enter correct orientation.
                        if (orientation.equals("N")||orientation.equals("E")||orientation.equals("S")||orientation.equals("W")) {
                            int facing = 0;
                            //Convert rover orientation to integers
                            switch (orientation) {
                                case "N":
                                    facing = 1;
                                    break;
                                case "E":
                                    facing = 3;
                                    break;
                                case "S":
                                    facing = 5;
                                    break;
                                case "W":
                                    facing = 7;
                                    break;
                            }

                            //Set rover X and Y co-ordinates and orientation
                            roverPosition = new RoverPosition(xCoordinate, yCoordinate, facing);

                            //Call getRoverInstruction method
                            getRoverInstructions(roverPosition);

                            //Call to printFinalPosition method
                            RoverHandler.printFinalPosition(roverPosition);

                            System.out.println(" ");

                            correct = false;
                        } else {
                            System.out.println("Please enter correct position.");
                        }
                    } catch (Exception e){
                        System.out.println("Please enter valid input.");
                    }
                } else {
                    System.out.println("Please enter correct position.");
                }
            } else {
                System.out.println("Please enter correct position.");
            }
        }
    }

    public static void getRoverInstructions(RoverPosition roverPosition){
        Scanner sc = new Scanner(System.in);
        boolean correctInstructions = true;

        while (correctInstructions) {
            try {
                //Get instructions from a user to control a rover
                System.out.println("Enter rover " + roverNum + " instructions (EX :- MMRMMRMRRM) :");
                String instructionsInput = sc.nextLine().toUpperCase();

                //Call to process method
                RoverHandler.process(roverPosition, instructionsInput);

                correctInstructions = false;
            } catch (Exception e){
                System.out.println("Please enter correct instructions.");
            }
        }
    }
}