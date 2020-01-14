public class NestingLoops {
      public static void main(String[] args) {
            //this is #1 'CN'
            //Inner loop changes faster, is fully completed every time outer loop runs once
            //When loops are switched the number and letters switch places in output
            for(int n = 1; n <= 3; n++) {
                   for(char c = 'A'; c <= 'E'; c++) {
                        System.out.println(c + " " + n);
                  }
            }
            //this is #2 'AB'
            for(int a = 1; a <= 3; a++) {
                  for(int b = 1; b <= 3; b++) {
                        //Changing this to println prints every pair in a new line
                        System.out.print("(" + a + "," + b + ") ");
                  }
                  // Line of code here
                  //int b is outside of scope since it is only part of inner loop
                  //This print statement runs every time inner loop 'set' is finished
                  //Gives every 'set' a new line
                  System.out.println("(" + a + ") ");
            }

            System.out.println("\n");
      }
}
