import java.util.Stack;
import java.util.Scanner;

public class AirplaneOrders {
    private Stack<String> airplaneOrders = new Stack <String>();

    public void AddOrder(String newOrder){
        airplaneOrders.push(newOrder);
    }

    public String getNextTenOrders(){
        String name = "";

        for (int i=0; i<10 && !airplaneOrders.empty(); i++); {

            name = name + airplaneOrders.pop() + "";
        }
        return name;
    }
    public boolean empty(){
        return airplaneOrders.empty();
    }


    public static void main(String[] args) {
        AirplaneOrders airplaneOrders = new AirplaneOrders();
        airplaneOrders.AddOrder ("Order 10");
        airplaneOrders.AddOrder ("Order 9");
        airplaneOrders.AddOrder ("Order 8");
        airplaneOrders.AddOrder ("Order 7");
        airplaneOrders.AddOrder ("Order 6");
        airplaneOrders.AddOrder ("Order 5");
        airplaneOrders.AddOrder ("Order 4");
        airplaneOrders.AddOrder ("Order 3");
        airplaneOrders.AddOrder ("Order 2");
        airplaneOrders.AddOrder ("Order 1");
        //prints the top of the stack (1)

        Scanner input = new Scanner(System.in); //doing this outside the loop, so we never have multiple Scanners watchign System.in at once
        

        while (!airplaneOrders.empty()){
            //wait for the stewardess to hit enter before showing the next ten orders
            System.out.print("Hit Enter for the next 10 orders...");
            input.nextLine(); //we don't need the input, just the keypress acknowledgement

            //build the next 10 orders into a string to print
            //print the orders
            System.out.println(getNextTenOrders());
            //i dont know why this doesnt compile on my intellij

        }

    }
}

