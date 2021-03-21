package basico.dev;

public class Salarios {
    private final Integer salGer, salSuper, salAtend;

    public Salarios(Integer salGer, Integer salSuper, Integer salAtend) {
        this.salGer = salGer;
        this.salSuper = salSuper;
        this.salAtend = salAtend;
    }
    public Integer getSalGer() {
        return salGer;
    }
    public Double calcImpGer() {
        return this.getSalGer() * 0.1;
    }
    public Integer getSalSuper() {
        return salSuper;
    }
    public Double calcImpSuper() {
        return this.getSalSuper() * 0.05;
    }
    public Integer getSalAtend() {
        return salAtend;
    }
    public Double calcImpAtend() {
        return this.getSalAtend() * 0.01;
    }
}
