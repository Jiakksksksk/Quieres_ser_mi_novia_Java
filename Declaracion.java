package Qsmn;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ventana extends JFrame{
    public JPanel panel;
    public JButton boton1;
    public JButton boton2;
    public Ventana(){
        setSize(640,480);//Establecemos el tamaño de la ventana
        setLocationRelativeTo(null);//Establecemos la pantalla en el centro
        setTitle("Quieres ser mi Niña");//Establecemos el titulo de nuestra ventana
        setResizable(false);//Establecemos si la ventana puede cambiar de tamaño o no
        iniciarComponentes();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    private void iniciarComponentes(){
        colocarPaneles();
        colocarEtiquetas();
        colocarBotones();
        colocarBotones2();

    }
    private void colocarPaneles(){
        panel = new JPanel();//Creacion de un panel
        panel.setLayout(null);//desactivando el diseño
        this.getContentPane().add(panel);// Agragamos el panel a la ventana
    }
    private void colocarEtiquetas(){
        //Etiqueta 1 - etiqueta de texto
        JLabel etiqueta = new JLabel();//Creamos una etiqueta de texto
        etiqueta.setText("Quieres ser mi Niña?");//Establecemos el texto de la etiqueta
        etiqueta.setBounds(160,50,300,80);
        etiqueta.setForeground(Color.BLACK);//Establecemos el color de la letra
        etiqueta.setFont(new Font("cooper blak",Font.PLAIN,30));
        panel.add(etiqueta);//agregamos la etiqueta al panel
    }
    private void colocarBotones(){
        boton1 = new JButton();
        boton1.setText("Shi");
        boton1.setBounds(60, 250, 100, 40);
        eventoDeRaton();
        panel.add(boton1);
        
        
    }
    private void colocarBotones2(){
        boton2 = new JButton();
        boton2.setText("No");
        int x = 450;
        int y = 250;
        
        boton2.setBounds(x, y, 100, 40);
        
        MouseListener eventoRaton2 = new MouseListener() {
            int cont = 0;
            @Override
            public void mouseClicked(MouseEvent me) {
            }
            @Override
            public void mousePressed(MouseEvent me){
            }

            @Override
            public void mouseReleased(MouseEvent me){
            }

            @Override
            public void mouseEntered(MouseEvent me) {
                if(cont == 0){
                   boton2.setBounds(x-60, y-60, 100, 40);
                }
                else if( cont  == 1){
                   boton2.setBounds(x, y, 100, 40);
                }
                else if(cont == 2){
                     boton2.setBounds(x+60, y-60, 100, 40);
                     
                }
                else{
                    boton2.setBounds(x-60, y-60, 100, 40);
                    cont = 0;
                }
            }

            @Override
            public void mouseExited(MouseEvent me) {
                cont ++;
            }
        };

        boton2.addMouseListener(eventoRaton2);
        panel.add(boton2);
    }
    private void eventoDeRaton(){
        JLabel etiqueta2 = new JLabel();//Creamos una etiqueta de texto
        etiqueta2.setBounds(160,150,300,80);
        etiqueta2.setForeground(Color.BLACK);//Establecemos el color de la letra
        etiqueta2.setFont(new Font("cooper blak",Font.PLAIN,30));
        panel.add(etiqueta2);//agregamos la etiqueta al panel
        MouseListener eventoRaton = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {
                etiqueta2.setText("Yo sabia que querias");
            }
            @Override
            public void mousePressed(MouseEvent me){
            }

            @Override
            public void mouseReleased(MouseEvent me){
            }

            @Override
            public void mouseEntered(MouseEvent me) {
            }

            @Override
            public void mouseExited(MouseEvent me) {
                etiqueta2.setText(" ");
            }
        };

        boton1.addMouseListener(eventoRaton);
    }
}
