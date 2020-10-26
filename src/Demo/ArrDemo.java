package Demo;

public class ArrDemo {
    public static void main(String[] arge) {
        //定义一个指定长度，未指定数值的数组
        int[] arr = new int[3];

        //定义一个数组，并指定数值
        int[] arr1 = new int[]{1, 2, 3};

        //定义一个数组，并指定数值,简化版
        int[] arr2 = {1, 2, 3};

        //将arr2赋值给一个新数组
        int[] arr3 = arr2;

        //将新数组arr3中的某个值重新赋值
        arr3[2] = 4;


        //此时，打印可发现，arr2和arr3的某个值，都变了
        System.out.println(arr2[2]);
        System.out.println(arr3[2]);


    }
}
