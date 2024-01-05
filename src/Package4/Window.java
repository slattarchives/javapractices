package Package4;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Window extends JFrame{
    JButton milan = new JButton("AC Milan");
    JButton madrid = new JButton("Real Madrid");
    JLabel result = new JLabel("Result: 0 X 0");
    JLabel scorer = new JLabel("Last scorer: N/A");
    JLabel winner = new JLabel("Winner: DRAW");
    int cnt1 = 0, cnt2 = 0;
    JPanel[] panel = new JPanel[4];

    Window(){
        super("Window");

        milan.setBackground(Color.MAGENTA);
        madrid.setBackground(Color.MAGENTA);
        Font font = new Font("Arial", Font.BOLD, 16);
        milan.setFont(font);
        madrid.setFont(font);
        result.setFont(font);
        scorer.setFont(font);
        winner.setFont(font);

        setLayout(new GridLayout(4, 0));
        setBounds(500, 200, 500, 500);
        for (int i = 0; i < panel.length; i++){
            panel[i] = new JPanel();
            add(panel[i]);
            panel[i].setBackground(Color.YELLOW);
            panel[i].setLayout(new FlowLayout());
        }

        panel[0].add(milan);
        panel[0].add(madrid);
        panel[1].add(result, BorderLayout.CENTER);
        panel[2].add(scorer, BorderLayout.CENTER);
        panel[3].add(winner, BorderLayout.CENTER);

        milan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cnt1 += 1;
                result.setText("Result: "+cnt1+" X "+cnt2);
                scorer.setText("Last scorer: AC Milan");
                if (cnt1 > cnt2) winner.setText("Winner: "+milan.getText());
                if (cnt1 == cnt2) winner.setText("Winner: DRAW");
            }
        });

        madrid.addActionListener(e -> {
            cnt2 += 1;
            result.setText("Result: "+cnt1+" X "+cnt2);
            scorer.setText("Last scorer: "+madrid.getText());
            if (cnt1 < cnt2) winner.setText("Winner: "+madrid.getText());
            if (cnt1 == cnt2) winner.setText("Winner: DRAW");
        });
    }


}