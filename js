<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>XSS Example</title>
</head>
<body>
    <h1>Welcome to our website!</h1>

    <!-- Vulnerable code - injecting user input into the HTML -->
    <script>
        // Assume userInput is provided by the user
        var userInput = "<script>alert('XSS Attack');</script>";

        // Displaying user input without proper sanitization
        document.write("<p>User input: " + userInput + "</p>");
    </script>
</body>
</html>
