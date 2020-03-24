public class Customer extends villa {
    private  int Age;
    private  String Name;

    public Customer() {
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
    public long billPlease(int day){
        return day*10;
    }
}
