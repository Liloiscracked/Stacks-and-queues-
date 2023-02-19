import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        LabStack<String> stack = new LabStack<>();
        LabQueue<String> queue = new LabQueue<>();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your input > ");
        String n = input.nextLine();
        String [] arr = n.split(" ");
        System.out.println();
        for (String elem : arr)
            stack.push(elem);
        System.out.println("Now the stack is >> " + stack.toString());
        while (!stack.isEmpty()){
            queue.enqueue(stack.pop());
        }
        System.out.println("After reverse the stack is >> " + queue.toString());
    }
}
