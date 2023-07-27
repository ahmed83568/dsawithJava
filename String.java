import java.util.Scanner;

public class String {

    public static void printletter(java.lang.String str){
        for (int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }
    public static boolean isPalindrome(java.lang.String str){
        for (int i=0;i<str.length()/2;i++){
            int n=str.length();
            if (str.charAt(i)!=str.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }

    public static float shortestpath(java.lang.String path){
        int x=0,y=0;
        for (int i=0;i<path.length();i++){
            char dir=path.charAt(i);
            //south
            if (dir=='S'){
                y--;
            }
            //north
            else if (dir=='N') {
                y++;
            }
            //west
            else if (dir=='W') {
                x--;
            }
            else {
                x++;
            }
        }
        int X2=x*x;
        int Y2=y*y;
        return (float) Math.sqrt(X2+Y2);

    }

    public static java.lang.String substring(java.lang.String sttr, int si, int ei){
        java.lang.String substr="";
        for (int i=si;i<ei;i++){
            substr+=sttr.charAt(i);
        }
        return substr;
    }

    public static java.lang.String touppercase(java.lang.String st){
        StringBuilder sb=new StringBuilder("");

        char ch=Character.toUpperCase(st.charAt(0));
        sb.append(ch);
        for (int i=1;i<st.length();i++){
            if (st.charAt(i)==' ' && i<st.length()-1){
                sb.append(st.charAt(i));
                i++;
                sb.append(Character.toUpperCase(st.charAt(i)));

            }
            else {
                sb.append(st.charAt(i));
            }
        }
        return sb.toString();


    }

    public static java.lang.String stringcompression(java.lang.String stri){
        java.lang.String newstr="";

        for (int i=0;i<stri.length();i++){
            Integer count=1;
            while (i<stri.length()-1&& stri.charAt(i)==stri.charAt(i+1)){
                count++;
                i++;
            }
            newstr+=stri.charAt(i);
            if (count>1){
                newstr+=count.toString();
            }
        }
        return newstr;
    }

    //vowels count
    public static java.lang.String vowelcount(java.lang.String str){
        java.lang.String stor=new Scanner(System.in).next();
        int count=0;

        for (int i=0;i<stor.length();i++){
            char ch= stor.charAt(i);
            if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                count++;
            }
        }
        System.out.println("count of vowels is "+count);


        return stor;
    }



    public static void main(java.lang.String[] args) {

        System.out.println("Hello and welcome!");
    //string
//        String str="Ahmed";
//        String str2=new String("ahmed raza");
//        System.out.println(str);
//        System.out.println(str2);
        //to print the length
//        System.out.println(str.length());
        //input
//        Scanner sc=new Scanner(System.in);
//        String name;
//        name= sc.nextLine();
//        System.out.println(name);

        java.lang.String fname="Ahmed";
        java.lang.String lname="Khan";
        java.lang.String fullname=fname+" "+lname;
        System.out.println("This is"+fullname);
        System.out.println(fullname.charAt(1));
        printletter(fullname);

        //ispalindrome
        java.lang.String str="racecar";
        System.out.println(isPalindrome(str));

        //shortest path
        java.lang.String path="WNEENESENNN";
        System.out.println(shortestpath(path));

        //string comaprison

        java.lang.String str1="ahmed";
        java.lang.String str2="ahmed";
        java.lang.String str3=new java.lang.String("ahmed");

        if (str1==str2){
            System.out.println("strings are equal");
        }
        else {
            System.out.println("string are not equal");
        }
        if (str1==str3){
            System.out.println("strings are equal");
        }
        else {
            System.out.println("string are not equal");
        }
        //it is use to equal
        if (str1.equals(str3)){
            System.out.println("strings are equal");
        }
        else {
            System.out.println("string are not equal");
        }
        java.lang.String sttr="helloworld";
        System.out.println(sttr.substring(0,5));
//        System.out.println(substring(sttr,0,4));
        java.lang.String fruits[]={"apple","banana","mango"};
        java.lang.String largest=fruits[0];
        for (int i=1;i<fruits.length;i++) {
            if (largest.compareTo(fruits[i]) < 0) {
                largest = fruits[i];
            }

        }
        System.out.println(largest);

        java.lang.String name[]={"khan","ahmed","raza"};
        java.lang.String lar=name[0];
        for (int i=1;i< name.length;i++){
            if (lar.compareTo(name[i])<0){
                largest=name[i];
            }
        }
        StringBuilder sb=new StringBuilder("");
        for(char ch='a';ch<='z';ch++){
            sb.append(ch);

        }
        System.out.println(sb.length());

        java.lang.String st="hi, i am ahmed";
        System.out.println(touppercase(st));


        //string compression
        java.lang.String stri="aaabbbcccdd";
        System.out.println(stringcompression(stri));
        System.out.println(vowelcount(str));









        }
    }
