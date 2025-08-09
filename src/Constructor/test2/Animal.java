package Constructor.test2;

public class Animal {
    private int id;

    public String name; // defaul

    protected String color;

    public int age;

    void input() {
        this.id = 1;
        this.name = "abc";
        this.color = "red";
        this.age = 1;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
//    public void capNhat(int id){
//        this.id = id;
//    }
//    public int layID(){
//        return id;
//    }
}
