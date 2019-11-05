package _03_photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.awt.*;
import java.awt.image.ImageProducer;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

    public void run() throws Exception {

        JFrame quizWindow = new JFrame();
        quizWindow.setVisible(true);
        // This will make sure the program exits when you close the window
        quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 1. find an image on the internet, and put its URL in a String
        // variable (from your browser, right click on the image, and select
        // “Copy Image Address”)
        String imageURL = "https://image.businessinsider.com/5d94bf6f6428f7054f5027f0?width=1300&format=jpeg&auto=webp";
        URL resource = getClass().getResource(imageURL);
        ImageProducer image = new ImageProducer(resource);


        // 2. create a variable of type "Component" that will hold your image
        Component component;

        // 3. use the "createImage()" method below to initialize your Component
        component.createImage(image);

        // 4. add the image to the quiz window
        quizWindow.setIconImage(component);

        // 5. call the pack() method on the quiz window
        quizWindow.pack();

        // 6. ask a question that relates to the image
        String input = JOptionPane.showInputDialog("What company makes the thing in the image?");

        // 7. print "CORRECT" if the user gave the right answer
        if (input.equalsIgnoreCase("spacex")) {
            JOptionPane.showMessageDialog(null, "CORRECT");
        } else {
            JOptionPane.showMessageDialog(null, "INCORRECT");
        }

        // 8. print "INCORRECT" if the answer is wrong

        // 9. remove the component from the quiz window (you may not see the
        // effect of this until step 12)
        quizWindow.remove(component);

        // 10. find another image and create it (might take more than one line
        // of code)
        imageURL = "https://www.lifewire.com/the-12-most-petty-memes-you-can-use-4161193";
        resource = getClass().getResource(imageURL);
        component.createImage(resource);


        // 11. add the second image to the quiz window
        quizWindow.add(component);

        // 12. pack the quiz window
        quizWindow.pack();

        // 13. ask another question

        // 14+ check answer, say if correct or incorrect, etc.

    }

    private Component createImage(String imageUrl) throws MalformedURLException {
        URL url = new URL(imageUrl);
        Icon icon = new ImageIcon(url);
        JLabel imageLabel = new JLabel(icon);
        return imageLabel;
    }

    /* OPTIONAL */
    // *14. add scoring to your quiz
    // *15. make something happen when mouse enters image
    // (imageComponent.addMouseMotionListener())
}
