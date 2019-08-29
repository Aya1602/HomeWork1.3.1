public class Main {

    public static void main(String[] args) {

        String[] names = {"Taras Bulba", "Andrey Bolkonskiy", "Rodion Raskolnikov"};


        for (int c = 0; c <= 2; c++)

            switch (names[c]) {
                case "Taras Bulba":
                    System.out.println("Good morning " + names[c]);
                    break;
                case "Andrey Bolkonskiy":
                    System.out.println("Good day " + names[c]);
                    break;
                case "Rodion Raskolnikov":
                    System.out.println("Good evening " + names[c]);
                    break;
            }
    }

}
