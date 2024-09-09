package collectionExampleProgram;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerGrouping {

	public static void groupCustomersByDistrict(List<Customer> customers) {
		Map<String,Integer> districtCount = new HashMap<>();
		
		for (Customer customer : customers) {
			String district = customer.getDistrict();
			
			districtCount.put(district, districtCount.getOrDefault(district,0) + 1);
		}
		
		System.out.println("District-wise customer count:");
		for (Map.Entry<String, Integer> e : districtCount.entrySet()) {
			
System.out.println(e.getKey()+":"+ e.getValue());
		}
		}
	public static void groupCustomersByCountryStateDistrict(List<Customer> customers) {
		Map<String, Integer> countryCount = new HashMap<>();
		Map<String, Integer> stateCount = new HashMap<>();
		Map<String, Integer> districtCount = new HashMap<>();
		
		for (Customer customer : customers) {
			String country = customer.getCountry();
			String state = customer.getState();
			String district = customer.getDistrict();
			
			//group by country
			countryCount.put(country, countryCount.getOrDefault(country,0)+1);
			
			// group by country and state 
			String countrystateKey = country+" , " + state;
			stateCount.put(countrystateKey, stateCount.getOrDefault(countrystateKey,0) + 1);
			
			//group by country,state and district
			String countryStateDistrictKey = country+ ", "+ state +" ,"+district;
			   districtCount.put(countryStateDistrictKey, districtCount.getOrDefault(countryStateDistrictKey, 0) + 1);
        }
	        
		
		}
	}
	

