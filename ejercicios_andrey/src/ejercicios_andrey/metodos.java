

package ejercicios_andrey;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class metodos {

    public metodos() {
    }
    
    public void setelevar(){
        
        String n1="",n2="";
        double a=0,resultado=0,b=0;
             
       n1=JOptionPane.showInputDialog("porfavor inserte el numero que desea elevar");
        
       a=Double.parseDouble(n1);
         n2=JOptionPane.showInputDialog("Por favor ingrese el exponente al que desea elevear el numero");
        b=Double.parseDouble(n2);
       
        resultado=Math.pow(a, b);
        JOptionPane.showMessageDialog(null, "el resultado es = "+resultado);
        
    }
    
    public void setcoseno(){
        String n1="";
        double a=0,cos=0;
        n1=JOptionPane.showInputDialog("por favor ingrese el numero que desea conocer el coseno");
        a=Double.parseDouble(n1);
        cos=Math.cos(a);
        JOptionPane.showMessageDialog(null, "el coseno de "+a+" es "+cos);
        
    }
    
     public void setseno(){
        String n1="";
        double a=0,sen=0;
        n1=JOptionPane.showInputDialog("por favor ingrese el numero que desea conocer el seno");
        a=Double.parseDouble(n1);
        sen=Math.sin(a);
        JOptionPane.showMessageDialog(null, "el seno de "+a+" es "+sen);
        
    }
    
     public void setlog(){
           String n1="";
        double a=0,log=0;
        n1=JOptionPane.showInputDialog("por favor ingrese el numero que desea conocer el logaritmo base 10");
        a=Double.parseDouble(n1);
        log=Math.log10(a);
        JOptionPane.showMessageDialog(null, "el logartimo en base 10 de "+a+" es "+log);
          }
     
     public void setmul(){
         String n1="",n2="";  
         double a=0,b=0,res=0,res1=0;
        n1=JOptionPane.showInputDialog("por favor ingrese el primer numero multiplicar");
        a=Double.parseDouble(n1);
        n2=JOptionPane.showInputDialog("por favor ingrese el otro numero a multiplicar");
        b=Double.parseDouble(n2);
        res=a*b;
        res1=Math.rint(res);
        JOptionPane.showMessageDialog(null, "el resultado es "+res+" que redondeado es "+res1);
         
         
     }
     
     public void setdiv(){
         String n1="",n2="";  
         double a=0,b=0,res=0,res1=0;
        n1=JOptionPane.showInputDialog("por favor ingrese el numero que desa dividir");
        a=Double.parseDouble(n1);
        n2=JOptionPane.showInputDialog("por favor ingrese el numero por el que desea dividir");
        b=Double.parseDouble(n2);
        res=a/b;
        res1=Math.rint(res);
        JOptionPane.showMessageDialog(null, "el resultado es "+res+" que redondeado es "+res1);
         
     }
}
