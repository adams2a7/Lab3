import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    System.out.println("Enter a number to count down or up from:");
    
    Scanner s = new Scanner(System.in);
     
    int num = s.nextInt();

    
      for(int count = num; count >= 0; count--)
      {	
        System.out.println(count);
      }
      for(int count = num; count <= 0; count++)   
      {	
        System.out.println(count);
      }
      
        System.out.println("Blast Off!");
      

    
  }
}
