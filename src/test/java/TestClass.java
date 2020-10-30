import Entity.From;
import com.google.gson.Gson;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class TestClass{

    @Test
    public void DoTest() throws IOException {

        String webPage = "https://api.telegram.org/bot1030325998:AAERsCxzhfoUrBmj9wYZkDsO0G_Zi7XC7Dw/getUpdates";

        try (InputStream is = new URL(webPage).openStream();
             Reader reader = new InputStreamReader(is, StandardCharsets.UTF_8)) {
            Gson gson = new Gson();
            From first_name = gson.fromJson(reader, From.class);

            System.out.println(first_name);
        }
    }
}
