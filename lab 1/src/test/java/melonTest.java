import static org.junit.Assert.*;
import org.junit.*;
public class melonTest {
    @Test
    public void bate5a(){
        melon melon = new melon();
        for(int i=1;i<=100;i++){
            String result = melon.checkWeight(i);
            if (i==2){
                System.out.println("size is: " + i + ", the result is : " + result);
                assertEquals("NO",result);
            }
            else if(i % 2 == 0){
                System.out.println("size is: " + i + ", the result is : " + result);
                assertEquals("YES",result);
            }
            else {
                System.out.println( "size is: " + i + ", the result is : " + result);
                assertEquals("NO",result);
            }
        }
    }
}
