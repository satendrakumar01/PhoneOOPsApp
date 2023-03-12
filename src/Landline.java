public class Landline implements Phone{

    private String phoneNumber;
    private boolean isRinging;
    private boolean isPowerOn;

    public Landline(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        this.isRinging=false;
        this.isPowerOn=true;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setRinging(boolean ringing) {
        isRinging = ringing;
    }

    public boolean isPowerOn() {
        return isPowerOn;
    }

    public void setPowerOn(boolean powerOn) {
        isPowerOn = powerOn;
    }

    @Override
    public void powerON() {
        this.isPowerOn=true;

    }

    @Override
    public void callNumber(String phoneNo) {
        if(isPowerOn==true){
            System.out.println("your are dailing the number: "+phoneNo);
        }
        else {
            System.out.println("your landline is off ");
        }
        return;

    }

    @Override
    public void recieveCall(String phoneNo) {
        if(isPowerOn && phoneNumber.equals(phoneNo)){
            this.isRinging=true;
            System.out.println("Phone is ringing please pick up the phone: ");


        }
        else {
            System.out.println("call not recieved ");
        }
        return;

    }

    @Override
    public boolean answerCall() {
        if (isRinging==true){
            System.out.println("call answerd");
            this.isRinging=false;
            return true;
        }
        return false;
    }

    @Override
    public boolean isRinging() {
       return isRinging;

    }
}
