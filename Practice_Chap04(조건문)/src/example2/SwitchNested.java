package example2;

public class SwitchNested {

	public static void main(String[] args) {
		int number = 7;
		
		switch(number) {
		case 1:
		case 7:
			switch (number)
			{
			case 1:
				System.out.println("011이시군요");
			}
		}

	}

}
