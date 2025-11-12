public class Account {
    
    private String id;
    private String holdername;
    private double balanceCents;
    private AccountStatus status;

    public Account(String Id, String holdername){
        if (Id == null){
            throw new IllegalArgumentException("Id invalido");
        }

        if (holdername == null){
            throw new IllegalArgumentException("Nombre no valido");
        }

        this.id = id.trim();
        this.holdername = holdername.trim();
        this.balanceCents = 0;
        this.status = AccountStatus.ACTIVE;
    }

    public String getId(){
        return id;
    }

    public String getholdername(){
        return holdername;
    }

    public double getbalanceCebts(){
        return balanceCents;
    }

    public AccountStatus getStatus(){
        return status;
    }

}
