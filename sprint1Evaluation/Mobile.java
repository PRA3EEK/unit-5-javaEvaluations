package sprint1Evaluation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import day2Assignment.Main;

public class Mobile {
	HashMap<String,ArrayList<String>> mobiles = new HashMap<>();
	public String addMobile(String company, String model) {
		company = company.toLowerCase();
		model = model.toLowerCase();
		if(mobiles.containsKey(company)) {
			mobiles.get(company).add(model);
			mobiles.put(company, mobiles.get(company));
		}else {
			ArrayList<String> l = new ArrayList<>();
			l.add(model);
			mobiles.put(company, l);
		}
		return "Mobile added successfully";
	}
	public List<String> getModels(String company){
		company = company.toLowerCase();
		if(mobiles.containsKey(company)) {
			return mobiles.get(company);
		}else {
			List<String> list = new ArrayList<>();
			return list;
		}
		
	
	}
	public static void main(String[] args) {
		Mobile m = new Mobile();
		m.addMobile("apple", "iphone 13");
		m.addMobile("apple", "iphone 12");
		m.addMobile("oppo", "f11 pro");
		m.addMobile("oppo", "f15 pro");
		System.out.println(m.getModels("Apple"));
	}


}
