package basico.dev;

public class CalcImp {
    public static void main(String[] args) {
        Salarios salarios = new Salarios(5000, 3200, 1800);
        System.out.println("O imposto pago pelo gerente foi de R$" + salarios.calcImpGer());
        System.out.println("O imposto pago pelo supervisor foi de R$" + salarios.calcImpSuper());
        System.out.println("O imposto pago pelo atendente foi de R$" + salarios.calcImpAtend());
    }
}
