import java.io.IOException;

/**
 * Created by Andrei on 2/21/2015.
 */
public class NotepadUtil {

        public static void main(String[] args) {
            Runtime rs = Runtime.getRuntime();


            try {
                rs.exec("notepad");
            }
            catch (IOException e) {
                System.out.println(e);
            }
        }
}
