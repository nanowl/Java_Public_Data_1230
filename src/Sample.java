/*
    public : 접근제한자를 의미한다. (public, protected, private)
    Class 이름은 일반적으로 시작을 대문자로 표기한다.
    void는 메소드 수행 이후 반환 값이 없음을 의미한다.
    main은 프로그램의 시작위치를 의미하며 JVM에 의해서 호출 된다.
    System.out은 JAVA의 표준 출력 클래스이다. (print,println,printf)       *f는 format의 약자로 서식을 의미
    %d = 10진수
    %x = 16진수
    %o = 8진수
    %s = string
    %c = character
    %f = float
    %b = boolean

*/

public class Sample { //Sample Class
    public static void main(String[] args) {
        System.out.print(100); //int
        System.out.print(3.14); //float
        System.out.print('c'); //char
        System.out.print("String"); //String
        System.out.print("String" + "Plus String"); //String + String
        System.out.print(true); //boolean
        System.out.println();//줄넘김

        System.out.println();//공백

        System.out.println(100); //int
        System.out.println(3.14); //float백
        System.out.println("String"); //String
        System.out.println("String" + "Plus String"); //String + String
        System.out.println(true); //boolean

        System.out.println();//공백

        System.out.printf("%d\n", 3000);
        System.out.printf("%f\n", 3.14);
        System.out.printf("%x %o %f\n", 6000, 9000, 3.14);

    }
}
