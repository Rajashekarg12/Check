// Assume the following code is part of an Android application

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Assume userInput is obtained from user input, such as EditText
        String userInput = getUserInput();

        // Vulnerable code - concatenating user input into a URL
        String apiUrl = "https://api.example.com/data?param=" + userInput;

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
}
