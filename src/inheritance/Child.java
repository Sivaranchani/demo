package inheritance;
// single inheritance
public class Child extends Parent{

	@Override
	public void favoriteFood() {
		System.out.println("veg");
		
	}

	@Override
	public void favoriteSport() {
		System.out.println("cricket");
	}

	@Override
	public void favoritePlace() {
		System.out.println("Manali");
		super.favoritePlace();
	}

	
	}
	
	
	
