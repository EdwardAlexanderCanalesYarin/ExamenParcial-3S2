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

PREGUNTA 2 RGR en Tic-Tac-Toe
Prueba: límites deltablero I
// Programa del test sin que exista el objeto ticTacToe ni el metodo jugar
RED
import org.example.ticTacToe;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestLimiteTableroI {
    @Test
    public void TestLimiteTableroI(){
        assertEquals(new RuntimeException("Error"), ticTacToe.jugar(5, 2),0);
    }
}  
// Programa codigo que haga pasar los test a Green
GREEN
package org.example;
import java.lang.RuntimeException;
public class ticTacToe {
    public static void jugar(int row, int column){
        if(row >= 0 && row < 3 && column >= 0 && column < 3){
            System.out.println("Jugar");
        }else{
            new RuntimeException("Error");
        }
    }
}                                           
