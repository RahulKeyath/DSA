import java.util.Scanner;
import java.util.ArrayList;

public class LinearSearch {
    int Search(ArrayList<Integer> arr, int x){
        for (int i = 0; i < arr.size(); i++){
            if (arr.get(i) == x){
                return i; // Return the index of the found element
            }
        }
        return -1; // Return -1 if not found
    }
    public static void main(String[] args){

        ArrayList<Integer> arr = new ArrayList<Integer>();
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of elements to be added to array: ");
        int size = scan.nextInt();

        for (int index = 0; index < size; index ++){
            System.out.print("Enter element number at index " + index + ": ");
            int value = scan.nextInt();
            arr.add(index, value);
        }
        System.out.println(arr);
        
        LinearSearch S = new LinearSearch();

        System.out.print("Enter element to be searched: ");
        int element = scan.nextInt();
        
        int result = S.Search(arr, element);
        
        if (result == -1){
            System.out.println("The element is not present in the array");
        }
        else {
            System.out.println("The eleement is present at the index number: "+result);
        }
    }
}
