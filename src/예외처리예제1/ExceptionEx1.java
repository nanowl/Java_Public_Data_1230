package 예외처리예제1;
/*
    자바는 어떻게 할 수 없는 에러와 대응가능한 예외로 나뉘어집니다.
    대응가능한 예외는 예외처리 구문을 통해 해결할 수 있습니다.
    예외 이전에 프로그램에서 조건문등을 통해 발생할 수 있는 문제는 사전에 차단해야 합니다.
    ArrayIndexOutOfBoundException : 할당되지 않은 배열의 인덱스에 접근할 때 발새하는 예외
 */
public class ExceptionEx1 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        try {
            for (int i = 0; i <= 5; i++) {
                arr[i] = i;
                System.out.println(arr[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e ) {
            System.out.println(e);
        }
        System.out.println("프로그램 정상종료");
    }
}
