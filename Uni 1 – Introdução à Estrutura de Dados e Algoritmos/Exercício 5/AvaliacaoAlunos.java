public class AvaliacaoAlunos {
    public static void main(String[] args) {
        int[] notas = {7, 8, 10, 5, 9};
        int maior = notas[0];

        for(int nota : notas){
            if(nota > maior){
                maior = nota;
            }
        }

        System.out.println("A maior nota da turma é: " + maior);
    }
}
