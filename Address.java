class Address {
   
    private String Street;
    private String City;
    private String postalCode;
    public Address(String street, String city, String postalCode) {
        Street = street;
        City = city;
        this.postalCode = postalCode;
    }
    public String getStreet() {
        return Street;
    }
    public void setStreet(String street) {
        Street = street;
    }
    public String getCity() {
        return City;
    }
    public void setCity(String city) {
        City = city;
    }
    public String getPostalCode() {
        return postalCode;
    }
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
    public void displayAddress(){
        System.out.println("Street name of pharamcy is : "+ Street);
        System.out.println("City name is: "+ City);
        System.out.println("postal code of city is: "+ postalCode);
    }
}
