package ru.geekbrains.lesson7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GameField extends JPanel {
    private final int CELL_SIZE = 120;
    private final int MAP_SIZE = 3;
    private final int DOT_TO_WIN = 3;

    private byte[][] map;
    private boolean isGameOn;
    private boolean isGameWinPlayer;
    private boolean isGameWinAI;

    public GameField() {
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                if (isGameOn) {
                    if (e.getButton() == MouseEvent.BUTTON1) {
                        int cellX = e.getX() / CELL_SIZE;
                        int cellY = e.getY() / CELL_SIZE;
                        if (setDotTo(cellX, cellY, (byte) 1)) {
                            isGameWinPlayer = checkWin((byte) 1);
                            chekDraw();
                            aiTurn();
                        }
                    }
                }
            }
        });
        startGame();
    }

    public void chekDraw() {
        for (int i = 0; i < MAP_SIZE; i++) {
            for (int j = 0; j < MAP_SIZE; j++) {
                if (map[i][j] == 0) {
                    return;
                }

            }
        }
        isGameOn = false;
        repaint();
    }

    public void startGame() {
        this.map = new byte[MAP_SIZE][MAP_SIZE];
        this.isGameOn = true;
        this.isGameWinPlayer = false;
        repaint();
    }

    public void aiTurn() {
        if (isGameOn) {
            int cellX, cellY;
            do {
                cellX = (int) (Math.random() * MAP_SIZE);
                cellY = (int) (Math.random() * MAP_SIZE);
            } while (!setDotTo(cellX, cellY, (byte) 2));
            isGameWinAI = checkWin((byte) 2);
            repaint();
            chekDraw();
        }
    }

    public boolean checkWin(byte dot) {
        boolean coll;
        boolean result = false;
        boolean row;
        int rightDiagonal = 0;
        int leftDiagonal = 0;

        for (int i = 0; i < MAP_SIZE; i++) {
            if (map[i][i] == dot) {
                leftDiagonal++;
            }
            if (map[MAP_SIZE - i - 1][i] == dot) {
                rightDiagonal++;
            }
            if (leftDiagonal >= DOT_TO_WIN || rightDiagonal >= DOT_TO_WIN) {
                return true;

            }
        }

        for (int i = 0; i < MAP_SIZE; i++) {
            coll = true;
            row = true;
            for (int j = 0; j < MAP_SIZE; j++) {
                coll = coll && (map[i][j] == dot);
                row = row && (map[j][i] == dot);
            }
            if (coll || row) return result = true;
        }
        return result;
    }

    private boolean setDotTo(int cellX, int cellY, byte dot) {
        if (cellX < 0 || cellY < 0 || cellX >= MAP_SIZE || cellY >= MAP_SIZE) {
            return false;
        }
        if (map[cellX][cellY] == 0) {
            map[cellX][cellY] = dot;
            repaint();
            return true;
        }
        return false;
    }

    private void setLabelGame(Graphics g,String text) {
        g.setColor(Color.BLACK);
        g.setFont(new Font("Times New Roman", Font.PLAIN, 32));
        g.drawString(text, 80, 200);
    }

    @Override
    protected void paintComponent(Graphics g) {

        g.setColor(Color.white);
        g.fillRect(0, 0, MAP_SIZE * CELL_SIZE, MAP_SIZE * CELL_SIZE);

        for (int i = 0; i < MAP_SIZE; i++) {
            for (int j = 0; j < MAP_SIZE; j++) {
                ((Graphics2D) g).setStroke(new BasicStroke(3));
                g.setColor(Color.black);
                g.drawRect(i * CELL_SIZE, j * CELL_SIZE, CELL_SIZE, CELL_SIZE);
                if (map[i][j] == 1) {
                    ((Graphics2D) g).setStroke(new BasicStroke(6));
                    g.setColor(Color.green);
                    g.drawOval(i * CELL_SIZE + 10, j * CELL_SIZE + 10, CELL_SIZE - 20, CELL_SIZE - 20);
                }
                if (map[i][j] == 2) {
                    ((Graphics2D) g).setStroke(new BasicStroke(6));
                    g.setColor(Color.red);
                    g.drawLine(i * CELL_SIZE + 20, j * CELL_SIZE + 20, (i + 1) * CELL_SIZE - 20, (j + 1) * CELL_SIZE - 20);
                    g.drawLine(i * CELL_SIZE + 20, (j + 1) * CELL_SIZE - 20, (i + 1) * CELL_SIZE - 20, j * CELL_SIZE + 20);

                }
            }
        }


        if (!isGameOn && !isGameWinPlayer && !isGameWinAI) {
            setLabelGame(g,"Game Over");
        }
        if (isGameWinPlayer) {
            isGameOn = false;
            setLabelGame(g,"Game Win Player");
        }
        if (isGameWinAI) {
            isGameOn = false;
            setLabelGame(g,"Game Win AI");
        }
    }
}
