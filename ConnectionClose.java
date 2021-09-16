import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionClose{
    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet  rs = null;
        try{
            // do stuff
        }
        catch(Exception ex){
            // exception handling stuff

        }
        finally {
            try{
                rs.close();
            }
            catch (SQLException e){
                // ignored

            }
            try{
                ps.close();
            }
            catch (SQLException e){
                //ignored

            }
            try{
                con.close();
            }
            catch (SQLException e){
                //ignore
            }
        }
    }
}
