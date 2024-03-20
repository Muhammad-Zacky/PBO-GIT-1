import java.util.Scanner;
   
class SegitigaBintang {
  public static void main(String args[]){
            
    Scanner input = new Scanner(System.in);
       
    System.out.println("Program Segitigah");
    System.out.println();
     
    int tsmz3019173222,kltwi1,kltwij;
  
    tsmz3019173222 = 5;
     
    System.out.println();
    
    for(kltwi1=1; kltwi1<=tsmz3019173222; kltwi1++) {
      for(kltwij=1; kltwij<=kltwi1; kltwij++) {
        System.out.print(" *");
      }
      System.out.println();
    }
     
  }
}
