package sahith.assignment.singleton;

public class Singleton
{
    public String s;
    public static Singleton init(String i)
    {
        Singleton obj = new Singleton();
        obj.s = i;
        return obj;
    }
    public void getString()
    {
        System.out.println(s);
    }

}
