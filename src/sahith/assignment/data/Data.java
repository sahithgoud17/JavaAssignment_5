package sahith.assignment.data;

public class Data
{
    public int x;
    public char y;
    public void myFunction()
    {
        System.out.println("Value of x = " +x);
        System.out.println("Value of y = " +y);
    }
    public static void myFunction2()
    {
        int c;
        char d;
       // System.out.println("c=" + c);
       // System.out.println("d=" + d);
    }

//  the above method myFunction2 gives us an error because the local variables are not initialised ,
//  whereas the instance variable will be assigined with the default values with the default constructor.
}
