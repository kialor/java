public class Main {
    public static void main(String[] args){
        int[] numbers = {1,2,3,4,5};
        //int[] numbers = null;

        double total = 0;

        for(int i=0; i < numbers.length; i++){  //for(int i=0; i<= numbers.length; i=++){
            //total+=i;
            total+=numbers[i];
            //System.out.println("for loop: " +total);
        }

        double avg = total/numbers.length;



        System.out.println("avg = " +avg);

        /*
        3) Code initially returned 2.0, instead of 3.0;
        The problem I was running into was that I had it originally as total+=i;
        I needed to have total+=numbers[i] to properly add the elements in the
        number array compared to before when it was adding the array indices which is incorrect.
        I used System.out.println() to show me the value of each iteration.

        4) Line 8 introduces a null pointer exception when I set int[] numbers=null
        in line 4. To debug I set a breakpoint at line 4 and run to debug. I use
        a step over to the next line which shows me that numbers = null and numbers.length
        = java.lang.NullPointerException.

        Line 8 introduces an array index out of bounds exception when the condition
        is set to i <= numbers.length instead of i < numbers.length. To debug this, I set a breakpoint at
        line 6, and step over to the next line of code. I then step into the
        for loop and continue using step over until I receive the java.lang.IndexOutOfBoundsException,
        which gives me a message of "invalid array range 5 to 5". When I step into
        the for loop and watch what happens during each step, I am able to see that it
        tries to iterate once more when there is no element present.

        6) For the logic error, I can return back to my code in step 3. I accidentally
        used i instead of numbers[i] in line 9 to try to get the sum of all the numbers in the array.
        I use the debugger to find the problem by stepping into the for loop. When I go through the loop
        the first time, I can see that the initial value is 0, and not 1 like what I am expecting. When
        I continue the loop, it is hard to tell since our numbers in the array are similar to the index,
        but I can realize by the starting value that it is adding the index value itself and not the element
        at the index.
         */

    }
}
