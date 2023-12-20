public class ExampleController {
    public String inputString { get; set; }
    
    public void executeQuery() {
        String query = 'SELECT Id, Name FROM Account WHERE Name = \'' + inputString + '\'';
        List<Account> accounts = Database.query(query);
    }
}
