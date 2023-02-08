package 람다예제3;

@FunctionalInterface
interface MyFuncInterface {
    int min(int x, int y);
}
public class LambdaEx3 {
    public static void main(String[] args) {
        MyFuncInterface fi = (x, y) -> x < y ? x : y; // 중괄호가 없어야 됨(?)
        System.out.println(fi.min(3,4));
    }
}
