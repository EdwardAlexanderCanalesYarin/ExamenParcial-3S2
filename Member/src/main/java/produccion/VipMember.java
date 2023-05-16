package produccion;

public class VipMember extends Member {
    public VipMember(String nombre) {
        super(nombre);
    }
    @Override
    public void joinTournament(){
        System.out.println("Un miembro vip se une al juego");
    }
    @Override
    public void organizeTournament(){
        System.out.println("Mientro vip organiza el juego");
    }
}