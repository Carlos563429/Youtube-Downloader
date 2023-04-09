package src;

import java.io.File;
import java.io.FileWriter;

import javax.swing.JFileChooser;
import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Carlos
 */
public class AdminClass {

    String path = "";

    public void chooseFile() {

        //TODO: A UI friendly
        /*try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (Exception e) {
            System.err.println(e);
        } finally {*/
        JFileChooser fc = new JFileChooser();

        fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

        int response = fc.showOpenDialog(null);
        if (response == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();

            path = file.getAbsolutePath();

            System.out.println(path);
            //}
        }
    }
    
    public void downloadVideo() {
        
        //First I need to write the path
        File file = new File("no_editar.sync");
        FileWriter fw = new FileWriter("no_editar.sync");        
        
        fw.append(path);

        fw.close();
    }

}
