
public class  Main {

    public static void Bubblesort(int arr[]){
        for ( int turn=0;turn< arr.length-1;turn++){
            for (int j=0;j< arr.length-1-turn;j++){
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    public static void selectionsort(int arr[]){
        for (int i=0;i< arr.length-1;i++){
            int minpos=i;
            for (int j=i+1;j< arr.length;j++){
                if (arr[minpos]>arr[j])
                    minpos=j;

            }
            //swaps
            int temp=arr[minpos];
            arr[minpos]=arr[i];
            arr[i]=temp;

        }
    }

    public static void Insertionsort(int arr[]){
        for (int i=1;i< arr.length;i++){
            int curr=arr[i];
            int prev=i-1;
            //finding out the correct pos to insert
            while (prev>=0&&arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            //insertion
            arr[prev+1]=curr;
        }

    }
    public static void countingsort(int arr1[]){
        int largest=Integer.MIN_VALUE;
        for (int i=0;i< arr1.length;i++){
            largest=Math.max(largest,arr1[i]);
        }
        int count[]=new int[largest+1];

        for (int i=0;i< arr1.length;i++){
            count[arr1[i]]++;
        }
        //sorting
        int j=0;
        for (int i=0;i< count.length;i++){
            while (count[i]>0){
                arr1[j]=i;
                j++;
                count[i]--;
            }
        }
    }
    public static void printarray1(int arr1[]){
        for (int i=0;i< arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
    }



    public static void printArr(int arr[]){
        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        System.out.println("Hello and welcome!");

        int arr[]={5,4,1,3,2};

        Bubblesort(arr);
        selectionsort(arr);
        Insertionsort(arr);
        printArr(arr);
        printArr(arr);
        printArr(arr);

        int arr1[]={1,4,1,3,2,4,3,7};
        countingsort(arr1);
        printarray1(arr1);






        }

}
