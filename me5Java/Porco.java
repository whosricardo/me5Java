public class Porco extends Animal implements Pesado, Colorido{

    @Override
    public void fazerBarulho() {
        System.out.println("Oinc!");
    }

    @Override
    public String obterCor() {
        return "Preto";
    }

    @Override
    public double obterPeso() {
        return 50.0;
    }

    public boolean enlameado(){
        return true;
    }

    @Override
    public String toString() {
        String enlameadoString = enlameado() ? "sim" : "não";
        return String.format("\n%s: %s\n%s: %.6f\n%s: %s",
                "Cor", obterCor(),
                "Peso", obterPeso(),
                "Enlameado?", enlameadoString);
    }
}