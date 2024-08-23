package etc.enum_;

public enum Language {

    JAVA("자바",true),
    PYTHON("파이썬",false),
    JAVASCRIPT("자바스크립트",false),
    C("씨",true);

    // 상수와 연관 시킬 데이터를 담을 필드 선언
    private final String name;
    private final boolean isCompileLang;

    // 외부에서 enum 타입의 상수를 사용시 enum 객체가 생성됨.
    //상수가 생성자 호출문을 통해 연관 문자가 매개값으로 전달되어 필드를 초기화한다.
    private Language(String name, boolean isCompileLang) {
        this.name = name;
        this.isCompileLang = isCompileLang;
    }

    public String getName() {
        return name; // 한글이름
    }

    public boolean isCompileLang() {
        return isCompileLang; // 컴파일여부
    }
}
