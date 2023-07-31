import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        //create an object
        textEditor textEditor = new textEditor(null);

        //used jframe to create window
        textEditor.setTitle("It's a Text Editor");
        textEditor.setSize(900, 600);
        textEditor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        textEditor.setVisible(true);
        textEditor.setLocationRelativeTo(null);
    }
}

