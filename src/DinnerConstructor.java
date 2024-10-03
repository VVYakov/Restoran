

import java.util.*;

public class DinnerConstructor {

    Random random = new Random();

    private HashMap<String, ArrayList<String>> numbersAndNamesDinners = new HashMap<>();
    private List<String> Types = new ArrayList<>();

    public void addDinners(String type, String name) {
        if (numbersAndNamesDinners.containsKey(type)) {
            numbersAndNamesDinners.get(type).add(name);
        } else {
            ArrayList<String> DinnersList = new ArrayList<>();
            DinnersList.add(name);
            numbersAndNamesDinners.put(type, DinnersList);
        }
    }

    public void printMenu() {
        for (String type : numbersAndNamesDinners.keySet()) {
            System.out.println(type + ": " + numbersAndNamesDinners.get(type));
        }
    }

    public void SaveTypesGenerate(String TypeGenerate) {
        if (numbersAndNamesDinners.containsKey(TypeGenerate)) {
            Types.add(TypeGenerate);
        } else {
            System.out.println("Данного типа блюд, нет в меню, попробуйте снова");
        }
    }

    public void Generate(int sumGenerate) {
        for (int i = 0;i<sumGenerate;i++) {
            for (String type : numbersAndNamesDinners.keySet() ) {
                Types = numbersAndNamesDinners.get(type);
                int randomIndex = random.nextInt(Types.size());
                String randomDish = Types.get(randomIndex);
                System.out.println(type +": " + randomDish);
            }

        }
    }
}

