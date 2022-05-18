
package calc;
import java.lang.Math;
public class Quadratic {
    public double Quadraticx1 (double a , double b , double c ){
       double x1 = (-b + Math.sqrt(b*b-4*a*c))/(2*a);

        
    return x1;

    }    public double Quadraticx2 (double a , double b , double c ){

        double x2 = (-b - Math.sqrt(b*b-4*a*c))/(2*a);
        
    return x2;
    }
            
            
            
}
