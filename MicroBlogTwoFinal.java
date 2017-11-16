import static java.lang.System.out;
import java.util.Scanner;
import java.util.ArrayList;

public class MicroBlogTwoFinal
{
    Scanner keyboard = new Scanner(System.in);

    public static void main(String[]args){
        Scanner keyboard = new Scanner(System.in);
        boolean blogging = true;
        String currentUser = "";
        int entry;
        int i = 0;
        //this one is for tracking the number of post made
        int a = 1;
        ArrayList<BlogPost> createdPosts = new ArrayList<BlogPost>();
        ArrayList<UserInfo> allUsers = new ArrayList<UserInfo>();
        allUsers.add(new UserInfo("PZeldaSwag","Zelda Fitzgerald","https://goo.gl/images/NznvJY","PrincessZelda@gmail.com"));
        allUsers.add(new UserInfo("ReySayWhat","Rey of Jakku","https://goo.gl/images/8wjFFX","Rey@yahoo.com"));
        allUsers.add(new UserInfo("RingSlayer","Frodo Baggins, son of Drogo Baggins","https://goo.gl/images/kVMiBm","RingSlayer1386@gmail.com"));
        do{
            printMenu();
            out.println("Pick from the menu! " + currentUser+ "");
            entry = keyboard.nextInt();
            out.println("");
            if(entry<1 || entry>6)
            {
                out.println("Oops! You selected an invalid option, try again!");
            }
            keyboard.skip("\n");
            if(entry==1){
                out.println("\nAlright, let's make you an account!");
                out.println("Please enter your first and last name.");
                String realName = keyboard.nextLine();
                out.println("Enter your desired user name.");
                String userName = keyboard.nextLine();
                out.println("Cool name! Now,throw up your url profile picture! Otherwise enter 'nah'.");
                String webPic = keyboard.nextLine();
                out.println("Almost "+userName+",just need your email address.");
                String emailAdd = keyboard.nextLine();
                allUsers.add(new UserInfo(userName,realName,webPic,emailAdd));
                out.println("Awesome, you're all done!\nTo login to your profile, use the menu.");

            }
            if(entry==2)
            {
                out.println("To become an existing user, please enter the number that corresponds with your username.");
                for(i=0; i<allUsers.size(); i++) {
                    out.println((i + 1) + "\n" + allUsers.get(i).getUserName() + "\n");
                }
                int userEntry = keyboard.nextInt();
                currentUser = allUsers.get(userEntry-1).getUserName();
                out.println("You are now the user:\n"+currentUser+"\n");
            }
            if(entry==3){
                if(currentUser.equals("")){
                    out.println("Wait! Hold on! You need to become a user to make a post! DUH!");
                }else{
                    out.println("Last post made by that user "+currentUser+": ");

                    for(i=(createdPosts.size()-1);i>= 0; i--)
                    {
                        if (currentUser.equals(createdPosts.get(i).getWhatUserPosted()))
                        {
                            out.println(""+ createdPosts.get(i).getUserPost() + "\n\n" );
                        }
                    }

                    out.println("To make a blog post, just type a message and hit enter!");
                    String newPost = keyboard.nextLine();
                    out.println("Do you have a Link you want to add? if so add it, if not say no");
                    String linkAnswer = keyboard.nextLine();
                    if(linkAnswer.equals("no")){
                    createdPosts.add(new BlogPost(newPost, currentUser));
                    }else{
                    createdPosts.add(new BlogPost(newPost, currentUser, linkAnswer));}

                }
            }
            if(entry==4){
                out.println("\n~All MicroBlog Posts~\n");
                for(i=0; i<createdPosts.size(); i++){
                    out.println(createdPosts.get(i).getUserPost()+"\n");
                }
            }
            if(entry==5){
                out.println("\n~All Users~\n");
                for(i=0; i<allUsers.size(); i++){
                    out.println(allUsers.get(i).getUserInfo()+"\n");
                }
            }
            if(entry==6){
                out.println("Good bye "+currentUser+" \nSee you next time.");
                blogging = false;
            }
        }while(blogging);
    }




    public static void printMenu(){
        out.println("\n~Welcome to MicroBlog~");
        out.println("Please select an item from the Main Menu:");
        out.println("1: Create a new user");
        out.println("2: Become an existing user");
        out.println("3: Create a post as the current user");
        out.println("4: Print all posts");
        out.println("5: Print all users");
        out.println("6: Logout");

    }
}