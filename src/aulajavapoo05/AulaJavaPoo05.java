/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulajavapoo05;


public class AulaJavaPoo05 {
  
    public static void main(String[] args) {
     ContaBanco p1 = new ContaBanco ();
     p1.setNumConta(111111);
     p1.estadoAtual();
     p1.setDono("Jubileu");
     p1.abrirConta ("CC");
     
     ContaBanco p2 = new ContaBanco ();
     p2.setDono("Jhony Cash");
     p2.setNumConta(1234);
     p2.estadoAtual();
     p2.abrirConta("CP");
     
     p1.depositar(100);
     p2.depositar(500);
     p2.sacar(1000);
     
     p1.sacar(150);
     p1.estadoAtual();
     p2.estadoAtual();
     p1.fecharConta();
     
    }
    
}
