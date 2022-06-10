package codewarstask.twofighters;

public class Fighter {
    private String name;
    private int health;
    private int damagePerAttack;


    public Fighter(String name, int health, int damagePerAttack) {
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
        if (health < 0){
            this.health=0;
        }
    }

    public static String isEqualNameFighter  (){
        return "Enter correct First Attacker name";
    }


    public static String  declareWinner (Fighter fighter1, Fighter fighter2, String firstAttacker ){
        String firstStepFighter = "";
        String finalMessage = "";
        String deadMessage = "";
        if (fighter1.name.toUpperCase().equals(firstAttacker.toUpperCase())){
            firstStepFighter = fighter1.name;
        } else if (fighter2.name.toUpperCase().equals(firstAttacker.toUpperCase())){
            firstStepFighter = fighter2.name; //Understand who is the first Attacker having only the name
        } else {
            return isEqualNameFighter();
        }

        Fighter initialAttacker = (fighter1.name.equals(firstStepFighter)) ? fighter1 : fighter2;
        Fighter defender = (fighter1.name.equals(firstStepFighter) ) ? fighter2 : fighter1; // Having the name of first attacker initialize the instance to him

        while (defender.health >= 0 && initialAttacker.health >= 0 ){
            defender.health -= initialAttacker.damagePerAttack;
            if (defender.health < 0) { //Condition if defender is dead
                deadMessage = initialAttacker.name + " attacks " + defender.name + ": " + defender.name + " now has " + defender.health
                        + " and is dead. " +
                        initialAttacker.name + " wins.";
                continue;
            }

            finalMessage+=initialAttacker.name + " attacks " + defender.name +
                    "; " + defender.name + " now has " + defender.health + " health. " + "\n"; //Attack of First Attacker


            initialAttacker.health -= defender.damagePerAttack;
            if (initialAttacker.health < 0) { //Condition if First Attacker is dead
                deadMessage = defender.name + " attacks " + initialAttacker.name + ": " + initialAttacker.name + " now has " + initialAttacker.health
                        + " and is dead. " +
                        defender.name + " wins.";
                continue;
            }
            finalMessage+=defender.name + " attacks " + initialAttacker.name +
                    "; " + initialAttacker.name + " now has " + initialAttacker.health + " health. " + "\n"; //attack of the defender



        }
        return finalMessage + deadMessage;
    }
}
