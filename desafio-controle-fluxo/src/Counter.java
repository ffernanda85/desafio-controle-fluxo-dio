import java.util.Scanner;

public class Counter {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro: ");
        int parameterOne = scanner.nextInt();

        System.out.println("Digite o segundo parâmetro: ");
        int parameterTwo = scanner.nextInt();
        
        try {
            count(parameterOne, parameterTwo);
            
        } catch (InvalidParametersException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
        
    }

    static void count(int parameterOne, int parameterTwo) throws InvalidParametersException {
        
        if (parameterOne > parameterTwo) {
            throw new InvalidParametersException();
        }
        
        int value = parameterTwo - parameterOne;
        for (int index = 1; index <= value; index++) {
            System.out.println("Imprimindo o número " + index);
        }
    }
}
