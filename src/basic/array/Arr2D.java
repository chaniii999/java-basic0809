package basic.array;

import java.util.Arrays;

public class Arr2D {
    public static void main(String[] args) {
        int[][] score = {
                {79, 80, 99}, //A학생
                {95, 85, 89}, //B학생
                {90, 65, 56}, //C학생
                {69, 78, 77}  //D학생
                //과목: 3과목
        };
        String[] stuName = {"A학생", "B학생", "C학생", "D학생"};
        String[] subName = {"국어", "영어", "수학"};

        /*
         1. 각 학생의 평균을 소수점 첫째 자리까지 출력해 보세요.
         2. 각 과목의 평균을 출력해 보세요.
         3. 반 평균을 출력해 보세요. (모든 학생들의 평균을 더해서 학생수로 나누기)
         */
        int idx = 0;
        for (int[] p : score) {
            double total = 0;
            for (int k : p) {
                total += k;
            }
            double avg = total / subName.length;
            System.out.printf("%s의 평균:%.1f점\n",stuName[idx++],avg);

        }
        System.out.println("========================");
        for (int i = 0; i < subName.length ; i++) {
            double total = 0;
            for (int j = 0; j < stuName.length; j++) {
                total += score[j][i];
            }
            double avg = total / stuName.length;
            System.out.printf("%s과목의 평균 %.1f\n",subName[i],avg);
        }
        System.out.println("========================");
        double all = 0;
        for (int[] p : score) {
            double total = 0;
            for (int k : p) {
                total += k;
            }
            all+= total / subName.length;
        }
        all /= stuName.length;
        System.out.printf("전체 점수의 평균: %.1f\n",all);
    }
}
