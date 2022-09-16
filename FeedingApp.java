package java1.lessonsforqa.lesson7;

public class FeedingApp {
    public static void main(String[] args) {
        Cat[] cats = {new Cat("Matroskin", 10), new Cat("Vaska", 15), new Cat("Pushok", 5)};

        Plate plate = new Plate(20);
        System.out.print("Сперва ");
        System.out.println(plate);
        System.out.println();

        for (Cat cat : cats) {
            cat.eat(plate);
            System.out.println(cat);
            System.out.println();
            System.out.print("Теперь ");
            System.out.println(plate);
        }

        System.out.println();

        plate.addFood(50);
        System.out.print("Добавим еще корма. Теперь ");
        System.out.print(plate);
    }
    }

