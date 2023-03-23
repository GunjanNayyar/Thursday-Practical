/*int i=50;
switch(Expression)
{
	case value:
		//program statement
		break;
	case value:
		//program statement
		break;
	case value:
		//program statement
		break;
	default:
		//program statement
		
}*/

class SwitchEx
{
	public static void main(String args[])
	{
		char grade='M';
		switch (grade)
		{
			case 'A':
				System.out.println("Excellent");
				break;
			case 'B':
				System.out.println("Very good");
				break;
			case 'C':
				System.out.println("Average");
				break;
			case 'F':
				System.out.println("Fail");
				break;
			default:
				System.out.println("Sorry wrong input");
				break;
		}
	}
}