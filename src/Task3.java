import java.util.Scanner;

public class Task3
{
    public static void main(String[] args) {
        double delta;
        double x1;
        double x2;

        int root;

        Scanner numbers = new Scanner(System.in);

        System.out.print("Enter number a: ");
        Double a = numbers.nextDouble();
        System.out.print("Enter number b: ");
        Double b = numbers.nextDouble();
        System.out.print("Enter number c: ");
        Double c = numbers.nextDouble();
        System.out.println("Your equation is: " + a + "x^2+" + b + "x+" + c + "=0");

        if (a == 0 && b == 0)
        {
            System.out.println("a and b are zero, no answers");
            System.exit(0);
        }

        if (a != 0)
        {
            delta = Math.pow(b, 2) - 4 * a * c;

            if (delta < 0) {root = 0;}
            else if (delta == 0) {root = 1;}
            else root = 2;

            System.out.println("Delta: " + delta);

            switch (root)
            {
                case (0):
                    System.out.println("No roots.");
                    break;
                case (1):
                    x1 = -b / 2 * a;
                    System.out.println("One root: " + x1);
                    break;
                case (2):
                    x1 = (-b + Math.sqrt(delta)) / 2 * a;
                    x2 = (-b - Math.sqrt(delta)) / 2 * a;
                    System.out.println("Two roots: \n" + "x1: " + x1 + "\n" + "x2: " + x2);
            }
        }
        else
        {
           System.out.print("Looks like a = 0. Following equation is NOT square. Do you want to continue(Y/N): ");

           Scanner answers = new Scanner(System.in);
           String ans = answers.nextLine().toUpperCase();

           if(ans.equals("Y"))
           {
               x1=-c/b;
               System.out.println("One root: "+x1);
           }
           else if (ans.equals("N"))
           {
               System.out.println("Ok, goodbye");
               System.exit(0);
           }
           else
           {
               System.out.println("Looks like you wrote wrong, goodbye!");
               System.exit(0);
           }
        }
    }
}
