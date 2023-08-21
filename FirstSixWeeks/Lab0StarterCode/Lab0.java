package FirstSixWeeks.Lab0StarterCode;// name:
// date:
// per:  

public class Lab0
{

    public Lab0()
    {
        // do not update the constructor
    }

    public  void display (int min, int max)
    {
        String output = "";
        for(int i = min; i <= max; i++){
            output = checkValue(i);
            System.out.println(output);
        }
    }

    public String checkValue(int value)
    {
        String output = "";
        if(value%3 == 0){
            output += "Poke";
        }
        if (value%5 == 0){
            output += "mon";
        }
        if(output.length() == 0){
            output = "" + value;
        }
        return output;

    }
}
