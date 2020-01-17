//Ibrahim Mohamed

package theadditiongameibrahimmohamed;

import javax.swing.JOptionPane;

public class TheAdditionGameIbrahimMohamed
{

    public static void main(String[] args)
    {
        int numOfProbs, answer, x = 1, num1, num2, correct = 0;

        numOfProbs = Integer.parseInt(JOptionPane.showInputDialog("How many "
                + "addition problems would you like to do?"));

        while (x <= numOfProbs)
        {
            num1 = (int) (Math.random() * 40 + 10 + 1);
            num2 = (int) (Math.random() * 40 + 10 + 1);

            answer = Integer.parseInt(JOptionPane.showInputDialog(x + ".) \t\t"
                    + num1 + " + " + num2));

            if (answer == num1 + num2)
            {
                correct++;
                JOptionPane.showMessageDialog(null, "\nCorrect!\n\n" + correct
                        + " correct out of " + numOfProbs);
            } else
            {
                JOptionPane.showMessageDialog(null, "Incorrect!\n\n"
                        + "The correct answer is: " + (num1 + num2)
                        + "\n\n" + correct + " correct out of " + numOfProbs
                );
            }

            x++;
        }
    }
}
