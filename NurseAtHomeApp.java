import java.util.*;

public class NurseAtHomeApp{
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      
      Homecare[] assist = new Homecare[30];
      int count = 0;
      
      System.out.print("Enter number of customers [max 30]: ");
      int n = sc.nextInt();
      sc.nextLine();
      
      for(int i = 0;i < n;i++){
      System.out.println("\nRecord " + (i + 1));
      
      System.out.print("Service Id: ");
      String sid = sc.nextLine();
      
      System.out.print("Customer Name: ");
      String cusname = sc.nextLine();
      
      System.out.print("Service Type (Basic/ Physiotherapy/ BabyCare): ");
      String stype = sc.nextLine();
      
      System.out.print("Service Hours: ");
      double hrs = sc.nextDouble();
      sc.nextLine();
      
      System.out.print("Staff ID: ");
      String stid = sc.nextLine();
      
      System.out.print("Staff Name: ");
      String sname = sc.nextLine();
      
      System.out.print("Staff Phone: ");
      String sphone = sc.nextLine();
      
      Staff s = new Staff(stid, sname, sphone);
      
      assist[count] = new Homecare(sid, cusname, stype, hrs, s);
      count++;
      }
      
      double totalPhysio = 0;
      
      for(int i = 0;i < count;i++){
      if(assist[i].getServiceType().equalsIgnoreCase("Physiotherapy")){
         totalPhysio += assist[i].calcServiceCharge();
         }
      }
      System.out.println("\nTotal charges for Physiotherapy customers: RM" + totalPhysio);
      }
      
   }