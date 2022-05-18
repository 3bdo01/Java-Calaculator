package calc;
import java.util.Scanner;
public class calc {

    public static void main(String[] args) {
        //Apply Frame 
        new welcome_page().setVisible(true);
        
        Scanner sc = new Scanner(System.in);
        int option = 0;
        String check;
        do {
            System.out.println("Enter Number of Required Operation : ");
            System.out.println("1: Math Operations ");
            System.out.println("2: Array Operations ");
            int x =sc.nextInt();
        if (x==1){
        drawline();
        System.out.println("ENTER YOUR NUMBERS");
        drawline();
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        System.out.println("1: sum");
        System.out.println("2: subtract");
        System.out.println("3: multibication");
        System.out.println("4: divide");
        System.out.println("0: Exit program");
        drawline();
        System.out.println("ENTER YOUR OPTION ; ");
        option = sc.nextInt();
        MathOperation mo = new MathOperation();
        switch (option){
            case 1 :
                System.out.println("The sum is : "+mo.sum(num1, num2));
                break ;
            case 2 :
                System.out.println("The subtract :"+mo.sub(num1,num2));
                break ;
            case 3 :
                System.out.println("The multibication is : "+mo.multipication(num1,num2));
                break;
            case 4 :
                System.out.println("The divide is :"+mo.divide(num1,num2));
                break ;
            case 0 :
                System.out.println("Good Bye");
                break ; 
        }}else if (x == 2){
            System.out.println("Enter Number Of Array Operation :");
            System.out.println("1: Add Array");
            System.out.println("2: Subtract Array");
            System.out.println("3: Multipication");
            int r = sc.nextInt();
            ArrayOpertion ao = new ArrayOpertion();
            int a,b,c,d;
                        System.out.println("Enter Number Of Rows for first marix");
                        a =sc.nextInt();
                        System.out.println("Enter Number Of columns for first marix");
                        b =sc.nextInt();
                        System.out.println("Enter Number Of Rows for secound marix");
                        c =sc.nextInt();
                        System.out.println("Enter Number Of columns for secound marix");
                        d =sc.nextInt();
                        if (a==c && b==d){
                        //System.out.println("Enter all element for first matrix");
                        int[][]w = new int [a][b];
                        int[][]y = new int [c][d];
                        System.out.println("Enter all element for first matrix");
                        for(int i=0;i<a;i++)
                        {
                            for(int j=0 ; j<b;j++)
                            {
                            w[i][j]=sc.nextInt();            
                            }
                        }
                        System.out.println("Enter all element for secound matrix");
                        for(int i=0;i<c;i++)
                        {
                            for(int j=0;j<d;j++)
                            {
                            y[i][j]=sc.nextInt();            
                            }
                        }if (r == 1 ){
                        ao.Addarray(w, y);

                        }else if (r == 2){
                            ao.SubArray(w, y);
                        }else if (r == 3){
                            ao.Multi_Array(w, y);
                            
                        }

            }
 
        }
        System.out.println("Do YOu Want To Continue y/n");
        check = sc.next();
        }
        while(option !=0 && check.equalsIgnoreCase("y"));  
        
        
    }

public static void drawline(){
    for(int i=0; i<30 ; i++){
        System.out.print("*");
        }
        System.out.println();
}

}
