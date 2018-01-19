import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MainWindow extends JFrame
{

    public MainWindow()
    {
        setTitle("Snake");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(370,400);
        setLocation(1920/2-370/2,1080/2-390/2);
        setVisible(false);
        setResizable(false);
        System.out.println("It Works!");
    }

    public static void main(String[] args) {
        MainWindow mw = new MainWindow();
        JMenuBar jMenuBar = new JMenuBar();

        JMenu file = new JMenu("Game");
        jMenuBar.add(file);


        file.add(new JMenuItem("Start", 'S')).addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
            	GameField gf = new GameField();
            	mw.add(gf);
            	mw.setVisible(true);
            	gf.requestFocus();
            }
        });
        file.addSeparator();
        file.add(new JMenuItem("Exit", 'E')).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        jFrame.setJMenuBar(jMenuBar);
        jFrame.revalidate();
        file.setMnemonic('G');
        file.add(new JMenuItem("Set_back", 'B')).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    static JFrame jFrame = getFrame();
    static JFrame getFrame()
    {
        JFrame jFrame = new JFrame() {};
        jFrame.setTitle("Snake");
        jFrame.setVisible(true);
        jFrame.setBounds(1920/2-370/2, 1080/2-390/2, 370, 400);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setResizable(false);
        jFrame.getContentPane().setBackground(Color.DARK_GRAY);
        String hello = "Welcome to Snake";
        return jFrame;


    }




    }
