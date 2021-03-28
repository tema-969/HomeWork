package ru.geekbrains.course1.lesson7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class XoForm extends JFrame {
    private GameField gameField;

    public XoForm() {
        this.setTitle("X-O");
        this.setBounds(500, 300, 381, 460);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        this.gameField = new GameField();
        this.add(gameField);

        JPanel bottomPanel = new JPanel(new GridLayout(1,2));
        Button btnStart = new Button("Start New Game");
        Button btnExit = new Button("Exit Game");
        bottomPanel.add(btnStart);
        bottomPanel.add(btnExit);
        bottomPanel.setPreferredSize(new Dimension(1,40));
        this.add(bottomPanel, BorderLayout.SOUTH);

        btnStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameField.startGame();
            }
        });

        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        this.setVisible(true);
    }

    public static void main(String[] args) {
        new XoForm();

    }
}
