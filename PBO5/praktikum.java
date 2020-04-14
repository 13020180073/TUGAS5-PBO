import javax.swing.JOptionPane;

 
import java.util.Scanner;

 
public class praktikum {
 
 
   //fungsi
 
   
 public static int Tambah (int a, int b){
 

    return(a + b);

 
}
public static void main(String[] args) {
 
  
      Scanner input = new Scanner(System.in);
 

        System.out.print("Masukan nilai A : ");

 
        int a=input.nextInt();
 
       
 System.out.print("Masukan nilai B : ");
 
      
  int b=input.nextInt();
 
      
  System.out.println("==================");
 
 
       System.out.println("Hasil Penjumlahan : "+Tambah(a, b));
 
       
}
 

}