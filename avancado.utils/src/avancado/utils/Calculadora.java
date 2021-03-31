package avancado.utils;
import avancado.utils.interno.DivHelper;
import avancado.utils.interno.MultHelper;
import avancado.utils.interno.SubHelper;
import avancado.utils.interno.SumHelper;

public class Calculadora {
    private final SumHelper sumHelper;
    private final SubHelper subHelper;
    private final MultHelper multHelper;
    private final DivHelper divHelper;

    public Calculadora() {
        sumHelper = new SumHelper();
        subHelper = new SubHelper();
        multHelper = new MultHelper();
        divHelper = new DivHelper();
    }

    public int sum(int a, int b){
        return sumHelper.execute(a, b);
    }
    public int sub(int a, int b){
        return subHelper.execute(a, b);
    }
    public int mult(int a, int b){
        return multHelper.execute(a, b);
    }
    public int div(int a, int b){
        return divHelper.execute(a, b);
    }
}
