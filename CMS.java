
import java.util.Scanner;
import java.util.*;
class Contact
{
    String name;
    String phno;
    String email;
}
class Main {
    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       ArrayList<Contact> arr=new ArrayList<>();
       while(true)
       {
           System.out.println("1.Add contact");
           System.out.println("2.View contact");
           System.out.println("3.Search contact");
           System.out.println("4.Delete contact");
           System.out.println("5.Update contact");
           System.out.println("6.exit");
           System.out.print("enter choice:");
           int ch=s.nextInt();
           s.nextLine();
           switch(ch)
           {
               case 1:
                   Contact info=new Contact();
                   System.out.print("enter name:");
                   info.name=s.nextLine();
                   boolean exists = false;
                   for (Contact c : arr) 
                   {
                      if (c.name.equalsIgnoreCase(info.name))
                      {
                        exists = true;
                        break;
                      }
                   }
                   if(exists)
                   {
                       System.out.println("Contact already exists");
                   }
                   else{
                   System.out.print("enter phno:");
                   info.phno=s.nextLine();
                   System.out.print("enter email:");
                   info.email=s.nextLine();
                   arr.add(info);
                   System.out.println("contact added successfully......");
                   }
                   break;
                case 2:
                    if(arr.isEmpty())
                    {
                        System.out.println("No contacts available");
                    }
                    else
                    {
                        System.out.println("----Contact list----");
                        for(Contact c:arr)
                        {
                            System.out.println("Name: "+c.name);
                            System.out.println("Phno: "+c.phno);
                            System.out.println("Email: "+c.email);
                            System.out.println("--------------");
                        }
                    }
                    break;
                case 3:
                    System.out.print("Enter the name to search:");
                    String searchname=s.nextLine().trim();
                    boolean found1=false;
                    for(Contact c:arr)
                    {
                        if(c.name.equalsIgnoreCase(searchname))
                        {
                            System.out.println();
                            System.out.println("Name: "+c.name);
                            System.out.println("Phno: "+c.phno);
                            System.out.println("Email: "+c.email);
                            found1=true;
                            System.out.println();
                        }
                    }
                            if(found1==false)
                            {
                                System.out.println("contact not found");
                            }
                        
                    
                    break;
                case 4:
                    System.out.print("Enter the name to delete:");
                    String Deletename=s.nextLine().trim();
                    boolean found2=false;
                    for(int i=0;i<arr.size();i++)
                    {
                        if(arr.get(i).name.equalsIgnoreCase(Deletename))
                        {
                            arr.remove(i);
                            found2=true;
                            System.out.println("contact deleted....");
                            break;
                        }
                    }
                            if(found2==false)
                            {
                                System.out.println("contact not found");
                            }
                        
                    
                    break;
                case 5:
                     System.out.print("Enter the name of contact to update:");
                    String Updatename=s.nextLine().trim();
                    boolean found3=false;
                    for(Contact c:arr)
                    {
                        if(c.name.equalsIgnoreCase(Updatename))
                        {
                            System.out.print("New name:");
                            c.name=s.nextLine();
                            System.out.print("New phno:");
                            c.phno=s.nextLine();
                            System.out.print("New email:");
                            c.email=s.nextLine();
                          
                            System.out.println("Contact updated successfully......");
                            found3=true;
                            break;
                        }
                    }  
                            if(found3==false)
                            {
                                System.out.println("contact not found");
                            }
                    
                    break;
                case 6:
                    System.out.print("Exiting....");
                    return;
                default:
                    System.out.print("Invalid choice....");
           }
       }
    }
}