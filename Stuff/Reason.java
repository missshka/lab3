package Stuff;

public class Reason {

    public Reason(String name){
        this.setReason(name);
    }


    private String reason;

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getReason() {
        return reason;
    }
}
