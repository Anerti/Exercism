public class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

class Warrior extends Fighter {
    
    @Override
    public String toString() {
        return "Fighter is a Warrior";
    }

    @Override
    boolean isVulnerable() {
        return false;
    }

    @Override
    int getDamagePoints(Fighter fighter) {
        return fighter.isVulnerable() ? 10 : 6;
    }
} 

class Wizard extends Fighter {
    private boolean spellAvailable = false;
    
    @Override
    public String toString(){
        return "Fighter is a Wizard";
    }

    void prepareSpell(){
        spellAvailable = true;
    }

    @Override
    boolean isVulnerable(){
        return !spellAvailable;
    }

    @Override
    int getDamagePoints(Fighter fighter){
        return spellAvailable ? 12 : 3;
    }
}
