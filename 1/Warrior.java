// Warrior
public class Warrior implements Fighter{
    
    public Warrior(){
        System.out.println('직업 : 전사');
    }

    @override
    public void attack(){
        System.out.println('칼을 휘두르는 중');
    }

    @override
    public void defend(){
        System.out.println('방패로 막는 중');
    }

    @override
    public void escape(){
        System.out.println('튼튼한 두 다리로 튀는 중');
    }
}