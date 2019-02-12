package Main;



import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;

/**
 *
 * @author ANDY
 */
public class Run {

    public static FormMain FormMain;

    public static void main(String[] args) {
        FormMain = new FormMain();
        FormMain.setLocationRelativeTo(FormMain);
        FormMain.setVisible(true);
    }

}
