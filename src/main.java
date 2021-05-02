import java.text.DecimalFormat;
import java.util.Scanner;

public class main {
    private static DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("x[0]=");
        double[] x = new double[100];
        x[0] = sc.nextDouble();
           System.out.print("h=");
        double h = sc.nextDouble();
        double[] f = new double[100];
        double a = 0;
        double b = 0;
        double delta = 0;
        int i = 0;
        int k = 0;

        if (Math.pow((x[0] - h - 1), 2) >= Math.pow(x[0] - 1, 2) && Math.pow(x[0] - 1, 2) <= Math.pow((x[0] + h - 1), 2)) {
            System.out.println("a=" + (x[0] - h) + " b=" + (x[0] + h));
//            break;

        } else if (Math.pow((x[0] - h - 1), 2) <= Math.pow(x[0] - 1, 2) && Math.pow(x[0] - 1, 2) >= Math.pow((x[0] + h - 1), 2)) {
            System.out.println("Funksiya unimodal deyil! Başqa başlanğıc nöqtə götürməyiniz məsləhətdir.");
        }


        if (Math.pow((x[0] - h - 1), 2) >= Math.pow(x[0] - 1, 2) && Math.pow(x[0] - 1, 2) >= Math.pow((x[0] + h - 1), 2)) {
            while (true) {
                delta = h;
                x[1] = x[0] - h;
                a = x[k];
                i++;
                System.out.println("a" + "[" + k + "]=" + a);
                x[i + 1] = x[i] + (Math.pow(2, i)) * delta;
                x[i + 1] = Double.parseDouble(df.format(x[i + 1]));
                System.out.println("x[" + (i) + "]=" + x[i]);
                System.out.println("x[" + (i + 1) + "]=" + x[i + 1]);

                f[i] = Math.pow((x[i] - 1), 2);
                f[i + 1] = Math.pow((x[i + 1] - 1), 2);
                f[i] = Double.parseDouble(df.format(f[i]));
                f[i + 1] = Double.parseDouble(df.format(f[i + 1]));
                System.out.println("f["+i+"]=" + f[i]);
                System.out.println("f["+(i+1)+"]="  + f[i + 1]);
                if (f[i + 1] > f[i]) {
                    System.out.println("Yekun:");
                    a = x[k];
                    System.out.println("a=" + a);
                    k++;
                    b = x[k + 1];
                    System.out.println("b=" + b);
                                        break;

                } else {
                    k++;
                    System.out.println("-------------");
                }
            }

        } else if (Math.pow((x[0] - h - 1), 2) <= Math.pow(x[0] - 1, 2) && Math.pow(x[0] - 1, 2) <= Math.pow((x[0] + h - 1), 2)) {
            while (true) {
                delta = -h;
                x[1] = x[0] - h;
                b = x[k];
                i++;
                System.out.println("b" + "[" + k + "]=" + b);
                x[i + 1] = x[i] + (Math.pow(2, i)) * delta;
                x[i + 1] = Double.parseDouble(df.format(x[i + 1]));
                System.out.println("x[" + (i) + "]=" + x[i]);
                System.out.println("x[" + (i + 1) + "]=" + x[i + 1]);

                f[i] = Math.pow((x[i] - 1), 2);
                f[i + 1] = Math.pow((x[i + 1] - 1), 2);
                f[i] = Double.parseDouble(df.format(f[i]));
                f[i + 1] = Double.parseDouble(df.format(f[i + 1]));
                System.out.println("f["+i+"]=" + f[i]);
                System.out.println("f["+(i+1)+"]=" + f[i + 1]);
                if (f[i + 1] > f[i]) {
                    System.out.println("Yekun:");
                    b = x[k];
                    System.out.println("b=" + b);
                    k++;
                    a = x[k + 1];
                    System.out.println("a=" + a);
                    break;

                } else {
                    k++;
                    System.out.println("-------------");
                }
            }
        }
    }
}