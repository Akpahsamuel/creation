import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Creation {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Creation Days");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        
        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);
        
        frame.setVisible(true);
    }
    
    private static void placeComponents(JPanel panel) {
        panel.setLayout(null);

        JLabel userLabel1 = new JLabel("<html>Wants to know what God created on each day</html>");
        userLabel1.setBounds(5, 10, 150, 25);
        panel.add(userLabel1);

        


        JLabel userLabel = new JLabel(" Enter a day (1-7):");
        userLabel.setBounds(20, 30, 150, 25);
        panel.add(userLabel);
        
        JTextField dayText = new JTextField(20);
        dayText.setBounds(150, 20, 165, 25);
        panel.add(dayText);
        
        JButton showButton = new JButton("Show Events");
        showButton.setBounds(10, 80, 150, 25);
        panel.add(showButton);
        
        JTextArea resultArea = new JTextArea();
        resultArea.setBounds(10, 110, 400, 100);
        resultArea.setLineWrap(true);
        resultArea.setWrapStyleWord(true);

        panel.add(resultArea);
        
        showButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int day;
                try {
                    day = Integer.parseInt(dayText.getText());
                } catch (NumberFormatException ex) {
                    resultArea.setText("Invalid input. Please enter a number between 1 and 7.");
                    return;
                }
                
                switch (day) {
                    case 1:
                        resultArea.setText("Day 1: On the first day, God spoke and light into existence. <br/> Genesis 1:3-5");
                        break;
                    case 2:
                        resultArea.setText("Day 2: On the second day, God separated the waters, creating the sky (firmament) above the earth.\nGenesis 1:6-8");
                        break;
                    case 3:
                        resultArea.setText("Day 3:On day 3, God commanded the land to rise from the water and brought forth all kinds of plants and trees.\nGenesis 1:9-13");
                        break;
                    case 4:
                        resultArea.setText("Day 4: On day 4, God placed the sun, moon, and stars in the heavens to govern the day and night, and mark the seasons. S<br> Genesis 1:14-19");
                        break;
                    case 5:
                        resultArea.setText("Day 5:On day 5, God filled the world with life in the waters and the skies. He created the swimming creatures of the seas and the birds that soar through the air.\nGenesis 1:20-23");
                        break;
                    case 6:
                    resultArea.setText("Day 6: On day 6, God created the land animals in all their variety, from the smallest creatures that creep to the largest beasts that roam. He then crowned His creation by forming humanity, male and female, in His own image<br/>Genesis 1:24-31");

                        break;
                    case 7:
                        resultArea.setText("Day 7: God rested\nGenesis 2:1-3");
                        break;
                    default:
                        resultArea.setText("Invalid day. Please enter a number between 1 and 7.");
                }
            }
        });
    }
}
