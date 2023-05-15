# ExamenParcial-3S2
PREGUNTA 1 SOLID y refactorización
- Antes de la refactorizacion 

package produccion;
public abstract class Member {
    private final String nombre;
    public Member(String nombre) {
        this.nombre = nombre;
    }
    public abstract void joinTournament();
    public abstract void organizeTournament();

}

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

