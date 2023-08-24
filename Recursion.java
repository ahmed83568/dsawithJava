
public class Recursion {

        public static void printDec(int n){
            if (n==1){
                System.out.println(n);
                return;
            }
            System.out.print(n+" ");
            printDec(n-1);
        }

        public static void printinc(int n){
            if (n==1){
                System.out.println(n);
                return;
            }
            printinc(n-1);
            System.out.print(n+" ");
        }


        public static int factno(int n){
            if (n==0){
                return 1;
            }
            int fnm1=factno(n-1);
            int fn=n*factno(n-1);
            return fn;

        }

        public static int sumnn(int n){
            if (n==1){
                return 1;
            }
            int snm1=sumnn(n-1);
            int sn=n+sumnn(n-1);
            return sn;
        }

        public static int fibno(int n){
            if (n==0||n==1){
                return n;

            }
            int fnm1=fibno(n-1);
            int fnm2=fibno(n-2);
            int fn=fnm1+fnm2;
            return fn;
        }

        public static boolean issorted(int arr[],int i){
            if (i==arr.length-1){
                return true;
            }
            if (arr[i]>arr[i+1]){
                return false;
            }
             return issorted(arr,i+1);
        }

        public  static int firtsOccur(int arr1[],int key,int i){
            if (i== arr1.length){
                return -1;
            }
            if (arr1[i]==key){
                 return i;
            }
            return firtsOccur(arr1,key,i+1);
        }

        public static int lastoccur(int arr1[],int key,int i){
            if(i==arr1.length){
                return -1;
            }
            int isFound=lastoccur(arr1,key,i+1);
            if (isFound==-1&&arr1[i]==key ){
                return i;
            }
            return isFound;
        }

        public static int powern(int x,int n){
            if (n==0){
                return 1;
            }
            return x*powern(x,n-1);
        }

        public static int optimizedpower(int x,int n){
            if (n==0){
                return 1;
            }
            int halfpower=optimizedpower(x,n/2);
            int halfpowersqr=halfpower*halfpower;
            if (n%2!=0){
                halfpowersqr=x*halfpowersqr;
            }
            return halfpowersqr;
        }


        public static int problemTiles(int n){
            //base class
            if (n==0||n==1){
                return 1;
            }
//            //vertical case
//            int fnm1=problemTiles(n-1);
//            //horizontal case
//            int fnm2=problemTiles(n-2);
//            //totalways
//            int tot=fnm1+fnm2;
            return problemTiles(n-1)+problemTiles((n-2));
        }

        public static void removeduplicates(String st, int idx, StringBuilder newStr, boolean[] map){
            //base
            if (idx==st.length()){
                System.out.println(newStr);
                return;
            }
            //kaam
            char currChar=st.charAt(idx);
            if (map[currChar-'a']==true){
                removeduplicates(st,idx+1,newStr,map);
            }
            else {
                map[currChar-'a']=true;
                removeduplicates(st,idx+1,newStr.append(currChar),map);
            }
        }

        public static int Friendspairing(int n){
            //base
            if (n==1||n==2){
                return n;
            }
//            //choice
//            //single
//            int fnm1=Friendspairing(n-1);
//            //pair
//            int fnm2=Friendspairing(n-2);
//            int pairways=(n-1)*fnm2;
//            //totways
//            int totways=fnm1+pairways;
//            return totways;
            return Friendspairing(n-1)+(n-1)*Friendspairing(n-2);
        }

        public static void printBinstring(int n,int lastPlace,String str){
            //base
            if (n==0){
                System.out.println(str);
                return;
            }
            printBinstring(n-1,0,str+"0");
            if (lastPlace==0){
                printBinstring(n-1,1,str+"1");
            }
        }

    public static void main(String[] args) {
//        System.out.printf("Hello and welcome!");
//        int n=5;
//        printDec(n);
//        printinc(n);
//        System.out.println(factno(3));
//        System.out.println(sumnn(5));
//        int arr[]={1,2,3    ,4,5};
//        System.out.println(issorted(arr,0));

        int arr1[]={8,3,6,9,5,10,2,5,3};
//        System.out.println(firtsOccur(arr1,5,0));
//        System.out.println(lastoccur(arr1,5,0));

//        System.out.println(powern(2,10));
//        System.out.println(optimizedpower(2,10));
        System.out.println(problemTiles(4));
        String st="ahmedrazakhan";
        removeduplicates(st,0,new StringBuilder(""),  new  boolean [26]);
        System.out.println(Friendspairing(4));
        printBinstring(3,0,"");



    }
}