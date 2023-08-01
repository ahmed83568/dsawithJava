
public class Bit_manipulation {

    public static void Oddeven(int n){
        int bitmasks=1;
        if ((n&bitmasks)==0){
            System.out.println("even number");
        }
        else {
            System.out.println("odd number");
        }
    }
    public static int getIthBit(int n,int i){
        int bitmask=1<<i;
        if ((n&bitmask)==0){
            return 0;
        }
        else {
            return 1;
        }
    }

    public static int setIthbit(int n,int i) {
        int bitmask = 1<<i;
        return n|bitmask;
    }

    public static int clearIthbit(int n,int i){
        int bitmask=~(1<<i);
        return n&bitmask;

    }
    public static int updateIthbit(int n,int i,int newbit) {
        if (newbit == 0) {
            return clearIthbit(n, i);
        }
        else
            return setIthbit(n,i);
    }

    public static int clearIbit(int n, int i){
        int bitmask=(~0)<<i;
        return n&bitmask;
    }

    public static int clearrangebit(int n,int i,int j){
        int a=(~0)<<(j+1);
        int b=(1<<i)-1;
        int bitmask=a|b;
        return n&bitmask;
    }

    public static boolean ispoweroftwo(int n){
        return(n&(n-1)) == 0;
    }

    public static int countsetbit(int n){
        int count=0;
        while (n>0){
            if ((n&1)!=0){
                count++;
            }
           n= n>>1;
        }
        return count;
    }

    public static int fastExpo(int a,int n){
        int ans=1;
        while (n>0){
            if ((n&1)!=0){
                ans=ans*a;
            }
            a=a*a;
            n=n>>1;

        }
        return ans;
    }




    public static void main(String[] args) {

        System.out.println("Hello and welcome!");

        //and operator

        System.out.println(5&6);//4
        System.out.println(8&9);//8


        //OR operator

        System.out.println(5|6);//7

        //XOR operator
        System.out.println(5^6);//3


        //Not operator
        System.out.println(~5);//-6

        System.out.println(~0);//-1

        Oddeven(3);
        Oddeven(4);
        Oddeven(43);

        System.out.println(getIthBit(10,2));

        System.out.println(setIthbit(10,2));

        System.out.println(clearIthbit(10,1));

        System.out.println(updateIthbit(10,2,1));

        System.out.println(clearIbit(15,2));

        System.out.println(clearrangebit(10,2,4));

        System.out.println(ispoweroftwo(15));
        System.out.println(ispoweroftwo(8));

        System.out.println(countsetbit(15));
        System.out.println(countsetbit(10));

        System.out.println(fastExpo(3  ,5));

        System.out.println(3^4);

//        int x=3,y=4;
//        System.out.println("before swap: x="+x+"and y:="+y);

        //swapping xor
//        x=x^y;
//        y=x^y;
//        x=x^y;
//        System.out.println("after swap :x="+ x +"and y:"+y);


        int x=6;
        System.out.println(x+"+"+1+"is"+-~x)    ;

        int y=-4;
        System.out.println(y+"+"+1+"is"+-~y);


        }
    }
