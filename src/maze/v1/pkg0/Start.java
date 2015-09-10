package maze.v1.pkg0;

import javax.swing.JOptionPane;

public class Start {
    
    static private int numNPC= (int)(Double.parseDouble(JOptionPane.showInputDialog("Number of NPC: (Max10)")));
    static private int numCoins= (int)(Double.parseDouble(JOptionPane.showInputDialog("Number of Coins:")));
    static private int highScore=(int)(Double.parseDouble(JOptionPane.showInputDialog("set HighScore")));
    static private int num;
    static private String cheat;

    
    static public int getnumNPC()
    {
        return(numNPC);
    }
    static public int getnumCoins()
    {
        return(numCoins);
    }
    static public int getHighScore()
    {
        return(highScore);
    }
    static public String getCheats()
    {
        return(cheat);
    }
    static public void setCheats(String _cheat)
    {
        cheat=((JOptionPane.showInputDialog("Enter Command")));
    }
}
