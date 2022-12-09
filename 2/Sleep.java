// 행위패턴 중 state 패턴은 자주 바뀌는 상태를 클래스로 만들고 이를 <<interface>> 타입의 상속구조 형태로 만드는 것을 말합니다.
// state 패턴을 이용하면, 다른 클래스와 충돌 가능성이 적고, 개발 분담이 용이하다는 장점이 있기 때문에, OSS를 개발할 때 역시 편리합니다.

public class Sleep implements State {

    public Sleep() {
        System.out.println("<<현재 상태: 수면풍>>");
    }
    public void on_button(ElectricFan EF) {
        System.out.println("\n***on 버튼 눌림***\n" + "수면풍에서 송풍 상태로 바뀜\n");		// 교안의 예제를 참고하여, 송풍의 상태는 Wind와 Sleep만 존재함을 가정하였습니다. 따라서, 수면풍 상태에서 on버튼을 누르면 수면풍 상태에서 기본 송풍상태로 변경됩니다.
        EF.setState(new Wind());
    }
    public void off_button(ElectricFan EF) {
        System.out.println("\n***off 버튼 눌림***\n" + "수면풍에서 정지 상태로 바뀜\n");
        EF.setState(new Stop());
    }
    
}