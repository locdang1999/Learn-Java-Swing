package notepad;

import java.awt.HeadlessException;
import javax.swing.JFrame;

public class About extends JFrame {

    public About() {
        setBounds();
        setVisible(true);
    }

    public static void main(String[] args) {
        new About();
    }
}
