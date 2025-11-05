import javax.swing.*;

public class snakeFrame extends JFrame {
    snakeFrame(){
        snakePanel panel = new snakePanel();
        this.add(panel);
        this.setTitle("snakeXenzia");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}
