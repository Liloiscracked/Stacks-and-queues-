import java.util.Scanner;

public class BalancedParentheses {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your expression: ");
        String exp = input.nextLine();
        System.out.println();
        if (isBalanced(exp))
            System.out.println("Expression is balanced");
        else
            System.out.println("Expression is not balanced");
    }
    public static boolean isBalanced(String eq){
        LabStack<String> stack= new LabStack<String>();
        char[] strarray = eq.toCharArray();
        for(char el : strarray){
            if(isOpening(String.valueOf(el)))
                stack.push(String.valueOf(el));
            else if (isClosing(String.valueOf(el))){
                if(stack.isEmpty())
                    return false;
                else{
                    String c =  stack.pop();
                    if(!isMatch(c,String.valueOf(el)))
                    return false;
                }
            }
        }
        if(stack.isEmpty())
            return true;
        else
            return false;
    }
    public static boolean isOpening(String sample){ // to check is it is opening
        if(sample.equals("(") | sample.equals("[") | sample.equals("{") )
            return true;
        else
            return false;
    }
    public static boolean isClosing(String sample){ // to check if it is closing
        if(sample.equals(")") | sample.equals("]") | sample.equals("}") )
            return true;
        else
            return false;
    }
    public static boolean isMatch(String a , String b){ // to check if the closing and opening are matched a is the opener and b is the closer
        if(a.equals("(") & b.equals(")"))
            return true;
        else if (a.equals("{") & b.equals("}")) {
            return true;
        }
        else if (a.equals("[") & b.equals("]")) {
            return true;
        }
        else
            return false;
    }
}
