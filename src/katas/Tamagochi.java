package katas;

public class Tamagochi {

	public int hunger = 4;
	public int energy = 4;
	public int mood = 4;
	
	public int getHunger() {
        return hunger;
    }

    public int getEnergy() {
        return energy;
    }

    public int getMood() {
        return mood;
    }
    
	public String estado() {
		if(energy==0) {
			return "(-_-) zZZ";
		}else if(mood>8){
			return ":-)";
		}else if(energy < 3 && energy > 0) {
			return "(-_-)";
		}else if(mood < 2) {
			return "ఠ_ఠ";
		}else {
			return ":-|";
		}
	}
	
	public String play() {
		hunger+=1;
		mood+=1;
		energy-=1;
		return estado();
	}
	
	public String eat() {
		hunger -=2;
		energy-=1;
		return estado();
	}
	
	public String sleep() {
		energy +=2;
		return "(-_-) zZZ";
	}
	
	
	public static void main (String []args) {
		Tamagochi tami = new Tamagochi();
		System.out.println("Estado inicial de Tami:");
		System.out.println(tami.estado());
		System.out.println("Tami come:");
		System.out.println(tami.eat());
		System.out.println("Tami juega:");
		System.out.println(tami.play());
		System.out.println("Tami duerme: ");
		System.out.println(tami.sleep());
      }
	
}
