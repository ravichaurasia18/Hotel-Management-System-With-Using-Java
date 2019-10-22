import java.util.Scanner;
import java.util.Random;
public class Hotel{
public static void main(String[] args) {
  String first;    //for first name
  String last;     //for last name
  long contact;    //for contact number
  String identity;   //for identity proff
  int acr=5000;      //room rent of AC
  int nacr=3000;     //room rent of NON AC
  int jsr=8000;      //room rent of Junior Suite room
  int n;             //for taken number of room
  int z;             //for room number allots
  int  day;          //for number of days stays
  double tax;        //for GST tax 18%
  double total;
  double atotal;     //total amount
  Random rnd = new Random();       //make obj for random number genrated
Scanner htl = new Scanner(System.in);    //for I/O
while(true){
    //Select Room Type
     System.out.println("\n\t________Lotus Niko 5*-Hotel________\n");
     System.out.println("\t\t1.AC Room(Rs.5000)");
     System.out.println("\t\t2.Non-AC Room(Rs.3000)");
     System.out.println("\t\t3.Junior Suite Room(Rs.8000)");
     System.out.println("\t\t4.Exit");
     System.out.println("\t_____________________________________");
     System.out.print("\tChoose The Room-Type For Booking:");
     int x = htl.nextInt();
     int rndmly = rnd.nextInt(500);
switch(x){
  //enter the information
  case 1 : System.out.println("\n\t--------Booking For AC Room--------");
  System.out.println("\tPrice Of Room        :Rs." +acr);
  System.out.print("\tEnter No Of Room       :");
  n = htl.nextInt();
  for(z=1;z<=n;z++){
  System.out.print("\tEnter The Room No      :");
  z = htl.nextInt();}
  System.out.print("\tEnter No Of Days       :");
  day = htl.nextInt();
  System.out.print("\tEnter Your  First Name :");
  first = htl.next();
  System.out.print("\tEnter Your Last Name   :");
  last = htl.next();
  System.out.print("\tEnter Contact.No       :");
  contact = htl.nextLong();
  System.out.print("\tEnter Identity Proff   :");
  identity = htl.next();
  //claculate total amount
  total = n*acr*day;
  tax = (total*18)/100;
  atotal=total+tax;
  System.out.println("\t------Total Amount(Include 18% GST) :Rs." +atotal+ "/- -------");
  //for confirmation and cancel the reservation
    while(true){
             System.out.println("------------------------------------------------------");
             System.out.println("\t1.Confirm Booking");    //for confirm so print the information and display
             System.out.println("\t2.Cancel Booking");
             System.out.println("------------------------------------------------------");
             System.out.print("\tChoose Your Option :");
             int y = htl.nextInt();
       switch(y){
          case 1 :
             System.out.println("\tBill No                 :" +rndmly);
             System.out.println("\tCoustmer Name           :" +first+" "+last);
             System.out.println("\tCoustmer Contact.No     :" +contact);
             System.out.println("\tCoustmer Identity Proff :" +identity);
             for(z=1;z<=n;z++){
             System.out.println("\tRoom No                 :" +z);}
             System.out.println("\tNumber Of Room          :" +n);
             System.out.println("\tNumber Of Days          :" +day);
             System.out.println("\tPrice Of Room           :Rs." +acr);
             System.out.println("\tTotal Ammount(Included 18% GST)   :Rs." +atotal);
             System.out.println("\t____!!!Thank You For Booking!!!____");
             System.out.println("------------------------------------------------------");
          break;
          case 2 : System.exit(0);
          break;
                }
                 }

//similarly use in above

  case 2 : System.out.println("\n\t--------Booking For NON-AC Room--------");
  System.out.println("\tPrice Of Room        :Rs." +nacr);
  System.out.print("\tEnter No Of Room       :");
  n = htl.nextInt();
  for(z=1;z<=n;z++){
  System.out.print("\tEnter The Room No      :");
  z = htl.nextInt();}
  System.out.print("\tEnter No Of Days       :");
  day = htl.nextInt();
  System.out.print("\tEnter Your  First Name :");
  first = htl.next();
  System.out.print("\tEnter Your Last Name   :");
  last = htl.next();
  System.out.print("\tEnter Contact.No       :");
  contact = htl.nextLong();
  System.out.print("\tEnter Identity Proff   :");
  identity = htl.next();
  total = n*nacr*day;
  tax = (total*18)/100;
  atotal=total+tax;
  System.out.println("\t------Total Amount(Include 18% GST) :Rs." +atotal+ "/- -------");
          while(true){
                  System.out.println("------------------------------------------------------");
                  System.out.println("\t1.Confirm Booking");
                  System.out.println("\t2.Cancel Booking");
                  System.out.println("------------------------------------------------------");
                  System.out.print("Choose Your Option :");
                  int y = htl.nextInt();
            switch(y){
                case 1 :
                  System.out.println("\tBill No                 :" +rndmly);
                  System.out.println("\tCoustmer Name           :" +first+" "+last);
                  System.out.println("\tCoustmer Contact.No     :" +contact);
                  System.out.println("\tCoustmer Identity Proff :" +identity);
                  for(z=1;z<=n;z++){
                  System.out.println("\tRoom No                 :" +z);}
                  System.out.println("\tNumber Of Room          :" +n);
                  System.out.println("\tNumber Of Days          :" +day);
                  System.out.println("\tPrice Of Room           :Rs." +nacr);
                  System.out.println("\tTotal Ammount(Included 18% GST)   :Rs." +atotal);
                  System.out.println("\t____!!!Thank You For Booking!!!____");
                  System.out.println("------------------------------------------------------");
                break;
                case 2 : System.exit(0);
                break;
                      }
                      }
//similarly above

   case 3 : System.out.println("\n\t--------Booking For JUNIOR SUITE Room--------");
   System.out.println("\tPrice Of Room        :Rs." +jsr);
   System.out.print("\tEnter No Of Room       :");
   n = htl.nextInt();
   for(z=1;z<=n;z++){
   System.out.print("\tEnter The Room No      :");
   z = htl.nextInt();}
   System.out.print("\tEnter No Of Days       :");
   day = htl.nextInt();
   System.out.print("\tEnter Your  First Name :");
   first = htl.next();
   System.out.print("\tEnter Your Last Name   :");
   last = htl.next();
   System.out.print("\tEnter Contact.No       :");
   contact = htl.nextLong();
   System.out.print("\tEnter Identity Proff   :");
   identity = htl.next();
   total = n*jsr*day;
   tax = (total*18)/100;
   atotal=total+tax;
   System.out.println("\t------Total Amount(Include 18% GST) :Rs." +atotal+ "/- -------");
     while(true){
               System.out.println("------------------------------------------------------");
               System.out.println("\t1.Confirm Booking");
               System.out.println("\t2.Cancel Booking");
               System.out.println("------------------------------------------------------");
               System.out.print("Choose Your Option :");
               int y = htl.nextInt();
         switch(y){
           case 1 :
               System.out.println("\tBill No                 :" +rndmly);
               System.out.println("\tCoustmer Name           :" +first+" "+last);
               System.out.println("\tCoustmer Contact.No     :" +contact);
               System.out.println("\tCoustmer Identity Proff :" +identity);
               for(z=1;z<=n;z++){
               System.out.println("\tRoom No                 :" +z);}
               System.out.println("\tNumber Of Room          :" +n);
               System.out.println("\tNumber Of Days          :" +day);
               System.out.println("\tPrice Of Room           :Rs." +jsr);
               System.out.println("\tTotal Ammount(Included 18% GST)   :Rs." +atotal);
               System.out.println("\t____!!!Thank You For Booking!!!____");
               System.out.println("------------------------------------------------------");
           break;
           case 2 : System.exit(0);
           break;
                 }
                   }
//exit

  case 4 : System.exit(0);
  break;
      }
    }
  }
}
