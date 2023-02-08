package 람다예제4;
/*
    클래스멤버와 로컬변수 : 클래스멤버는 제약없이 사용가능, 로컬변수는 제약이 있음
 */
public class LambdaEx4 {
}

interface MyFuncInterface {
    void method();
}

class UsingThis {
    public int outerField = 10;

    class Inner {
        int innerField = 20;
        void method() {
            int localVal = 40;
            MyFuncInterface mi = () -> {
                System.out.println("외부 필드 : " + outerField);
                System.out.println("외부 필드 : " + UsingThis.this.outerField);
                System.out.println("내부 필드 : " + innerField);
                System.out.println("내부 필드 : " + this.innerField);
                System.out.println("지역 변수 : " + localVal);
            };
        }
    }
}