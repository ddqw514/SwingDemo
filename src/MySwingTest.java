import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame extends JFrame{
    int myValue = 10;
    private JLabel sumLabel = new JLabel();
    private JButton myButton = new JButton("+");
    MyFrame(){
        /**
         * an ActionListener demo
         */
//        setLayout(new FlowLayout());
//        myButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                myValue+=10;
//                sumLabel.setText("my value change to " + myValue);
//
//            }
//        });
//        add(myButton);
//        add(sumLabel);
//        sumLabel.setText("my value is "+myValue);


        /**
         * a calculator demo
         */
//        JButton resultButton = new JButton("0");
//        JPanel panel = new JPanel();
//        //set to BorderLayout
//        setLayout(new BorderLayout());
//
//        add(resultButton, BorderLayout.NORTH);
//        add(panel, BorderLayout.CENTER);
//
//        //gridLayout
//        GridLayout gridLayout = new GridLayout(4,4,3,3);
//        panel.setLayout(gridLayout);
//
//        //add buttons
//        String [] buttonNames = new String []{"7", "8","9","/","4","5","6","*","1","2","3","-","0",".","=","+"};
//        for (String string : buttonNames) {
//            panel.add(new JButton(string));
//        }
//        //config resultButton
//        resultButton.setSize(200, 50);
//        resultButton.setHorizontalAlignment(SwingConstants.RIGHT);
//        resultButton.setEnabled(false);

    }
}
public class MySwingTest{
    public static void main(String[] args) {
        SwingConsole.run(new JFrame("hello-world"),200,250);
//        SwingConsole.run(new MyFrame(),200,250);
    }
}
