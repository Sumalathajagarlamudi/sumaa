package inheritance;
class Market{
	public void items() {
		System.out.println("all items");
	}}
	class vegetables extends Market{
		public void potato() {
			System.out.println("potato is sweet");
		}}
		class fastfood extends Market{
			public   void egg() {
				System.out.println("egg noodles");
			}		
	}


public class Heirarchical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fastfood suma=new fastfood();
		suma.egg();
		suma.items();
		

	}

}
