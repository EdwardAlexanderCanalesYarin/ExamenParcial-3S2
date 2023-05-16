package produccion;

public class PremiumMember extends Member {
    public PremiumMember(String nombre) {
        super(nombre);
    }
    @Override
    public void joinTournament(){
        System.out.println("Un miembro premium se une al juego");
    }
    @Override
    public void organizeTournament(){
        System.out.println("Mientro premium organiza el juego");
    }
}
