class Person{
    private String ownerName;
    private int contactNo;

    Person(String ownerName, int contactNo){
        this.ownerName = ownerName;
        this.contactNo = contactNo;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public int getContactNo() {
        return contactNo;
    }

    public void setContactNo(int contactNo) {
        this.contactNo = contactNo;
    }
   public void displayInformation(){
    System.out.println("Owner name of pharmacy is" + ownerName);
    System.out.println("Contact number of pharmacy is"+ contactNo);
   } 
}
