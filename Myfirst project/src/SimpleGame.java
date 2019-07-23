import com.sun.net.httpserver.Authenticator;

import java.util.Random;
import java.util.Scanner;

public class SimpleGame{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Random random=new Random();
        int random_number=random.nextInt(5);
       // System.out.println(magic_number);

//        System.out.println("Enter a number");
//       int num=sc.nextInt();
//       if(num==random_number){
//           System.out.println("you are Successful");
//       }else{
//           System.out.println("you are failed");
//       }

       for(int i=0;i<5;i++) {
           System.out.println("Enter a number");
           int num = sc.nextInt();
           if (num == random_number) {
               System.out.println("you are Successful");
               break;
           } else if (num<random_number){
               System.err.println("you are failed");
               System.out.println("your number is less than expected number");

           }
           else{
               System.err.println("you are failed");
               System.out.println("your number is greater than expected number");

           }
       }




    }


}
