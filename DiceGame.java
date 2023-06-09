import java.util.Random;

class DiceGame{
    public static void main(String[] args){
	int dice1,dice2,total;
	Random rand=new Random();

	System.out.println("Rolling the dice...");
	dice1=(rand.nextInt(6))+1;
	dice2=(rand.nextInt(6))+1;
	total=dice1+dice2;
	System.out.println("Die 1: "+dice1);
	System.out.println("Die 2: "+dice2);
	System.out.println("Total value: "+total);
	if(total>=7) System.out.println("You won");
	else System.out.println("You lost");
    }
}
