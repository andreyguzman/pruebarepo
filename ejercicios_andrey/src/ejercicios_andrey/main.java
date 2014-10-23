
package ejercicios_andrey;
import javax.swing.JOptionPane;

public class main {

    public static void main(String[] args) {
     String n="";
     int n1=0;
        metodos op=new metodos();
        n=JOptionPane.showInputDialog("Menu por favor presione 1 para elevar"
                                    +"\n Por favor seleccione el programa que desea ejecutar"
                                    +"\n 1.Elevar numero"
                                    +"\n 2.Coseno"
                                    +"\n 3.Seno"
                                    +"\n 4.Logaritmo base 10"
                                    +"\n 5.multiplicacion redondeada"
                                    +"\n 6.División redondeada");
        
        n1=Integer.parseInt(n);
        switch (n1){
            case 1:
                op.setelevar();
                break;
            case 2:
                op.setcoseno();
                break;
            case 3:
                op.setseno();
                break;
            case 4:
                op.setlog(); 
                break;
            case 5:
                op.setmul();
                break;
            case 6:
                op.setdiv();
                break;
            
            
        }
     
    }
    
}
