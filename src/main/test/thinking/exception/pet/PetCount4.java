package thinking.exception.pet;


public class PetCount4 {

	public static void main(String[] args) {
		TypeCounter counter = new TypeCounter(Pet.class);
		Pet[] pets = Pets.createArray(20);
		for (Pet pet : pets) {
			System.out.print(pet.getClass().getSimpleName()+" ");
			counter.count(pet);
		}
		System.out.println(" ");
		System.out.print(counter);
	}
	
}
