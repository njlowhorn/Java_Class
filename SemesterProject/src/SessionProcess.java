
package semesterproject;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Class that processes information about the website
 * @author Nolan Lowhorn
 */
public class SessionProcess {
    private String url = "jdbc:mysql://localhost:3306/SemesterProject";
    private String username = "root";
    private String password = "";
    public DatabaseConnector db = new DatabaseConnector(url, username, password);
        
    /**
     * Default constructor
     */
    public SessionProcess() {
    }//end constructor
    
    /**
     * Method that returns the media type specified from the previous page
     * @param request HttpServletRequest - Allows page to get information from previous
     * @return String - The specified type of media
     */
    public String getMediaType(HttpServletRequest request, HttpSession session){
        String mediaType = request.getParameter("mediatype");
        if(mediaType ==  null){
            mediaType = (String)session.getAttribute("type");
        }//end if
        return mediaType;
    }//end getMediaType
    
    /**
     * Method that adds the information into the database
     * @param <T> T - Generic for the media type
     * @param request HttpServletRequest - Allows page to get information from previous
     * @param media T - Media type
     * @param fields String[] - columns of database to be entered into
     */
    public <T> void addEntryIntoDatabase(HttpServletRequest request, T media, String[] fields){
        Method[] methods = media.getClass().getMethods();
        Arrays.sort(methods, new Comparator<Method>(){
        
            public int compare(Method m1, Method m2){
                return m1.getName().compareTo(m2.getName());
            }//end compare
            
        });
        Method[] setMethods = new Method[fields.length];
        Method[] getMethods = new Method[fields.length];
        
        int setMethodsCount = 0;
        int getMethodsCount = 0;
        
        Object[] values = new Object[fields.length];
        for(int i = 0; i < methods.length; i++){
            if(methods[i].getName().contains("set") && !methods[i].getName().contains("Rating")){
                setMethods[setMethodsCount] = methods[i];
                setMethodsCount++;
            }//end if
            else if(methods[i].getName().contains("get") && !methods[i].getName().contains("Rating")&& !methods[i].getName().contains("Class")){
                getMethods[getMethodsCount] = methods[i];
                
                getMethodsCount++;
            }//end else if
        }//end for
        
        for(int i = 0; i < setMethods.length; i++){
            try{
                setMethods[i].invoke(media, request.getParameter(fields[i]));
            }//end try
            catch(Exception e){
                try{
                    setMethods[i].invoke(media, Integer.parseInt(request.getParameter(fields[i])));
                }//end try
                catch (Exception ex) {
                }//end catch
            }//end catch
        }//end for
        
        for(int i = 0; i < getMethods.length; i++){
            try{
                values[i] = getMethods[i].invoke(media);
            }//end try
            catch (Exception e) {
            }//end catch
        }//end for
        
        String table = media.getClass().getName();
        
        db.addData(table, fields, values);
    }//end addEntryIntoDatabase
    
    /**
     * Method that averages the ratings in a list
     * @param ratingsList LinkedList&lt;Object&gt; - The list with the ratings
     * @return double - The average of the ratings, averaged to two decimal places
     */
    public double averageRatings(LinkedList<Object> ratingsList){
        double ratingsSum = 0;
        for(int i = 0; i < ratingsList.size(); i++){
            ratingsSum += (double)ratingsList.get(i);
        }//end for 
        double ratingsAverage = ratingsSum / ratingsList.size();
        double ratingsRoundedAverage = Math.round(ratingsAverage * 100);
        ratingsRoundedAverage = ratingsRoundedAverage/100;
        return ratingsRoundedAverage;
    }//end averageRatings
    
    /**
     * Method that gets the information from the database, including the ratings
     * @param <T> T - Generic for the media type
     * @param request HttpServletRequest - Allows page to get information from previous
     * @param session HttpSession - Allows to store information while using the website
     * @param media T - Media type
     * @param fields String[] - columns of database to be entered into
     */
     public <T> void getFieldsFromDatabase(HttpServletRequest request, HttpSession session, T media, String[] fields){
        Method[] methods = media.getClass().getMethods();
        Arrays.sort(methods, new Comparator<Method>(){
        
            public int compare(Method m1, Method m2){
                return m1.getName().compareTo(m2.getName());
            }//end compare
            
        });
        
        int methodCount;
        
        try{
            methodCount = 0;
            for(int i = 0; i < methods.length; i ++){
                if(methods[i].getName().contains("set") && !methods[i].getName().contains("Rating")){
                    try{
                        methods[i].invoke(media, request.getParameter(fields[methodCount]));
                    }//end try
                    catch(Exception e){
                        methods[i].invoke(media, Integer.parseInt(request.getParameter(fields[methodCount])));
                    }//end catch
                    methodCount++;
                }//end if
            }//end for
            
            for(int i = 0; i < fields.length; i++){
                session.setAttribute(fields[i], request.getParameter(fields[i]));
            }//end for
            session.setAttribute("type", media.getClass().getSimpleName().toLowerCase());
        }//end try
        catch(Exception e){
            methodCount = 0;
            for(int i = 0; i < methods.length; i++){
                if(methods[i].getName().contains("set") && !methods[i].getName().contains("Rating")){
                    if(methods[i].getParameterTypes()[0].getSimpleName().equals("String")){
                        try{
                            methods[i].invoke(media, (String)(session.getAttribute(fields[methodCount])));
                        }//end try
                        catch(Exception ex){   
                        }//end catch
                    }//end try
                    else if(methods[i].getParameterTypes()[0].getSimpleName().equals("int")){
                        try{
                            methods[i].invoke(media, Integer.parseInt((String)session.getAttribute(fields[methodCount])));
                        }//end try
                        catch(Exception ex){   
                        }//end catch
                    }//end else if
                    methodCount++;
                }//end if
            }//end for
        }//end catch
        
        try{
            String table = "Ratings";
            String[] ratingFields = {"Title", "Type"};
            Object[] values = new Object[2];
            String returnField = "Rating";
            
            LinkedList<Object> returnValues = new LinkedList<>();

            for(int i = 0; i < methods.length; i++){
                if(methods[i].getName().equals("getTitle")){
                    values[0] = methods[i].invoke(media);
                    values[1] = media.getClass().getSimpleName();
                }//end if
                else if(methods[i].getName().equals("setAverageRating")){
                    returnValues = db.selectColumnData(table, ratingFields, values, returnField);
                    double averageRatings = averageRatings(returnValues);
                    methods[i].invoke(media, averageRatings);
                }//end else if
                else if(methods[i].getName().equals("setTotalRatings")){
                    methods[i].invoke(media, returnValues.size());
                }//end else if
            }//end for
        }//end try
        catch(Exception e){
        }//end catch
     }//end getFieldsFromDatabase
     
