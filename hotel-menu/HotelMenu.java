import java.util.Scanner;
import java.util.ArrayList;
public class HotelMenu{
    static String name[]={"Dosa","Idly","Poori","Pongal"};
    static int sum=0,price[]={60,30,40,50};
    static ArrayList<String> items=new ArrayList<>();

    static void showMenu(){
        for(int i=0;i<name.length;i++){
            System.out.println((i+1)+"."+name[i]+" - Rs."+price[i]);
        }
    }
    static boolean isValidItem(int a){
        if (a>0 && a<=name.length){
            return true;
        }
        else{
            System.out.println("Enter valid item");
            return false;
        }
    }
    static void showOrderSoFar(int a){
        System.out.println("Items selected so far:");
        for(String s:items){
            System.out.println(s);
        }
        System.out.println("Total so far = "+a);
    }
    static void takeOrder(Scanner sc){
        int it;
        while(true){
            System.out.println("Enter the S.No(0 to Stop): ");
            it=sc.nextInt();
            if (it==0) {
                break;
            }
            boolean va= isValidItem(it);
            if(va){
                System.out.println("Enter the Quantity: ");
                int qty=sc.nextInt();
                int cost=price[it-1]*qty;
                sum+=cost;
                items.add(name[it-1]+" x "+qty+" = "+cost);
                showOrderSoFar(sum);
            }
        }
    }
    static void printBill(){
        if (sum==0){
            System.out.println("*****Order Anytime*****");
        }
        else{
            System.out.println("*****BILL*****");
            for(int i=0;i<items.size();i++){
                System.out.println(items.get(i));
            }
            System.out.println("TOTAL = "+sum);
        }
        
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        showMenu();
        takeOrder(sc);
        printBill();
        sc.close();
    }
}