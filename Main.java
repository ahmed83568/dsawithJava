import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public  static boolean isPrime(int n){
        if (n==2){
         return true;
        }
        for (int i=2;i<=Math.sqrt(n);i++){
            if (n%i==0){
                return false;

            }

        }

        return true;
    }
//    public static boolean isprime(int n) {
////        corner case
////        for 2
//        if (n == 2) {
//            return true;
//        }
//
//        boolean isprime=true;
//        for (int i=2;i<=n-1;i++){
//            if(n%i==0){
//                isprime=false;
//                break;
//            }
//        }
//        return isprime;
//    }
//    public static boolean isrime(int n){
//        for ( int i=2;i<=n-1;i++){
//            if (n%i==0){
//                return false;
//            }
//        }
//        return true;
//    }
//    public static void primeinRange(int n){
//        for (int i=2;i<=n;i++){
//            if (isPrime(i)){
//                System.out.print(i+" ");
//            }
//        }
//    }
    public static void bintodec(int binNum){
        int mynum=binNum;
        int pow=0;
        int dec=0;
        while (binNum>0){
            int lastDig=binNum%10;
            dec=dec+(lastDig*(int)(Math.pow(2,pow)));
            pow++;
            binNum=binNum/10;
        }
        System.out.println("decimal of"+mynum+"=" + dec);
    }

    public static void dectobin(int n){
        int myno=n;
        int pow=0;
        int binno=0;
        while (n>0){
            int rem=n%2;
            binno=binno+(rem*(int)Math.pow(10,pow));
            pow++;
            n=n/2;
        }
        System.out.println("Binary form of"+myno+"="+binno);
    }
    public static int  sumDigits(int n) {
        int sumOfDigits=0;
        while(n>0) {
            int lastDigit=n%10;
            sumOfDigits+=lastDigit;
            n/=10;
        }
        return sumOfDigits;
    }
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.print("Input an integer: ");
//        int digits=sc.nextInt();
//        System.out.println("The sum is "+sumDigits(digits));
        dectobin(7);
        bintodec(1011);
//        int bin=1011;
//        int pow=0;
//        int dec=0;
//        while (bin>0){
//           int ld=bin%10;
//           dec=  (dec+(ld*(int)Math.pow(2,pow)));
//           pow++;
//           bin/=10;
//
//        }
//        System.out.println(dec);
        int n=7;
        int pow=0;
        int bin=0;
        while (n>0){
            int rem=n%2;
            bin=bin+(rem*(int)Math.pow(10,pow));
            pow++;
            n/=2;
        }
        System.out.println(bin);
//        primeinRange(100);
//        System.out.println(isrime(30));
//        System.out.println(isprime(2));
//        System.out.println(isPrime(2));
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
//        System.out.printf("Hello and welcome!");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
//        for (int i = 1; i <= 5; i++) {
//
//            // Press Shift+F9 to start debugging your code. We have set one breakpoint
//            // for you, but you can always add more by pressing Ctrl+F8.
//            System.out.println("i = " + i);
//        }
//        char a='a';
//        char b='b';
////        char c=b-a;
//        System.out.println((int)(a));
//        System.out.println((int)(b));
//        System.out.println(a-b);
//         short a=5;
//         byte b=10;
//         char c='c';
//         int bt=a+b+c;
//        int a=10;
////        float b= 20.5F;
////        long c=25;
////        double d=3;
////        long ans=(long)(a+b+c+d);
////        System.out.println(ans);
//        Scanner sc=new Scanner(System.in);
//        int a= sc.nextInt();
//        int b= sc.nextInt();
//        int c= sc.nextInt();
//        int avg=(a+b+c)/3;
//        System.out.println("average is: "+avg);
//        Scanner sc=new Scanner(System.in);
//        int square= sc.nextInt();
//        int area=square*square;
//        System.out.println("The arae of the square is :" + area);
//        Scanner sc=new Scanner(System.in);
//        float pencil= sc.nextFloat();
//        float pen=sc.nextFloat();
//        float eraser=sc.nextFloat();
//        float total=(pen+pencil+eraser);
//        System.out.println(total);
//        float newTotal= total+(0.18f*total);
//        System.out.println(newTotal);

//        int $ = 24;
//        System.out.println($);
//        //unary operation pre increment
//        int a=10;
//        int b=++a;
//        System.out.println(a);
//        System.out.println(b);
        //post increment
