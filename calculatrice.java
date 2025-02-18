import java.util.Scanner;

// Class that performs basic arithmetic operations
class Calculatrice {
    
    public double addition(double a, double b) {
        return a + b;
    }

   
    public double soustraction(double a, double b) {
        return a - b;
    }

    
    public double multiplication(double a, double b) {
        return a * b;
    }

    
    public double division(double a, double b) {
        if (b == 0) {
            System.out.println("Erreur : Division par zéro !");
            return 0; 
        }
        return a / b;
    }}

public class test {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Calculatrice calc = new Calculatrice();
        
        while (true){
            System.out.println("donner premiere nombre:");
            double num1=sc.nextInt();

            System.out.println("donner l operation(+,-,*,/) : ");
            char op=sc.next().charAt(0);

            System.out.println("donner deuxieme nombre:");
            double num2=sc.nextInt();
            
            double res=0;
            switch(op){
                case '+':
                res=calc.addition(num1, num2);
                break;

                case '-':
                res=calc.soustraction(num1, num2);
                break;

                case '*':
                res=calc.multiplication(num1, num2);
                break;

                case '/':
                res=calc.division(num1, num2);
                break;

                default:
                System.out.println("erreur : operation invalide");
            }
            System.out.println("resultat= "+res);


            
        }
    }
}



