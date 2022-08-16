import javax.sound.midi.MidiChannel;
import java.nio.charset.MalformedInputException;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class test2review {

    public static void main(String[] args) {


        int[] myArray = {70, 60, 50};

        double avg = 0;
        double sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            sum += myArray[i];
            avg = sum / myArray.length;

        }
        System.out.println(avg);


    }


}





