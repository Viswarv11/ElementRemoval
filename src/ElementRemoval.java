import java.util.Arrays;
import java.util.Scanner;

public class ElementRemoval {
    public static int cost(int []array,int size){
        int temp=0;
        for (int i = 0; i < size; i++) {
            for(int j=i+1;j<size;j++){
                if(array[i]<array[j]){
                    temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
        int cost=0;
        for (int i = 0; i < size; i++) {
            cost+=array[i];
            for(int j=i+1;j<size;j++){
                cost+=array[j];
            }}
        return cost;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size=scanner.nextInt();
        System.out.println("enter the array elements");
        int array[]=new int[size];
        for (int i = 0; i < size; i++) {
            array[i]=scanner.nextInt();
        }
        System.out.println(cost(array,size));
    }
}
