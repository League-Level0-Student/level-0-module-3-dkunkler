package elseif;

import javax.swing.JOptionPane;

public class Horoscope {
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("What is your zodiac sign?");
		if (input.equals("Aries")) {
			JOptionPane.showMessageDialog(null, "Aries horoscope");
		} else if (input.equals("Taurus")) {
			JOptionPane.showMessageDialog(null, "Taurus horoscope");
		} else if (input.equals("Gemini")) {
			JOptionPane.showMessageDialog(null, "Gemini horoscope");
		} else if (input.equals("Cancer")) {
			JOptionPane.showMessageDialog(null, "Cancer horoscope");
		} else if (input.equals("Leo")) {
			JOptionPane.showMessageDialog(null, "Leo horoscope");
		} else if (input.equals("Virgo")) {
			JOptionPane.showMessageDialog(null, "Virgo horoscope");
		} else if (input.equals("Libra")) {
			JOptionPane.showMessageDialog(null, "Libra horoscope");
		} else if (input.equals("Scorpio")) {
			JOptionPane.showMessageDialog(null, "Scorpio horoscope");
		} else if (input.equals("Sagittarius")) {
			JOptionPane.showMessageDialog(null, "Sagitarrius horoscope");
		} else if (input.equals("Capricorn")) {
			JOptionPane.showMessageDialog(null, "Capricorn horoscope");
		} else if (input.equals("Aquarius")) {
			JOptionPane.showMessageDialog(null, "Aquarius horoscope");
		} else if (input.equals("Pisces")) {
			JOptionPane.showMessageDialog(null, "Pisces horoscope");
		} else {
			JOptionPane.showMessageDialog(null, "That is not a zodiac star sign!");
		}
	}
}
