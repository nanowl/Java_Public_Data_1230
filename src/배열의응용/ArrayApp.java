package 배열의응용;

import java.util.Arrays;

/*
    배열의 복사 : 원칙적으로 자바에서 배열은 한번 생성하면 크기를 변경할 수 없습니다.
    하지만 배열의 복사를 통해 크기를 변경 할 수 있습니다.
 */
public class ArrayApp {
    public static void main(String[] args) {
        // arraycopy() : 배열값을 복사 할 때 사용
        // System.arraycopy(Object src, int srcPos, Object dest, int destPos, int length);
//        int[] arr1 = {1, 2, 3, 4, 5};
////        int len = 10;
////        int[] arr2 = new int[len];
////        arr2[0] = 100;
////        arr2[1] = 200;
////        arr2[2] = 300;
////        System.arraycopy(arr1, 0, arr2, 4, arr1.length);
////        for (int e : arr2) System.out.println(e);
        // copyOf() : 배열의 원하는 길이만큼 새로운 배열로 복사
//        int[] arr1 = {1,2,3,4,5};
//        int[] arr2 = Arrays.copyOf(arr1, 10);
//        for (int e: arr2) System.out.print(e + " ");
        // 얕은 복사와 깊은 복사
        int[] arr1 = {1,2,3,4};
        int[] arr2 = arr1;
        arr1[0] = 100;
        for (int e: arr2) System.out.print(e + " ");
        System.out.println();
        for (int e: arr1) System.out.print(e + " ");
    }
}
