/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication39;

/**
 *
 * @author erik_
 */
 import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Tetris extends JPanel {

    private final int BOARD_WIDTH = 10;
    private final int BOARD_HEIGHT = 20;
    private final int BLOCK_SIZE = 30;

    private boolean[][] board;

    public Tetris() {
        board = new boolean[BOARD_HEIGHT][BOARD_WIDTH];
        setPreferredSize(new Dimension(BOARD_WIDTH * BLOCK_SIZE, BOARD_HEIGHT * BLOCK_SIZE));
        setBackground(Color.BLACK);

        addKeyListener(new KeyListener() {
            public void keyTyped(KeyEvent e) {}

            public void keyPressed(KeyEvent e) {
                // Lógica para manejar las teclas presionadas
            }

            public void keyReleased(KeyEvent e) {}
        });

        setFocusable(true);
    }

    public void startGame() {
        // Lógica para iniciar el juego
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Lógica para dibujar los bloques en el tablero
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Tetris");
        Tetris tetris = new Tetris();
        frame.add(tetris);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        tetris.startGame();
    }
}
