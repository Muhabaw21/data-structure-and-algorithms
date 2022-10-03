public class Sum {
    private  double firstNumber;
    private  double secondNumber;
    public   void setFirstNumber(double firstNumber){
        this.firstNumber = firstNumber;
    }
    public void  setSecondNumber(double secondNumber){
        this.secondNumber = secondNumber;
    }
    public  double getFirstNumber(){
        return  this.firstNumber;
    }
    public  double getSecondNumber() {
        return this.secondNumber;
    }
    public  double getAdditionResult(){
        double sum = this.firstNumber +secondNumber;
        return sum;
    }
    public  double getSubtractionResult(){
        return  this.firstNumber - this.secondNumber;
    }
    public  double getMultiPlicationResult(){
        return  this.firstNumber * this.secondNumber;
    }
    public double getDivisionResult(){
        return  this.firstNumber / this.secondNumber;
    }
}
