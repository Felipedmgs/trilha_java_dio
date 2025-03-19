package candidatura;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {

    public static void main(String[] args) {
        System.out.println("Processo Seletivo");
        //analisarCandidatos(3000.0);
        selecaoCandidatos();
    }

    static boolean atender(){
        return new Random().nextInt(3)==1;
    }

    static void imprimirSelecionados(){
        String [] candidatos = {"Ana", "Carlos", "Felipe"};
        System.out.println("Imprimindo lista de candidatos selecionados");

       for(String candidato : candidatos){
          entrandoEmContato(candidato);
       }
    }

    static void entrandoEmContato(String candidato){
       int tentativasRealizadas = 0;
       boolean continuarTentando = true;
       boolean atendeu=false;

       do{
           atendeu = atender();
           continuarTentando = !atendeu;
           if(continuarTentando){               
               tentativasRealizadas++;
           } else{
               System.out.println("Contato realizado com sucesso");              
           }
       } while(continuarTentando && tentativasRealizadas < 3);

       if(atendeu){
           System.out.println("Candidato " + candidato + " atendeu a ligação");
       } else{
           System.out.println("Candidato " + candidato + " não atendeu a ligação");
       }
    }

    static void selecaoCandidatos(){
        String [] candidatos = {"João", "Maria", "José", "Ana", "Carlos", "Felipe"};
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase=2000.0;

        while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = ThreadLocalRandom.current().nextDouble(1500.0, 3000.0);            
            
            if(salarioBase >= salarioPretendido){
                System.out.println("Candidato: " + candidato + " foi selecionado para vaga");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }

    static void analisarCandidatos(double salarioPretendido){
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido){
            System.out.println("Ligar para Candidato");
        } else if(salarioBase == salarioPretendido){ 
            System.out.println("Enviar contra proposta ao Candidato");
        }
        else{
            System.out.println("Aguardando demais Candidato");
        }
    }
}