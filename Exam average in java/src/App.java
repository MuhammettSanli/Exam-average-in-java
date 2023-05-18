import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner girdi = new Scanner(System.in);
        int exam1,quiz,exam2;
        double avarage;

        System.out.println("Write first exam:");
        exam1=girdi.nextInt();

       System.out.println("Write second exam:");
       exam2=girdi.nextInt();

       System.out.println("Write quiz:");
       quiz=girdi.nextInt();

        avarage=((exam1*0.3)+(exam2*0.5)+(quiz*0.2));

        if(avarage>=50)
        {
            System.out.println("You passed the lesson");
        }

        else
        {
         System.out.println("You didn't pass the lesson ");

        }


      
    }
}
