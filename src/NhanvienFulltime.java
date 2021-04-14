public class NhanvienFulltime extends NhanVien implements getThuong{
    private int bonusmoney;
    private int punishmoney;
    private int hardsalary;

    public NhanvienFulltime(int id, String name, int age, int phoneNumber, String email, int bonusmoney, int punishmoney, int hardsalary) {
        super(id, name, age, phoneNumber, email);
        this.bonusmoney = bonusmoney;
        this.punishmoney = punishmoney;
        this.hardsalary = hardsalary;
    }

    public int getBonusmoney() {
        return bonusmoney;
    }

    @Override
    int countSalaryReal() {
      return   getHardsalary() + (getBonusmoney() - getPunishmoney());
    }

    @Override
    void Display() {

    }

    @Override
    public void bonusThuong() {
         System.out.println("Thuong " + this.getName());
    }

    public void setBonusmoney(int bonusmoney) {
        this.bonusmoney = bonusmoney;
    }

    public int getPunishmoney() {
        return punishmoney;
    }

    public void setPunishmoney(int punishmoney) {
        this.punishmoney = punishmoney;
    }

    public int getHardsalary() {
        return hardsalary;
    }

    public void setHardsalary(int hardsalary) {
        this.hardsalary = hardsalary;
    }
}
