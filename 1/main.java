public class main {
    public static void main(String[] args) {
    
    // Fighter 객체를 하나 만들고, 
    Fighter figher1 = new Warrior();
    fighter1.attack();
    fighter1.defend();
    fighter1.escape();

    
    Wizard wizard = new Wizard();
    Fighter fighter2 = new WizardAdapter(wizard); 
    fighter2.attack(); 
    fighter2.defend(); 
    fighter2.escape();
    } 
}
