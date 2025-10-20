import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
      // Scanner sc = new Scanner(System.in);
      // System.out.println("Enter:");
      // int userInput = sc.nextInt();
      // int i = 1;

      //Problem 1
      // int sum = 0;
      // while(i < 5)
      // {
      //     System.out.println("Enter:");
      //     sum += userInput = sc.nextInt();
      // }
      //     System.out.println(sum);

      // Problem 2
      // int highest = 0;
      // int i = 1;

      // while(i < 5)
      // {
      //     System.out.println("Enter:");
      //     userInput = sc.nextInt();
      //     if(highest < userInput)
      //     {
      //       highest = userInput;
      //     }
      //     i++;
      // }
      // System.out.println();
      // System.out.println(highest);
      
      // Problem 3
      int index = 0;
      String word = "calculator";
      String e = ""; 
      String currentLetter = "";
      while(index < word.length())
      {
        if(index + 2 > word.length())
        {
          currentLetter = word.substring(index);
        }
        else
        {
          currentLetter = word.substring(index, index + 2);
        }
        index += 3;
        e = e + currentLetter;
      }
      System.out.println(e);
      
      // sc.close();
  }
}

