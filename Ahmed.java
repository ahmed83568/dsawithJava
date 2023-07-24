import java.util.Scanner;
import java.util.Arrays;
public class Ahmed {

    public static int calculateSum(int num1, int num2){//paraments or formal parameters
        int sum=num1+num2;
    return sum;


    }
    public static int factorial(int n){
        int f=1;
        for (int i=1;i<=n;i++){
            f*=i;
        }
     return f;
    }
    public static int multiply(int a, int b)
    {
        int prod=a*b;
        return prod;
    }
    public static float multiply(float a,float b ){
        return a*b;

    }

//    public static void swap (int a,int b){
//        int temp=a;
//        a=b;
//        b=temp;
//        System.out.println(a);
//        System.out.println(b);
//    }
//    public static void printSum(int a,int b){

//        int sum=a+b;
//        System.out.println(sum);
//    }
//    public static void printName(String name){
//        System.out.println(name);
//    }
//        public  static  void numberPyramid(int n){
////            outer loops
//            for (int i=1;i<=n;i++){
////                space
//                for (int j=1;j<=n-i;j++){
//                    System.out.print(" ");
//                }
////                number
//                for (int j=1;j<=i;j++){
//                    System.out.print(i+" ");
//                }
//                System.out.println();
//            }
//        }
//        public static void palindromic(int n){
////            outer loops
//            for (int i=1;i<=n;i++){
////                spaces
//                for (int j=1;j<=n-i;j++){
//                    System.out.print(" ");
//                }
////                descending
//                for (int j=i;j>=1;j--){
//                    System.out.print(j);
//                }
////                ascending
//                for (int j=2;j<=i;j++){
//                    System.out.print(j);
//                }
//                System.out.println();
//            }
//        }
    public static int bincoeff(int n,int r){
        int fac_n=factorial(n);
        int fac_r=factorial(r);
        int fac_nmr=factorial(n-r);

        int bincoeff=fac_n/(fac_r*fac_nmr);
        return bincoeff;
    }
    public static int sum(int a, int b){
        return a+b;
    }
    public static float sum(float a,float b){
        return a+b;
    }

