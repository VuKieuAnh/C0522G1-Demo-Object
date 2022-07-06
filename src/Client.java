public class Client {
    public static void main(String[] args) {
        Dog ky = new Dog("Ky", "Lap xuong");
        Dog mi = new Dog(10, 3, "Cho ta", "Mi");
        Dog dung = new Dog();
//<tên đối tương>.<lời gọi phương thức>
        dung.bark();
        System.out.println(dung.getName());
        dung.setName("Nguyen Anh Dung");
        //<ten đối tượng>.<thuộc tính/phương thức>
        System.out.println(dung.name);
    }
}
