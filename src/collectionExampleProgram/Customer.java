package collectionExampleProgram;

public	class Customer{
		String name;
		String country;
		String state;
		String district;
		
		// constructor
		Customer (String name, String country, String state, String district){
			this.name = name;
			this.country = country;
			this.state= state;
			this.district=district;
			}

		String getCountry() {
			return country;
			
		}

		String getState() {
			return state;
		}
		
		String getDistrict() {
			return district;
		}

		

}

