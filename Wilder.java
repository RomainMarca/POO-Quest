public class Wilder {

    private String firstname ;
    private boolean aware ;

    public Wilder(String firstname, boolean aware){

        this.firstname = firstname;
        this.aware = aware;
    }

    //getter
    public String getFirstname(){
        return this.firstname;
    }

    public boolean isAware(){
        return this.aware;
    }

    //setter
    public void setFirstname(String firstname){
        this.firstname=firstname;
    }

    public void setAware(boolean aware){
        this.aware=aware;
    }

    public String WhoAmI(){
        if(this.aware==true){
            return "Je m'appelle " + this.firstname + " je suis aware";
        }else{
            return "Je m'appelle " + this.firstname + " je ne suis pas aware";
        }

    }

}