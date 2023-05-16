package produccion;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Member> miembros = List.of(
                new PremiumMember("Abejita Azul"),
                new VipMember("Kaperucita Feliz"),
                new FreeMember("Inspectora Motita")
        );
        for(int i = 0; i < miembros.size(); ++i){
            miembros.get(i).joinTournament();
            miembros.get(i).organizeTournament();
            System.out.println("\n");
        }
    }
}