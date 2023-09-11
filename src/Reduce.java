public class Reduce {
    public static void main(String[] args) {
        int numSteps = 0;
        int startNum = 100;

        while (startNum != 0){
            if (startNum % 2 == 0){
                startNum /= 2;

            }
            else{
                startNum -= 1;
            }
            numSteps++;
        }
        System.out.println("The number of steps taken was: " +  numSteps);
    }
}
