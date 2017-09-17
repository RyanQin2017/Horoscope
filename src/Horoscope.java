import javax.swing.JOptionPane;

public class Horoscope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String answer = JOptionPane.showInputDialog("What is your zodiac sign?");
			if(answer.equalsIgnoreCase("Capricorn")) {
				System.out.println("You will trip on a hamburger today.");
			}
			else if  (answer.equalsIgnoreCase("Scorpio")) {
				System.out.println("You will trip on a rock today.");
			}
			else if  (answer.equalsIgnoreCase("Gemini")) {
				System.out.println("You will become rich today!");
			}
			else if  (answer.equalsIgnoreCase("Sagittarius")) {
				System.out.println("You will trip on a cheeseburger today.");
			}
			else if  (answer.equalsIgnoreCase("Aries")) {
				System.out.println("You will lose something today.");
			}
			else if  (answer.equalsIgnoreCase("Taurus")) {
				System.out.println("You will buy a dog today.");
			}
			else if  (answer.equalsIgnoreCase("Leo")) {
				System.out.println("You will drive your car today.");
			}
			else if  (answer.equalsIgnoreCase("Cancer")) {
				System.out.println("You will find out you have cancer today.");
			}
			else if  (answer.equalsIgnoreCase("Virgo")) {
				System.out.println("You will trip on a rock today.");
			}
			else if  (answer.equalsIgnoreCase("Libra")) {
				System.out.println("You will trip on a rock today.");
			}
			else if  (answer.equalsIgnoreCase("Pisces")) {
				System.out.println("You will trip on a rock today.");
			}
			else if  (answer.equalsIgnoreCase("Aquarius")) {
				System.out.println("You will trip on a rock today.");
			}
			else {
				JOptionPane.showMessageDialog(null,"Sorry, that is not a valid zodiac sign. Please run the program again.");
			}
	}


		
	}


