package produccion;

public class FreeMember extends Member {
    public FreeMember(String nombre) {
        super(nombre);
    }
    @Override
    public void joinTournament() {
        System.out.println("Un miembro gratuito se une al juego");
    }
    //Este método rompe LSP
    @Override
    public void organizeTournament() {
        System.out.println("Un miembro gratuito no puede orzanizar un juego");
    }
}
