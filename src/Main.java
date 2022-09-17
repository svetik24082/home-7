import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(" Задание 1.1 ");
        int[] nums = new int[3];
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;

        for (int i = 0; i < 3; i++) {
            System.out.println(nums[i]);
        }
        System.out.println(" Задание 1.2 ");

        double[] nums2 = {1.57, 7.654, 9.986};
        for (int i = 0; i < nums2.length; i++) {
            System.out.println(nums2[i]);
        }

        System.out.println(" Задание 1.3 ");
        int[] nums3 = {1, 2, 3, 4, 5};
        for (int i = 0; i < nums3.length; i++) {
            System.out.println(nums3[i]);
        }


        System.out.println(" задача 2 ");
        nums = new int[3];
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;


        for (int i = 0; i < nums.length; i++) {
            if ( i != nums.length-1) {
                System.out.print(nums[i] + " , ");
            }else {
                System.out.println( nums[i]);
            }

        }
        System.out.println();
        double[] nums4 = {1.57, 7.654, 9.986};
        for (int i = 0; i < nums4.length; i++) {
            if ( i != nums4.length-1) {
            System.out.print(nums4[i] + " , ");
            }else {
                System.out.println(nums4[i]);
            }


        }
        System.out.println();
        int[] nums5 = {1, 2, 3, 4, 5};
        for (int i = 0; i < nums5.length; i++) {
            if ( i != nums5.length-1) {
                System.out.print(nums5[i] + " , ");
            }else {
                System.out.println(nums5[i]);

            }
        }
        System.out.println();
        System.out.println(" Задача 3 ");
        nums = new int[3];
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;
        for (int  i = nums.length-1;i >= 0; i--) {
            if (i!=0) {
                System.out.print(nums[i] + ", ");
            } else {
                System.out.print(nums[i] );
            }

        }
        System.out.println();
        double[] nums6 = {1.57, 7.654, 9.986};
        for (int i = nums6.length - 1; i >= 0; i--) {
            if (i!=0) {
                System.out.print(nums6[i] + " , ");
            } else {
                System.out.print(nums6[i]);
            }

        }
        System.out.println();
        int[] nums7 = {1, 2, 3, 4, 5};
        for (int i = nums7.length - 1; i >= 0; i--) {
            if (i!=0) {
            System.out.print(nums7[i] + " , ");
            } else {
                System.out.print(nums7[i]);
            }
        }


        System.out.println();
        System.out.println(" Задание 4 ");

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) {
                nums[i] += 1;

            }
        }
        System.out.print(Arrays.toString(nums ));

            }


        }

















































