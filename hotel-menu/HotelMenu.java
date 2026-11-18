import java.util.Scanner;
import java.util.ArrayList;
public class HotelMenu{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int sum=0,i,it,qty,cost;
        ArrayList<String> ordername = new ArrayList<>();
        ArrayList<Integer> ordercost = new ArrayList<>();
        ArrayList<Integer> orderqty = new ArrayList<>();
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
                cost=price[it-1]*qty;
                ordername.add(name[it-1]);
                orderqty.add(qty);
                ordercost.add(cost);
                sum=sum+cost;
            }
            else if (it!=0){
                System.out.println("Select valid item");
            }
        }while(it!=0);
        for (i=0;i<ordername.size();i++){
            System.out.println((i+1)+"."+ordername.get(i)+" x "+orderqty.get(i)+" = "+ordercost.get(i));
        }
        if (sum==0){
            System.out.println("******Order Anytime******");
        }
        else{
            System.out.println("\n\nTOTAL = "+sum);
        }
        sc.close();
    }
}