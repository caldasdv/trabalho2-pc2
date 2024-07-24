import java.util.Arrays;

public class Aluno {
    Integer matricula;
    String nome;
    Double[] notas;
    Double media;

    public Aluno(Integer matricula, String nome, Double[] notas){
        this.matricula = matricula;
        this.nome = nome;
        this.notas = notas;
        this.media = calculaMedia(notas);
    }
    public Double calculaMedia(Double[] media){
        double soma = 0.0;
        for (Double nota : notas){
            soma += nota;
        }
        return soma/ notas.length;
    }

    @Override
    public String toString() {
        return "matricula: " + matricula + " nome: " + nome + " notas: " + Arrays.toString(notas)+ " media: " + media;
    }

    public void setMedia(Double media) {
        this.media = media;
    }

    public Double getMedia(){
        return media;
    }
    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double[] getNotas() {
        return notas;
    }

    public void setNotas(Double[] notas) {
        this.notas = notas;
    }
}

