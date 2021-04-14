public class Manager{
    private NhanVien[] nhanViens;

    public Manager(NhanVien[] nhanViens) {
        this.nhanViens = nhanViens;
    }

    public NhanVien[] getNhanViens() {
        return nhanViens;
    }

    public void setNhanViens(NhanVien[] nhanViens) {
        this.nhanViens = nhanViens;
    }



    public int countAverageSalaryFulltime(){
        int dem = 0;
        int total = 0;
        int count = 0;
        int luongtrungbinh = 0;
        for (int i = 0; i < nhanViens.length; i++) {
            if (nhanViens[i] instanceof NhanvienFulltime){
                NhanvienFulltime aa = (NhanvienFulltime)nhanViens[i];
                count++;
                total += aa.getHardsalary() + (aa.getBonusmoney() -aa.getPunishmoney());
                luongtrungbinh = total/count;
                if (aa.getHardsalary() + (aa.getBonusmoney() -aa.getPunishmoney()) < luongtrungbinh){
                    dem++;
                }
            }

        }
        return dem;
    }

    public int countTotalSalarypartime(){
        int total = 0;
        int count = 0;
        for (int i = 0; i < nhanViens.length; i++) {
            if (nhanViens[i] instanceof NhanvienParttime){
                NhanvienParttime a = (NhanvienParttime)nhanViens[i];
                total += a.getWorkinghours()*100000;
            }
        }
        return total;
    }

    public NhanVien[] addNhanvien(NhanVien[] nhanViens, NhanVien nhanVien, int index){
        NhanVien[] nhanViens1 = new NhanVien[nhanViens.length + 1];
        for (int i = 0; i < nhanViens.length; i++) {
            nhanViens1[i] =nhanViens[i];
            nhanViens1[index] = nhanVien;
        }
        for (int i = index + 1; i < nhanViens1.length; i++) {
            nhanViens1[i] = nhanViens[i -1];
        }
        return nhanViens1;
    }


}
