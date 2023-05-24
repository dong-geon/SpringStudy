public class PrintMorseCode extends MorseCode{
    public PrintMorseCode(MorseCodeFunction function) {
        super(function);
    }
    //donggeon
    public PrintMorseCode d(){
        dash();dot();dot();space();
        return this;
    }
    public PrintMorseCode o(){
        dash();dash();dash();space();
        return this;
    }
    public PrintMorseCode n(){
        dash();dot();space();
        return this;
    }
    public PrintMorseCode g(){
        dash();dash();dot();space();
        return this;
    }
    public PrintMorseCode e(){
        dot();space();
        return this;
    }
}
