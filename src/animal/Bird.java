package animal;

public class Bird extends Animal {
    /*Su dung tu khoa extend ĐỂ kế  thừa
    * Khi triển khai kế thừa
    * */

    private int id;

    public Bird(String name, int age) {
        super(name, age);
    }

    public String go(){
        return "Bird is going";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
