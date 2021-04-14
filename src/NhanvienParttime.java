public class NhanvienParttime extends NhanVien implements getThuong {
    private int workinghours;

    public NhanvienParttime(int id, String name, int age, int phoneNumber, String email, int workinghours) {
        super(id, name, age, phoneNumber, email);
        this.workinghours = workinghours;
    }

    @Override
    int countSalaryReal() {
        return getWorkinghours()*100000;
    }

    @Override
    void Display() {

    }

    @Override
    public void bonusThuong() {
        System.out.println("thuong" + this.getName());
    }

    public int getWorkinghours() {
        return workinghours;
    }

    public void setWorkinghours(int workinghours) {
        this.workinghours = workinghours;
    }
}
