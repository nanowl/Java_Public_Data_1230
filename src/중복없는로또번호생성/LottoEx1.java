package 중복없는로또번호생성;

import com.sun.source.doctree.BlockTagTree;

import java.util.ArrayList;
import java.util.Arrays;

/*
    중복 없는 로또번호 생성하기

    1. 6개의 로또 번호 생성해서 출력하기 (배열 사용)
    2. 중복 없는 로또 번호 생성 후 출력
    3. ArrayList사용해서 출력 (중복 없음)
    4. Set을 이용해서 로또번호 출력 (중복 없음)
 */
public class LottoEx1 {
    public static void main(String[] args) {
    /*
        6개 배열생성
        반복문을 순회하면서 랜덤함수를 이용해 배열에 로또번호 추가
        마지막에 배열에 포함된 로또번호 출력
     */
        int[] lotto = new int[6];
        int i = 0;
        boolean isExist = false;
        while (true){
            if (i > 5) break;
            int count = (int) ((Math.random() * 45) + 1 );
            for (int j = 0; j< lotto.length; j++) {
                if (lotto[j] == count) isExist = true;
            }
            if(isExist == false) {
                lotto[i++] = count;
            } else isExist = false;
        }
        System.out.println(Arrays.toString(lotto));
    }
}
