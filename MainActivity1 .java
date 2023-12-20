import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class MainActivity1 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Assume userInput is obtained from user input, such as EditText
        String userInput = getUserInput();

        // Improved code - encoding user input before constructing the URL
        String encodedUserInput = encodeUserInput(userInput);
        String apiUrl = "https://api.example.com/data?param=" + encodedUserInput;

        // Make a network request using the constructed URL
        makeNetworkRequest(apiUrl);
    }

    private void makeNetworkRequest(String url) {
        // Code to make a network request
        // ...
    }

    private String getUserInput() {
        // Code to get user input, for example, from an EditText
        // ...
        return userInput;
    }

    private String encodeUserInput(String input) {
        try {
            return URLEncoder.encode(input, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return input; // Handle encoding error gracefully, or throw an exception
        }
    }
}
