public class AddressDTO {
  private int addressId;
  private String addressName;
  private CountryDTO country;
  
  public int getAddressId() {
	  return addressId;
  }
  public void setAddressId(int addressId) {
	  this.addressId=addressId;
  }
  
  public String getAddressName() {
	return addressName;
  }
  public void setAddressName(String addressName) {
	this.addressName = addressName;
  }
  
  public CountryDTO getCountry() {
	return country;
  }
  public void setCountry(CountryDTO country) {
	this.country = country;
  }
  
  @Override
  public String toString() {
	  return "AddressDTO={addressId="+this.addressId+",addressName="+this.addressName+",country="+this.country+"}";
  }
  
  
}
