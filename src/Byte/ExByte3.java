package Byte;

import java.util.Scanner;

public class ExByte3 {
    private byte qlaminas;

    Scanner s = new Scanner(System.in);

    public void conf() {
        System.out.println("Digite a quantia de lâminas: ");
        qlaminas = s.nextByte();
        System.out.println("A quantia foi de: " + qlaminas);
        if (qlaminas >= 10) {
            System.out.println("Quantidade não permitida");
        }
    }
}
