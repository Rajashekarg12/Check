Imports System.Data.SqlClient

Public Class CodeInjectionExample
    Private connectionString As String = "Data Source=your_server;Initial Catalog=your_database;User ID=your_username;Password=your_password;"

    Public Function ExecuteQuery(inputData As String) As String
        Dim sqlCommand As String = "SELECT * FROM Users WHERE UserName = '" & inputData & "';"
        Dim result As String = ""

        Using connection As New SqlConnection(connectionString)
            connection.Open()

            Using command As New SqlCommand(sqlCommand, connection)
                Try
                    ' This is a simplified example and is vulnerable to SQL injection!
                    Dim reader As SqlDataReader = command.ExecuteReader()

                    While reader.Read()
                        ' Process the data or perform other operations
                        result += $"User ID: {reader("UserID")}, Username: {reader("UserName")}{Environment.NewLine}"
                    End While

                    reader.Close()
                Catch ex As Exception
                    ' Handle exceptions (logging, error reporting, etc.)
                    result = "Error: " & ex.Message
                End Try
            End Using
        End Using

        Return result
    End Function
End Class
