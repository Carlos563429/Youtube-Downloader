package src;

import java.io.File;
import java.io.FileWriter;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import com.formdev.flatlaf.FlatLightLaf;
import java.io.IOException;
import java.net.URL;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Carlos
 */
public class AdminClass {

    String path;

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
        
        //The user will be must to choose a file
        chooseFile();

        //First I need to write the path
        try {
            File file = new File("no_editar.sync");
            file.createNewFile();
        } catch (IOException e) {
            System.err.println(e);
        }


        try {
            FileWriter fw = new FileWriter("no_editar.sync");        
            
            fw.append(path + ";" + link);
    
            fw.close();

        } catch (IOException e) {
            System.err.println(e);
        }

        //Now index.py needs know the correct time
        try {
            File file = new File("its_the_moment.sync");

            file.createNewFile();

        } catch (IOException e) {
            System.err.println(e);
        }

        try{
        //Open the .exe (index.py convnerted to .exe)
        
        //Get the path
        URL url = AdminClass.class.getProtectionDomain().getCodeSource().getLocation();

        File jarFile = new File(url.toURI());

        File jarDir = jarFile.getParentFile();
        String jarDirPath = jarDir.getPath();

        String exePath = jarDirPath + "\\index.exe";

        //Open the .exe
        Runtime runtime = Runtime.getRuntime();
        Process process = runtime.exec("cmd.exe /C start " + exePath);

        JOptionPane.showMessageDialog(null, exePath);

        process.wait(10000);
        process.destroy();

        } catch(Exception e){

        }
    }

}
