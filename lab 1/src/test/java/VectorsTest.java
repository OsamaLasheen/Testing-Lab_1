import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Scanner;

public class VectorsTest {
    @Test
    public void vectorTest() {
        int vectForceValues[][] = {{11, 4, 8}, {-2, 7, 5}, {-9, -11, -13}};
            assertEquals("YES",Vectors.Vector(vectForceValues));

         vectForceValues = new int[][] {{1,2,3},{3,2,1},{3,1,2}};
        assertEquals("NO",Vectors.Vector(vectForceValues));
        System.out.println("NO");
        vectForceValues = new int[][] {{1,2,3},{3,2,1},{-4,-4,-4}};
        assertEquals("YES",Vectors.Vector(vectForceValues));
        System.out.println("YES");
        vectForceValues = new int[][] {{5,2,3},{302485,2,1},{-12185615,1,2}};
        assertEquals("NO",Vectors.Vector(vectForceValues));
        System.out.println("NO");
        vectForceValues = new int[][] {{50,200,3},{30,200,1},{-80,-400,-4}};
        assertEquals("YES",Vectors.Vector(vectForceValues));
        System.out.println("YES");


    }
}