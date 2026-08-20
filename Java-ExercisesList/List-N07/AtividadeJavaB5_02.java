package ExercíciosJava_07;

public class AtividadeJavaB5_02 {
    public static void main(String[] args) {
        int RPM = 0, loop = 0;
        do {
            RPM = RPM + 500;
            loop = loop + 1;
        } while (RPM < 3000);
        System.out.println("RPM do " + loop);
        loop = 0;
        for (int i = 0; i < 3000; i += 500) {
            loop = loop + 1;
        }
        System.out.println("RPM for " + loop);
    }
}
