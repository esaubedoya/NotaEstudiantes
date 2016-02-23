
package notasestudiantes;

import java.util.Scanner;


public class NotasEstudiantes {

    
    public static void main(String[] args) {
        
        double notad[], pper=0, npg=0;
        int n, i;
        String codigo[];
        
        Scanner leer=new Scanner(System.in);
        
        System.out.println("Ingrese el Nro de estudiantes:");
        n=leer.nextInt();
        
        notad=new double[n];
        codigo=new String[n];
        
        for(i=0;i<n;i++){
            System.out.println("código:");
            codigo[i]=leer.next();
            System.out.println("Nota 1:");
            notad[i]=(leer.nextDouble()*0.25);
            System.out.println("Nota 2:");
            notad[i]+=(leer.nextDouble()*0.2);
            System.out.println("Nota 3:");
            notad[i]+=(leer.nextDouble()*0.25);
            System.out.println("Nota 4:");
            notad[i]+=(leer.nextDouble()*0.3);
            
           if(notad[i]<3)
               pper++;
           npg+=notad[i];
           
           System.out.println("Código: "+codigo[i] + " Nota: "+notad[i]);
            
        }
        System.out.println("% Estudiantes que perdieron: "+(pper*100)/n);
        System.out.println("Nota promedio grupo: "+(npg/n));
        
        
    }
    
}
