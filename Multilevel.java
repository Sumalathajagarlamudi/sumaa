package inheritance;
	class Student{
		public void Btech() {
			System.out.println("b.tech student");
		}}
		class Student1 extends Student{
			public void bsc() {
				System.out.println("degree student");
			}}
			class Student2 extends Student1{
				public   void agri() {
					System.out.println("agriculture student");
				}		
		}
	
public class Multilevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student2 suma=new Student2();
		suma.Btech();
		suma.bsc();
		suma.agri();
	}
}
		
		


