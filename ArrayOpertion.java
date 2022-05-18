package calc;

public class ArrayOpertion {
    public int [][] Addarray (int [][]x ,int [][]y){
        int [][]z;
        int r =x.length;
        int c =x[0].length;
        z = new int [r][c];
        for(int i=0;i<r;i++){
            for(int j=0; j<c ;j++)
            {      
             z[i][j]=x[i][j]+y[i][j];
             System.out.print(z[i][j]+" ");
            }
            System.out.println("");
        }
        return z;
    
}
    public int [][] SubArray (int [][]x ,int [][]y){
                int [][]z;
        int r =x.length;
        int c =x[0].length;
        z = new int [r][c];
        for(int i=0;i<r;i++){
            for(int j=0; j<c ;j++)
            {      
             z[i][j]=x[i][j]-y[i][j]; 
             System.out.print(z[i][j]+" ");
            }
            System.out.println("");
        }
        return z;

    }
    public int [][] Multi_Array (int [][]x,int [][]y){
        int [][] z;
        int r =x.length;
        int c =x[0].length;
        z = new int [r][c];
         int sum =0 ;
            int multibly[][] = new int [r][c];
            for(int i=0;i<r;i++){
                for(int j=0;j<c;j++){
                    for (int k=0;k<c;k++){
                    sum = sum + x[i][k]*y[k][j];
                    }
                    multibly[i][j]=sum;
                    sum = 0;
                }
            }
             for(int i =0 ; i<r;i++){
                    for(int j=0 ;j<c;j++){
                        System.out.print(multibly[i][j]+" ");
                    }
                    System.out.println(" ");
                }
            return z;
    
    }
    
    
}