package src;

import java.io.File;
import java.io.FileWriter;

import javax.swing.JFileChooser;
import com.formdev.flatlaf.FlatLightLaf;
import java.io.IOException;
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
    
    public void downloadVideo(String link) {
        
        //First I need to write the path
        try {
            File file = new File("no_editar.sync");
            file.createNewFile();
        } catch (IOException e) {
            System.err.println(e);
        }


        try {
            FileWriter fw = new FileWriter("no_editar.sync");        
            
            fw.append(path + ";");
    
            fw.close();   
        } catch (IOException e) {
            System.err.println(e);
        }
    }

}
