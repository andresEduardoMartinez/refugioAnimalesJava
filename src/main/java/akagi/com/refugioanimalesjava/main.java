
package akagi.com.refugioanimalesjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author andymcparow
 */
public class main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
                mainPanel main = new mainPanel();
                main.setVisible(true);
        });

    }
}
