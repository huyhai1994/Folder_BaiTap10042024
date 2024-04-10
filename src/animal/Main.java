package animal;

public class Main {
    public static void main(String[] args){
        Bird bird = new Bird("cúc cu",3);
        System.out.println(bird.getAge());
        System.out.println(bird.go());
    }
}