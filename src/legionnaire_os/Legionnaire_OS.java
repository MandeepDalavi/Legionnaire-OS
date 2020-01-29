/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package legionnaire_os;

import javax.swing.JOptionPane;

/*
 * @author Mandeep M. Dalavi
 */
public class Legionnaire_OS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Splash Splash = new Splash();
        Login Login = new Login();
        Splash.setVisible(true);
        try
            {
                for(int i = 0; i<=100; i++)
                {
                    Thread.sleep(60);
                    Splash.loadingnum.setText(Integer.toString(i)+"%");
                    Splash.loadingbar.setValue(i);
                    if(i==100)
                    {
                        Splash.setVisible(false);
                        Login.setVisible(true);
                    }
                }
            }
        catch(Exception e)
            {
                JOptionPane.showMessageDialog(Splash, "Error in Connectivity");
            }
                
        // TODO code application logic here
    }
    
}
