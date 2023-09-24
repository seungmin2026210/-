using System;

public class Example
{
    public static void Main()
    {
        String s;

        Console.Clear();
        
        s = Console.ReadLine();
        
        char[] tmp = s.ToCharArray();
        
        for(int i=0; i<tmp.Length; i++){
            Console.WriteLine(tmp[i]);
        }


    }
}