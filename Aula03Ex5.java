import javax.swing.JOptionPane;

public class Aula03Ex5 {
   public static void main (String arg[]){
      int n1;
      n1 = Integer.parseInt(JOptionPane.showInputDialog ("digite numero:"));
      
      if (n1 >= 20 ){
         if (n1 <= 90){
            JOptionPane.showMessageDialog (null, "esta entre " + n1 );
         }
         else{
            JOptionPane.showMessageDialog (null, "nao " + n1);
         }
      }
      else{ 
         JOptionPane.showMessageDialog (null, "nao " + n1);
      }      
   }
}