     /**
      * Method that gets the rating for the media
      * @param session HttpSession - Allows to store information while using the website
      * @return String[] - Each rating with one of them checked
      */
     public String[] getRatings(HttpSession session){
        String[] rowsChecked = {"", "", "", "", ""};
         
        try{
            String username = (String)session.getAttribute("username");
            String title = (String)session.getAttribute("Title");
            String type = (String)session.getAttribute("type"); 

            for(int i = 0; i < 5; i++){
                String table = "Ratings";
                String[] fields = {"Username", "Title", "Type", "Rating"};
                Object[] values = {username, title, type, i+1};

                boolean rowChecked = db.checkData(table, fields, values);

                if(rowChecked == true){
                    rowsChecked[i] = "checked";
                }//end if

            }//end for
        }//end catch
        catch(Exception e){
        }//end catch
         
        return rowsChecked;
     }//end sendRatings
     
     /**
      * Method that adds ratings into the database
      * @param request HttpServletRequest - Allows page to get information from previous
      * @param response HttpServletResponse - Allows for control over website
      * @param session HttpSession - Allows to store information while using the website
      * @return 
      */
     public String processRatings(HttpServletRequest request, HttpServletResponse response, HttpSession session){
         String status = "Please login first.";
        try{
            String username = (String)session.getAttribute("username");
            String title = (String)session.getAttribute("Title");
            String type = (String)session.getAttribute("type");
            int ratingNumber = Integer.parseInt(request.getParameter("star"));

            if(username != null){

                String table = "Ratings";
                String[] deleteFields = {"Username", "Title", "Type"};
                Object[] deleteValues = {username, title, type};

                db.deleteData(table, deleteFields, deleteValues);

                String[] addFields = {"Username", "Title", "Type", "Rating"};
                Object[] addValues = {username, title, type, ratingNumber};

                db.addData(table, addFields, addValues);

                response.sendRedirect("media.jsp");
            }//end if
        }//end try
        catch(Exception e){
        }//end catch
        return status;
     }//end processRatings
    
     /**
      * Method that signs up user into the website
      * @param request HttpServletRequest - Allows page to get information from previous
      */
     public void signUp(HttpServletRequest request){
         try{
            String username = request.getParameter("newUsername");
            String password = request.getParameter("newPassword");

            if(username != null || password != null){
                String table = "User";
                String[] fields = {"Username", "Password"};
                Object[] values = {username, password};

                db.addData(table, fields, values);
            }//end if
        }//end try
        catch(Exception e){   
        }//end catch 
     }//end signUp
     
     /**
      * Method that verifies if the account information is correct
      * @param request HttpServletRequest - Allows page to get information from previous
      * @param session HttpSession - Allows to store information while using the website
      * @param user User - The account
      * @return 
      */
     public String[] verifyLogIn(HttpServletRequest request, HttpSession session, User user){
        String[] status = new String[3];
        try{
            user.setUsername(request.getParameter("username"));
            user.setPassword(request.getParameter("password"));
            String table = "user";
            String[] fields = {"username", "password"};
            Object[] values = {user.getUsername(), user.getPassword()};

            boolean rowChecked = db.checkData(table, fields, values);

            if(rowChecked){
                status[0] = "Welcome, " + user.getUsername();
                status[1] = "Home";
                status[2] = "index.jsp";
                session.setAttribute("username", user.getUsername());
            }//end if
            else{
                status[0] = "The Username/Password you entered was incorrect.";
                status[1] = "Back";
                status[2] = "login.jsp";
            }//end else
        }//end try
        catch(Exception e){   
        }//end catch
        return status;
     }//end verifyLogIn
     
     /**
      * Method for example film page on index
      * @param film Film - The Dark Knight film
      */
     public void example(Film film){
         try{
            String table = "Film";
            String[] fields = {"Title"};
            Object[] values = {"The Dark Knight"};
            String[] returnFields = {"Director", "ReleaseYear", "CoverArt", "Length"};
            
            Object[] returnValues = db.selectData(table, fields, values, returnFields);
            
            film.setCreator((String)(returnValues[0]));
            film.setReleaseYear((int)(returnValues[1]));
            film.setCoverImage((String)(returnValues[2]));
            film.setTimeLength((int)(returnValues[3]));
            }//end try
            catch(Exception e){
            
            }//end catch
     }//end Example
}//end Session Process
