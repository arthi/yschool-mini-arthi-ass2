<html>
<body bgcolor="lightblue">
        <center>
        <form name="form" action="MyServlet" method="POST">
            <table border="0" width="400">
                
                    <tr style="background-color:whitesmoke">
                        <th>Student Name:</th>
                        <th><input type="text" name="studentname" value="" size="30" /></th>
                    </tr>                
                
                    <tr style="background-color:whitesmoke">
                        <th>Grade:</th>
                        <th>
                            <select name="grade">
                                <option>1</option>
                                <option>2</option>
                                <option>3</option>
                                <option>4</option>
                                <option>5</option>
                                <option>6</option>
                                <option>7</option> 
                                <option>8</option> 
                                <option>9</option> 
                                <option>10</option> 
                            </select> 
                        </th>
                    </tr>                   
                    <tr>
                        <th>&nbsp;</th>
                        <th>&nbsp;</th>
                    </tr>
                    <tr>
                        <th><input type="submit" value="Search" name="search"/></th>
                        <th><input type="reset" value="Reset" name="reset" /></th>
                    </tr>                 
            </table>
        </form>
        </center>
    </body>
</html>
