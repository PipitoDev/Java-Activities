package ExercíciosJava_05;

public class AtividadeJavaB2_04 {
    public static void main(String[] args) {
        int num1=0, num2=2;
        while(num2<=50){
            if(num1%2==0&&num2%2==0){
                System.out.printf("%d + %d = %d%n", num1, num2, num1+num2);
            }
            num1=num1+1;
            num2=num2+1;
        }
    }
}
