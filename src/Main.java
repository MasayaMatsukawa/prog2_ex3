import jp.ac.uryukyu.ie.ex3.pair17.*;

public class Main{
    public static void main(String args[]){
	Dice dice = new Dice();
	dice.play();
	System.out.println(dice.getValue());
	ExDice exdice = new ExDice(5,7);
	exdice.play();
	System.out.println(exdice.getValue());
    }
}