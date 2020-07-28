
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        Container firstContainer = new Container();
        Container secondContainer = new Container();
        while (true) {
            System.out.println("First: " + firstContainer.toString());
            System.out.println("Second: " + secondContainer.toString());
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String [] parts = input.split(" ");
            String command = parts [0];
            int amount = Integer.valueOf(parts[1]);
            if(command.equals("add")){
                firstContainer.add(amount);
                System.out.println("");
            } else if(command.equals("move")){
                System.out.println("Conta: " +firstContainer.contains());
                if(firstContainer.contains() >= amount){
                    secondContainer.add(amount);
                    firstContainer.remove(amount);
                    
                } else {
                    secondContainer.add(firstContainer.contains());
                    firstContainer.remove(firstContainer.contains());
                    
                }    
                System.out.println("");
            } else if(command.equals("remove")){
                secondContainer.remove(amount);
                System.out.println("");
            }

        }
    }

}
