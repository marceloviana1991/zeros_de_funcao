public class Main {

    public static double f(double s) {
        // Determinando a raiz quadrada do numero 10
        return Math.pow(s, 2) - 10;
    }

    public static void main(String[] args) {
        // Estimasse que a raiz quadrada do numero 10 seja um numero entre 3 e 4
        // Para isso utilizaremos uma apromixação de 0.0005
        // e um número máximo de 50 iterações para o caso da aproximação ser atingida
        bissecao(3, 4, 0.0005, 50);
    }

    public static void bissecao(double a, double b, double tol, double kMax) {
        int k = 1;
        double x = (a + b) / 2;
        double fx = f(x);
        double fa = f(a);
        double erro = 9999999999999999999999999999999999999.0;
        System.out.println("k = " + k + ", fx = " + fx + ", x = " + x + ", erro = " + erro);
        while (k < kMax && Math.abs(erro) > tol) {
            if (fa * fx <= 0) {
                b = x;
            } else {
                a = x;
                fa = fx;
            }
            k++;
            double u = x;
            x = (a + b) / 2;
            fx = f(x);
            erro = (u - x) / x;
            System.out.println("k = " + k + ", fx = " + fx + ", x = " + x + ", erro = " + erro);
        }
    }
}