//        int a=10;
//        int b=a++;
//        System.out.println(a);
//       System.out.println(b);
//        int a=10;
//        int b=a++;
//        System.out.println(a);
////        System.out.println(b);
//        int a=10;
//        int b=--a;
//        System.out.println(a);
//        System.out.println(b);
//        int a=10;
//        int b=a--;
//        System.out.println(a);
//        System.out.println(b);
//        int a=10;
//        a-=10;
//        System.out.println(a);
//        int x = 2, y = 5;
//        int exp1 = (x * y / x);
//        int exp2 = (x * (y / x));
//        System.out.print(exp1 + " ,     " );
//        System.out.print(exp2);

//        int x = 200, y = 50, z = 100;
//        if(x > y && y > z){
//            System.out.println("Hello");
//        }
//        if(z > y && z < x){
//            System.out.println("Java");
//        }
//        if((y+200) < x && (y+150) < z){
//            System.out.println("Hello Java");
//        }
//        int x, y, z;
//        x = y = z = 2;
//        x += y;
//        y -= z;
//        z /= (x + y);
//        System.out.println(x + " " + y + " " + z);
//        int x = 9, y = 12;
//        int a = 2, b = 4, c = 6;
//        int exp = 4/3 * (x + 34) + 9 * (a + b * c) + (3 + y * (2 + a)) / (a + b*y);
//        System.out.println(exp);
//        int x = 10, y = 5;
//        int exp1 = (y * (x / y + x / y));
//        int exp2 = (y * x / y + y * x / y);
//        System.out.println(exp1);
//        System.out.println(exp2);
//        Scanner sc =new Scanner(System.in);
//        System.out.println("enter the age to check elegibility:");
//        int age=sc.nextInt();
//
//        if (age>18){
//            System.out.println("you are eligible to vote and drive");
//        }
//        else if (age>13 && age<18){
//            System.out.println("teenager");
//        }
//        else {
//            System.out.println("you are not eligible");
//        }
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter the no to find the largest one:");
//        int a= sc.nextInt();
//        int b=sc.nextInt();
//        if (a>b){
//            System.out.println("A is the largest one" +a);
//        }
//        else {
//            System.out.println("B is the largest one"+b);
//        }
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter the no to check even or odd");
//        int number= sc.nextInt();
//        if (number%2==0){
//            System.out.println("even");
//        }
//        else {
//            System.out.println("odd");
//        }
//    Scanner sc=new Scanner(System.in);
//        System.out.println("enter the income ");
//    int income=sc.nextInt();
//    int tax;
//
//    if (income<500000){
//        tax=0;
//    } else if (income>50000 && income<1000000) {
//        tax=(int)(income*0.2);
//    }
//    else {
//        tax=(int)(income*0.3);
//
//    }
//        System.out.println("your tax is " + tax);
//
//    int a=1,b=2,c=4;
//    if ((a>=b)&&(a>=c)){
//        System.out.println("largest is a");
//    }
//    else if (b>=c){
//        System.out.println("largest is b");
//    }
//    else {
//        System.out.println("largest is c");
//    }
    //ternary operators
