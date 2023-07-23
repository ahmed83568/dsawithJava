import java.util.SortedMap;

public class Main {

    public static void array(int[] marks){
        for (int i=0;i< marks.length;i++){
            marks[i]=marks[i]+1;
        }

    }
    public static int Linearsearch(int numbers[],int key){
        for (int i=0;i< numbers.length;i++){
            if (numbers[i]==key){
                return i;
            }
        }
        return -1;
    }

    public static int getLargest(int number[]){
        int largest=Integer.MIN_VALUE;
        for (int i=0;i<number.length;i++){
            if(largest<number[i]){
                largest=number[i];
            }

        }
        return largest;
    }
    public static int getSmallest(int number[]){
        int smallest=Integer.MAX_VALUE;
        for (int i=0;i< number.length;i++){
            if (smallest>number[i]){
                smallest=number[i];
            }
        }
        return smallest;
    }
    //binary search
    public static int binarySearch(int number[],int key){
        int start=0,end=number.length-1;
        while (start<=end){
            int mid=(start+end)/2;
            //comparisons
            if (number[mid]==key){
                return mid;
            } else if (number[mid]<key) {
                    start=mid+1;
            }
            else {
                end=mid-1;
            }
        }
        return -1;
    }
    public static void reversearray(int reverse[]){
        int first=0,last= reverse.length-1;
        while (first<last){
            int temp=reverse[last];
            reverse[last]=reverse[first];
            reverse[first]= temp;

            first++;
            last--;
        }
    }
    public static void printPairs(int num[]){
        int tp=0;
        for (int i=0;i< num.length;i++){
            int curr=num[i];
            for (int j=i+1;j< num.length;j++){
                System.out.print("("+curr+","+num[j]+")");
                tp++;
            }

            System.out.println();
        }
        System.out.println("total pairs is " +tp);
    }
    public static void printsubarray(int num[]){
        int ts=0;
        for (int i=0;i< num.length;i++){
            int start=i;
            for (int j=i;j< num.length;j++){
                int end=j;
                for (int k=start;k<=end;k++){//print
                    System.out.print(num[k]+" ");
                }
                ts++;
                System.out.println();

            }
            System.out.println();

        }
        System.out.println("total subarray = "+ ts);

    }
    public static void Maxsubarray(int num[]){//brute force
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i< num.length;i++){
            int start=i;
            for (int j=i;j< num.length;j++){
                int end=j;
                currsum=0;
                for (int k=start;k<=end;k++){
                    currsum+=num[k];
                }
                System.out.println(currsum);
                if (maxsum<currsum){
                    maxsum=currsum;
                }
            }
        }
        System.out.println("max sum is "+ maxsum);

    }
    public static void maxsubaaray(int ms[]){//prefix sum
        int curr=0;
        int max=Integer.MIN_VALUE;
        int prefix[]=new int[ms.length];
         //calculate prefix
        prefix[0]=ms[0];
        for (int i=1;i< prefix.length;i++){
            prefix[i]=prefix[i-1]+ms[i];
        }

        for (int i=0;i< ms.length;i++){
            int start=i;
            for (int j=1;j< ms.length;j++){
                int end=j;
                curr=start==0?prefix[end]: prefix[end]-prefix[start-1];

                if (max<curr){
                    max=curr;
                }
            }

        }
        System.out.println("Max Sum is "+max);

    }
    public static void kadanes(int numbers1[]){
        int ms=Integer.MIN_VALUE;
        int cs=0;


        for (int i=0;i< numbers1.length;i++){
            cs=cs+numbers1[i];
            if (cs<0){
                cs=0;
            }
            ms=Math.max(cs,ms);
        }
        System.out.println("max sum is "+ ms);
    }
    public static int Trappedrainwater(int height[]){
        int n=height.length;
        //left max
        int leftmax[]=new int[n];
        leftmax[0]=height[0];
        for (int i=1;i<n;i++){
            leftmax[i]=Math.max(height[i],leftmax[i-1]);
        }


        //right max
        int rightmax[]=new int[n];
        rightmax[n-1]=height[n-1];
        for (int i=n-2;i>=0;i--){
            rightmax[i]=Math.max(height[i],rightmax[i+1]);

        }
        int trappedwater=0;
        //loop
        for (int i=0;i<n;i++){
            //waterlevel
            int waterlevel=Math.min(leftmax[i],rightmax[i]);
            //trapped water
            trappedwater+=waterlevel-height[i];

        }
        return trappedwater;


    }
    public static int buyandsellstocks(int prices[]){
        int buyprice=Integer.MAX_VALUE;
        int maxprofit=0;

        for (int i=0;i<prices.length;i++){
            if (buyprice<prices[i]){
                int profit=prices[i]-buyprice;
                maxprofit=Math.max(maxprofit,profit);
            }
            else {
                buyprice=prices[i];
            }
        }
        return maxprofit;
    }


    public static void main(String[] args) {
    //CREATION OF ARRAY
        System.out.print("Hello and welcome!");
//        int marks[]=new int[50];
//        int number[]={1,2,3,4,5};
        String fruits[]={"apple","banana","mango"};

        //ARRAY AS A FUNCTION
        int marks[]={97,98,99};
        array(marks);
        for (int i=0;i< marks.length;i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println();

        //Linear search time complexity is O(n)
        int numbers[]={2,4,6,8,10,};
        int key=10;

        int index=Linearsearch(numbers,key);
        if (index==-1){
            System.out.println("key not found");
        }
        else {
            System.out.println("key found at " + index);
        }
        //BINARY SEARCH time compexity is O(logn)
        System.out.println("index for key is "+binarySearch(numbers,key));
        //GET LARGEST VALUE
        //GET SMALLEST VALUE
        int number[]={1,2,6,3,5};
        System.out.println("smallest value is "+ getSmallest(number));
        System.out.println("largest value is "+getLargest(number));
        //Reverse of array Time complexity is O(1)

        int reverse[]={2,4,6,8,10};
        reversearray(reverse);
        for (int i=0;i<reverse.length;i++){
            System.out.print(reverse[i]+" ");
        }
        System.out.println();
        int num[]={2,4,6,8,10};
        printPairs(num);
        printsubarray(num);
        Maxsubarray(num);

        int ms[]={1,-2,6,-1,3};
        maxsubaaray(ms);

        int numbers1[]={ -2,-3,4,-1,-2,1,5,-3};
        kadanes(numbers1);
        int height[]={4,2,0,6,3,2,5};
        System.out.println(Trappedrainwater(height));

        int prices[]={7,1,5,3,6,4};
        System.out.println(buyandsellstocks(prices));



    }


}