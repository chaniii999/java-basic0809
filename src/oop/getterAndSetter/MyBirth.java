package oop.getterAndSetter;

public class MyBirth {


    private int month = 0;
    private int day = 0;

    public void setDay(int day) {
        if (month == 0) {
            System.out.println("월이 초기화 되지 않았습니다.");
            return;
        }
        if (day < 1 || day > 31) {
            System.out.println("1~31일 중에서 입력하세요.");
            return;
        }
        if (isValidMonth(day)) {
            System.out.println("해당 월에 존재하지않는 날짜입니다.");
            return;
        }
            this.day = day;
    }
    public void setMonth(int month) {
        if (month < 1 || month > 12) {
            System.out.println("1~12월 중에서 입력하세요.");
        }
        else
            this.month = month;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    private boolean isValidMonth(int day) {
        switch (this.month) {
            case 2:
                if (day > 28) return false;
            case 4: case 8: case 9: case 11:
                if (day > 30) return  false;
            default:
                return  true;
        }
    }
}
