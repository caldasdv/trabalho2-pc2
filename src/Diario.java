import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
public class Diario {

    public static void main(String[] args) {
        int matricula;
        Scanner stdin = new Scanner(System.in);
        List <Aluno> alunos = new ArrayList<>();
        do {
            matricula = stdin.nextInt();
            if (matricula == 0){
                break;
            }
            String nome = stdin.next();
            int arrayTam = stdin.nextInt();
            Double[] array = new Double[arrayTam];
            for (int i = 0; i < array.length; i++) {
                double nota = stdin.nextDouble();
                array [i] = nota;
            }
            Aluno aln = new Aluno(matricula, nome, array);
            alunos.add(aln);
        }while(matricula != 0);
        stdin.close();

        double[] mediaNotas = calcularMediaNotas(alunos);
        double mediaGeral = calcularMediaGeral(mediaNotas);

        for (Aluno aluno : alunos){
            System.out.println(aluno);
        }
        System.out.println("\nTotal de alunos: " + alunos.size());
        for (int i = 0; i < mediaNotas.length; i++) {
            System.out.printf("Média da nota %d: %.2f\n", i + 1, mediaNotas[i]);
        }
        System.out.printf("Média geral: %.2f\n", mediaGeral);
    }
    private static double[] calcularMediaNotas(List<Aluno> alunos){
        int numNotas = alunos.getFirst().getNotas().length;
        double[] mediaNotas = new double[numNotas];
        for (int i = 0; i <numNotas ; i++){
            double soma = 0.0;
            for (Aluno aluno : alunos){
                soma += aluno.getNotas()[i];
            }
            mediaNotas[i] = soma / alunos.size();
        }
        return mediaNotas;
    }
    private static double calcularMediaGeral(double[] mediaNotas){
        Double soma = 0.0;
        for (double media : mediaNotas){
            soma += media;
        }
        return soma / mediaNotas.length;
    }
}

