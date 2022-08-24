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

    public int hashCode(Passenger passenger){
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

    }
}
