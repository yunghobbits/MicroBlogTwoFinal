public class UserInfo
{
    private String userName;
    private String realName;
    private String webPic;
    private String emailAdd;


    public UserInfo(String userName,String realName,String webPic,String emailAdd){
    this.userName=userName;
    this.realName=realName;
    this.webPic=webPic;
    this.emailAdd=emailAdd;
    }

    public String getUserName(){
        return userName; }
    public String getRealName(){
        return realName; }
    public String getWebPic(){
        return webPic; }
    public String getEmailAdd(){
        return emailAdd; }

    public String getUserInfo(){
        return userName +"\n" +realName+"\n"+webPic+"\n"+emailAdd;
    }
}