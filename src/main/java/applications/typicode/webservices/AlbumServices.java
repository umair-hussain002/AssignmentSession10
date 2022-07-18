package applications.typicode.webservices;

import applications.typicode.models.Albums;
import applications.typicode.models.Photos;
import applications.typicode.models.User;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.testng.Assert;
import org.testng.AssertJUnit;

import java.util.Arrays;

import static io.restassured.RestAssured.given;

public class AlbumServices {
    public static String baseURL = "https://jsonplaceholder.typicode.com/";
    public static ObjectMapper objectMapper = new ObjectMapper();

    public static void getUserName() throws Exception{

        //Get photo with id 77
        var photoResponse = given().get(baseURL+"photos").body().asString();
        Photos[] photos = objectMapper.readValue(photoResponse, Photos[].class);
        Photos selectedPhoto = Arrays.stream(photos).filter(photo -> photo.id == 77).findFirst().get();

        //Get album with album id 2
        var albumResponse = given().get(baseURL+"albums").body().asString();
        Albums[] albums = objectMapper.readValue(albumResponse, Albums[].class);
        Albums selectedAlbum= Arrays.stream(albums).filter(album -> album.id == selectedPhoto.albumId).findFirst().get();

        var userResponse = given().get(baseURL+"users").body().asString();
        User[] users = objectMapper.readValue(userResponse, User[].class);

        User selectedUser = Arrays.stream(users).filter(user -> user.id == selectedAlbum.userId).findFirst().get();
        System.out.println("The photo has been posted by: "+selectedUser.name);

    }
}
