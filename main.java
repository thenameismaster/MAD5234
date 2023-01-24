import java.util.ArrayList;
import java.util.Random;
public class Main {
//    public static void main(String[] args) {
//    ListOfSheep obj = new ListOfSheep();
//
//    Sheep sheepObj = new Sheep("Sheepo","White",311,55);
//    obj.AddSheep(sheepObj);
//
//    }

    public static ArrayList<Sheep> arrayList = new ArrayList<>();

    public int AddSheep(Sheep sheepToAdd) {
        arrayList.add(sheepToAdd);
        System.out.println("Added a sheep " + sheepToAdd.SheepName);
        return arrayList.size();
    }

    public static void generateSheep(int numberOfSheep) {
        Random random = new Random();
        for (int i = 0; i < numberOfSheep; i++) {
            String name = "Sheep" + i;
            String color = "Color" + random.nextInt(10);
            int weight = random.nextInt(200);
            int height = random.nextInt(100);
            Sheep sheep = new Sheep(name, color, weight, height);
            arrayList.add(sheep);
            System.out.println("Sheep entry: " + sheep.toString());
        }
    }


    public static void main(String[] args) {
        Main sheepManager = new Main();
        generateSheep(1000000);
        System.out.println("Number of sheep: " + arrayList.size());
    }
}
