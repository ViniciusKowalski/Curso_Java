import javax.swing.JOptionPane;

public class ControleVotos {
    public static void main(String[] args) {      
           
        int urnaLiberada = Integer.parseInt(JOptionPane.showInputDialog("1 - Para Liberar Urna \n"
                + "2 - Finalizar Votação \n"
                + "9 - Sair da Votação") );
        
        switch (urnaLiberada) {
            case 1:
                System.out.println("Eleitor pode Votar");
                break;
            case 2:
                System.out.println("Finalizar Votação");
                break;
            case 9:
                System.out.println("Sai da Votação");
                break;
            default:
                System.out.println("Erro - Urna não foi Liberada");
                break;
        }
	 
	String candidato1 = "15 - Angela Pepino - Partido PMDB";
	String candidato2 = "13 - Gean da Silva - Partido PT";
	String candidato3 = "25 - Cesar Souza Neto - Partido DEM";
	String nulo = "4 - Voto Nulo";
	String branco = "5 - Voto Branco";
        
        int voto = 0;
        do{  
        
            voto = Integer.parseInt(JOptionPane.showInputDialog("Digite o Código do Seu Canditado: \n"
                    + "15 - Angela Pepino - Partido PMDB \n"
                    + "13 - Gean da Silva - Partido PT \n"
                    + "25 - Cesar Souza Neto - Partido DEM \n"
                    + " 4 - Voto Nulo \n"
                    + " 5 - Voto em Branco \n"));
        
            if(voto == 15){
                System.out.println(candidato1 = candidato1 +1);
            }
            if(voto == 13){
                System.out.println(candidato2 = candidato2 +1);
            }
            if(voto == 25){
                System.out.println(candidato3 = candidato3 +1);
            }
            if(voto == 4){
                System.out.println(nulo = nulo +1);
            }
            if (voto == 5){
                System.out.println(branco = branco +1);
            } 
            
        } 
        while (voto != 9);            
           
        System.out.println("A Candidata, Angela Pepino do PMDB", +candidato1+, "votos.");
        System.out.println("O Candidato, Gean da Silva do PT", +candidato2+ , "votos.");
        System.out.println("O Candidato, Cesar Souza Neto do DEM", +candidato3+ , "votos.");
        System.out.println("Total de votos Nulos", +nulo+ , ".");
        System.out.println("Total de votos Brancos", +branco+ , ".");	
   }
}