//Created by Campus
package Class_and_Object.J04011;

import java.util.Scanner;

class Point3D {
    private int x, y, z;

    public Point3D() {
    }

    public Point3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public static boolean check(Point3D M, Point3D N, Point3D P, Point3D Q) {
        Point3D MN = new Point3D();
        Point3D MP = new Point3D();

        MN.x = N.x - M.x;
        MN.y = N.y - M.y;
        MN.z = N.z - M.z;

        MP.x = P.x - M.x;
        MP.y = P.y - M.y;
        MP.z = P.z - M.z;


        int A = MN.y * MP.z - MP.y * MN.z;
        int B = MN.z * MP.x - MP.z * MN.x;
        int C = MN.x * MP.y - MP.x * MN.y;

        int D = - (A * M.x + B * M.y + C * M.z);

        int temp = A * Q.x + B * Q.y + C * Q.z + D;

        if (temp == 0) {
            return true;
        }
        return false;
    }

}

public class BonDiemTranMatPhang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            Point3D p1 = new Point3D(sc.nextInt(), sc.nextInt(), sc.nextInt());
            Point3D p2 = new Point3D(sc.nextInt(), sc.nextInt(), sc.nextInt());
            Point3D p3 = new Point3D(sc.nextInt(), sc.nextInt(), sc.nextInt());
            Point3D p4 = new Point3D(sc.nextInt(), sc.nextInt(), sc.nextInt());

            if (Point3D.check(p1, p2, p3, p4)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
