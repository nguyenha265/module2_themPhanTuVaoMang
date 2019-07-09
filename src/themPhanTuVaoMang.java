import java.util.Scanner;

public class themPhanTuVaoMang {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap phan tu muon chen ");
        int chen = scanner.nextInt();
        System.out.println("chon vi tri muon chen ");
        int them = scanner.nextInt();
        while (them > 10 || them < 0) {

            System.err.println("khong chen duoc phan tu vao mang ");

            System.out.println("chon lai vi tri muon chen ");

            them = scanner.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            if (them == (i + 1)) {
                array[i] = chen;
            }
            System.out.print(array[i] + " ");
        }

    }
}