    public static void main(String[] args) {

//        System.out.println(sum(3,2));
//        System.out.println(sum(3.2f,4.8f));
//        System.out.println(bincoeff(5,2));
//        int a=5;
//        int b=10;
//        swap(a,b);
//        int prod=multiply(13,5);
//        System.out.println(prod);
//        System.out.println(factorial(7));


//        Scanner sc=new Scanner(System.in);
//        int a=sc.nextInt();
//        int b= sc.nextInt();
//         int sum=calculateSum(a,b);//arguments or actual  parameters
//        System.out.println(sum);

//            palindromic(5);
//            numberPyramid(5);
//            numberPyramid(8);
//        printSum(12,39);
//        printSum(34,43);
//        printName("ahmed");
//        printName("zaid");
//        printName("akthar");
//        System.out.println("*****");
//        System.out.println("   *");
//        System.out.println("  *");
//        System.out.println(" *");
//        System.out.println("*****");
//  concatination
//        String name1 = new String("Ahmed");
//        String description = new String("is a good boy.");
//
//        String sentence = name1 + description;
//        System.out.println(sentence);

//        String name = new String("ahmed");
//        System.out.println(name.replace('a', 'h'));
//        String name = new String("AhmedAndAkthar");
//        System.out.println(name.substring(0,14));

//        float price = 100.00F;
//        int gst = 18;
//        float finalPrice = price + gst;
//        System.out.println(finalPrice);

//        int price = 100;
//        float gst = 18.00F;
//        int finalPrice = price + (int)gst;
//        System.out.println(finalPrice);
//        int x=15;
//        int y=10;
//        int sum=x+y;
//        int prd=x*y;
//        System.out.println(sum);
//        System.out.println("sum of " + x + " and " + y + " is "+sum);
//        System.out.println("product of " + x + " and " + y + " is "+prd);
//        int exp=(x * y )/ (x+y);
//        System.out.println(exp);
//        int x=21;
//        if (x%2==0){
//            System.out.println(x+"is even");
//        }
//        else{
//            System.out.println(x+"is odd");
//        }
//        int n1=20;
//        int n2=20;
//        if (n1==n2){
//            System.out.println(n1+" is equal to " + n2);
//        }
//        else if (n1>n2){
//            System.out.println(n1+" is greater than "+n2);
//        }
//        else{
//            System.out.println(n1+" is smaller than "+n2);
//        }
// grading system
//        Scanner scn=new Scanner(System.in);
//        int marks=scn.nextInt();
////        int z=24;
//        if (marks>90) {
//            System.out.println(  "your mark is excellent");
//        }
//        else if (marks>80){
//            System.out.println("your mark is very good");
//        }
//        else if (marks>70){
//            System.out.println( "your mark is  good");
//        }
//        else if (marks>60){
//            System.out.println("your mark is fair");
//        }
//        else if (marks>50){
//            System.out.println( "your mark is not good");
//        }
//        else if (marks>40){
//            System.out.println( "you fail");
//        }
//
//
//        else {
//            System.out.println("mark cannot be greater than 100");
//
//        }
//        int [] marks=new int[6];
//        marks[0]=97;
//        marks[1]=98;
//        marks[2]=91;
//        marks[3]=49;
//        marks[4]=53;
//        marks[5]=89;
//        System.out.println(marks[4]);
//        //sorts
//        System.out.println(marks[0]);
//        Arrays.sort(marks);
//        System.out.println(marks[1]);
//        int [] marks={91,98,97};
//        int [] [] finalMark={{95,97,98},{89,88,73}};
//        System.out.println(finalMark[1][2]);
//        double price=100.50;
//        double fp=price+18;
//        System.out.println(fp);
//        int p= 100;
//        int Fp=p+(int)18.76;
//        System.out.println(Fp);

        //const
//        final int age=21;
//        int  age1=30;
//        System.out.println(age);
//        System.out.println(age1);

        //maths
//        System.out.println(Math.max(5,6));
//        System.out.println((int)(Math.random()*100));
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter your name :");
//        int age= sc.nextInt();
//        System.out.println("your age is" + age);
//            String name= sc.nextLine();
//        System.out.println(name);
//        boolean isSunup=true;
//        if (isSunup==true){
//            System.out.println("day");
//        }
//        else {
//            System.out.println("night");
//        }
//        int a = 90;
//        int b = 30;
//        if (a<50 && b<50){
//            System.out.println("both the no are less than 50");
//        }
//        else {
//            System.out.println("not less than 50");
//        }
//        if (a<50 || b<50){
//            System.out.println("atleast  one no is less than 50");
//        }
//        boolean isAdult=true;
//            if (isAdult){
//                System.out.println("is adult");
//            }
//            else {
//                System.out.println("not adult");
//            }
//        System.out.println("ahmed");
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter the amount you have:");
//        int cash =sc.nextInt();
//        if(cash<10){
//            System.out.println("connot buy anything");
//        } else if (cash>10 && cash<50) {
//            System.out.println("can buy one thing");
//
//        }
//        else {
//            System.out.println("can buy both the thing");
//        }
//        int day=5;
//        switch (day){
//            case 1:
//                System.out.println("monday");
//                break;
//            case 2:
//                System.out.println("tuesday");
//                break;
//            default:
//                System.out.println("wed-sun");
//        }
//        for( int i=0;i<=100;i++){
//            System.out.println(i);
//        }
//        for( int i=100;i>=0;i--){
//            System.out.println(i);
//        }
        //while lops
//        int j = 1;
//        while (j <= 100) {
//            System.out.println(j);
//            j++;
//          }
//        int j=100;
//        while (j>=1){
//        System.out.println(j);
//            j--;
//        }
//        int k=100;
//        do {
//            System.out.println(k);
//            k--;
//        }while (k>=1);
//        int k=1;
//        do {
//            System.out.println(k);
//            k++;
//        }while (k<=100);
//        Scanner sc=new Scanner(System.in);
//        int number=0;
//        do {
//            System.out.println("input a number");
//            number= sc.nextInt();
//            System.out.println("here is your no");
//            System.out.println(number);
//        }while (number>=0);
//        System.out.println("the end");
            //mini project
//        Scanner sc =new Scanner(System.in);
//        int myNumber=(int)(Math.random()*100);
//        int userNumber=0;
//
//        do {
//            System.out.println("guess my number()1-100 : ");
//           userNumber=sc.nextInt();
//            if (userNumber==myNumber){
//                System.out.println("Wooho....Correct answer!!!");
//                break;
//            } else if (userNumber>myNumber) {
//                System.out.println("your no is to large");
//            }
//            else {
//                System.out.println("your no is to small");
//            }
//        }while (userNumber>=0);
//        System.out.println("my number was:");
//        System.out.println(myNumber);
//            Scanner sc=new Scanner(System.in);
////        System.out.println("enter a number");
//
//        int t=sc.nextInt();
//            for (int i=0;i<t;i++){
//                int n= sc.nextInt();
//
//                int count=0;
//                for (int div=2;div*div<=n;div++){
//                    if (n%div==0){
//                        count++;
//                        break;
//
//                    }
//                }
//                if (count==0){
//                    System.out.println("prime");
//                }else {
//                    System.out.println("not prime");
//                }
//            }
//            Scanner sc=new Scanner(System.in);
//            int low=sc.nextInt();
//            int high=sc.nextInt();
//
//            for (int n=low;n<=high;n++){
//                int count=0;
//
//            for (int div=2;div*div<=n;div++){
//                if (n%div==0){
//                    count++;
//                    break;
//                }
//            }
//            if(count==0){
//                System.out.println(n);
//            }
//            Scanner sc= new Scanner(System.in);
//            int n=sc.nextInt();
//            int a=0;
//            int b=1;
//            for (int i=0;i<n;i++){
//                System.out.println(a);
//              int  c=a+b;
//              a=b;
//              b=c;
//
//            }
//        Scanner ab=new Scanner(System.in);
//        int n=ab.nextInt();
//
//        int dig=0;
//        while (n!=0){
//            n=n/10;
//            dig++;
//        }
//        System.out.println(dig);
//        Scanner sc=new Scanner(System.in);
//        int n= sc.nextInt();
//
//        int nod=0;
//        int temp =n;
//        while (temp!=0){
//            temp=temp/10;
//            nod++;
//        }
//        int div=(int)Math.pow(10,nod-1);
//        while (div!=0){
//            int q=n/div;
//            System.out.println(q);
//
//            n=n%div;
//            div=div/10;
//
//        }
//        Scanner sc= new Scanner(System.in);
//        int n= sc.nextInt();
//        while (n>0) {
//            int dig=n%10;
//        n=n/10;
//            System.out.println(dig);
//        }
//        Scanner sc=new Scanner(System.in);
//        int n= sc.nextInt();
//
//        int val=1;
//        int sum=0;
//        while (val<=n){
//            sum=sum+val;
//            val++;
//        }
//        System.out.println(sum);
//
//        System.out.println("****");
//        System.out.println("***");
//        System.out.println("**");
//        System.out.println("*");
//
//        Scanner sc=new Scanner(System.in);
//        int a= sc.nextInt();
//        int b= sc.nextInt();
//        int sum=a+b;
//        System.out.println(sum);
//      area of circle
//        Scanner sc=new Scanner(System.in);
//        float rad=sc.nextFloat();
//        float area= 3.14f*rad*rad;
//        System.out.println(area);
//    type conversion
//        int a=20;
//        float b=a;
//        System.out.println(b);
// type casting
//        float a = 25.12f ;
//        int b=(int)a;
//        System.out.println(b);
//        char ch='a';
//        char ch2='A';
//        int no=ch;
//        int no2=ch2;
//        System.out.println(no);
//        System.out.println(no2);
//        swapping of two no

    }

            }






