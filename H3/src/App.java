import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        Random ran = new Random(0);
        ArrayList  <Device> devices = new ArrayList<>();


        System.out.print("Enter a number from 1 to 20 :   ");
        int a = input.nextInt();
        int randomNum = ran.nextInt(a);   // 0 to a

        int totalPrice = 0;
        int totalWeght = 0;
        

        for(int i = 0 ; i < a; i++){

            int devs = ran.nextInt(0,3);

            if(devs == 0 ){
                Smartphone sm = new Smartphone("Smartphone", ran.nextDouble(500), ran.nextDouble(300), ran.nextInt(200), "Black" );
                devices.add(sm);
            }
                else if(devs == 1 ){
                Laptop sm = new Laptop("Laptop", ran.nextDouble(500), ran.nextDouble(300), ran.nextInt(20), "Apple" );
                devices.add(sm);
            }
                else if(devs == 3 ){
                Tablet sm = new Tablet("Tablet", ran.nextDouble(500), ran.nextDouble(300), "Huawei", "Black" );
                devices.add(sm);
            }
        }
        for(Device i : devices){
            System.out.println(i);
            totalPrice += i.getPrice();
            totalWeght += i.getWeight();

        }

            System.out.println("Total Price : " + totalPrice);
            System.out.println("Total Weight : " + totalWeght);

    }
}
