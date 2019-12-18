package springdemomvc;

import java.util.LinkedHashMap;

public class Student {
	
	private String firstName;
	private String lastName;
	private String country;
	private String favouriteLanguage;
	private LinkedHashMap<String,String> countryOptions;
	private String[] opertingSystems;
	
	 public Student(){
			
			// populate country options 
		 
		 countryOptions = new LinkedHashMap();
		 countryOptions.put("IN","INDIA");
		 countryOptions.put("MEX","MEXICO");
		 countryOptions.put("SRL","SRI LANKA"); 
		 countryOptions.put("CHN","CHINA");
	 } 
	 
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public void setCountryOptions(LinkedHashMap<String, String> countryOptions) {
		this.countryOptions = countryOptions;
	}

	public String getFavouriteLanguage() {
		return favouriteLanguage;
	}

	public void setFavouriteLanguage(String favouriteLanguage) {
		this.favouriteLanguage = favouriteLanguage;
	}

	public String[] getOpertingSystems() {
		return opertingSystems;
	}

	public void setOpertingSystems(String[] opertingSystems) {
		this.opertingSystems = opertingSystems;
	}

	

    
	
	
    
}
