import applications.typicode.webservices.AlbumServices;
import org.testng.annotations.Test;

public class WebServicePhoto {

    @Test
    public void webserivce() throws Exception {
        AlbumServices.getUserName();
    }
}
