/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufc.projeto.visao.dialogos;

import java.awt.Frame;
import java.awt.Point;
import javax.swing.JDialog;
import ufc.projeto.modelo.Perfil;
import ufc.projeto.visao.SelecionaJogadoresGui;

/**
 *
 * @author Loopback
 */
public class DialogoFimDeJogo extends JDialog implements EventosDialogo{
    private Perfil perfil;
    public DialogoFimDeJogo(Frame owner, Perfil perfil) {
        super(owner);
        this.perfil = perfil;
        iniciandoComponentes();
    }
    
    private void iniciandoComponentes(){
        this.setContentPane(new PainelDialogoFimDeJogo(perfil, this));
        this.setModal(true);
        this.setSize(1376, 728);
        this.setLocation(new Point(300, 180));
        this.setUndecorated(true);
        this.setVisible(true);
        this.pack(); 
    }

    @Override
    public void cliqueBotao1() {
        this.dispose();
        new SelecionaJogadoresGui().setVisible(true);
    }

    @Override
    public void cliqueBotao2() {
        System.exit(0);
    }
    
}
