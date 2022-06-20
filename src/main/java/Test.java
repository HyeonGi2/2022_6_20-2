public class Test {
    public static void main(String[] args) {
        int int1 = 5;
        double double1 = int1; //형변환
        System.out.println("doubld : " + double1);

        double double2 = 5.5;
        int int2 = (int)5.5;
        System.out.println("int : " + int2);


        boolean test1 = true;
        float test = 3.5F;

        String string1 = Integer.toString(2);
        System.out.println("String : " + string1);
        System.out.println(string1.getClass());

        int y = 7;
        y = 10;
        System.out.println(y);

        final int q = 7;

        // 변수는 값을 변경할 수 있지만 final이 붙은 상수는 값을 바꿀 수 없다.

        int a = 1;
        System.out.println(a);


        System.out.println(3 + 5);
        System.out.println(3 - 5);
        System.out.println(3 * 5);
        System.out.println(3 / 5);
        System.out.println(3 % 5);

        // 총점과 평점구하기
        int mathScore = 90;
        int engScore = 80;
        int korScore = 78;

        int sumScore = mathScore + engScore + korScore;
        System.out.println("총점 : " + sumScore);

        double avgScore = sumScore / 3.0;
        System.out.println("평균 : " + avgScore);

        /* 증가 감소 연산자
        연산자 앞이나 뒤에 사용, 값을 1만큼 늘리거나 1만큼 줄인다.
        ++ : 항에 값을 1 더한다.
        -- : 항에 값을 1 뺀다.   */

        int score = 99;
        int lastScore = ++score;
        System.out.println("last : " + lastScore);
        System.out.println(score);

        int lastScore2 = --score;
        System.out.println("last2 :" + lastScore2);

        int value = 10;
        int test3 = value++;
        System.out.println("test: " + test3);
        System.out.println(value);

        int test2 = ++value;
        System.out.println("test2 : " + test2);




    }
}

