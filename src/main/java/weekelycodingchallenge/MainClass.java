package weekelycodingchallenge;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args){
        int n;
        Scanner myObj = new Scanner(System.in);// Create a Scanner object
        System.out.println("Enter n number of triples");
         String nn =  myObj.nextLine();
         n = Integer.parseInt(nn);
        List<String> numbers = new ArrayList<>();
        for(int i = 1; i<=n;i++){
            System.out.println("Enter "+i+" Set Number separated by space");
            String firstSet = myObj.nextLine();
            numbers.add(firstSet);
        }
        for (String num:numbers
             ) {
            String[] splitted = num.split(" ");
            int[] splittedNum = new int[splitted.length];
            for(int i = 0;i < splitted.length;i++)
            {
                splittedNum[i] = Integer.parseInt(splitted[i]);
            }
            int finalResult = getSecondLargest(splittedNum,splitted.length);
            System.out.println(finalResult);
        }
        System.out.println("Enter t number of test case");
        String p = myObj.nextLine();
        int t = Integer.parseInt(p);
        List<String> numString = new ArrayList<>();
        for(int j = 0; j<t;j++){
            System.out.println("Enter "+j+1+" set string with number");
            String alpNum = myObj.nextLine();
            numString.add(alpNum);
        }
        for (String nuStr: numString) {
            char[] c = nuStr.toCharArray();
            int sum = 0;
            for (int i = 0; i < c.length; i++) {
                if (Character.isDigit(c[i])) {
                    int a = Integer.parseInt(String.valueOf(c[i]));
                    sum = sum + a;
                }
            }
            System.out.println(sum);
        }
    }
    public static int getSecondLargest(int[] a, int total){
        int temp;
        for (int i = 0; i < total; i++)
        {
            for (int j = i + 1; j < total; j++)
            {
                if (a[i] > a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a[total-2];
    }
}
