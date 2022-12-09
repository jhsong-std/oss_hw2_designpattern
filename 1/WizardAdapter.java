
class WizardAdapter implements Fighter {

    private Wizard wizard;

    public WizardAdapter(Wizard wizard) {
        this.wizard = wizard;
        System.out.println("Wizard가 Fighter와 호환됩니다.");
    }

    @Override    
    public void attack() {
        this.wizard.shot_fire_ball();
    } 
    
    @Override
    public void depend() {
        this.wizard.shield();
    } 
    
    @Override
    public void escape() {
        this.wizard.portal();
    } 

}

