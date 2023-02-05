import java.util.Scanner;

public class Dealership {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        
        System.out.println("Welcome to the Java Dealership");
        System.out.println("- Select option 'a' to buy a car");
        System.out.println("- Select option 'b' to sell a car");

        String option = in.nextLine();
        switch(option){
            //Buying a car
            case "a" : System.out.println("What is your budget?"); 
            int budget = in.nextInt();
            if(budget >= 10000){
                System.out.println("Great! a Nissan Altima is available ");
                System.out.println("\nDo you have insurance? Write 'yes' or 'no'");
                in.nextLine(); //trap
                String insurance = in.nextLine();
                System.out.println("\nDo you have a driver's license? Write 'yes' or 'no'");
                String license = in.nextLine();
                System.out.println("\nWhat is your credit score?");
                int creditScore = in.nextInt();
                if(insurance.equals("yes") && license.equals("yes") && creditScore >660){
                    System.out.println("Sold! Pleasure doing business with you");
                }
                else{
                    System.out.println("We're sorry. You're not eligible");
                }
            }

            else{
                System.out.println("We don't sell cars under $10,000. Sorry!");
            }
            
            break;
            // selling a car
            case "b" : System.out.println("\nWhat is your car valued at?");
            int value = in.nextInt(); 
            System.out.println("\nWhat is your selling price?");
            int price = in.nextInt();

            if(value > price && price < 30000){
                System.out.println("\nWe will buy your car. A pleasure doing business with you");
            }
            else{
                System.out.println("\nSorry! we're not interested");
            }
            
            break;
            default : System.out.println("Invalid option");
        }
        in.close();



















    }
    
}
