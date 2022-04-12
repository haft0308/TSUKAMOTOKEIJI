
public class personMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				person hong = new person();
				hong.input("홍길동", 20, "서울");
				person.countperson++;
				person.print();
				
				person lee = new person();
				lee.input("이몽룡", 30, "제천");
				person.countperson++;
				person.print();
				
				person sung = new person();
				sung.input("성춘향", 40, "인천");
				person.countperson++;
				person.print();
				
				//hong.printInstance();
				//person.print();
				//hong.print();
			
				
			}

		}
		class person
		{
			static int countperson;
			static String name;
			static int age;
			static String address;

			void input(String _name, int _age, String _address)
			{
				name = _name;
				age = _age;
				address = _address;
			}
			static void print()
			{
				System.out.println(countperson);
				System.out.println(name);
				System.out.println(age);
				System.out.println(address);
//				printInstance();
//			}
//			static void printInstance()
//			{
//				System.out.println(name);
			}
	}

