package CF;

import CF.Login.TelaLogin;


public class ProjetoPoo {
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               new TelaLogin().setVisible(true);
            }
        });
    }
}
