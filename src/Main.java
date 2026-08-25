import java.util.Arrays;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        int [] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        double [] arr2 = {1.57, 7.654, 9.986};
        int [] arr3 = {90, 88, 71};
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.println();
        for (int i = 0; i < arr2.length; i++) {
            if (i == arr2.length - 1) {
                System.out.print(arr2[i]);
            } else {
                System.out.print(arr2[i] + ", ");
            }
        }
        System.out.println();
        for (int i = 0; i < arr3.length; i++) {
            if (i == arr3.length - 1) {
                System.out.print(arr3[i]);
            } else {
                System.out.print(arr3[i] + ", ");
            }
        }
        System.out.println();
        for (int i = arr.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.println();
        for (int i = arr2.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(arr2[i]);
            } else {
                System.out.print(arr2[i] + ", ");
            }
        }
        System.out.println();
        for (int i = arr3.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(arr3[i]);
            } else {
                System.out.print(arr3[i] + ", ");
            }
        }
        System.out.println();
        for (int i = 0; i < arr.length;) {
            if (arr[i] % 2 == 0) {
                i++;
            } else {
                arr[i] += 1;
            }
        }
        System.out.println(Arrays.toString(arr));






    }
}