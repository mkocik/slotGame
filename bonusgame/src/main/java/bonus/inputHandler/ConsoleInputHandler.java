package bonus.inputHandler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by maciej.kocik on 2/7/2017.
 */
public class ConsoleInputHandler extends AbstractInputHandler{

    public ConsoleInputHandler(int minValue, int maxValue) {
        super(minValue, maxValue);
    }

    @Override
    public int getPlayerIntegerInput() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Please select box index: ");
            int value = Integer.parseInt(br.readLine());

            if(value >= minValue && value <= maxValue){
                return value;

            } else {
                System.err.println("Value should be between " + minValue + " and " + maxValue);

            }

        } catch(NumberFormatException nfe){
            System.err.println("Invalid Format!");

        } catch (IOException e) {
            System.err.println("I/O Exception!");
        }

        System.out.println();
        return this.getPlayerIntegerInput();
    }
}
