<<<<<<< HEAD
import java.util.Scanner;
public class HotelMenu{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int sum=0,i,it,qty;
        String bill="";
        System.out.println("**********Welcome to Hotel**********");
        System.out.println("**********      Menu      **********");
        String name[]={"Dosa","Idli","Vada","Pongal","Poori","Coffee","Tea"};
        int price[]={50,30,20,40,60,25,20};
        for(i=0;i<name.length;i++){
            System.out.println((i+1)+"."+name[i]+" - "+price[i]);
        }
        do{
            System.out.println("Enter the S.no(0 to stop):");
            it=sc.nextInt();
            if (it>0 && it<=name.length){
                System.out.println("Enter the quantity: ");
                qty=sc.nextInt();
                sum+=price[it-1]*qty;
                bill=bill+"\n"+name[it-1]+" - "+price[it-1]+" x "+qty+" = "+price[it-1]*qty;
            }
            else if (it!=0){
                System.out.println("Select valid item");
            }
        }while(it!=0);
        if (sum!=0){
            System.out.println("*****BILL*****");
            System.out.println(bill+"\n\nTotal ="+sum);
        }
        else{
            System.out.println("******Order Anytime******");
        }
        sc.close();
    }
=======
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
>>>>>>> d60cac83fda769bdb388d16592dc66f9bb60b236
}