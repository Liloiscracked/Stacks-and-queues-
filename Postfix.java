import java.util.Scanner;

public class Postfix {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your expression: ");
        String exp = input.nextLine();
        String[] EXP = exp.split(" ");
        LabStack<String> s = new LabStack<>();
        for(String i: EXP){
            s.push(i);
        }
        System.out.println(Calculate(exp));
        input.close();
    }
    public static double Calculate(String exp){
     LabStack<Double> stack = new LabStack<>();
     String[] EXP = exp.split(" ");
     for(String elem : EXP){
         try {
             stack.push(Double.valueOf(elem));
         }
         catch (Exception e) {
             if (stack.pool.size() == 1) {
                 System.out.println("your postfix expression is not valid!!");
                 return stack.pop();
             } else {
                 System.out.println("Stack now is >> " + stack.toString());
                 double n1 = stack.pop();
                 double n2 = stack.pop();
                 switch (elem) {
                     case ("+"):
                         stack.push(n2 + n1);
                         break;
                     case "-":
                         stack.push(n2 - n1);
                         break;
                     case "*":
                         stack.push(n2 * n1);
                         break;
                     case "/":
                         stack.push(n2 / n1);
                         break;
                 }
                 System.out.println("Stack now is >> " + stack.toString());
             }
         }
     }
     return stack.pop();
    }
}
