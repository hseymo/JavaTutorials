public class Passenger extends User {
	
	// BUSINESS, PERSONAL, etc.
	private String accountType;

	public Passenger() {
		super();
	}

    // Do not delete this constructor.
	public Passenger(String name, String accountType) {
		super();
		this.setName(name);
		this.accountType = accountType;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
    	
    public boolean equals(Passenger p){
        Passenger other = (Passenger) p;
        if (this.getName().equals(other.getName())) {
            if (this.getEmail().equals(other.getEmail())) {
                if (getAccountType().equals(other.getAccountType())) {
                    return true;
                }
            }
        }
        return false;
    }

    /* public int hashCode(Passenger passenger){
        int outcome = 11;
        
        if (passenger.getName() != null) {
            outcome = outcome * passenger.getName().hashCode();
        }
        
        if (passenger.getEmail() != null) {
            outcome = outcome * passenger.getEmail().hashCode();
        }
        
        if (passenger.getAccountType() != null) {
        outcome = outcome * passenger.getAccountType().hashCode();
        }
        
        return outcome;

    } */
    
    @Override
    public int hashCode(){
        int nameInt = 0;
        int emailInt = 0;
        int accountInt = 0;
        int hashcode = 1;
        
        if (this.getName() == null) {
            nameInt = 0;
        } else {
            hashcode = hashcode * this.getName().hashCode();
        }
        
        if (this.getEmail() == null) {
            emailInt = 0;
        } else {
            hashcode = hashcode * this.getEmail().hashCode();
        }
        
        if (this.getAccountType() == null) {
            accountInt = 0;
        } else {
            hashcode = hashcode * this.getAccountType().hashCode();
        }
        return hashcode;
    }
    
    
    @Override
    /* public int hashCode(){
        int accountInt = 0;
        int incoming = super.hashCode();
        int outcome = incoming;
        
        if (this.getAccountType() == null) {
            accountInt = 0;
        } else {
            outcome = outcome * this.getAccountType().hashCode();
        }
        return outcome;
    } */
    
}
