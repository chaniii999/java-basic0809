package oop.encap.practice;

public class PasswordManager {
    private String pwd;

    public PasswordManager(String pwd) {
        this.pwd = pwd;
    }

    public String getPwd() {
        return pwd;
    }


    /**
     * 이 메서드는 비밀번호를 변경해주는 공개된 메서드로서
     * 사용자는 기존에 사용하던 패스워드를 올바르게 전달하고
     * 새롭게 사용할 패스워드를 전달합니다.
     * @param oldPwd - 기존에 사용하던 비밀번호
     * @param newPwd - 새롭게 변경할 비밀번호
     * @return - 변경에 성공하면 true, 실패하면 false
     */
    public boolean changePwd(String oldPwd, String newPwd) {
        if (oldPwd.equals(pwd)) {
            this.pwd = newPwd;
            return true;
        }
        System.out.println("비밀번호가 틀렸습니다.");
        return false;
    }
}
