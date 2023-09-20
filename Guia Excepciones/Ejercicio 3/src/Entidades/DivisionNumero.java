package Entidades;

public class DivisionNumero {

    String num1;
    String num2;

    public DivisionNumero(String num1, String num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int dividir() {
        int num1 = Integer.parseInt(this.num1);
        int num2 = Integer.parseInt(this.num2);
        return num1 / num2;
    }

}
