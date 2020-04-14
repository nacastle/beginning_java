package eKoreatech.inheritance;

@FunctionalInterface // 추상 메소드가 하나만 있는(paySalary) 인터페이스:
public interface Payable {

    public abstract /*앞에 것 생략가능 */ long paySalary();

    default long payAllowance() {
        callLocal(); // default 메소드가 좀 길어진다 싶을때 private 메소드를 활용하여 구현 가능
        return 0;  // 하위 클래스에서 오버라이딩 가능
    } // 구현 메소드

    private void callLocal(){

    }

    static long testStatic(){
        return 1;
    }
}
