// Wizard
// 이 코드는 외부에서 구현한 모듈로 절대 수정해서는 안됨
public class Wizard {
    
    public Wizard(){
        System.out.println('직업 : 마법사');
    }

    public void shot_fire_ball(){
        System.out.println('파이어볼을 쏘는 중');
    }

    public void shield(){
        System.out.println('마법방패를 소환하는 중');
    }

    public void portal(){
        System.out.println('포탈을 소환하는 중');
    }
}