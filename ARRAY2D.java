import javax.swing.plaf.PanelUI;
import java.util.Scanner;

public class ARRAY2D {

    public static boolean search(int matrix[][],int key){
        for (int i=0;i< matrix.length;i++){
            for (int j=0;j<matrix[0].length;j++){
                if (matrix[i][j]==key){
                    System.out.println("key found at"+"("+i+","+j+")");
                    return true;
                }
            }
        }
        System.out.println("key not found");
        return false;
    }
    public static void Spiralmatrix(int matrix1[][]){
        int startrow=0;
        int endrow=matrix1.length-1;
        int startcol=0;
        int endcol=matrix1[0].length-1;

        while (startrow<=endrow&&startcol<=endcol){
            //top
            for (int j=startcol;j<=endcol;j++){
                System.out.print(matrix1[startrow][j]+" ");
            }
            //right
            for (int i=startrow+1;i<=endrow;i++){
                System.out.print(matrix1[i][endcol]+" ");
            }
            //bottom
            for (int j=endcol-1;j>=startcol;j--){
                if (startrow==endrow){
                    break;
                }
                System.out.print(matrix1[endrow][j]+" " );
            }
            //left
            for (int i=endrow-1;i>=startrow+1;i--){
                if (startcol==endcol){
                    break;
                }
                System.out.print(matrix1[i][startcol]+" ");
            }
            startrow++;
            endrow--;
            startcol++;
            endcol--;
        }
    }

    public static int diagonalsum(int matrix1[][] ){
        int sum=0;

        for (int i=0;i< matrix1.length;i++){
            //pd
            sum+=matrix1[i][i];
            //sd
            if (i!= matrix1.length-1-i);
            sum+=matrix1[i][matrix1.length-1-i];

        }
        return sum;
    }

    public static boolean starircasesearch(int matrix[][],int key){
        int row=0,col=matrix[0].length-1;
        while (row< matrix.length && col>=0){
            if (matrix[row][col]==key){
                System.out.print("key found at"+"("+row+","+col+")");
                return true;
            } else if (key<matrix[row][col]) {
                col--;

            }
            else {
                row++;
            }
        }
        System.out.println("key not found");
        return false;
    }

    public static void count(int mat[][]){
        int countof7=0;
        for (int i=0;i<mat.length;i++){
            for (int j=0;j<mat[0].length;j++){
                if (mat[i][j]==7){
                    countof7++;
                }
            }
        }
        System.out.println("count of 7 is "+countof7 );
    }

    public static void printmatrix(int matrix[][]){
        System.out.println("the matrix is : ");
        for (int i=0;i< matrix.length;i++){
            for (int j=0;j< matrix[0].length;j++){
                System.out.print(matrix[i][j]+"  ");
            }

        }
    }



    public static void main(String[] args) {

        System.out.println("Hello and welcome!");

        //CREATION OF 2D ARRAY

//        int matrix[][]=new int[3][3];
//        int n= matrix.length;int m=matrix[0].length;
//        Scanner sc=new Scanner(System.in);
//        for (int i=0;i<n;i++){
//            for (int j=0;j<m;j++){
//                matrix[i][j]= sc.nextInt();
//            }
//        }

        //print the array
//        for (int i=0;i<n;i++){
//            for (int j=0;j<m;j++) {
//                System.out.print(matrix[i][j]+" ");
//
//            }
//            System.out.println();
//
//        }

//        search(matrix,5);
            int matrix1[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
//            Spiralmatrix(matrix1);
        System.out.println(diagonalsum(matrix1));
//
//        int matrix[][]={{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
//        int key=33;
//        starircasesearch(matrix,key);


//print the 2 row
        int num[][]={{1,4,9},{11,4,3},{2,2,3}};
        int sum=0;
        for (int j=0;j<num[0].length;j++){
            sum+=num[1][j];

        }
        System.out.println("sum is "+sum);
//      count of 7
        int mat[][]={{4,7,8},{8,8,7}};
        count(mat);

        //transpose of matrix
        int matrix[][]={{2,3,7},{5,6,7}};
       int row=2,col=3;
       int transpose[][]=new int[col][row];
       for (int i=0;i<row;i++){
           for (int j=0;j<col;j++){
               transpose[j][i]=matrix[i][j];
           }
       }
       printmatrix(transpose);
        printmatrix(matrix);














    }
}