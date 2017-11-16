public class BlogPost
{
    private String postComment;
    private String whatUserPosted;
    private String linkAdded;
    private static int increasePost = 1;
    private  int postNumber;


    BlogPost(String postComm,String userPosted){
        this.postComment=postComm;
        this.whatUserPosted = userPosted;
        this.postNumber = increasePost;
        increasePost ++;
    }

    BlogPost(String postComm,String userPosted, String linkAnswer){
        this.postComment=postComm;
        this.whatUserPosted = userPosted;
        this.linkAdded = linkAnswer;
        this.postNumber = increasePost;
        increasePost ++;
    }

    public String getPostComment()
    {return postComment;}
    public String getWhatUserPosted()
    {return whatUserPosted;}
    public String getWebsite()
    {return linkAdded;}
    public int getPostNumber()
    { return postNumber; }


    public String getUserPost(){
        return "User Info: "+whatUserPosted +"\nPost number: "+ postNumber +"\nBlog Post: "+ postComment +"\nLink: "+linkAdded;
    }
}
