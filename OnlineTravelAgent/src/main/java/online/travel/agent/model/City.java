package online.travel.agent.model;

public class City {
	int cityId;
	String cityName;
	int cityCountryId;
	public int getCityId() {
		return cityId;
	}
	public void setCityId(int cityId) {
		this.cityId = cityId;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public int getCityCountryId() {
		return cityCountryId;
	}
	public void setCityCountryId(int cityCountryId) {
		this.cityCountryId = cityCountryId;
	}
	
}
