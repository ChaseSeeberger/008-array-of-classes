package arrayClassesPackage;

import javax.swing.JOptionPane;

public class VetArray {
	Vet[] vetAnimal = new Vet[5];
	String message = "";
	
	public void buildVetArray() {
		vetAnimal[0] = new Vet();
		vetAnimal[0].setBreed("Golden Retriever");
		vetAnimal[0].setGender("Male");
		vetAnimal[0].setAge(9);
		vetAnimal[0].setSymptoms("Leg is weak");
		
		vetAnimal[1] = new Vet();
		vetAnimal[1].setBreed("Parrot");
		vetAnimal[1].setGender("Female");
		vetAnimal[1].setAge(12);
		vetAnimal[1].setSymptoms("Pregnant");
		
		vetAnimal[2] = new Vet();
		vetAnimal[2].setBreed("Siberian Husky");
		vetAnimal[2].setGender("Male");
		vetAnimal[2].setAge(2);
		vetAnimal[2].setSymptoms("Bleeding limb");
		
		vetAnimal[3] = new Vet();
		vetAnimal[3].setBreed("Cat");
		vetAnimal[3].setGender("Female");
		vetAnimal[3].setAge(1);
		vetAnimal[3].setSymptoms("Excessive sneezing");
		
		vetAnimal[4] = new Vet();
		addVetArray();
		
	}
	public void addVetArray() {
		message = "What breed is your animal?";
		vetAnimal[4].setBreed(JOptionPane.showInputDialog(message)); 
		message = "What gender is your animal?";
		vetAnimal[4].setGender(JOptionPane.showInputDialog(message)); 
		message = "how old is your animal?";
		vetAnimal[4].setAge(Integer.parseInt(JOptionPane.showInputDialog(message))); 
		message = "What symptoms is your animal experiencing?";
		vetAnimal[4].setSymptoms(JOptionPane.showInputDialog(message)); 
	}
	public void showVetArray() {
		for (int i=0; i < vetAnimal.length; i++) {
			System.out.println(vetAnimal[i].getBreed() + ", " + vetAnimal[i].getGender() + ", " + vetAnimal[i].getAge() + ", " + vetAnimal[i].getSymptoms());
		}
	}
}
