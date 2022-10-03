public class bankAccount {
    private  String number;
    private  double balance;
    private  String customerName;
    private  String email;
    private String phoneNumber;

    public bankAccount(String number, double balance, String customerName, String email, String phoneNumber) {
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public double depositFund(double save){
        save +=this.balance;
        return save;
    }
    public double withdrawMoney(double withdraw){
        double remaining = this.balance - withdraw;
        if (remaining < 0){
            System.out.println("Sorry your balance insufficient to withdraw " + this.balance);
        }
        else
            System.out.println("Your remaining balance" +remaining);
return  remaining;
    }

    public static class MotherBoard {
        private String model;
        private String manufacturer;
        private int ramSlots;
        private int cardSlots;
        private String bios;

        public MotherBoard(String model, String manufacturer, int ramSlots, int cardSlots, String bios) {
            this.model = model;
            this.manufacturer = manufacturer;
            this.ramSlots = ramSlots;
            this.cardSlots = cardSlots;
            this.bios = bios;
        }
    public  void programLoad(String programName){
        System.out.println("Program" + programName + "is now loading....");
    }
        public String getModel() {
            return model;
        }

        public String getManufacturer() {
            return manufacturer;
        }

        public int getRamSlots() {
            return ramSlots;
        }

        public int getCardSlots() {
            return cardSlots;
        }

        public String getBios() {
            return bios;
        }
    }
}
