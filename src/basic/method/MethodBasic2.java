package basic.method;

import javax.lang.model.SourceVersion;
import java.lang.reflect.Parameter;

public class MethodBasic2 {
    // x~ y
    static int calcXToY(int x, int y) {
        int total = 0;
        for (int i = x; i <= y; i++)
            total += i;
        return total;
    }
    static String selectRanddomFood() {
        double rn = Math.random();
        if (rn > 0.66)
            return "치킨";
        if (rn >0.33)
            return "족발";
        return "햄버거";

    }


    static double calAvg(int... nums) {
        double ans = 0;
        for (int k : nums) {
            ans += k;
        }
        ans /= nums.length;
        return ans;
    }

    public static void main(String[] args) {
        int x = 10;
        int y = 100;
        int ans =  calcXToY(x,y);
        System.out.println("ans = " + ans);
        System.out.println(selectRanddomFood());
        
        int[] arr = {10,20,31,33,32};
        System.out.println("평균:" +calAvg(arr));
        
        
    }
}
