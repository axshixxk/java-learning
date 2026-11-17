import java.util.Scanner;
public class hotelmenu{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int sum=0,item,qty,p=0;
        System.out.println("\t\tHOTEL\t\t");
        System.out.println("\t\tMENU\t\t");
        System.out.println("1. Idly - 30");
        System.out.println("2. Dosa - 50");
        System.out.println("3. Vada - 20");
        System.out.println("4. Pongal - 40"); 
        do{ 
            System.out.println("Enter the item number you want to order / 0 to stop: ");
            item = sc.nextInt();
            if (item!=0){
                System.out.println("Enter the Quantity");
                qty=sc.nextInt();
                switch (item){
                    case 1:
                        p=30;
                        break;
                    case 2:
                        p=50;
                        break;
                    case 3:
                        p=20;
                        break;
                    case 4:
                        p=40;
                        break;
                    default:
                        System.out.println("Invalid item number");
                        p=0;
                }
                sum += p * qty;
            }
        } while (item != 0);
        System.out.println("Total bill: " + sum);
        sc.close();
    }
}