import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        if(x%y==0)
        {
            System.out.println("Multiple");
        }
        else
        {
            System.out.println("Not Multiple");
        }
    }
}