import java.lang.runtime.SwitchBootstraps;
import java.util.*;
public class AadharPortal
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[]args)
    {
          Aadhar user1=new Aadhar("Yuvaraj",9597208527L,12345,"Ariyalur");
          Aadhar user2=new Aadhar("Vishal",95972084322L,11234,"Thanjavur");
          Aadhar user3=new Aadhar("Vikash",95972085678L,65433,"Namakkal");

          boolean flag=true;
         do {
             System.out.println("Wlecome to Aadhar Portal.......!");
             System.out.println("1.Get Information\n2.Modify Details\n3.Exit");
             int input1 = sc.nextInt();
             switch (input1)
             {
                 case 1:
                 {
                     boolean flag1=true;
                     do {
                         System.out.println("Select user to get details........!");
                         System.out.println("1.User1\n2.User2\n3.User3\n4.Exit");
                         int input2 = sc.nextInt();
                         switch (input2) {
                             case 1: {
                                 System.out.println(user1.getName());
                                 System.out.println(user1.getContact());
                                 System.out.println(user1.getAddress());
                                 System.out.println(user1.getAadharNo());
                                 break;
                             }
                             case 2: {
                                 System.out.println(user2.getName());
                                 System.out.println(user2.getContact());
                                 System.out.println(user2.getAddress());
                                 System.out.println(user2.getAadharNo());
                                 break;
                             }
                             case 3: {
                                 System.out.println(user3.getName());
                                 System.out.println(user3.getContact());
                                 System.out.println(user3.getAddress());
                                 System.out.println(user3.getAadharNo());
                                 break;
                             }
                             case 4: {
                                 flag1= false;
                                 break;
                             }
                         }
                     }while(flag1);
                     break;
                 }
                 case 2:
                 {
                     boolean flag3 = true;
                     do
                     {
                         System.out.println("Select the user to modify the details........!");
                         System.out.println("1.User1\n2.User2\n3.User3\n4.Exit");
                         int input2 = sc.nextInt();
                         switch (input2)
                         {
                             case 1:
                             {
                                 boolean flag4 = true;
                                 do
                                 {
                                     System.out.println("Select the option to modify the detail.....!");
                                     System.out.println("1.Name\n2.Contact\n3.Address\n4.Exit");
                                     int input3 = sc.nextInt();
                                     switch (input3)
                                     {
                                         case 1:
                                         {
                                             System.out.print("Enter the new name :");
                                             String newName=sc.nextLine();
                                             user1.setName(newName);
                                             System.out.println(user1.getName());
                                             break;
                                         }
                                         case 2:
                                         {
                                             System.out.print("Enter the new contact :");
                                             long NewContact=sc.nextLong();
                                             user1.setContact(NewContact);
                                             System.out.println(user1.getContact());
                                             break;
                                         }
                                         case 3:
                                         {
                                             System.out.print("Enter the new address :");
                                             String NewAddress=sc.nextLine();
                                             user1.setAddress(NewAddress);
                                             System.out.println(user1.getAddress());
                                         }
                                         case 4:
                                         {
                                             flag4=false;
                                             break;
                                         }
                                     }
                                 }while (flag4);
                                 break;
                             }
                             case 2:
                             {
                                 boolean flag4=true;
                                 do {
                                     System.out.println("Select the option to modify the detail.....!");
                                     System.out.println("1.Name\n2.Contact\n3.Address\n4.Exit");
                                     int input3 = sc.nextInt();
                                     switch (input3) {
                                         case 1: {
                                             System.out.print("Enter the new name :");
                                             String newName = sc.next();
                                             user2.setName(newName);
                                             System.out.println(user2.getName());
                                             break;
                                         }
                                         case 2: {
                                             System.out.print("Enter the new contact :");
                                             long NewContact = sc.nextLong();
                                             user2.setContact(NewContact);
                                             System.out.println(user2.getContact());
                                             break;
                                         }
                                         case 3: {
                                             System.out.print("Enter the new address :");
                                             String NewAddress = sc.nextLine();
                                             user2.setAddress(NewAddress);
                                             System.out.println(user2.getAddress());
                                         }
                                         case 4: {
                                             flag4 = false;
                                             break;
                                         }
                                     }
                                 } while (flag4);
                             }
                             case 3:
                             {
                                 boolean flag2=true;

                                 do
                                 {
                                     System.out.println("Select the option to modify the detail.....!");
                                     System.out.println("1.Name\n2.Contact\n3.Address\n4.Exit");
                                     int input3 = sc.nextInt();

                                     switch (input3)
                                     {
                                         case 1: {
                                             System.out.print("Enter the new name :");
                                             String newName = sc.next();
                                             user3.setName(newName);
                                             System.out.println(user3.getName());
                                             break;
                                         }
                                         case 2: {
                                             System.out.print("Enter the new contact :");
                                             long NewContact = sc.nextLong();
                                             user3.setContact(NewContact);
                                             System.out.println(user3.getContact());
                                             break;
                                         }
                                         case 3: {
                                             System.out.print("Enter the new address :");
                                             String NewAddress = sc.nextLine();
                                             user3.setAddress(NewAddress);
                                             System.out.println(user3.getAddress());
                                         }
                                         case 4: {
                                             flag2 = false;
                                             break;
                                         }
                                     }
                                 }while (flag2);
                                 break;
                             }
                             case 4: {
                                 flag3 = false;
                                 break;
                             }
                         }
                     }while (flag3);
                     break;
                 }
                 case 3:
                 {
                     flag=false;
                     break;
                 }
             }
         }while(flag);
    }
}
