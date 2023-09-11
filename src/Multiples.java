public class Multiples {
    public static void main(String[] args) {
        int numInstances = 0;
        int numCurr = 1;

        while(numCurr < 1000){
            boolean divisibleby3 = numCurr % 3 == 0;
            boolean divisibleby5 = numCurr % 5 == 0;

            if (divisibleby3 || divisibleby5){
                numInstances++;
            }
            numCurr++;
        }
        System.out.println("The number of instances is: " + numInstances);
    }
}
