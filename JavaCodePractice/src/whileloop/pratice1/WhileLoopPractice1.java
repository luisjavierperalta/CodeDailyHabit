package whileloop.pratice1;

/*
Java program for practice simple "While Loop" syntax & dynamics
 */

/*
ALGORITHM CHECKLIST:
1 To declare java's program main method
2 To declare & init loop control variable (index)
3 To declare the while loop (count <= 5)
4 Next, while body: To print (count)
5 Next, while body: To increment count by +1 (count++) to update loop control variable (Goal: convert condition to false)
Loop Terminate!
 */
public class WhileLoopPractice1 {

    //1 Java's program main method
    public static void main(String[] args) {

        //2 Init loop control variable
        int count = 1;

        //3 Declare & check while loop condition
        while (count <= 5) {
            //While body
            //4 To print current count
            System.out.println(count); //OUTPUT: 1, 2, 3, 4, 5,
            //5 To increment count +1
            count++;
        }
    }
}
