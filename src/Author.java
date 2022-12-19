public class Author {
    private String firstname;
    private String lastname;
    public Author(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }
    public String getFirstname() {
        return this.firstname;
    }
    public String getLastname() {
        return this.lastname;
    }
    public String setFristname(String firstname){
        return this.firstname;
    }
    public String setLastname(String lastname){
        return this.lastname;
    }
    public String toString(){
        return firstname+" "+lastname;
    }
}