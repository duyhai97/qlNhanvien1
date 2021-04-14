
import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        NhanVien[] nhanvien = new NhanVien[10];
        nhanvien[0] = new NhanvienFulltime(1, "hai", 24, 11111, "aaa", 1000000, 500000, 10000000);
        nhanvien[1] = new NhanvienFulltime(2, "hai", 24, 11111, "aaa", 1000000, 500000, 10000000);
        nhanvien[2] = new NhanvienFulltime(3, "hai", 24, 11111, "aaa", 1000000, 500000, 20000000);
        nhanvien[3] = new NhanvienFulltime(4, "hai", 24, 11111, "aaa", 1000000, 500000, 10000000);
        nhanvien[4] = new NhanvienFulltime(5, "hai", 24, 11111, "aaa", 1000000, 500000, 20000000);

        nhanvien[5] = new NhanvienParttime(6, "hai", 25, 1212, "adda", 50);
        nhanvien[6] = new NhanvienParttime(7, "hai", 25, 1212, "adda", 50);
        nhanvien[7] = new NhanvienParttime(8, "hai", 25, 1212, "adda", 50);
        nhanvien[8] = new NhanvienParttime(9, "hai", 25, 1212, "adda", 100);
        nhanvien[9] = new NhanvienParttime(10, "hai", 25, 1212, "adda", 100);

        NhanvienFulltime nhanvien10 = new NhanvienFulltime(11, "aaa", 25, 2322, "sddd", 1000000, 0, 10000000);

        Manager hai = new Manager(nhanvien);
        hai.addNhanvien(nhanvien, nhanvien10, 9);
        System.out.println(nhanvien[1].countSalaryReal());
        System.out.println(nhanvien[6].countSalaryReal());

    }
}