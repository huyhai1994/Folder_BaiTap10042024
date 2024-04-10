package animal;

public class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        // Khái niệm từ khóa this đại diện cho đối tượng đang sử dụng
        this.age = age;
    }
//    public Animal(){  // COntructor with no argument / default
//        this("meo",3);
//        // gọi đến contructor có tham số tương ứng,
//        // bắt buộc phải đứng đầu dòng;
//
//    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }


}