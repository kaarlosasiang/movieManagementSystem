/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package moviemanagementsystem;

import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author kaarlosasiang
 */
public class MovieManagementSystem {

    /**
     * @param args the command line arguments
     */
    static Startup start = new Startup();
    static MainFrame mf = new MainFrame();
    private static boolean isContinue = true;

    public static void main(String[] args) {
        // TODO code application logic here
        mf.setVisible(true);

//        if (isContinue == true) {
//            start.setVisible(true);
//            Timer timer = new Timer();
//
//            timer.schedule(new EndStartup(), 5000, 5000);
//           
//        }
    }

    static class EndStartup extends TimerTask {

        @Override
        public void run() {
            start.dispose();
            mf.setVisible(true);
            isContinue = false;
        }
    }

//    public boolean endStartup(){
//        return true;
//    }
//    
}
