public class Tester {
    public static void main(String[] args) {
        Animal[] animalList = new Animal[2];

        animalList[0] = new Animal("Dog", "Labrador Retriever", "Jake", 14);
        animalList[1] = new Animal("Cat", "Domestic Medium Hair", "Edgar", 14);

        for(int i = 0; i < 2; ++i) {
            System.out.println(animalList[i]);
        }
    }
}