//        int number=4;
//    Scanner sc=new Scanner(System.in);
//    int number= sc.nextInt();
//    String type=(number%2==0)?"even":"odd";
//        System.out.println(type);
//        Scanner sc=new Scanner(System.in);
//        int marks= sc.nextInt();
//        String type=(marks>=33)?"pass":"fail";
//        System.out.println(type);
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the no to order ");
//        int number= sc.nextInt();
//        switch (number){
//            case 1:
//                System.out.println("Samosa");
//                break;
//            case 2:
//                System.out.println("burger");
//                break;
//            case 3:
//                System.out.println("mango shake");
//                break;
//            default:
//                System.out.println("we are dreaming come in real world");
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter a : ");
//        int a=sc.nextInt();
//        System.out.println("enter b : ");
//        int b=sc.nextInt();
//        System.out.println("enter operator : ");
//        char operator=sc.next().charAt(0);
//        switch (operator){
//            case '+' :
//                System.out.println(a+b);
//                break;
//            case '-':
//                System.out.println(a-b);
//                break;
//            case '*':
//                System.out.println(a*b);
//                break;
//            case '/':
//                System.out.println(a/b);
//                break;
//            case '%':
//                System.out.println(a%b);
//                break;
//            default:
//                System.out.println("wrong operator");
//        }
//    Scanner sc=new Scanner(System.in);
//    int number=sc.nextInt();
//    if (number>0){
//        System.out.println("the no is positive");
//    }
//    else {
//        System.out.println("the no is negative");
//    }
//        Scanner sc=new Scanner(System.in);
//        System.out.print("Input the year: ");
//        int year=sc.nextInt();
//        boolean x= (year%4) ==0;
//        boolean y= (year%100) !=0;
//        boolean z= ((year%100==0) && (year%400==0));
//        if(x&& (y||z)) {
//            System.out.println(year+" is a leap year");
//        }
//        else{
//            System.out.println(year+" is not a leap year");
//        }
//        int i=0;
//        while (i<=100){
//            System.out.println("hello world " + i);
//            i++;
//        int no=1;
//        while (no<=10){
//            System.out.println(no);
//            no++;
//        }
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int counter=1;
//        while (counter<=n){
//            System.out.println(counter);
//            counter++;
//        }
//        Scanner sc=new Scanner(System.in);
//        int n= sc.nextInt();
//        int i=1;
//        int sum=0;
//        while (i<=n){
//            sum=sum+i;
//            i++;
//
//        }
//        System.out.println(sum);
//        for ( int i=1;i<=10;i++){
//            System.out.println("hello world"+ i);
//        }
//        int n=4;
//        for ( int i=1;i<=n;i++){
//            System.out.println("****");
//        }
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        while (n>0){
//            int lastDigit=n%10;
//            System.out.print(lastDigit+" ");
//            n=n/10;
//        }
//        System.out.println();
//        int n=108899;
//        int reverse=0;
//        while (n>0){
//            int lastDigit=n%10;
//            reverse=(reverse*10)+lastDigit;
//             n=  n/10;
//
//        }
//        System.out.println(reverse);
//        for (int i=1;i<=5;i++){
//            if (i==3)
//                break;
//            System.out.println(i);
//        }
//        Scanner sc=new Scanner(System.in);
//        do {
//            System.out.println("enter your no : ");
//            int n= sc.nextInt();
//            if (n%10==0){
//                break;
//            }
//            System.out.println(n);
//        }while (true);
//        for (int i=1;i<=5;i++){
//            if (i==3)
//                continue;
//            System.out.println(i);
//        }
//        Scanner sc=new Scanner(System.in);
//        do {
//            System.out.println("enter your no : ");
//            int n= sc.nextInt();
//            if (n%10==0){
//                continue;
//            }
//            System.out.println(n);
//        }while (true);
//        Scanner sc = new Scanner(System.in);
//        int number;
//        int choice;
//        int evenSum = 0;
//        int oddSum = 0;
//        do {
//            System.out.print("Enter the number ");
//            number = sc.nextInt();
//            if( number % 2 == 0) {
//                evenSum += number;
//            } else {
//                oddSum += number;
//            }
//            System.out.print("Do you want to continue? Press 1 for yes or 0 for no");
//                    choice = sc.nextInt();
//        } while(choice==1);
//        System.out.println("Sum of even numbers: " + evenSum);
//        print star
//        for (int i=1;i<=5;i++){
//            for (int j=1; j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
////        print inverted star
//        for (int i=5;i>=1;i--){
//            for (int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//
//        }
////        print inverted star
//        for (int i=1;i<=5;i++){
//            for (int j=1;j<=(5-i+1);j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
////      half pyramid with number
//        for (int i=1;i<=5;i++){
//            for (int j=1;j<=i;j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }
////        print the char
//        char ch='A';
//        for (int i=1;i<=5;i++){
//            for (int j=1;j<=i;j++){
//                System.out.print(ch);
//                ch++;
//
//            }
//            System.out.println();
//
//        }
//        for (int i=5;i>=1;i--){
//            for (int j=1;j<=i;j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }
//    int num=1;
//        for (int i=1; i<=5;i++){
//            for (int j=1;j<=i;j++){
//                System.out.print(num+" ");
//                num++;
//            }
//            System.out.println();
//        }
//        int space=0;
//        int n=14;
//        if (n==2){
//            System.out.println("prime no");
//        }
//        for (int i=2;i<=n-1;i++){
//            if(n%2==0){
//                System.out.println("not prime no");
//            }
//            else {
//                System.out.println("prime no");
//            }
//        }
        for(int i=4;i>=1;i--){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i=1;i<=4;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
//        char ch ='A';
//        for (int i=1;i<=4;i++){
//            for (int j=1;j<=i;j++){
//                System.out.print(ch);
//                ch++;
//            }
//            System.out.println();
//        }

        }
    }
