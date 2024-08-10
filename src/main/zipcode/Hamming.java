package zipcode;
//import org.junit.rules.ExpectedException;


public class Hamming {
    private String string1;
    private String string2;
   // public ExpectedException expectedException = ExpectedException.none();

    public Hamming(String s, String s1) {
        this.string1 = s;
        this.string2 = s1;
    }

    public int getHammingDistance() {
        int results =0;
        if(this.string1 == "" && this.string2 == ""){
            return results;
        }
        char [] charOfString1 = string1.toCharArray();
        char [] charOfString2 = string2.toCharArray();
        if(charOfString1.length != charOfString2.length){
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");

        }

        for(int i = 0; i< charOfString1.length; i++){
                if (charOfString1[i] != charOfString2[i]) {
                    results++;
                }
        }

        return results;
    }
}
