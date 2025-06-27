package entidades;

public class Aula1306 {
    private String nome;
    private double sb;
    private double imp;
    private double sl;
    private double salario;
    private double porcent;

    public Aula1306() {
    }

    public Aula1306 createAula1306() {
        return new Aula1306();
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSb() {
        return sb;
    }

    public void setSb(double sb) {
        this.sb = sb;
    }

    public double getImp() {
        return imp;
    }

    public void setImp(double imp) {
        this.imp = imp;
    }

    public double getSl() {
        return sl;
    }

    public void setSl(double sl) {
        this.sl = sl;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getPorcent() {
        return porcent;
    }

    public void setPorcent(double porcent) {
        this.porcent = porcent;
    }




    public void aumentarSalario(double porcent){
        double aumento = sb + porcent;
        sb += aumento;
        
        salarioLiquido();


    }

    public double resultadoPorcentagem(double porcent) {
        this.porcent = sb * porcent / 100;
        return porcent;
    }

    public double salarioLiquido() {
        double sl= sb - imp;

        return sl;
    }

    public double atualizacaoSalario() {
        porcent = sb * porcent / 100;
        sb = sb + porcent;
        double sl= sb - imp;

        return sl;
    }

    //lembrar ToString
   // public String toString(){
    //    return nome
      //          +" ,R$ "
        //        +String.format("%.2f", calcularSalarioLiquido());
    //}


}
