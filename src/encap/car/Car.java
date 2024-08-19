package encap.car;

public class Car {

    private String model;
    private int speed;
    private char mode;
    private boolean start;

    public Car(String model) {
        this.model = model;
        System.out.println("model = " + model);
    }

    public String getModel() {
        return model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed < 0 || speed > 300) {
            System.out.println("잘못된 speed.");
            return;
        }
        if (!start) {
            System.out.println("start = false입니다.");
        }
        if (mode == 'D'|| mode == 'R') {
            if (mode == 'R' && speed > 40) {
                System.out.println("후진은 40이상 가속할 수 없습니다.");
                return;
            }
            this.speed = speed;
            return;
        } else {
            System.out.println("변속기를 확인하세요.");
        }
    }

    public char getMode() {
        return mode;
    }

    public void setMode(char mode) {
        switch (mode) {
            case 'D': case'R': case 'N': case 'P':
                this.mode = mode;
                break;
            default:
                System.out.println("올바르지않은 값입니다.");
        }
    }

    public boolean isStart() {
        return start;
    }


    //시동 버튼 누르는 행위
    public void engineStart() {
        System.out.println("시동버튼을 눌렀습니다.");
        injectOil();
        injectGasoline();
        this.start = true;
        moveCylinder();
        System.out.println("시동이 걸렸습니다.");
    }

    public void engineStop() {

    }

    //엔진오일이 주입되는 기능
    private void injectOil() {
        System.out.println("엔진오일이 순환합니다.");
    }

    //엔진에 연료가 주입되는 기능
    private void injectGasoline() {
        System.out.println("연료가 엔진에 주입됩니다.");
    }

    //실린더가 움직이는 기능
    private void moveCylinder() {
        if(start) {
            System.out.println("실린더가 움직입니다.");
        } else {
            System.out.println("실린더가 움직이지 않습니다.");
        }
    }
}
