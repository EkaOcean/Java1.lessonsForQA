package java1.lessonsforqa.lesson6;

    class Cat extends Animal {
    int max_run_length = 200;

    @Override
    void run(int run_length) {
        if ((run_length >= 0) && (run_length <= max_run_length)) {
            System.out.println("Кот пробежал " + run_length + " м.");
        } else System.out.println("Кот не смог пробежать " + run_length + " м.");
    }

    @Override
    void swim(int swim_length) {
        System.out.println("Кот не умеет плавать");
    }
}


