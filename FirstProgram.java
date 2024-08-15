public class FirstProgram {
    public static void main(String[] args) {

        int a = 11;
        int b = 3;

        int cnt1 = CheckPrime(a);
        int cnt2 = CheckPrime(b);

        if (cnt1 == 1 && cnt2 == 1) {
            System.out.printf("Tong cua hai so nguyen to la: %d ", a + b);
        }
        else {System.out.println("Khong the tinh tong vi co it nhat mot so khong phai so nguyen to");}
    }

    public static int CheckPrime(int x) {
        int cnt = 0;
        if (x <= 1) {
            return 0;
        }
        for (int i = 2; i <= x / 2; i++) {
            if (x % i == 0) {
                cnt = 1 + cnt;
            }
        }
        if (cnt <= 2) {
            // No chi co hai uoc la 1 va chinh no
            return 1;
        } else { // co nhieu hon 2 uoc
            return 0;
        }
    }
}