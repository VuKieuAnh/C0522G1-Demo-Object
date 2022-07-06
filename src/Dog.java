public class Dog {
    int weight;
    int age;
    String origin;
    String name;


    //phương thức bình thường: tên, kiểu dữ liệu trả về, tham số
    void bark(){
        System.out.println("Gau gau");
    }

    //phương thức khởi tạo: Tạo mới đối tượng thuộc lớp
    //tên của nó trùng tên với tên lớp
    //không có dữ liệu trả về

    public Dog(){}

    public Dog(String name, String origin){
        this.name = name;
        this.origin = origin;
    }

    public Dog(int age, String origin) {
        this.age = age;
        this.origin = origin;
    }

    public Dog(int weight, int age, String origin, String name) {
        this.weight = weight;
        this.age = age;
        this.origin = origin;
        this.name = name;
    }

    //get: -> Lấy dữ liệu
    //trả về kiểu dữ kiệu trùng với dữ liệu của thuộc tính
    //không cần tham số
    //get<Ten thuộc tính>

    int getAge(){
        return age;
    }

    //set: -> gán dữ liệu
    //kiểu dl trả về: void
    //1 tham số cùng kiểu với kiểu dữ liệu cần gán
    //set<Tên thuộc tính>
    void setAge(int newAge){
        age = newAge;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
