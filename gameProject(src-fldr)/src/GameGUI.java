
    /**
     * ---------------------------------------------------------------------------
     * File name: GameGui.java
     * Project name: 1260Game
     * ---------------------------------------------------------------------------
     * Creator's name and email: Dylan Zelasko
     * Course:  CSCI 1260
     * Creation Date: Dec 6, 2020
     * ---------------------------------------------------------------------------
     */


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Scanner;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JWindow;

    /**
     * Enter type purpose here
     *
     * <hr>
     * Date created: Dec 6, 2020
     * <hr>
     * @author Dylan Zelasko
     */
    public class GameGUI extends JFrame
    {
        private static final long serialVersionUID = 1L;
        private JMenuBar 	gameMenuBar;
        private JMenu		closeMenu,
                resetMenu;
        private JMenuItem	closeItem,
                cancelItem,
                resetItem;
        private JPanel		gamePanel,
                mapPanel,
                mapAndCharacterPanel,
                outputPanel,
                characterPanel;
        private JLabel		namelabel,
                raceLabel,
                expLabel,
                levelLabel,
                weaponLabel,
                currentHealthLabel,
                maxHealthLabel,
                moneyLabel,
                nameValuelabel,
                raceValueLabel,
                expValueLabel,
                levelValueLabel,
                weaponValueLabel,
                currentHealthValueLabel,
                maxHealthValueLabel,
                moneyValueLabel;
        private JTextArea	inputArea,
                outputArea;
        private JButton		confirmButton;
        private Font		inputFont,
                characterFont;
        private GridLayout	characterLayout,
                mapLayout,
                camLayout;
        private JScrollPane	outputScroll;


        public GameGUI()
        {
            //set size and close operation for GUI. closing ends program
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setSize(1080, 720 );
            setResizable (false);
            setVisible(true);

            //initialize our menu bar
            gameMenuBar = new JMenuBar();
            gameMenuBar.setBackground (Color.getHSBColor (.44f, .6f, .88f));

            //add our JMenus to the menu bar with Color
            closeMenu = new JMenu("Close");
            closeMenu.setOpaque (true);
            closeMenu.setBackground(Color.getHSBColor (.44f,.6f, .88f));
            closeMenu.setForeground (Color.WHITE);

            resetMenu = new JMenu("Reset");
            resetMenu.setOpaque (true);
            resetMenu.setBackground(Color.getHSBColor (.44f,.6f, .88f));
            resetMenu.setForeground (Color.WHITE);

            //initialize menuItems
            closeItem = new JMenuItem("Close Game");
            closeItem.setOpaque (true);
            closeItem.setBackground(Color.getHSBColor (.44f,.6f, .88f));
            closeItem.setForeground (Color.WHITE);

            cancelItem = new JMenuItem("Cancel");
            cancelItem.setOpaque (true);
            cancelItem.setBackground(Color.getHSBColor (.4f,.7f, .55f));
            cancelItem.setForeground (Color.WHITE);

            resetItem = new JMenuItem("Reset Game");
            resetItem.setOpaque (true);
            resetItem.setBackground(Color.getHSBColor (.44f,.6f, .88f));
            resetItem.setForeground (Color.WHITE);


            //add MenuItems to our Menus to be activated when clicked
            closeMenu.add (closeItem);
            closeMenu.add (cancelItem);

            resetMenu.add (resetItem);
            resetMenu.add (cancelItem);


            //initialize ActionListener
            Handler gameHandler = new Handler();


            //set name of JFrame
            setTitle("Code Gang Code Game");


            //add ActionListener to all menuItems
            closeItem.addActionListener (gameHandler);
            resetItem.addActionListener (gameHandler);
            cancelItem.addActionListener (gameHandler);


            //add menus to gameMenuBar
            gameMenuBar.add (closeMenu);
            gameMenuBar.add (resetMenu);


            //add gameMenuBar to content layout
            gameMenuBar.setBorder (BorderFactory.createLineBorder (Color.getHSBColor(.44f,.6f,.77f), 4));
            getContentPane().add(BorderLayout.NORTH, gameMenuBar);


            //add gameMenuBar to JFrame
            setJMenuBar(gameMenuBar);
            setVisible(true);


            //initialize inputArea
            inputArea = new JTextArea("Here is where you enter instructions");
            inputArea.setLineWrap (true);
            inputArea.setWrapStyleWord(false);
            inputArea.setEditable (true);
            inputArea.setBackground(Color.getHSBColor (.40f, .4f, .5f));
            inputArea.setForeground (Color.white);
            inputFont = new Font("Serif", Font.BOLD, 15);
            inputArea.setFont (inputFont);


            //initialize confirmButton
            confirmButton = new JButton("Confirm Action!");


            //build gamePanel
            gamePanel = new JPanel();
            gamePanel.setLayout (new GridLayout(1,2));
            gamePanel.add (inputArea);
            gamePanel.add (confirmButton);


            //add gamePanel to south
            getContentPane().add(BorderLayout.SOUTH, gamePanel);


            //initialize output Area
            outputScroll = new JScrollPane(outputArea);
            outputScroll.setSize (300, 250);

            outputArea = new JTextArea(10, 40);
            outputArea.setLineWrap (true);
            outputArea.setWrapStyleWord(true);
            outputArea.setEditable (false);
            outputArea.setBackground(Color.getHSBColor (.40f, .4f, .5f));
            outputArea.setForeground (Color.white);
            outputArea.setFont (inputFont);
            outputArea.setText ("Welcome to Code Gang's Code Game!\n"+
                    "\tIn it, you play as a vagrant robbing "+
                    "a seedy motel and likely killing most "+
                    "of their clientele. Have fun!");


            //build mapPanel
            mapLayout = new GridLayout(1,2);
            mapPanel = new JPanel();
            mapPanel.add (outputArea);

            //buildCharacterPanel
            characterPanel = new JPanel();

            namelabel = new JLabel("NAME");
            raceLabel = new JLabel("RACE");
            expLabel = new JLabel("EXPERIENCE");
            levelLabel = new JLabel("LEVEL");
            weaponLabel = new JLabel("WEAPON");
            currentHealthLabel = new JLabel("HEALTH");
            maxHealthLabel = new JLabel("MAX HEALTH");
            moneyLabel = new JLabel("MONEY");

            nameValuelabel = new JLabel("1337");
            raceValueLabel = new JLabel("1337");
            expValueLabel = new JLabel("1337");
            levelValueLabel = new JLabel("1337");
            weaponValueLabel = new JLabel("1337");
            currentHealthValueLabel = new JLabel("1337");
            maxHealthValueLabel = new JLabel("1337");
            moneyValueLabel = new JLabel("1337");

            characterFont = new Font("Serif", Font.BOLD, 24);
            namelabel.setFont (characterFont);
            raceLabel.setFont (characterFont);
            expLabel.setFont (characterFont);
            levelLabel.setFont (characterFont);
            weaponLabel.setFont (characterFont);
            currentHealthLabel.setFont (characterFont);
            maxHealthLabel.setFont (characterFont);
            moneyLabel.setFont (characterFont);
            nameValuelabel.setFont (characterFont);
            raceValueLabel.setFont (characterFont);
            expValueLabel.setFont (characterFont);
            levelValueLabel.setFont (characterFont);
            weaponValueLabel.setFont (characterFont);
            currentHealthValueLabel.setFont (characterFont);
            maxHealthValueLabel.setFont (characterFont);
            moneyValueLabel.setFont (characterFont);

            namelabel.setForeground (Color.white);
            raceLabel.setForeground (Color.white);
            expLabel.setForeground (Color.white);
            levelLabel.setForeground (Color.white);
            weaponLabel.setForeground (Color.white);
            currentHealthLabel.setForeground (Color.white);
            maxHealthLabel.setForeground (Color.white);
            moneyLabel.setForeground (Color.white);
            nameValuelabel.setForeground (Color.white);
            raceValueLabel.setForeground (Color.white);
            expValueLabel.setForeground (Color.white);
            levelValueLabel.setForeground (Color.white);
            weaponValueLabel.setForeground (Color.white);
            currentHealthValueLabel.setForeground (Color.white);
            maxHealthValueLabel.setForeground (Color.white);
            moneyValueLabel.setForeground (Color.white);

            namelabel.setBackground(Color.getHSBColor (.40f, .4f, .5f));
            raceLabel.setBackground(Color.getHSBColor (.45f, .45f, .45f));
            expLabel.setBackground(Color.getHSBColor (.40f, .4f, .5f));
            levelLabel.setBackground(Color.getHSBColor (.45f, .45f, .45f));
            weaponLabel.setBackground(Color.getHSBColor (.40f, .4f, .5f));
            currentHealthLabel.setBackground(Color.getHSBColor (.45f, .45f, .45f));
            maxHealthLabel.setBackground(Color.getHSBColor (.40f, .4f, .5f));
            moneyLabel.setBackground(Color.getHSBColor (.45f, .45f, .45f));
            nameValuelabel.setBackground(Color.getHSBColor (.40f, .4f, .5f));
            raceValueLabel.setBackground(Color.getHSBColor (.45f, .45f, .45f));
            expValueLabel.setBackground(Color.getHSBColor (.40f, .4f, .5f));
            levelValueLabel.setBackground(Color.getHSBColor (.45f, .45f, .45f));
            weaponValueLabel.setBackground(Color.getHSBColor (.40f, .4f, .5f));
            currentHealthValueLabel.setBackground(Color.getHSBColor (.45f, .45f, .45f));
            maxHealthValueLabel.setBackground(Color.getHSBColor (.40f, .4f, .5f));
            moneyValueLabel.setBackground(Color.getHSBColor (.45f, .45f, .45f));

            namelabel.setOpaque (true);
            raceLabel.setOpaque (true);
            expLabel.setOpaque (true);
            levelLabel.setOpaque (true);
            weaponLabel.setOpaque (true);
            currentHealthLabel.setOpaque (true);
            maxHealthLabel.setOpaque (true);
            moneyLabel.setOpaque (true);
            nameValuelabel.setOpaque (true);
            raceValueLabel.setOpaque (true);
            expValueLabel.setOpaque (true);
            levelValueLabel.setOpaque (true);
            weaponValueLabel.setOpaque (true);
            currentHealthValueLabel.setOpaque (true);
            maxHealthValueLabel.setOpaque (true);
            moneyValueLabel.setOpaque (true);

            characterLayout = new GridLayout(8,2);
            characterPanel.setLayout(characterLayout);

            characterPanel.add (namelabel);
            characterPanel.add (nameValuelabel);
            characterPanel.add (raceLabel);
            characterPanel.add (raceValueLabel);
            characterPanel.add (expLabel);
            characterPanel.add (expValueLabel);
            characterPanel.add (levelLabel);
            characterPanel.add (levelValueLabel);
            characterPanel.add (weaponLabel);
            characterPanel.add (weaponValueLabel);
            characterPanel.add (currentHealthLabel);
            characterPanel.add (currentHealthValueLabel);
            characterPanel.add (maxHealthLabel);
            characterPanel.add (maxHealthValueLabel);
            characterPanel.add (moneyLabel);
            characterPanel.add (moneyValueLabel);


            //add character and map panels to joint panel
            camLayout = new GridLayout(1,2);
            mapAndCharacterPanel = new JPanel(camLayout);

            mapAndCharacterPanel.add (mapPanel);
            mapAndCharacterPanel.add (characterPanel);

            //add joint panel to middle of JFrame
            getContentPane().add(BorderLayout.CENTER, mapAndCharacterPanel);



        }

        private class Handler implements ActionListener
        {
            /**
             * Checks if an item has been clicked, and if so, runs an appropriate action
             */
            public void actionPerformed(ActionEvent click)
            {
                Object selection = click.getSource();
                if(selection == closeItem)//compares selection to known clickables to get what has to be done
                {//exits game
                    System.exit (0);
                }
                else if(selection == resetItem)
                {
                    JOptionPane.showMessageDialog(null, "Sorry, not available at the moment. Hopefully we'll figure this out soon!");
                }
                else if(selection == cancelItem)
                {
                    ;
                }
                else if(selection == confirmButton)
                {
                    String s = "";
                    inputArea.getText();    //insert a LOT of the old driver code and this is basically the new driver
                    s.toLowerCase();

                }
            }
        }

    }
